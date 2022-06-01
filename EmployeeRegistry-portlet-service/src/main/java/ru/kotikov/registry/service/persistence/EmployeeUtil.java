package ru.kotikov.registry.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.kotikov.registry.model.Employee;

import java.util.List;

/**
 * The persistence utility for the employee service. This utility wraps {@link EmployeePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeePersistence
 * @see EmployeePersistenceImpl
 * @generated
 */
public class EmployeeUtil {
    private static EmployeePersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Employee employee) {
        getPersistence().clearCache(employee);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Employee> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Employee> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Employee> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Employee update(Employee employee) throws SystemException {
        return getPersistence().update(employee);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Employee update(Employee employee,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(employee, serviceContext);
    }

    /**
    * Returns all the employees where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findByArchiveStatus(
        boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveStatus(archive_status);
    }

    /**
    * Returns a range of all the employees where archive_status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive_status the archive_status
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findByArchiveStatus(
        boolean archive_status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveStatus(archive_status, start, end);
    }

    /**
    * Returns an ordered range of all the employees where archive_status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive_status the archive_status
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findByArchiveStatus(
        boolean archive_status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchiveStatus(archive_status, start, end,
            orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee findByArchiveStatus_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence()
                   .findByArchiveStatus_First(archive_status, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee fetchByArchiveStatus_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchiveStatus_First(archive_status, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee findByArchiveStatus_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence()
                   .findByArchiveStatus_Last(archive_status, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee fetchByArchiveStatus_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchiveStatus_Last(archive_status, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where archive_status = &#63;.
    *
    * @param employee_id the primary key of the current employee
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee[] findByArchiveStatus_PrevAndNext(
        long employee_id, boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence()
                   .findByArchiveStatus_PrevAndNext(employee_id,
            archive_status, orderByComparator);
    }

    /**
    * Removes all the employees where archive_status = &#63; from the database.
    *
    * @param archive_status the archive_status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByArchiveStatus(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByArchiveStatus(archive_status);
    }

    /**
    * Returns the number of employees where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByArchiveStatus(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByArchiveStatus(archive_status);
    }

    /**
    * Returns all the employees where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findByBankId(
        long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(bank_id);
    }

    /**
    * Returns a range of all the employees where bank_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bank_id the bank_id
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findByBankId(
        long bank_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByBankId(bank_id, start, end);
    }

    /**
    * Returns an ordered range of all the employees where bank_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param bank_id the bank_id
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findByBankId(
        long bank_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByBankId(bank_id, start, end, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee findByBankId_First(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence().findByBankId_First(bank_id, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee fetchByBankId_First(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByBankId_First(bank_id, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee findByBankId_Last(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence().findByBankId_Last(bank_id, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee fetchByBankId_Last(
        long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByBankId_Last(bank_id, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where bank_id = &#63;.
    *
    * @param employee_id the primary key of the current employee
    * @param bank_id the bank_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee[] findByBankId_PrevAndNext(
        long employee_id, long bank_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence()
                   .findByBankId_PrevAndNext(employee_id, bank_id,
            orderByComparator);
    }

    /**
    * Removes all the employees where bank_id = &#63; from the database.
    *
    * @param bank_id the bank_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByBankId(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByBankId(bank_id);
    }

    /**
    * Returns the number of employees where bank_id = &#63;.
    *
    * @param bank_id the bank_id
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByBankId(long bank_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByBankId(bank_id);
    }

    /**
    * Returns all the employees where position_id = &#63;.
    *
    * @param position_id the position_id
    * @return the matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findByPositionId(
        long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPositionId(position_id);
    }

    /**
    * Returns a range of all the employees where position_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param position_id the position_id
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findByPositionId(
        long position_id, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByPositionId(position_id, start, end);
    }

    /**
    * Returns an ordered range of all the employees where position_id = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param position_id the position_id
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findByPositionId(
        long position_id, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByPositionId(position_id, start, end, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee findByPositionId_First(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence()
                   .findByPositionId_First(position_id, orderByComparator);
    }

    /**
    * Returns the first employee in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee fetchByPositionId_First(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPositionId_First(position_id, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee findByPositionId_Last(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence()
                   .findByPositionId_Last(position_id, orderByComparator);
    }

    /**
    * Returns the last employee in the ordered set where position_id = &#63;.
    *
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching employee, or <code>null</code> if a matching employee could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee fetchByPositionId_Last(
        long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByPositionId_Last(position_id, orderByComparator);
    }

    /**
    * Returns the employees before and after the current employee in the ordered set where position_id = &#63;.
    *
    * @param employee_id the primary key of the current employee
    * @param position_id the position_id
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee[] findByPositionId_PrevAndNext(
        long employee_id, long position_id,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence()
                   .findByPositionId_PrevAndNext(employee_id, position_id,
            orderByComparator);
    }

    /**
    * Removes all the employees where position_id = &#63; from the database.
    *
    * @param position_id the position_id
    * @throws SystemException if a system exception occurred
    */
    public static void removeByPositionId(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByPositionId(position_id);
    }

    /**
    * Returns the number of employees where position_id = &#63;.
    *
    * @param position_id the position_id
    * @return the number of matching employees
    * @throws SystemException if a system exception occurred
    */
    public static int countByPositionId(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByPositionId(position_id);
    }

    /**
    * Caches the employee in the entity cache if it is enabled.
    *
    * @param employee the employee
    */
    public static void cacheResult(ru.kotikov.registry.model.Employee employee) {
        getPersistence().cacheResult(employee);
    }

    /**
    * Caches the employees in the entity cache if it is enabled.
    *
    * @param employees the employees
    */
    public static void cacheResult(
        java.util.List<ru.kotikov.registry.model.Employee> employees) {
        getPersistence().cacheResult(employees);
    }

    /**
    * Creates a new employee with the primary key. Does not add the employee to the database.
    *
    * @param employee_id the primary key for the new employee
    * @return the new employee
    */
    public static ru.kotikov.registry.model.Employee create(long employee_id) {
        return getPersistence().create(employee_id);
    }

    /**
    * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param employee_id the primary key of the employee
    * @return the employee that was removed
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee remove(long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence().remove(employee_id);
    }

    public static ru.kotikov.registry.model.Employee updateImpl(
        ru.kotikov.registry.model.Employee employee)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(employee);
    }

    /**
    * Returns the employee with the primary key or throws a {@link ru.kotikov.registry.NoSuchEmployeeException} if it could not be found.
    *
    * @param employee_id the primary key of the employee
    * @return the employee
    * @throws ru.kotikov.registry.NoSuchEmployeeException if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee findByPrimaryKey(
        long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchEmployeeException {
        return getPersistence().findByPrimaryKey(employee_id);
    }

    /**
    * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param employee_id the primary key of the employee
    * @return the employee, or <code>null</code> if a employee with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Employee fetchByPrimaryKey(
        long employee_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(employee_id);
    }

    /**
    * Returns all the employees.
    *
    * @return the employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @return the range of employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the employees.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.EmployeeModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of employees
    * @param end the upper bound of the range of employees (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of employees
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Employee> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the employees from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of employees.
    *
    * @return the number of employees
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static EmployeePersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (EmployeePersistence) PortletBeanLocatorUtil.locate(ru.kotikov.registry.service.ClpSerializer.getServletContextName(),
                    EmployeePersistence.class.getName());

            ReferenceRegistry.registerReference(EmployeeUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(EmployeePersistence persistence) {
    }
}
