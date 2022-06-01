package ru.kotikov.registry.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.kotikov.registry.service.BankLocalServiceUtil;
import ru.kotikov.registry.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class BankClp extends BaseModelImpl<Bank> implements Bank {
    private long _bankId;
    private String _bankName;
    private String _bik;
    private String _bankAddress;
    private BaseModel<?> _bankRemoteModel;
    private Class<?> _clpSerializerClass = ru.kotikov.registry.service.ClpSerializer.class;

    public BankClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Bank.class;
    }

    @Override
    public String getModelClassName() {
        return Bank.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _bankId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setBankId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _bankId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bankId", getBankId());
        attributes.put("bankName", getBankName());
        attributes.put("bik", getBik());
        attributes.put("bankAddress", getBankAddress());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bankId = (Long) attributes.get("bankId");

        if (bankId != null) {
            setBankId(bankId);
        }

        String bankName = (String) attributes.get("bankName");

        if (bankName != null) {
            setBankName(bankName);
        }

        String bik = (String) attributes.get("bik");

        if (bik != null) {
            setBik(bik);
        }

        String bankAddress = (String) attributes.get("bankAddress");

        if (bankAddress != null) {
            setBankAddress(bankAddress);
        }
    }

    @Override
    public long getBankId() {
        return _bankId;
    }

    @Override
    public void setBankId(long bankId) {
        _bankId = bankId;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setBankId", long.class);

                method.invoke(_bankRemoteModel, bankId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBankName() {
        return _bankName;
    }

    @Override
    public void setBankName(String bankName) {
        _bankName = bankName;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setBankName", String.class);

                method.invoke(_bankRemoteModel, bankName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBik() {
        return _bik;
    }

    @Override
    public void setBik(String bik) {
        _bik = bik;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setBik", String.class);

                method.invoke(_bankRemoteModel, bik);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getBankAddress() {
        return _bankAddress;
    }

    @Override
    public void setBankAddress(String bankAddress) {
        _bankAddress = bankAddress;

        if (_bankRemoteModel != null) {
            try {
                Class<?> clazz = _bankRemoteModel.getClass();

                Method method = clazz.getMethod("setBankAddress", String.class);

                method.invoke(_bankRemoteModel, bankAddress);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getBankRemoteModel() {
        return _bankRemoteModel;
    }

    public void setBankRemoteModel(BaseModel<?> bankRemoteModel) {
        _bankRemoteModel = bankRemoteModel;
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

        Class<?> remoteModelClass = _bankRemoteModel.getClass();

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

        Object returnValue = method.invoke(_bankRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            BankLocalServiceUtil.addBank(this);
        } else {
            BankLocalServiceUtil.updateBank(this);
        }
    }

    @Override
    public Bank toEscapedModel() {
        return (Bank) ProxyUtil.newProxyInstance(Bank.class.getClassLoader(),
            new Class[] { Bank.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        BankClp clone = new BankClp();

        clone.setBankId(getBankId());
        clone.setBankName(getBankName());
        clone.setBik(getBik());
        clone.setBankAddress(getBankAddress());

        return clone;
    }

    @Override
    public int compareTo(Bank bank) {
        int value = 0;

        value = getBankName().compareTo(bank.getBankName());

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

        if (!(obj instanceof BankClp)) {
            return false;
        }

        BankClp bank = (BankClp) obj;

        long primaryKey = bank.getPrimaryKey();

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
        StringBundler sb = new StringBundler(9);

        sb.append("{bankId=");
        sb.append(getBankId());
        sb.append(", bankName=");
        sb.append(getBankName());
        sb.append(", bik=");
        sb.append(getBik());
        sb.append(", bankAddress=");
        sb.append(getBankAddress());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(16);

        sb.append("<model><model-name>");
        sb.append("ru.kotikov.registry.model.Bank");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>bankId</column-name><column-value><![CDATA[");
        sb.append(getBankId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankName</column-name><column-value><![CDATA[");
        sb.append(getBankName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bik</column-name><column-value><![CDATA[");
        sb.append(getBik());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>bankAddress</column-name><column-value><![CDATA[");
        sb.append(getBankAddress());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
