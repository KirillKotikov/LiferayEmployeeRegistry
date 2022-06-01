package ru.kotikov.registry.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import ru.kotikov.registry.model.Position;
import ru.kotikov.registry.service.PositionLocalService;
import ru.kotikov.registry.service.persistence.BankPersistence;
import ru.kotikov.registry.service.persistence.EmployeePersistence;
import ru.kotikov.registry.service.persistence.PositionPersistence;

import java.io.Serializable;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the position local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link ru.kotikov.registry.service.impl.PositionLocalServiceImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.kotikov.registry.service.impl.PositionLocalServiceImpl
 * @see ru.kotikov.registry.service.PositionLocalServiceUtil
 * @generated
 */
public abstract class PositionLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements PositionLocalService, IdentifiableBean {
    @BeanReference(type = ru.kotikov.registry.service.BankLocalService.class)
    protected ru.kotikov.registry.service.BankLocalService bankLocalService;
    @BeanReference(type = BankPersistence.class)
    protected BankPersistence bankPersistence;
    @BeanReference(type = ru.kotikov.registry.service.EmployeeLocalService.class)
    protected ru.kotikov.registry.service.EmployeeLocalService employeeLocalService;
    @BeanReference(type = EmployeePersistence.class)
    protected EmployeePersistence employeePersistence;
    @BeanReference(type = ru.kotikov.registry.service.PositionLocalService.class)
    protected ru.kotikov.registry.service.PositionLocalService positionLocalService;
    @BeanReference(type = PositionPersistence.class)
    protected PositionPersistence positionPersistence;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private PositionLocalServiceClpInvoker _clpInvoker = new PositionLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link ru.kotikov.registry.service.PositionLocalServiceUtil} to access the position local service.
     */

    /**
     * Adds the position to the database. Also notifies the appropriate model listeners.
     *
     * @param position the position
     * @return the position that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Position addPosition(Position position) throws SystemException {
        position.setNew(true);

        return positionPersistence.update(position);
    }

    /**
     * Creates a new position with the primary key. Does not add the position to the database.
     *
     * @param position_id the primary key for the new position
     * @return the new position
     */
    @Override
    public Position createPosition(long position_id) {
        return positionPersistence.create(position_id);
    }

    /**
     * Deletes the position with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param position_id the primary key of the position
     * @return the position that was removed
     * @throws PortalException if a position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Position deletePosition(long position_id)
        throws PortalException, SystemException {
        return positionPersistence.remove(position_id);
    }

    /**
     * Deletes the position from the database. Also notifies the appropriate model listeners.
     *
     * @param position the position
     * @return the position that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Position deletePosition(Position position) throws SystemException {
        return positionPersistence.remove(position);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Position.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return positionPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.PositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return positionPersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.PositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return positionPersistence.findWithDynamicQuery(dynamicQuery, start,
            end, orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return positionPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return positionPersistence.countWithDynamicQuery(dynamicQuery,
            projection);
    }

    @Override
    public Position fetchPosition(long position_id) throws SystemException {
        return positionPersistence.fetchByPrimaryKey(position_id);
    }

    /**
     * Returns the position with the primary key.
     *
     * @param position_id the primary key of the position
     * @return the position
     * @throws PortalException if a position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position getPosition(long position_id)
        throws PortalException, SystemException {
        return positionPersistence.findByPrimaryKey(position_id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return positionPersistence.findByPrimaryKey(primaryKeyObj);
    }

    /**
     * Returns a range of all the positions.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.PositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of positions
     * @param end the upper bound of the range of positions (not inclusive)
     * @return the range of positions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Position> getPositions(int start, int end)
        throws SystemException {
        return positionPersistence.findAll(start, end);
    }

    /**
     * Returns the number of positions.
     *
     * @return the number of positions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getPositionsCount() throws SystemException {
        return positionPersistence.countAll();
    }

    /**
     * Updates the position in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param position the position
     * @return the position that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Position updatePosition(Position position) throws SystemException {
        return positionPersistence.update(position);
    }

    /**
     * Returns the bank local service.
     *
     * @return the bank local service
     */
    public ru.kotikov.registry.service.BankLocalService getBankLocalService() {
        return bankLocalService;
    }

    /**
     * Sets the bank local service.
     *
     * @param bankLocalService the bank local service
     */
    public void setBankLocalService(
        ru.kotikov.registry.service.BankLocalService bankLocalService) {
        this.bankLocalService = bankLocalService;
    }

    /**
     * Returns the bank persistence.
     *
     * @return the bank persistence
     */
    public BankPersistence getBankPersistence() {
        return bankPersistence;
    }

    /**
     * Sets the bank persistence.
     *
     * @param bankPersistence the bank persistence
     */
    public void setBankPersistence(BankPersistence bankPersistence) {
        this.bankPersistence = bankPersistence;
    }

    /**
     * Returns the employee local service.
     *
     * @return the employee local service
     */
    public ru.kotikov.registry.service.EmployeeLocalService getEmployeeLocalService() {
        return employeeLocalService;
    }

    /**
     * Sets the employee local service.
     *
     * @param employeeLocalService the employee local service
     */
    public void setEmployeeLocalService(
        ru.kotikov.registry.service.EmployeeLocalService employeeLocalService) {
        this.employeeLocalService = employeeLocalService;
    }

    /**
     * Returns the employee persistence.
     *
     * @return the employee persistence
     */
    public EmployeePersistence getEmployeePersistence() {
        return employeePersistence;
    }

    /**
     * Sets the employee persistence.
     *
     * @param employeePersistence the employee persistence
     */
    public void setEmployeePersistence(EmployeePersistence employeePersistence) {
        this.employeePersistence = employeePersistence;
    }

    /**
     * Returns the position local service.
     *
     * @return the position local service
     */
    public ru.kotikov.registry.service.PositionLocalService getPositionLocalService() {
        return positionLocalService;
    }

    /**
     * Sets the position local service.
     *
     * @param positionLocalService the position local service
     */
    public void setPositionLocalService(
        ru.kotikov.registry.service.PositionLocalService positionLocalService) {
        this.positionLocalService = positionLocalService;
    }

    /**
     * Returns the position persistence.
     *
     * @return the position persistence
     */
    public PositionPersistence getPositionPersistence() {
        return positionPersistence;
    }

    /**
     * Sets the position persistence.
     *
     * @param positionPersistence the position persistence
     */
    public void setPositionPersistence(PositionPersistence positionPersistence) {
        this.positionPersistence = positionPersistence;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("ru.kotikov.registry.model.Position",
            positionLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "ru.kotikov.registry.model.Position");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Position.class;
    }

    protected String getModelClassName() {
        return Position.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = positionPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
