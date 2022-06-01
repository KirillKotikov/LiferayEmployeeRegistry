package ru.kotikov.registry.portlets;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import ru.kotikov.registry.model.Bank;
import ru.kotikov.registry.model.Employee;
import ru.kotikov.registry.model.Position;
import ru.kotikov.registry.service.BankLocalServiceUtil;
import ru.kotikov.registry.service.EmployeeLocalServiceUtil;
import ru.kotikov.registry.service.PositionLocalServiceUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

public class EmployeesPortlet extends MVCPortlet {


    public void addEmployee(ActionRequest request, ActionResponse response) {

        try {
            Employee employee = EmployeeLocalServiceUtil.createEmployee(EmployeeLocalServiceUtil.getEmployeesCount() + 1);
            employee.setLast_name(ParamUtil.getString(request, "Last name"));
            employee.setFirst_name(ParamUtil.getString(request, "First name"));
            employee.setPatronymic(ParamUtil.getString(request, "Patronymic"));
            employee.setSex(ParamUtil.getString(request, "Sex"));
            employee.setDate_of_birth(ParamUtil.getString(request, "Date of birth"));
            employee.setPosition_id(ParamUtil.getInteger(request, "Position id"));
            employee.setDate_of_employment(ParamUtil.getString(request, "Date of employment"));
            employee.setSalary(ParamUtil.getInteger(request, "Salary"));
            employee.setWork_phone_number(ParamUtil.getString(request, "Work phone number"));
            employee.setMobile_phone_number(ParamUtil.getString(request, "Mobile phone number"));
            employee.setBank_id(ParamUtil.getInteger(request, "Bank id"));
            employee.setArchive_status(ParamUtil.getBoolean(request, "Archive status"));

            EmployeeLocalServiceUtil.addEmployee(employee);
            response.setRenderParameter("jspPage", "/html/employees/allEmployees.jsp");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }

    public void addBank(ActionRequest request, ActionResponse response) {

        try {
            Bank bank = BankLocalServiceUtil.createBank(BankLocalServiceUtil.getBanksCount() + 1);
            bank.setBank_name(ParamUtil.getString(request, "Bank name"));
            bank.setBik(ParamUtil.getString(request, "BIK"));
            bank.setBank_address(ParamUtil.getString(request, "The bank address"));

            BankLocalServiceUtil.addBank(bank);
            response.setRenderParameter("jspPage", "/html/banks/allBanks.jsp");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }

    public void addPosition(ActionRequest request, ActionResponse response) {

        try {
            Position position = PositionLocalServiceUtil.createPosition(PositionLocalServiceUtil.getPositionsCount() + 1);
            position.setPosition_name(ParamUtil.getString(request, "Position name"));
            position.setArchive_status(ParamUtil.getBoolean(request, "Archive status"));

            PositionLocalServiceUtil.addPosition(position);
            response.setRenderParameter("jspPage", "/html/positions/allPositions.jsp");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
            e.printStackTrace();
        }
    }

    public void getCurrentEmployee(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Employee currentEmployee = EmployeeLocalServiceUtil.getEmployee(Long.parseLong(request.getParameter("currentEmployeeId")));
        request.setAttribute("currentEmployee", currentEmployee);
        response.setRenderParameter("jspPage", "/html/employees/updateEmployee.jsp");
    }

    public void updateEmployee(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Employee employee = EmployeeLocalServiceUtil.getEmployee(ParamUtil.getLong(request, "Employee id"));
        employee.setLast_name(ParamUtil.getString(request, "Last name"));
        employee.setFirst_name(ParamUtil.getString(request, "First name"));
        employee.setPatronymic(ParamUtil.getString(request, "Patronymic"));
        employee.setSex(ParamUtil.getString(request, "Sex"));
        employee.setDate_of_birth(ParamUtil.getString(request, "Date of birth"));
        employee.setPosition_id(ParamUtil.getInteger(request, "Position id"));
        employee.setDate_of_employment(ParamUtil.getString(request, "Date of employment"));
        employee.setSalary(ParamUtil.getInteger(request, "Salary"));
        employee.setWork_phone_number(ParamUtil.getString(request, "Work phone number"));
        employee.setMobile_phone_number(ParamUtil.getString(request, "Mobile phone number"));
        employee.setBank_id(ParamUtil.getInteger(request, "Bank id"));
        employee.setArchive_status(ParamUtil.getBoolean(request, "Archive status"));

        EmployeeLocalServiceUtil.updateEmployee(employee);
        response.setRenderParameter("jspPage", "/html/employees/allEmployees.jsp");
    }

    public void getCurrentBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        String bankId = request.getParameter("currentBankId");
        Bank currentBank = BankLocalServiceUtil.getBank(Long.parseLong(bankId));
        request.setAttribute("currentBank", currentBank);
        response.setRenderParameter("jspPage", "/html/banks/updateBank.jsp");
    }

    public void updateBank(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Bank bank = BankLocalServiceUtil.getBank(ParamUtil.getLong(request, "Bank id"));
        bank.setBank_name(ParamUtil.getString(request, "Bank name"));
        bank.setBik(ParamUtil.getString(request, "BIK"));
        bank.setBank_address(ParamUtil.getString(request, "Bank address"));

        BankLocalServiceUtil.updateBank(bank);
        response.setRenderParameter("jspPage", "/html/banks/allBanks.jsp");
    }

    public void getCurrentPosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Position currentPosition = PositionLocalServiceUtil.getPosition(Long.parseLong(request.getParameter("currentPositionId")));
        if (PositionLocalServiceUtil.getPositionEmployees(currentPosition.getPosition_id()).size() < 1) {
            request.setAttribute("employeesAvailable", 0);
        } else  request.setAttribute("employeesAvailable", 1);
        request.setAttribute("currentPosition", currentPosition);
        response.setRenderParameter("jspPage", "/html/positions/updatePosition.jsp");
    }

