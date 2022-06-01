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
    public long bank_id;
    public String bank_name;
    public String bik;
    public String bank_address;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(9);

        sb.append("{bank_id=");
        sb.append(bank_id);
        sb.append(", bank_name=");
        sb.append(bank_name);
        sb.append(", bik=");
        sb.append(bik);
        sb.append(", bank_address=");
        sb.append(bank_address);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Bank toEntityModel() {
        BankImpl bankImpl = new BankImpl();

        bankImpl.setBank_id(bank_id);

        if (bank_name == null) {
            bankImpl.setBank_name(StringPool.BLANK);
        } else {
            bankImpl.setBank_name(bank_name);
        }

        if (bik == null) {
            bankImpl.setBik(StringPool.BLANK);
        } else {
            bankImpl.setBik(bik);
        }

        if (bank_address == null) {
            bankImpl.setBank_address(StringPool.BLANK);
        } else {
            bankImpl.setBank_address(bank_address);
        }

        bankImpl.resetOriginalValues();

        return bankImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        bank_id = objectInput.readLong();
        bank_name = objectInput.readUTF();
        bik = objectInput.readUTF();
        bank_address = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(bank_id);

        if (bank_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bank_name);
        }

        if (bik == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bik);
        }

        if (bank_address == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(bank_address);
        }
    }
}
