package ru.kotikov.registry.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import ru.kotikov.registry.NoSuchEmployeeException;
import ru.kotikov.registry.model.Employee;
import ru.kotikov.registry.model.impl.EmployeeImpl;
import ru.kotikov.registry.model.impl.EmployeeModelImpl;
import ru.kotikov.registry.service.persistence.EmployeePersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the employee service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EmployeePersistence
 * @see EmployeeUtil
 * @generated
 */
public class EmployeePersistenceImpl extends BasePersistenceImpl<Employee>
    implements EmployeePersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link EmployeeUtil} to access the employee persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = EmployeeImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVESTATUS =
        new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArchiveStatus",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS =
        new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArchiveStatus",
            new String[] { Boolean.class.getName() },
            EmployeeModelImpl.ARCHIVE_STATUS_COLUMN_BITMASK |
            EmployeeModelImpl.LAST_NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ARCHIVESTATUS = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArchiveStatus",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ARCHIVESTATUS_ARCHIVE_STATUS_2 = "employee.archive_status = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByBankId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID =
        new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByBankId",
            new String[] { Long.class.getName() },
            EmployeeModelImpl.BANK_ID_COLUMN_BITMASK |
            EmployeeModelImpl.LAST_NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_BANKID = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByBankId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_BANKID_BANK_ID_2 = "employee.bank_id = ?";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITIONID =
        new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByPositionId",
            new String[] {
                Long.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID =
        new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, EmployeeImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByPositionId",
            new String[] { Long.class.getName() },
            EmployeeModelImpl.POSITION_ID_COLUMN_BITMASK |
            EmployeeModelImpl.LAST_NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_POSITIONID = new FinderPath(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByPositionId",
            new String[] { Long.class.getName() });
    private static final String _FINDER_COLUMN_POSITIONID_POSITION_ID_2 = "employee.position_id = ?";
    private static final String _SQL_SELECT_EMPLOYEE = "SELECT employee FROM Employee employee";
    private static final String _SQL_SELECT_EMPLOYEE_WHERE = "SELECT employee FROM Employee employee WHERE ";
    private static final String _SQL_COUNT_EMPLOYEE = "SELECT COUNT(employee) FROM Employee employee";
    private static final String _SQL_COUNT_EMPLOYEE_WHERE = "SELECT COUNT(employee) FROM Employee employee WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "employee.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Employee exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Employee exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(EmployeePersistenceImpl.class);
    private static Employee _nullEmployee = new EmployeeImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Employee> toCacheModel() {
                return _nullEmployeeCacheModel;
            }
        };

    private static CacheModel<Employee> _nullEmployeeCacheModel = new CacheModel<Employee>() {
            @Override
            public Employee toEntityModel() {
                return _nullEmployee;
            }
        };

    public EmployeePersistenceImpl() {
        setModelClass(Employee.class);
    }

    /**
     * Returns all the employees where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findByArchiveStatus(boolean archive_status)
        throws SystemException {
        return findByArchiveStatus(archive_status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Employee> findByArchiveStatus(boolean archive_status,
        int start, int end) throws SystemException {
        return findByArchiveStatus(archive_status, start, end, null);
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
    @Override
    public List<Employee> findByArchiveStatus(boolean archive_status,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS;
            finderArgs = new Object[] { archive_status };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVESTATUS;
            finderArgs = new Object[] {
                    archive_status,
                    
                    start, end, orderByComparator
                };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((archive_status != employee.getArchive_status())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVESTATUS_ARCHIVE_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive_status);

                if (!pagination) {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employee>(list);
                } else {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Employee findByArchiveStatus_First(boolean archive_status,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByArchiveStatus_First(archive_status,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive_status=");
        msg.append(archive_status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the first employee in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByArchiveStatus_First(boolean archive_status,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByArchiveStatus(archive_status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employee findByArchiveStatus_Last(boolean archive_status,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByArchiveStatus_Last(archive_status,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive_status=");
        msg.append(archive_status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the last employee in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByArchiveStatus_Last(boolean archive_status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByArchiveStatus(archive_status);

        if (count == 0) {
            return null;
        }

        List<Employee> list = findByArchiveStatus(archive_status, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employee[] findByArchiveStatus_PrevAndNext(long employee_id,
        boolean archive_status, OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(employee_id);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByArchiveStatus_PrevAndNext(session, employee,
                    archive_status, orderByComparator, true);

            array[1] = employee;

            array[2] = getByArchiveStatus_PrevAndNext(session, employee,
                    archive_status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByArchiveStatus_PrevAndNext(Session session,
        Employee employee, boolean archive_status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_ARCHIVESTATUS_ARCHIVE_STATUS_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(archive_status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employees where archive_status = &#63; from the database.
     *
     * @param archive_status the archive_status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByArchiveStatus(boolean archive_status)
        throws SystemException {
        for (Employee employee : findByArchiveStatus(archive_status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(employee);
        }
    }

    /**
     * Returns the number of employees where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByArchiveStatus(boolean archive_status)
        throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_ARCHIVESTATUS;

        Object[] finderArgs = new Object[] { archive_status };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVESTATUS_ARCHIVE_STATUS_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive_status);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the employees where bank_id = &#63;.
     *
     * @param bank_id the bank_id
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findByBankId(long bank_id) throws SystemException {
        return findByBankId(bank_id, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Employee> findByBankId(long bank_id, int start, int end)
        throws SystemException {
        return findByBankId(bank_id, start, end, null);
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
    @Override
    public List<Employee> findByBankId(long bank_id, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] { bank_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_BANKID;
            finderArgs = new Object[] { bank_id, start, end, orderByComparator };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((bank_id != employee.getBank_id())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_BANKID_BANK_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(bank_id);

                if (!pagination) {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employee>(list);
                } else {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Employee findByBankId_First(long bank_id,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByBankId_First(bank_id, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bank_id=");
        msg.append(bank_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the first employee in the ordered set where bank_id = &#63;.
     *
     * @param bank_id the bank_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByBankId_First(long bank_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByBankId(bank_id, 0, 1, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employee findByBankId_Last(long bank_id,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByBankId_Last(bank_id, orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("bank_id=");
        msg.append(bank_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the last employee in the ordered set where bank_id = &#63;.
     *
     * @param bank_id the bank_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByBankId_Last(long bank_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByBankId(bank_id);

        if (count == 0) {
            return null;
        }

        List<Employee> list = findByBankId(bank_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employee[] findByBankId_PrevAndNext(long employee_id, long bank_id,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(employee_id);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByBankId_PrevAndNext(session, employee, bank_id,
                    orderByComparator, true);

            array[1] = employee;

            array[2] = getByBankId_PrevAndNext(session, employee, bank_id,
                    orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByBankId_PrevAndNext(Session session,
        Employee employee, long bank_id, OrderByComparator orderByComparator,
        boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_BANKID_BANK_ID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(bank_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employees where bank_id = &#63; from the database.
     *
     * @param bank_id the bank_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByBankId(long bank_id) throws SystemException {
        for (Employee employee : findByBankId(bank_id, QueryUtil.ALL_POS,
                QueryUtil.ALL_POS, null)) {
            remove(employee);
        }
    }

    /**
     * Returns the number of employees where bank_id = &#63;.
     *
     * @param bank_id the bank_id
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByBankId(long bank_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_BANKID;

        Object[] finderArgs = new Object[] { bank_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_BANKID_BANK_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(bank_id);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Returns all the employees where position_id = &#63;.
     *
     * @param position_id the position_id
     * @return the matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findByPositionId(long position_id)
        throws SystemException {
        return findByPositionId(position_id, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Employee> findByPositionId(long position_id, int start, int end)
        throws SystemException {
        return findByPositionId(position_id, start, end, null);
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
    @Override
    public List<Employee> findByPositionId(long position_id, int start,
        int end, OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID;
            finderArgs = new Object[] { position_id };
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_POSITIONID;
            finderArgs = new Object[] { position_id, start, end, orderByComparator };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Employee employee : list) {
                if ((position_id != employee.getPosition_id())) {
                    list = null;

                    break;
                }
            }
        }

        if (list == null) {
            StringBundler query = null;

            if (orderByComparator != null) {
                query = new StringBundler(3 +
                        (orderByComparator.getOrderByFields().length * 3));
            } else {
                query = new StringBundler(3);
            }

            query.append(_SQL_SELECT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_POSITIONID_POSITION_ID_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(EmployeeModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(position_id);

                if (!pagination) {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employee>(list);
                } else {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
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
    @Override
    public Employee findByPositionId_First(long position_id,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByPositionId_First(position_id,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("position_id=");
        msg.append(position_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the first employee in the ordered set where position_id = &#63;.
     *
     * @param position_id the position_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByPositionId_First(long position_id,
        OrderByComparator orderByComparator) throws SystemException {
        List<Employee> list = findByPositionId(position_id, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employee findByPositionId_Last(long position_id,
        OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByPositionId_Last(position_id,
                orderByComparator);

        if (employee != null) {
            return employee;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("position_id=");
        msg.append(position_id);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchEmployeeException(msg.toString());
    }

    /**
     * Returns the last employee in the ordered set where position_id = &#63;.
     *
     * @param position_id the position_id
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching employee, or <code>null</code> if a matching employee could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByPositionId_Last(long position_id,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByPositionId(position_id);

        if (count == 0) {
            return null;
        }

        List<Employee> list = findByPositionId(position_id, count - 1, count,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Employee[] findByPositionId_PrevAndNext(long employee_id,
        long position_id, OrderByComparator orderByComparator)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = findByPrimaryKey(employee_id);

        Session session = null;

        try {
            session = openSession();

            Employee[] array = new EmployeeImpl[3];

            array[0] = getByPositionId_PrevAndNext(session, employee,
                    position_id, orderByComparator, true);

            array[1] = employee;

            array[2] = getByPositionId_PrevAndNext(session, employee,
                    position_id, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Employee getByPositionId_PrevAndNext(Session session,
        Employee employee, long position_id,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_EMPLOYEE_WHERE);

        query.append(_FINDER_COLUMN_POSITIONID_POSITION_ID_2);

        if (orderByComparator != null) {
            String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

            if (orderByConditionFields.length > 0) {
                query.append(WHERE_AND);
            }

            for (int i = 0; i < orderByConditionFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByConditionFields[i]);

                if ((i + 1) < orderByConditionFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN_HAS_NEXT);
                    } else {
                        query.append(WHERE_LESSER_THAN_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(WHERE_GREATER_THAN);
                    } else {
                        query.append(WHERE_LESSER_THAN);
                    }
                }
            }

            query.append(ORDER_BY_CLAUSE);

            String[] orderByFields = orderByComparator.getOrderByFields();

            for (int i = 0; i < orderByFields.length; i++) {
                query.append(_ORDER_BY_ENTITY_ALIAS);
                query.append(orderByFields[i]);

                if ((i + 1) < orderByFields.length) {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC_HAS_NEXT);
                    } else {
                        query.append(ORDER_BY_DESC_HAS_NEXT);
                    }
                } else {
                    if (orderByComparator.isAscending() ^ previous) {
                        query.append(ORDER_BY_ASC);
                    } else {
                        query.append(ORDER_BY_DESC);
                    }
                }
            }
        } else {
            query.append(EmployeeModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(position_id);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(employee);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Employee> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the employees where position_id = &#63; from the database.
     *
     * @param position_id the position_id
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByPositionId(long position_id) throws SystemException {
        for (Employee employee : findByPositionId(position_id,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(employee);
        }
    }

    /**
     * Returns the number of employees where position_id = &#63;.
     *
     * @param position_id the position_id
     * @return the number of matching employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countByPositionId(long position_id) throws SystemException {
        FinderPath finderPath = FINDER_PATH_COUNT_BY_POSITIONID;

        Object[] finderArgs = new Object[] { position_id };

        Long count = (Long) FinderCacheUtil.getResult(finderPath, finderArgs,
                this);

        if (count == null) {
            StringBundler query = new StringBundler(2);

            query.append(_SQL_COUNT_EMPLOYEE_WHERE);

            query.append(_FINDER_COLUMN_POSITIONID_POSITION_ID_2);

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(position_id);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(finderPath, finderArgs, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Caches the employee in the entity cache if it is enabled.
     *
     * @param employee the employee
     */
    @Override
    public void cacheResult(Employee employee) {
        EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeImpl.class, employee.getPrimaryKey(), employee);

        employee.resetOriginalValues();
    }

    /**
     * Caches the employees in the entity cache if it is enabled.
     *
     * @param employees the employees
     */
    @Override
    public void cacheResult(List<Employee> employees) {
        for (Employee employee : employees) {
            if (EntityCacheUtil.getResult(
                        EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeeImpl.class, employee.getPrimaryKey()) == null) {
                cacheResult(employee);
            } else {
                employee.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all employees.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(EmployeeImpl.class.getName());
        }

        EntityCacheUtil.clearCache(EmployeeImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the employee.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Employee employee) {
        EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeImpl.class, employee.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Employee> employees) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Employee employee : employees) {
            EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                EmployeeImpl.class, employee.getPrimaryKey());
        }
    }

    /**
     * Creates a new employee with the primary key. Does not add the employee to the database.
     *
     * @param employee_id the primary key for the new employee
     * @return the new employee
     */
    @Override
    public Employee create(long employee_id) {
        Employee employee = new EmployeeImpl();

        employee.setNew(true);
        employee.setPrimaryKey(employee_id);

        return employee;
    }

    /**
     * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param employee_id the primary key of the employee
     * @return the employee that was removed
     * @throws ru.kotikov.registry.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee remove(long employee_id)
        throws NoSuchEmployeeException, SystemException {
        return remove((Serializable) employee_id);
    }

    /**
     * Removes the employee with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the employee
     * @return the employee that was removed
     * @throws ru.kotikov.registry.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee remove(Serializable primaryKey)
        throws NoSuchEmployeeException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Employee employee = (Employee) session.get(EmployeeImpl.class,
                    primaryKey);

            if (employee == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(employee);
        } catch (NoSuchEmployeeException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Employee removeImpl(Employee employee) throws SystemException {
        employee = toUnwrappedModel(employee);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(employee)) {
                employee = (Employee) session.get(EmployeeImpl.class,
                        employee.getPrimaryKeyObj());
            }

            if (employee != null) {
                session.delete(employee);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (employee != null) {
            clearCache(employee);
        }

        return employee;
    }

    @Override
    public Employee updateImpl(ru.kotikov.registry.model.Employee employee)
        throws SystemException {
        employee = toUnwrappedModel(employee);

        boolean isNew = employee.isNew();

        EmployeeModelImpl employeeModelImpl = (EmployeeModelImpl) employee;

        Session session = null;

        try {
            session = openSession();

            if (employee.isNew()) {
                session.save(employee);

                employee.setNew(false);
            } else {
                session.merge(employee);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !EmployeeModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeeModelImpl.getOriginalArchive_status()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVESTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS,
                    args);

                args = new Object[] { employeeModelImpl.getArchive_status() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVESTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS,
                    args);
            }

            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeeModelImpl.getOriginalBank_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);

                args = new Object[] { employeeModelImpl.getBank_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_BANKID, args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_BANKID,
                    args);
            }

            if ((employeeModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        employeeModelImpl.getOriginalPosition_id()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID,
                    args);

                args = new Object[] { employeeModelImpl.getPosition_id() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_POSITIONID,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_POSITIONID,
                    args);
            }
        }

        EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
            EmployeeImpl.class, employee.getPrimaryKey(), employee);

        return employee;
    }

    protected Employee toUnwrappedModel(Employee employee) {
        if (employee instanceof EmployeeImpl) {
            return employee;
        }

        EmployeeImpl employeeImpl = new EmployeeImpl();

        employeeImpl.setNew(employee.isNew());
        employeeImpl.setPrimaryKey(employee.getPrimaryKey());

        employeeImpl.setEmployee_id(employee.getEmployee_id());
        employeeImpl.setLast_name(employee.getLast_name());
        employeeImpl.setFirst_name(employee.getFirst_name());
        employeeImpl.setPatronymic(employee.getPatronymic());
        employeeImpl.setSex(employee.getSex());
        employeeImpl.setDate_of_birth(employee.getDate_of_birth());
        employeeImpl.setPosition_id(employee.getPosition_id());
        employeeImpl.setDate_of_employment(employee.getDate_of_employment());
        employeeImpl.setSalary(employee.getSalary());
        employeeImpl.setWork_phone_number(employee.getWork_phone_number());
        employeeImpl.setMobile_phone_number(employee.getMobile_phone_number());
        employeeImpl.setBank_id(employee.getBank_id());
        employeeImpl.setArchive_status(employee.isArchive_status());

        return employeeImpl;
    }

    /**
     * Returns the employee with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the employee
     * @return the employee
     * @throws ru.kotikov.registry.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee findByPrimaryKey(Serializable primaryKey)
        throws NoSuchEmployeeException, SystemException {
        Employee employee = fetchByPrimaryKey(primaryKey);

        if (employee == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchEmployeeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return employee;
    }

    /**
     * Returns the employee with the primary key or throws a {@link ru.kotikov.registry.NoSuchEmployeeException} if it could not be found.
     *
     * @param employee_id the primary key of the employee
     * @return the employee
     * @throws ru.kotikov.registry.NoSuchEmployeeException if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee findByPrimaryKey(long employee_id)
        throws NoSuchEmployeeException, SystemException {
        return findByPrimaryKey((Serializable) employee_id);
    }

    /**
     * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the employee
     * @return the employee, or <code>null</code> if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Employee employee = (Employee) EntityCacheUtil.getResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                EmployeeImpl.class, primaryKey);

        if (employee == _nullEmployee) {
            return null;
        }

        if (employee == null) {
            Session session = null;

            try {
                session = openSession();

                employee = (Employee) session.get(EmployeeImpl.class, primaryKey);

                if (employee != null) {
                    cacheResult(employee);
                } else {
                    EntityCacheUtil.putResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                        EmployeeImpl.class, primaryKey, _nullEmployee);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(EmployeeModelImpl.ENTITY_CACHE_ENABLED,
                    EmployeeImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return employee;
    }

    /**
     * Returns the employee with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param employee_id the primary key of the employee
     * @return the employee, or <code>null</code> if a employee with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Employee fetchByPrimaryKey(long employee_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) employee_id);
    }

    /**
     * Returns all the employees.
     *
     * @return the employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Employee> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    @Override
    public List<Employee> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Employee> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Employee> list = (List<Employee>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_EMPLOYEE);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_EMPLOYEE;

                if (pagination) {
                    sql = sql.concat(EmployeeModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Employee>(list);
                } else {
                    list = (List<Employee>) QueryUtil.list(q, getDialect(),
                            start, end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the employees from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Employee employee : findAll()) {
            remove(employee);
        }
    }

    /**
     * Returns the number of employees.
     *
     * @return the number of employees
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_EMPLOYEE);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the employee persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.kotikov.registry.model.Employee")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Employee>> listenersList = new ArrayList<ModelListener<Employee>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Employee>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(EmployeeImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
