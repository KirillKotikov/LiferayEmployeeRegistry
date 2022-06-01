package ru.kotikov.registry.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.kotikov.registry.model.Employee;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Employee in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
public class EmployeeCacheModel implements CacheModel<Employee>, Externalizable {
    public long employee_id;
    public String last_name;
    public String first_name;
    public String patronymic;
    public String sex;
    public String date_of_birth;
    public long position_id;
    public String date_of_employment;
    public int salary;
    public String work_phone_number;
    public String mobile_phone_number;
    public long bank_id;
    public boolean archive_status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{employee_id=");
        sb.append(employee_id);
        sb.append(", last_name=");
        sb.append(last_name);
        sb.append(", first_name=");
        sb.append(first_name);
        sb.append(", patronymic=");
        sb.append(patronymic);
        sb.append(", sex=");
        sb.append(sex);
        sb.append(", date_of_birth=");
        sb.append(date_of_birth);
        sb.append(", position_id=");
        sb.append(position_id);
        sb.append(", date_of_employment=");
        sb.append(date_of_employment);
        sb.append(", salary=");
        sb.append(salary);
        sb.append(", work_phone_number=");
        sb.append(work_phone_number);
        sb.append(", mobile_phone_number=");
        sb.append(mobile_phone_number);
        sb.append(", bank_id=");
        sb.append(bank_id);
        sb.append(", archive_status=");
        sb.append(archive_status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmployee_id(employee_id);

        if (last_name == null) {
            employeeImpl.setLast_name(StringPool.BLANK);
        } else {
            employeeImpl.setLast_name(last_name);
        }

        if (first_name == null) {
            employeeImpl.setFirst_name(StringPool.BLANK);
        } else {
            employeeImpl.setFirst_name(first_name);
        }

        if (patronymic == null) {
            employeeImpl.setPatronymic(StringPool.BLANK);
        } else {
            employeeImpl.setPatronymic(patronymic);
        }

        if (sex == null) {
            employeeImpl.setSex(StringPool.BLANK);
        } else {
            employeeImpl.setSex(sex);
        }

        if (date_of_birth == null) {
            employeeImpl.setDate_of_birth(StringPool.BLANK);
        } else {
            employeeImpl.setDate_of_birth(date_of_birth);
        }

        employeeImpl.setPosition_id(position_id);

        if (date_of_employment == null) {
            employeeImpl.setDate_of_employment(StringPool.BLANK);
        } else {
            employeeImpl.setDate_of_employment(date_of_employment);
        }

        employeeImpl.setSalary(salary);

        if (work_phone_number == null) {
            employeeImpl.setWork_phone_number(StringPool.BLANK);
        } else {
            employeeImpl.setWork_phone_number(work_phone_number);
        }

        if (mobile_phone_number == null) {
            employeeImpl.setMobile_phone_number(StringPool.BLANK);
        } else {
            employeeImpl.setMobile_phone_number(mobile_phone_number);
        }

        employeeImpl.setBank_id(bank_id);
        employeeImpl.setArchive_status(archive_status);

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employee_id = objectInput.readLong();
        last_name = objectInput.readUTF();
        first_name = objectInput.readUTF();
        patronymic = objectInput.readUTF();
        sex = objectInput.readUTF();
        date_of_birth = objectInput.readUTF();
        position_id = objectInput.readLong();
        date_of_employment = objectInput.readUTF();
        salary = objectInput.readInt();
        work_phone_number = objectInput.readUTF();
        mobile_phone_number = objectInput.readUTF();
        bank_id = objectInput.readLong();
        archive_status = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employee_id);

        if (last_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(last_name);
        }

        if (first_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(first_name);
        }

        if (patronymic == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(patronymic);
        }

        if (sex == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sex);
        }

        if (date_of_birth == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(date_of_birth);
        }

        objectOutput.writeLong(position_id);

        if (date_of_employment == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(date_of_employment);
        }

        objectOutput.writeInt(salary);

        if (work_phone_number == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(work_phone_number);
        }

        if (mobile_phone_number == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(mobile_phone_number);
        }

        objectOutput.writeLong(bank_id);
        objectOutput.writeBoolean(archive_status);
    }
}
