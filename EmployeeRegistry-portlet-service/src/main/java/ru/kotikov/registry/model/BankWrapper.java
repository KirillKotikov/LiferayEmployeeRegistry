package ru.kotikov.registry.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Bank}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Bank
 * @generated
 */
public class BankWrapper implements Bank, ModelWrapper<Bank> {
    private Bank _bank;

    public BankWrapper(Bank bank) {
        _bank = bank;
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
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("bank_id", getBank_id());
        attributes.put("bank_name", getBank_name());
        attributes.put("bik", getBik());
        attributes.put("bank_address", getBank_address());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long bank_id = (Long) attributes.get("bank_id");

        if (bank_id != null) {
            setBank_id(bank_id);
        }

        String bank_name = (String) attributes.get("bank_name");

        if (bank_name != null) {
            setBank_name(bank_name);
        }

        String bik = (String) attributes.get("bik");

        if (bik != null) {
            setBik(bik);
        }

        String bank_address = (String) attributes.get("bank_address");

        if (bank_address != null) {
            setBank_address(bank_address);
        }
    }

    /**
    * Returns the primary key of this bank.
    *
    * @return the primary key of this bank
    */
    @Override
    public long getPrimaryKey() {
        return _bank.getPrimaryKey();
    }

    /**
    * Sets the primary key of this bank.
    *
    * @param primaryKey the primary key of this bank
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _bank.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the bank_id of this bank.
    *
    * @return the bank_id of this bank
    */
    @Override
    public long getBank_id() {
        return _bank.getBank_id();
    }

    /**
    * Sets the bank_id of this bank.
    *
    * @param bank_id the bank_id of this bank
    */
    @Override
    public void setBank_id(long bank_id) {
        _bank.setBank_id(bank_id);
    }

    /**
    * Returns the bank_name of this bank.
    *
    * @return the bank_name of this bank
    */
    @Override
    public java.lang.String getBank_name() {
        return _bank.getBank_name();
    }

    /**
    * Sets the bank_name of this bank.
    *
    * @param bank_name the bank_name of this bank
    */
    @Override
    public void setBank_name(java.lang.String bank_name) {
        _bank.setBank_name(bank_name);
    }

    /**
    * Returns the bik of this bank.
    *
    * @return the bik of this bank
    */
    @Override
    public java.lang.String getBik() {
        return _bank.getBik();
    }

    /**
    * Sets the bik of this bank.
    *
    * @param bik the bik of this bank
    */
    @Override
    public void setBik(java.lang.String bik) {
        _bank.setBik(bik);
    }

    /**
    * Returns the bank_address of this bank.
    *
    * @return the bank_address of this bank
    */
    @Override
    public java.lang.String getBank_address() {
        return _bank.getBank_address();
    }

    /**
    * Sets the bank_address of this bank.
    *
    * @param bank_address the bank_address of this bank
    */
    @Override
    public void setBank_address(java.lang.String bank_address) {
        _bank.setBank_address(bank_address);
    }

    @Override
    public boolean isNew() {
        return _bank.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _bank.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _bank.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _bank.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _bank.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _bank.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _bank.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _bank.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _bank.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _bank.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _bank.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new BankWrapper((Bank) _bank.clone());
    }

    @Override
    public int compareTo(ru.kotikov.registry.model.Bank bank) {
        return _bank.compareTo(bank);
    }

    @Override
    public int hashCode() {
        return _bank.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.kotikov.registry.model.Bank> toCacheModel() {
        return _bank.toCacheModel();
    }

    @Override
    public ru.kotikov.registry.model.Bank toEscapedModel() {
        return new BankWrapper(_bank.toEscapedModel());
    }

    @Override
    public ru.kotikov.registry.model.Bank toUnescapedModel() {
        return new BankWrapper(_bank.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _bank.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _bank.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _bank.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankWrapper)) {
            return false;
        }

        BankWrapper bankWrapper = (BankWrapper) obj;

        if (Validator.equals(_bank, bankWrapper._bank)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Bank getWrappedBank() {
        return _bank;
    }

    @Override
    public Bank getWrappedModel() {
        return _bank;
    }

    @Override
    public void resetOriginalValues() {
        _bank.resetOriginalValues();
    }
}
