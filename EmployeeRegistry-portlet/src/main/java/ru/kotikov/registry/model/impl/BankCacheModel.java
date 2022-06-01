package ru.kotikov.registry.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.kotikov.registry.model.Bank;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Bank in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Bank
 * @generated
 */
public class BankCacheModel implements CacheModel<Bank>, Externalizable {
    public long bankId;
    public String bankName;
    public String bik;
    public String bankAddress;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{bankId=");
        sb.append(bankId);
        sb.append(", bankName=");
        sb.append(bankName);
        sb.append(", bik=");
        sb.append(bik);
        sb.append(", bankAddress=");
        sb.append(bankAddress);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Bank toEntityModel() {
        BankImpl bankImpl = new BankImpl();

        bankImpl.setBankId(bankId);

        if (bankName == null) {
            bankImpl.setBankName(StringPool.BLANK);
        } else {
            bankImpl.setBankName(bankName);
        }

        if (bik == null) {
            bankImpl.setBik(StringPool.BLANK);
        } else {
            bankImpl.setBik(bik);
        }

        if (bankAddress == null) {
            bankImpl.setBankAddress(StringPool.BLANK);
        } else {
            bankImpl.setBankAddress(bankAddress);
        }

        bankImpl.resetOriginalValues();

        return bankImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        bankId = objectInput.readLong();
        bankName = objectInput.readUTF();
        bik = objectInput.readUTF();
        bankAddress = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(bankId);

        if (bankName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bankName);
        }

        if (bik == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bik);
        }

        if (bankAddress == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bankAddress);
        }
    }
}
