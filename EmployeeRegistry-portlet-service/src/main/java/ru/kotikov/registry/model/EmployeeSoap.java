package ru.kotikov.registry.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class EmployeeSoap implements Serializable {
    private long _employeeId;
    private String _lastName;
    private String _firstName;
    private String _patronymic;
    private String _sex;
    private String _dateOfBirth;
    private long _positionId;
    private String _dateOfEmployment;
    private int _salary;
    private String _workPhoneNumber;
    private String _mobilePhoneNumber;
    private long _bankId;
    private boolean _archiveStatus;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setEmployeeId(model.getEmployeeId());
        soapModel.setLastName(model.getLastName());
        soapModel.setFirstName(model.getFirstName());
        soapModel.setPatronymic(model.getPatronymic());
        soapModel.setSex(model.getSex());
        soapModel.setDateOfBirth(model.getDateOfBirth());
        soapModel.setPositionId(model.getPositionId());
        soapModel.setDateOfEmployment(model.getDateOfEmployment());
        soapModel.setSalary(model.getSalary());
        soapModel.setWorkPhoneNumber(model.getWorkPhoneNumber());
        soapModel.setMobilePhoneNumber(model.getMobilePhoneNumber());
        soapModel.setBankId(model.getBankId());
        soapModel.setArchiveStatus(model.getArchiveStatus());

        return soapModel;
    }

    public static EmployeeSoap[] toSoapModels(Employee[] models) {
        EmployeeSoap[] soapModels = new EmployeeSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[][] toSoapModels(Employee[][] models) {
        EmployeeSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new EmployeeSoap[models.length][models[0].length];
        } else {
            soapModels = new EmployeeSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static EmployeeSoap[] toSoapModels(List<Employee> models) {
        List<EmployeeSoap> soapModels = new ArrayList<EmployeeSoap>(models.size());

        for (Employee model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new EmployeeSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _employeeId;
    }

    public void setPrimaryKey(long pk) {
        setEmployeeId(pk);
    }

    public long getEmployeeId() {
        return _employeeId;
    }

    public void setEmployeeId(long employeeId) {
        _employeeId = employeeId;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getPatronymic() {
        return _patronymic;
    }

    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;
    }

    public String getSex() {
        return _sex;
    }

    public void setSex(String sex) {
        _sex = sex;
    }

    public String getDateOfBirth() {
        return _dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        _dateOfBirth = dateOfBirth;
    }

    public long getPositionId() {
        return _positionId;
    }

    public void setPositionId(long positionId) {
        _positionId = positionId;
    }

    public String getDateOfEmployment() {
        return _dateOfEmployment;
    }

    public void setDateOfEmployment(String dateOfEmployment) {
        _dateOfEmployment = dateOfEmployment;
    }

    public int getSalary() {
        return _salary;
    }

    public void setSalary(int salary) {
        _salary = salary;
    }

    public String getWorkPhoneNumber() {
        return _workPhoneNumber;
    }

    public void setWorkPhoneNumber(String workPhoneNumber) {
        _workPhoneNumber = workPhoneNumber;
    }

    public String getMobilePhoneNumber() {
        return _mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        _mobilePhoneNumber = mobilePhoneNumber;
    }

    public long getBankId() {
        return _bankId;
    }

    public void setBankId(long bankId) {
        _bankId = bankId;
    }

    public boolean getArchiveStatus() {
        return _archiveStatus;
    }

    public boolean isArchiveStatus() {
        return _archiveStatus;
    }

    public void setArchiveStatus(boolean archiveStatus) {
        _archiveStatus = archiveStatus;
    }
}
