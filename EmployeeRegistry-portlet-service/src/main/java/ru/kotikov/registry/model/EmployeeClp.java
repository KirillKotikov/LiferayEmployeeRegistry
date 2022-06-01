package ru.kotikov.registry.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.kotikov.registry.service.ClpSerializer;
import ru.kotikov.registry.service.EmployeeLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class EmployeeClp extends BaseModelImpl<Employee> implements Employee {
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
    private BaseModel<?> _employeeRemoteModel;
    private Class<?> _clpSerializerClass = ru.kotikov.registry.service.ClpSerializer.class;

    public EmployeeClp() {
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
    public long getPrimaryKey() {
        return _employee_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setEmployee_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _employee_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
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

    @Override
    public long getEmployee_id() {
        return _employee_id;
    }

    @Override
    public void setEmployee_id(long employee_id) {
        _employee_id = employee_id;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setEmployee_id", long.class);

                method.invoke(_employeeRemoteModel, employee_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLast_name() {
        return _last_name;
    }

    @Override
    public void setLast_name(String last_name) {
        _last_name = last_name;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setLast_name", String.class);

                method.invoke(_employeeRemoteModel, last_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getFirst_name() {
        return _first_name;
    }

    @Override
    public void setFirst_name(String first_name) {
        _first_name = first_name;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setFirst_name", String.class);

                method.invoke(_employeeRemoteModel, first_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPatronymic() {
        return _patronymic;
    }

    @Override
    public void setPatronymic(String patronymic) {
        _patronymic = patronymic;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPatronymic", String.class);

                method.invoke(_employeeRemoteModel, patronymic);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSex() {
        return _sex;
    }

    @Override
    public void setSex(String sex) {
        _sex = sex;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setSex", String.class);

                method.invoke(_employeeRemoteModel, sex);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDate_of_birth() {
        return _date_of_birth;
    }

    @Override
    public void setDate_of_birth(String date_of_birth) {
        _date_of_birth = date_of_birth;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_of_birth", String.class);

                method.invoke(_employeeRemoteModel, date_of_birth);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getPosition_id() {
        return _position_id;
    }

    @Override
    public void setPosition_id(long position_id) {
        _position_id = position_id;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition_id", long.class);

                method.invoke(_employeeRemoteModel, position_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getDate_of_employment() {
        return _date_of_employment;
    }

    @Override
    public void setDate_of_employment(String date_of_employment) {
        _date_of_employment = date_of_employment;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setDate_of_employment",
                        String.class);

                method.invoke(_employeeRemoteModel, date_of_employment);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getSalary() {
        return _salary;
    }

    @Override
    public void setSalary(int salary) {
        _salary = salary;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setSalary", int.class);

                method.invoke(_employeeRemoteModel, salary);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getWork_phone_number() {
        return _work_phone_number;
    }

    @Override
    public void setWork_phone_number(String work_phone_number) {
        _work_phone_number = work_phone_number;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setWork_phone_number",
                        String.class);

                method.invoke(_employeeRemoteModel, work_phone_number);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMobile_phone_number() {
        return _mobile_phone_number;
    }

    @Override
    public void setMobile_phone_number(String mobile_phone_number) {
        _mobile_phone_number = mobile_phone_number;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setMobile_phone_number",
                        String.class);

                method.invoke(_employeeRemoteModel, mobile_phone_number);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public long getBank_id() {
        return _bank_id;
    }

    @Override
    public void setBank_id(long bank_id) {
        _bank_id = bank_id;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setBank_id", long.class);

                method.invoke(_employeeRemoteModel, bank_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchive_status() {
        return _archive_status;
    }

    @Override
    public boolean isArchive_status() {
        return _archive_status;
    }

    @Override
    public void setArchive_status(boolean archive_status) {
        _archive_status = archive_status;

        if (_employeeRemoteModel != null) {
            try {
                Class<?> clazz = _employeeRemoteModel.getClass();

                Method method = clazz.getMethod("setArchive_status",
                        boolean.class);

                method.invoke(_employeeRemoteModel, archive_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getEmployeeRemoteModel() {
        return _employeeRemoteModel;
    }

    public void setEmployeeRemoteModel(BaseModel<?> employeeRemoteModel) {
        _employeeRemoteModel = employeeRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _employeeRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_employeeRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            EmployeeLocalServiceUtil.addEmployee(this);
        } else {
            EmployeeLocalServiceUtil.updateEmployee(this);
        }
    }

    @Override
    public Employee toEscapedModel() {
        return (Employee) ProxyUtil.newProxyInstance(Employee.class.getClassLoader(),
            new Class[] { Employee.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        EmployeeClp clone = new EmployeeClp();

        clone.setEmployee_id(getEmployee_id());
        clone.setLast_name(getLast_name());
        clone.setFirst_name(getFirst_name());
        clone.setPatronymic(getPatronymic());
        clone.setSex(getSex());
        clone.setDate_of_birth(getDate_of_birth());
        clone.setPosition_id(getPosition_id());
        clone.setDate_of_employment(getDate_of_employment());
        clone.setSalary(getSalary());
        clone.setWork_phone_number(getWork_phone_number());
        clone.setMobile_phone_number(getMobile_phone_number());
        clone.setBank_id(getBank_id());
        clone.setArchive_status(getArchive_status());

        return clone;
    }

    @Override
    public int compareTo(Employee employee) {
        int value = 0;

        value = getLast_name().compareTo(employee.getLast_name());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof EmployeeClp)) {
            return false;
        }

        EmployeeClp employee = (EmployeeClp) obj;

        long primaryKey = employee.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{employee_id=");
        sb.append(getEmployee_id());
        sb.append(", last_name=");
        sb.append(getLast_name());
        sb.append(", first_name=");
        sb.append(getFirst_name());
        sb.append(", patronymic=");
        sb.append(getPatronymic());
        sb.append(", sex=");
        sb.append(getSex());
        sb.append(", date_of_birth=");
        sb.append(getDate_of_birth());
        sb.append(", position_id=");
        sb.append(getPosition_id());
        sb.append(", date_of_employment=");
        sb.append(getDate_of_employment());
        sb.append(", salary=");
        sb.append(getSalary());
        sb.append(", work_phone_number=");
        sb.append(getWork_phone_number());
        sb.append(", mobile_phone_number=");
        sb.append(getMobile_phone_number());
        sb.append(", bank_id=");
        sb.append(getBank_id());
        sb.append(", archive_status=");
        sb.append(getArchive_status());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("ru.kotikov.registry.model.Employee");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>employee_id</column-name><column-value><![CDATA[");
        sb.append(getEmployee_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>last_name</column-name><column-value><![CDATA[");
        sb.append(getLast_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>first_name</column-name><column-value><![CDATA[");
        sb.append(getFirst_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>patronymic</column-name><column-value><![CDATA[");
        sb.append(getPatronymic());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sex</column-name><column-value><![CDATA[");
        sb.append(getSex());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_of_birth</column-name><column-value><![CDATA[");
        sb.append(getDate_of_birth());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>position_id</column-name><column-value><![CDATA[");
        sb.append(getPosition_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>date_of_employment</column-name><column-value><![CDATA[");
        sb.append(getDate_of_employment());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>salary</column-name><column-value><![CDATA[");
        sb.append(getSalary());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>work_phone_number</column-name><column-value><![CDATA[");
        sb.append(getWork_phone_number());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mobile_phone_number</column-name><column-value><![CDATA[");
        sb.append(getMobile_phone_number());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bank_id</column-name><column-value><![CDATA[");
        sb.append(getBank_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archive_status</column-name><column-value><![CDATA[");
        sb.append(getArchive_status());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
