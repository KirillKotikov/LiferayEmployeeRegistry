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
    private long _employee_id;
    private String _last_name;
    private String _first_name;
    private String _patronymic;
    private String _sex;
    private String _date_of_birth;
    private long _position_id;
    private String _date_of_employment;
    private int _salary;
    private String _work_phone_number;
    private String _mobile_phone_number;
    private long _bank_id;
    private boolean _archive_status;

    public EmployeeSoap() {
    }

    public static EmployeeSoap toSoapModel(Employee model) {
        EmployeeSoap soapModel = new EmployeeSoap();

        soapModel.setEmployee_id(model.getEmployee_id());
        soapModel.setLast_name(model.getLast_name());
        soapModel.setFirst_name(model.getFirst_name());
        soapModel.setPatronymic(model.getPatronymic());
        soapModel.setSex(model.getSex());
        soapModel.setDate_of_birth(model.getDate_of_birth());
        soapModel.setPosition_id(model.getPosition_id());
        soapModel.setDate_of_employment(model.getDate_of_employment());
        soapModel.setSalary(model.getSalary());
        soapModel.setWork_phone_number(model.getWork_phone_number());
        soapModel.setMobile_phone_number(model.getMobile_phone_number());
        soapModel.setBank_id(model.getBank_id());
        soapModel.setArchive_status(model.getArchive_status());

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
        return _employee_id;
    }

    public void setPrimaryKey(long pk) {
        setEmployee_id(pk);
    }

    public long getEmployee_id() {
        return _employee_id;
    }

    public void setEmployee_id(long employee_id) {
        _employee_id = employee_id;
    }

    public String getLast_name() {
        return _last_name;
    }

    public void setLast_name(String last_name) {
        _last_name = last_name;
    }

    public String getFirst_name() {
        return _first_name;
    }

    public void setFirst_name(String first_name) {
        _first_name = first_name;
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

    public String getDate_of_birth() {
        return _date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        _date_of_birth = date_of_birth;
    }

    public long getPosition_id() {
        return _position_id;
    }

    public void setPosition_id(long position_id) {
        _position_id = position_id;
    }

    public String getDate_of_employment() {
        return _date_of_employment;
    }

    public void setDate_of_employment(String date_of_employment) {
        _date_of_employment = date_of_employment;
    }

    public int getSalary() {
        return _salary;
    }

    public void setSalary(int salary) {
        _salary = salary;
    }

    public String getWork_phone_number() {
        return _work_phone_number;
    }

    public void setWork_phone_number(String work_phone_number) {
        _work_phone_number = work_phone_number;
    }

    public String getMobile_phone_number() {
        return _mobile_phone_number;
    }

    public void setMobile_phone_number(String mobile_phone_number) {
        _mobile_phone_number = mobile_phone_number;
    }

    public long getBank_id() {
        return _bank_id;
    }

    public void setBank_id(long bank_id) {
        _bank_id = bank_id;
    }

    public boolean getArchive_status() {
        return _archive_status;
    }

    public boolean isArchive_status() {
        return _archive_status;
    }

    public void setArchive_status(boolean archive_status) {
        _archive_status = archive_status;
    }
}
