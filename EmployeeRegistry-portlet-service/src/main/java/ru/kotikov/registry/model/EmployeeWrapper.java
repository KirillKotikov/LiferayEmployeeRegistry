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

        attributes.put("employeeId", getEmployeeId());
        attributes.put("lastName", getLastName());
        attributes.put("firstName", getFirstName());
        attributes.put("patronymic", getPatronymic());
        attributes.put("sex", getSex());
        attributes.put("dateOfBirth", getDateOfBirth());
        attributes.put("positionId", getPositionId());
        attributes.put("dateOfEmployment", getDateOfEmployment());
        attributes.put("salary", getSalary());
        attributes.put("workPhoneNumber", getWorkPhoneNumber());
        attributes.put("mobilePhoneNumber", getMobilePhoneNumber());
        attributes.put("bankId", getBankId());
        attributes.put("archiveStatus", getArchiveStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long employeeId = (Long) attributes.get("employeeId");

        if (employeeId != null) {
            setEmployeeId(employeeId);
        }

        String lastName = (String) attributes.get("lastName");

        if (lastName != null) {
            setLastName(lastName);
        }

        String firstName = (String) attributes.get("firstName");

        if (firstName != null) {
            setFirstName(firstName);
        }

        String patronymic = (String) attributes.get("patronymic");

        if (patronymic != null) {
            setPatronymic(patronymic);
        }

        String sex = (String) attributes.get("sex");

        if (sex != null) {
            setSex(sex);
        }

        String dateOfBirth = (String) attributes.get("dateOfBirth");

        if (dateOfBirth != null) {
            setDateOfBirth(dateOfBirth);
        }

        Long positionId = (Long) attributes.get("positionId");

        if (positionId != null) {
            setPositionId(positionId);
        }

        String dateOfEmployment = (String) attributes.get("dateOfEmployment");

        if (dateOfEmployment != null) {
            setDateOfEmployment(dateOfEmployment);
        }

        Integer salary = (Integer) attributes.get("salary");

        if (salary != null) {
            setSalary(salary);
        }

        String workPhoneNumber = (String) attributes.get("workPhoneNumber");

        if (workPhoneNumber != null) {
            setWorkPhoneNumber(workPhoneNumber);
        }

        String mobilePhoneNumber = (String) attributes.get("mobilePhoneNumber");

        if (mobilePhoneNumber != null) {
            setMobilePhoneNumber(mobilePhoneNumber);
        }

        Long bankId = (Long) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        Boolean archiveStatus = (Boolean) attributes.get("archiveStatus");

        if (archiveStatus != null) {
            setArchiveStatus(archiveStatus);
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
    * Returns the employee ID of this employee.
    *
    * @return the employee ID of this employee
    */
    @Override
    public long getEmployeeId() {
        return _employee.getEmployeeId();
    }

    /**
    * Sets the employee ID of this employee.
    *
    * @param employeeId the employee ID of this employee
    */
    @Override
    public void setEmployeeId(long employeeId) {
        _employee.setEmployeeId(employeeId);
    }

    /**
    * Returns the last name of this employee.
    *
    * @return the last name of this employee
    */
    @Override
    public java.lang.String getLastName() {
        return _employee.getLastName();
    }

    /**
    * Sets the last name of this employee.
    *
    * @param lastName the last name of this employee
    */
    @Override
    public void setLastName(java.lang.String lastName) {
        _employee.setLastName(lastName);
    }

    /**
    * Returns the first name of this employee.
    *
    * @return the first name of this employee
    */
    @Override
    public java.lang.String getFirstName() {
        return _employee.getFirstName();
    }

    /**
    * Sets the first name of this employee.
    *
    * @param firstName the first name of this employee
    */
    @Override
    public void setFirstName(java.lang.String firstName) {
        _employee.setFirstName(firstName);
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
    * Returns the date of birth of this employee.
    *
    * @return the date of birth of this employee
    */
    @Override
    public java.lang.String getDateOfBirth() {
        return _employee.getDateOfBirth();
    }

    /**
    * Sets the date of birth of this employee.
    *
    * @param dateOfBirth the date of birth of this employee
    */
    @Override
    public void setDateOfBirth(java.lang.String dateOfBirth) {
        _employee.setDateOfBirth(dateOfBirth);
    }

    /**
    * Returns the position ID of this employee.
    *
    * @return the position ID of this employee
    */
    @Override
    public long getPositionId() {
        return _employee.getPositionId();
    }

    /**
    * Sets the position ID of this employee.
    *
    * @param positionId the position ID of this employee
    */
    @Override
    public void setPositionId(long positionId) {
        _employee.setPositionId(positionId);
    }

    /**
    * Returns the date of employment of this employee.
    *
    * @return the date of employment of this employee
    */
    @Override
    public java.lang.String getDateOfEmployment() {
        return _employee.getDateOfEmployment();
    }

    /**
    * Sets the date of employment of this employee.
    *
    * @param dateOfEmployment the date of employment of this employee
    */
    @Override
    public void setDateOfEmployment(java.lang.String dateOfEmployment) {
        _employee.setDateOfEmployment(dateOfEmployment);
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
    * Returns the work phone number of this employee.
    *
    * @return the work phone number of this employee
    */
    @Override
    public java.lang.String getWorkPhoneNumber() {
        return _employee.getWorkPhoneNumber();
    }

    /**
    * Sets the work phone number of this employee.
    *
    * @param workPhoneNumber the work phone number of this employee
    */
    @Override
    public void setWorkPhoneNumber(java.lang.String workPhoneNumber) {
        _employee.setWorkPhoneNumber(workPhoneNumber);
    }

    /**
    * Returns the mobile phone number of this employee.
    *
    * @return the mobile phone number of this employee
    */
    @Override
    public java.lang.String getMobilePhoneNumber() {
        return _employee.getMobilePhoneNumber();
    }

    /**
    * Sets the mobile phone number of this employee.
    *
    * @param mobilePhoneNumber the mobile phone number of this employee
    */
    @Override
    public void setMobilePhoneNumber(java.lang.String mobilePhoneNumber) {
        _employee.setMobilePhoneNumber(mobilePhoneNumber);
    }

    /**
    * Returns the bank ID of this employee.
    *
    * @return the bank ID of this employee
    */
    @Override
    public long getBankId() {
        return _employee.getBankId();
    }

    /**
    * Sets the bank ID of this employee.
    *
    * @param bankId the bank ID of this employee
    */
    @Override
    public void setBankId(long bankId) {
        _employee.setBankId(bankId);
    }

    /**
    * Returns the archive status of this employee.
    *
    * @return the archive status of this employee
    */
    @Override
    public boolean getArchiveStatus() {
        return _employee.getArchiveStatus();
    }

    /**
    * Returns <code>true</code> if this employee is archive status.
    *
    * @return <code>true</code> if this employee is archive status; <code>false</code> otherwise
    */
    @Override
    public boolean isArchiveStatus() {
        return _employee.isArchiveStatus();
    }

    /**
    * Sets whether this employee is archive status.
    *
    * @param archiveStatus the archive status of this employee
    */
    @Override
    public void setArchiveStatus(boolean archiveStatus) {
        _employee.setArchiveStatus(archiveStatus);
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
