package ru.kotikov.registry.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import ru.kotikov.registry.model.Position;

import java.util.List;

/**
 * The persistence utility for the position service. This utility wraps {@link PositionPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionPersistence
 * @see PositionPersistenceImpl
 * @generated
 */
public class PositionUtil {
    private static PositionPersistence _persistence;

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
    public static void clearCache(Position position) {
        getPersistence().clearCache(position);
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
    public static List<Position> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Position> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Position> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Position update(Position position) throws SystemException {
        return getPersistence().update(position);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Position update(Position position,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(position, serviceContext);
    }

    /**
    * Returns all the positions where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the matching positions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Position> findByArchiveStatus(
        boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveStatus(archive_status);
    }

    /**
    * Returns a range of all the positions where archive_status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.PositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive_status the archive_status
    * @param start the lower bound of the range of positions
    * @param end the upper bound of the range of positions (not inclusive)
    * @return the range of matching positions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Position> findByArchiveStatus(
        boolean archive_status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findByArchiveStatus(archive_status, start, end);
    }

    /**
    * Returns an ordered range of all the positions where archive_status = &#63;.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.PositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param archive_status the archive_status
    * @param start the lower bound of the range of positions
    * @param end the upper bound of the range of positions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching positions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Position> findByArchiveStatus(
        boolean archive_status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .findByArchiveStatus(archive_status, start, end,
            orderByComparator);
    }

    /**
    * Returns the first position in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching position
    * @throws ru.kotikov.registry.NoSuchPositionException if a matching position could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Position findByArchiveStatus_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException {
        return getPersistence()
                   .findByArchiveStatus_First(archive_status, orderByComparator);
    }

    /**
    * Returns the first position in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching position, or <code>null</code> if a matching position could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Position fetchByArchiveStatus_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchiveStatus_First(archive_status, orderByComparator);
    }

    /**
    * Returns the last position in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching position
    * @throws ru.kotikov.registry.NoSuchPositionException if a matching position could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Position findByArchiveStatus_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException {
        return getPersistence()
                   .findByArchiveStatus_Last(archive_status, orderByComparator);
    }

    /**
    * Returns the last position in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching position, or <code>null</code> if a matching position could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Position fetchByArchiveStatus_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence()
                   .fetchByArchiveStatus_Last(archive_status, orderByComparator);
    }

    /**
    * Returns the positions before and after the current position in the ordered set where archive_status = &#63;.
    *
    * @param position_id the primary key of the current position
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the previous, current, and next position
    * @throws ru.kotikov.registry.NoSuchPositionException if a position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Position[] findByArchiveStatus_PrevAndNext(
        long position_id, boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException {
        return getPersistence()
                   .findByArchiveStatus_PrevAndNext(position_id,
            archive_status, orderByComparator);
    }

    /**
    * Removes all the positions where archive_status = &#63; from the database.
    *
    * @param archive_status the archive_status
    * @throws SystemException if a system exception occurred
    */
    public static void removeByArchiveStatus(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeByArchiveStatus(archive_status);
    }

    /**
    * Returns the number of positions where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the number of matching positions
    * @throws SystemException if a system exception occurred
    */
    public static int countByArchiveStatus(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countByArchiveStatus(archive_status);
    }

    /**
    * Caches the position in the entity cache if it is enabled.
    *
    * @param position the position
    */
    public static void cacheResult(ru.kotikov.registry.model.Position position) {
        getPersistence().cacheResult(position);
    }

    /**
    * Caches the positions in the entity cache if it is enabled.
    *
    * @param positions the positions
    */
    public static void cacheResult(
        java.util.List<ru.kotikov.registry.model.Position> positions) {
        getPersistence().cacheResult(positions);
    }

    /**
    * Creates a new position with the primary key. Does not add the position to the database.
    *
    * @param position_id the primary key for the new position
    * @return the new position
    */
    public static ru.kotikov.registry.model.Position create(long position_id) {
        return getPersistence().create(position_id);
    }

    /**
    * Removes the position with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_id the primary key of the position
    * @return the position that was removed
    * @throws ru.kotikov.registry.NoSuchPositionException if a position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Position remove(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException {
        return getPersistence().remove(position_id);
    }

    public static ru.kotikov.registry.model.Position updateImpl(
        ru.kotikov.registry.model.Position position)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(position);
    }

    /**
    * Returns the position with the primary key or throws a {@link ru.kotikov.registry.NoSuchPositionException} if it could not be found.
    *
    * @param position_id the primary key of the position
    * @return the position
    * @throws ru.kotikov.registry.NoSuchPositionException if a position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Position findByPrimaryKey(
        long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException {
        return getPersistence().findByPrimaryKey(position_id);
    }

    /**
    * Returns the position with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param position_id the primary key of the position
    * @return the position, or <code>null</code> if a position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static ru.kotikov.registry.model.Position fetchByPrimaryKey(
        long position_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(position_id);
    }

    /**
    * Returns all the positions.
    *
    * @return the positions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Position> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<ru.kotikov.registry.model.Position> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the positions.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ru.kotikov.registry.model.impl.PositionModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of positions
    * @param end the upper bound of the range of positions (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of positions
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<ru.kotikov.registry.model.Position> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the positions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of positions.
    *
    * @return the number of positions
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PositionPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PositionPersistence) PortletBeanLocatorUtil.locate(ru.kotikov.registry.service.ClpSerializer.getServletContextName(),
                    PositionPersistence.class.getName());

            ReferenceRegistry.registerReference(PositionUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PositionPersistence persistence) {
    }
}
