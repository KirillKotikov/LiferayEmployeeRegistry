package ru.kotikov.registry.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.kotikov.registry.model.Bank;

/**
 * The persistence interface for the bank service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BankPersistenceImpl
 * @see BankUtil
 * @generated
 */
public interface BankPersistence extends BasePersistence<Bank> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link BankUtil} to access the bank persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the bank in the entity cache if it is enabled.
    *
    * @param bank the bank
    */
    public void cacheResult(ru.kotikov.registry.model.Bank bank);

    /**
    * Caches the banks in the entity cache if it is enabled.
    *
    * @param banks the banks
    */
    public void cacheResult(
        java.util.List<ru.kotikov.registry.model.Bank> banks);

    /**
    * Creates a new bank with the primary key. Does not add the bank to the database.
    *
    * @param bank_id the primary key for the new bank
    * @return the new bank
    */
    public ru.kotikov.registry.model.Bank create(long bank_id);

    /**
    * Removes the bank with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param bank_id the primary key of the bank
    * @return the bank that was removed
    * @throws ru.kotikov.registry.NoSuchBankException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Bank remove(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchBankException;

    public ru.kotikov.registry.model.Bank updateImpl(
        ru.kotikov.registry.model.Bank bank)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the bank with the primary key or throws a {@link ru.kotikov.registry.NoSuchBankException} if it could not be found.
    *
    * @param bank_id the primary key of the bank
    * @return the bank
    * @throws ru.kotikov.registry.NoSuchBankException if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Bank findByPrimaryKey(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchBankException;

    /**
    * Returns the bank with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param bank_id the primary key of the bank
    * @return the bank, or <code>null</code> if a bank with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Bank fetchByPrimaryKey(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the banks.
    *
    * @return the banks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.registry.model.Bank> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns a range of all the banks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @return the range of banks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.registry.model.Bank> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns an ordered range of all the banks.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.BankModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of banks
    * @param end the upper bound of the range of banks (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of banks
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.registry.model.Bank> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the banks from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of banks.
    *
    * @return the number of banks
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
