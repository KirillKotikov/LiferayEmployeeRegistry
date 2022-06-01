package ru.kotikov.registry.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Employee}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeWrapper implements Employee, ModelWrapper<Employee> {
    private Employee _employee;

    public EmployeeWrapper(Employee employee) {
        _employee = employee;
    }

    @Override
    public Class<?> getModelClass() {
        return Employee.class;
    }

    @Override
    public String getModelClassName() {
        return Employee.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("employee_id", getEmployee_id());
        attributes.put("last_name", getLast_name());
        attributes.put("first_name", getFirst_name());
        attributes.put("patronymic", getPatronymic());
        attributes.put("sex", getSex());
        attributes.put("date_of_birth", getDate_of_birth());
        attributes.put("position_id", getPosition_id());
        attributes.put("date_of_employment", getDate_of_employment());
        attributes.put("salary", getSalary());
        attributes.put("work_phone_number", getWork_phone_number());
        attributes.put("mobile_phone_number", getMobile_phone_number());
        attributes.put("bank_id", getBank_id());
        attributes.put("archive_status", getArchive_status());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employee_id = (Long) attributes.get("employee_id");

        if (employee_id != null) {
            setEmployee_id(employee_id);
        }

        String last_name = (String) attributes.get("last_name");

        if (last_name != null) {
            setLast_name(last_name);
        }

        String first_name = (String) attributes.get("first_name");

        if (first_name != null) {
            setFirst_name(first_name);
        }

        String patronymic = (String) attributes.get("patronymic");

        if (patronymic != null) {
            setPatronymic(patronymic);
        }

        String sex = (String) attributes.get("sex");

        if (sex != null) {
            setSex(sex);
        }

        String date_of_birth = (String) attributes.get("date_of_birth");

        if (date_of_birth != null) {
            setDate_of_birth(date_of_birth);
        }

        Long position_id = (Long) attributes.get("position_id");

        if (position_id != null) {
            setPosition_id(position_id);
        }

        String date_of_employment = (String) attributes.get(
                "date_of_employment");

        if (date_of_employment != null) {
            setDate_of_employment(date_of_employment);
        }

        Integer salary = (Integer) attributes.get("salary");

        if (salary != null) {
            setSalary(salary);
        }

        String work_phone_number = (String) attributes.get("work_phone_number");

        if (work_phone_number != null) {
            setWork_phone_number(work_phone_number);
        }

        String mobile_phone_number = (String) attributes.get(
                "mobile_phone_number");

        if (mobile_phone_number != null) {
            setMobile_phone_number(mobile_phone_number);
        }

        Long bank_id = (Long) attributes.get("bank_id");

        if (bank_id != null) {
            setBank_id(bank_id);
        }

        Boolean archive_status = (Boolean) attributes.get("archive_status");

        if (archive_status != null) {
            setArchive_status(archive_status);
        }
    }

    /**
    * Returns the primary key of this employee.
    *
    * @return the primary key of this employee
    */
    @Override
    public long getPrimaryKey() {
        return _employee.getPrimaryKey();
    }

    /**
    * Sets the primary key of this employee.
    *
    * @param primaryKey the primary key of this employee
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _employee.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the employee_id of this employee.
    *
    * @return the employee_id of this employee
    */
    @Override
    public long getEmployee_id() {
        return _employee.getEmployee_id();
    }

    /**
    * Sets the employee_id of this employee.
    *
    * @param employee_id the employee_id of this employee
    */
    @Override
    public void setEmployee_id(long employee_id) {
        _employee.setEmployee_id(employee_id);
    }

    /**
    * Returns the last_name of this employee.
    *
    * @return the last_name of this employee
    */
    @Override
    public java.lang.String getLast_name() {
        return _employee.getLast_name();
    }

    /**
    * Sets the last_name of this employee.
    *
    * @param last_name the last_name of this employee
    */
    @Override
    public void setLast_name(java.lang.String last_name) {
        _employee.setLast_name(last_name);
    }

    /**
    * Returns the first_name of this employee.
    *
    * @return the first_name of this employee
    */
    @Override
    public java.lang.String getFirst_name() {
        return _employee.getFirst_name();
    }

    /**
    * Sets the first_name of this employee.
    *
    * @param first_name the first_name of this employee
    */
    @Override
    public void setFirst_name(java.lang.String first_name) {
        _employee.setFirst_name(first_name);
    }

    /**
    * Returns the patronymic of this employee.
    *
    * @return the patronymic of this employee
    */
    @Override
    public java.lang.String getPatronymic() {
        return _employee.getPatronymic();
    }

    /**
    * Sets the patronymic of this employee.
    *
    * @param patronymic the patronymic of this employee
    */
    @Override
    public void setPatronymic(java.lang.String patronymic) {
        _employee.setPatronymic(patronymic);
    }

    /**
    * Returns the sex of this employee.
    *
    * @return the sex of this employee
    */
    @Override
    public java.lang.String getSex() {
        return _employee.getSex();
    }

    /**
    * Sets the sex of this employee.
    *
    * @param sex the sex of this employee
    */
    @Override
    public void setSex(java.lang.String sex) {
        _employee.setSex(sex);
    }

    /**
    * Returns the date_of_birth of this employee.
    *
    * @return the date_of_birth of this employee
    */
    @Override
    public java.lang.String getDate_of_birth() {
        return _employee.getDate_of_birth();
    }

    /**
    * Sets the date_of_birth of this employee.
    *
    * @param date_of_birth the date_of_birth of this employee
    */
    @Override
    public void setDate_of_birth(java.lang.String date_of_birth) {
        _employee.setDate_of_birth(date_of_birth);
    }

    /**
    * Returns the position_id of this employee.
    *
    * @return the position_id of this employee
    */
    @Override
    public long getPosition_id() {
        return _employee.getPosition_id();
    }

    /**
    * Sets the position_id of this employee.
    *
    * @param position_id the position_id of this employee
    */
    @Override
    public void setPosition_id(long position_id) {
        _employee.setPosition_id(position_id);
    }

    /**
    * Returns the date_of_employment of this employee.
    *
    * @return the date_of_employment of this employee
    */
    @Override
    public java.lang.String getDate_of_employment() {
        return _employee.getDate_of_employment();
    }

    /**
    * Sets the date_of_employment of this employee.
    *
    * @param date_of_employment the date_of_employment of this employee
    */
    @Override
    public void setDate_of_employment(java.lang.String date_of_employment) {
        _employee.setDate_of_employment(date_of_employment);
    }

    /**
    * Returns the salary of this employee.
    *
    * @return the salary of this employee
    */
    @Override
    public int getSalary() {
        return _employee.getSalary();
    }

    /**
    * Sets the salary of this employee.
    *
    * @param salary the salary of this employee
    */
    @Override
    public void setSalary(int salary) {
        _employee.setSalary(salary);
    }

    /**
    * Returns the work_phone_number of this employee.
    *
    * @return the work_phone_number of this employee
    */
    @Override
    public java.lang.String getWork_phone_number() {
        return _employee.getWork_phone_number();
    }

    /**
    * Sets the work_phone_number of this employee.
    *
    * @param work_phone_number the work_phone_number of this employee
    */
    @Override
    public void setWork_phone_number(java.lang.String work_phone_number) {
        _employee.setWork_phone_number(work_phone_number);
    }

    /**
    * Returns the mobile_phone_number of this employee.
    *
    * @return the mobile_phone_number of this employee
    */
    @Override
    public java.lang.String getMobile_phone_number() {
        return _employee.getMobile_phone_number();
    }

    /**
    * Sets the mobile_phone_number of this employee.
    *
    * @param mobile_phone_number the mobile_phone_number of this employee
    */
    @Override
    public void setMobile_phone_number(java.lang.String mobile_phone_number) {
        _employee.setMobile_phone_number(mobile_phone_number);
    }

    /**
    * Returns the bank_id of this employee.
    *
    * @return the bank_id of this employee
    */
    @Override
    public long getBank_id() {
        return _employee.getBank_id();
    }

    /**
    * Sets the bank_id of this employee.
    *
    * @param bank_id the bank_id of this employee
    */
    @Override
    public void setBank_id(long bank_id) {
        _employee.setBank_id(bank_id);
    }

    /**
    * Returns the archive_status of this employee.
    *
    * @return the archive_status of this employee
    */
    @Override
    public boolean getArchive_status() {
        return _employee.getArchive_status();
    }

    /**
    * Returns <code>true</code> if this employee is archive_status.
    *
    * @return <code>true</code> if this employee is archive_status; <code>false</code> otherwise
    */
    @Override
    public boolean isArchive_status() {
        return _employee.isArchive_status();
    }

    /**
    * Sets whether this employee is archive_status.
    *
    * @param archive_status the archive_status of this employee
    */
    @Override
    public void setArchive_status(boolean archive_status) {
        _employee.setArchive_status(archive_status);
    }

    @Override
    public boolean isNew() {
        return _employee.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _employee.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _employee.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _employee.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _employee.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _employee.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _employee.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _employee.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _employee.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _employee.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _employee.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new EmployeeWrapper((Employee) _employee.clone());
    }

    @Override
    public int compareTo(ru.kotikov.registry.model.Employee employee) {
        return _employee.compareTo(employee);
    }

    @Override
    public int hashCode() {
        return _employee.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.kotikov.registry.model.Employee> toCacheModel() {
        return _employee.toCacheModel();
    }

    @Override
    public ru.kotikov.registry.model.Employee toEscapedModel() {
        return new EmployeeWrapper(_employee.toEscapedModel());
    }

    @Override
    public ru.kotikov.registry.model.Employee toUnescapedModel() {
        return new EmployeeWrapper(_employee.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _employee.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _employee.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _employee.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeWrapper)) {
            return false;
        }

        EmployeeWrapper employeeWrapper = (EmployeeWrapper) obj;

        if (Validator.equals(_employee, employeeWrapper._employee)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Employee getWrappedEmployee() {
        return _employee;
    }

    @Override
    public Employee getWrappedModel() {
        return _employee;
    }

    @Override
    public void resetOriginalValues() {
        _employee.resetOriginalValues();
    }
}
