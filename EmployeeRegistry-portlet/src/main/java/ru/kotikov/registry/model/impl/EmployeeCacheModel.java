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
    public long employeeId;
    public String lastName;
    public String firstName;
    public String patronymic;
    public String sex;
    public String dateOfBirth;
    public long positionId;
    public String dateOfEmployment;
    public int salary;
    public String workPhoneNumber;
    public String mobilePhoneNumber;
    public long bankId;
    public boolean archiveStatus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{employeeId=");
        sb.append(employeeId);
        sb.append(", lastName=");
        sb.append(lastName);
        sb.append(", firstName=");
        sb.append(firstName);
        sb.append(", patronymic=");
        sb.append(patronymic);
        sb.append(", sex=");
        sb.append(sex);
        sb.append(", dateOfBirth=");
        sb.append(dateOfBirth);
        sb.append(", positionId=");
        sb.append(positionId);
        sb.append(", dateOfEmployment=");
        sb.append(dateOfEmployment);
        sb.append(", salary=");
        sb.append(salary);
        sb.append(", workPhoneNumber=");
        sb.append(workPhoneNumber);
        sb.append(", mobilePhoneNumber=");
        sb.append(mobilePhoneNumber);
        sb.append(", bankId=");
        sb.append(bankId);
        sb.append(", archiveStatus=");
        sb.append(archiveStatus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Employee toEntityModel() {
        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setEmployeeId(employeeId);

        if (lastName == null) {
            employeeImpl.setLastName(StringPool.BLANK);
        } else {
            employeeImpl.setLastName(lastName);
        }

        if (firstName == null) {
            employeeImpl.setFirstName(StringPool.BLANK);
        } else {
            employeeImpl.setFirstName(firstName);
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

        if (dateOfBirth == null) {
            employeeImpl.setDateOfBirth(StringPool.BLANK);
        } else {
            employeeImpl.setDateOfBirth(dateOfBirth);
        }

        employeeImpl.setPositionId(positionId);

        if (dateOfEmployment == null) {
            employeeImpl.setDateOfEmployment(StringPool.BLANK);
        } else {
            employeeImpl.setDateOfEmployment(dateOfEmployment);
        }

        employeeImpl.setSalary(salary);

        if (workPhoneNumber == null) {
            employeeImpl.setWorkPhoneNumber(StringPool.BLANK);
        } else {
            employeeImpl.setWorkPhoneNumber(workPhoneNumber);
        }

        if (mobilePhoneNumber == null) {
            employeeImpl.setMobilePhoneNumber(StringPool.BLANK);
        } else {
            employeeImpl.setMobilePhoneNumber(mobilePhoneNumber);
        }

        employeeImpl.setBankId(bankId);
        employeeImpl.setArchiveStatus(archiveStatus);

        employeeImpl.resetOriginalValues();

        return employeeImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        employeeId = objectInput.readLong();
        lastName = objectInput.readUTF();
        firstName = objectInput.readUTF();
        patronymic = objectInput.readUTF();
        sex = objectInput.readUTF();
        dateOfBirth = objectInput.readUTF();
        positionId = objectInput.readLong();
        dateOfEmployment = objectInput.readUTF();
        salary = objectInput.readInt();
        workPhoneNumber = objectInput.readUTF();
        mobilePhoneNumber = objectInput.readUTF();
        bankId = objectInput.readLong();
        archiveStatus = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(employeeId);

        if (lastName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lastName);
        }

        if (firstName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(firstName);
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

        if (dateOfBirth == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dateOfBirth);
        }

        objectOutput.writeLong(positionId);

        if (dateOfEmployment == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(dateOfEmployment);
        }

        objectOutput.writeInt(salary);

        if (workPhoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(workPhoneNumber);
        }

        if (mobilePhoneNumber == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(mobilePhoneNumber);
        }

        objectOutput.writeLong(bankId);
        objectOutput.writeBoolean(archiveStatus);
    }
}