    public void updatePosition(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Position position = PositionLocalServiceUtil.getPosition(ParamUtil.getLong(request, "Position id"));
        position.setPosition_name(ParamUtil.getString(request, "Position name"));
        position.setArchive_status(ParamUtil.getBoolean(request, "Archive status"));
        PositionLocalServiceUtil.updatePosition(position);
        response.setRenderParameter("jspPage", "/html/positions/allPositions.jsp");
    }

    public void changeEmployeeArchiveStatus(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Employee currentEmployee = EmployeeLocalServiceUtil.getEmployee(Long.parseLong(request.getParameter("currentEmployeeId")));
        currentEmployee.setArchive_status(!request.getParameter("currentEmployeeArchiveStatus").equals("true"));

        EmployeeLocalServiceUtil.updateEmployee(currentEmployee);
        response.setRenderParameter("jspPage", "/html/employees/allEmployees.jsp");
    }

    public void changePositionArchiveStatus(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        Position currentPosition = PositionLocalServiceUtil.getPosition(Long.parseLong(request.getParameter("currentPositionId")));
        currentPosition.setArchive_status(!request.getParameter("currentArchiveStatus").equals("true"));
        PositionLocalServiceUtil.updatePosition(currentPosition);
        if (PositionLocalServiceUtil.getPositionEmployees(currentPosition.getPosition_id()).size() < 1) {
            request.setAttribute("employeesAvailable", 1);
        } else  request.setAttribute("employeesAvailable", 0);
        response.setRenderParameter("jspPage", "/html/positions/allPositions.jsp");
    }

    public void getCurrentBankClients(ActionRequest request, ActionResponse response) throws SystemException, PortalException {
        String bankId = request.getParameter("currentBankClientsId");
        Bank currentBank = BankLocalServiceUtil.getBank(Long.parseLong(bankId));
        request.setAttribute("currentBank", currentBank);
        response.setRenderParameter("jspPage", "/html/banks/bankClients.jsp");
    }

}