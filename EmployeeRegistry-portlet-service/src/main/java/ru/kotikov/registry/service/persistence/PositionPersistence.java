package ru.kotikov.registry.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import ru.kotikov.registry.model.Position;

/**
 * The persistence interface for the position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionPersistenceImpl
 * @see PositionUtil
 * @generated
 */
public interface PositionPersistence extends BasePersistence<Position> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PositionUtil} to access the position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Returns all the positions where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the matching positions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.registry.model.Position> findByArchiveStatus(
        boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.registry.model.Position> findByArchiveStatus(
        boolean archive_status, int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.registry.model.Position> findByArchiveStatus(
        boolean archive_status, int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the first position in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching position
    * @throws ru.kotikov.registry.NoSuchPositionException if a matching position could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Position findByArchiveStatus_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException;

    /**
    * Returns the first position in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the first matching position, or <code>null</code> if a matching position could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Position fetchByArchiveStatus_First(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the last position in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching position
    * @throws ru.kotikov.registry.NoSuchPositionException if a matching position could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Position findByArchiveStatus_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException;

    /**
    * Returns the last position in the ordered set where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
    * @return the last matching position, or <code>null</code> if a matching position could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Position fetchByArchiveStatus_Last(
        boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public ru.kotikov.registry.model.Position[] findByArchiveStatus_PrevAndNext(
        long position_id, boolean archive_status,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException;

    /**
    * Removes all the positions where archive_status = &#63; from the database.
    *
    * @param archive_status the archive_status
    * @throws SystemException if a system exception occurred
    */
    public void removeByArchiveStatus(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of positions where archive_status = &#63;.
    *
    * @param archive_status the archive_status
    * @return the number of matching positions
    * @throws SystemException if a system exception occurred
    */
    public int countByArchiveStatus(boolean archive_status)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Caches the position in the entity cache if it is enabled.
    *
    * @param position the position
    */
    public void cacheResult(ru.kotikov.registry.model.Position position);

    /**
    * Caches the positions in the entity cache if it is enabled.
    *
    * @param positions the positions
    */
    public void cacheResult(
        java.util.List<ru.kotikov.registry.model.Position> positions);

    /**
    * Creates a new position with the primary key. Does not add the position to the database.
    *
    * @param position_id the primary key for the new position
    * @return the new position
    */
    public ru.kotikov.registry.model.Position create(long position_id);

    /**
    * Removes the position with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param position_id the primary key of the position
    * @return the position that was removed
    * @throws ru.kotikov.registry.NoSuchPositionException if a position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Position remove(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException;

    public ru.kotikov.registry.model.Position updateImpl(
        ru.kotikov.registry.model.Position position)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the position with the primary key or throws a {@link ru.kotikov.registry.NoSuchPositionException} if it could not be found.
    *
    * @param position_id the primary key of the position
    * @return the position
    * @throws ru.kotikov.registry.NoSuchPositionException if a position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Position findByPrimaryKey(long position_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            ru.kotikov.registry.NoSuchPositionException;

    /**
    * Returns the position with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param position_id the primary key of the position
    * @return the position, or <code>null</code> if a position with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public ru.kotikov.registry.model.Position fetchByPrimaryKey(
        long position_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the positions.
    *
    * @return the positions
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<ru.kotikov.registry.model.Position> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.registry.model.Position> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<ru.kotikov.registry.model.Position> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the positions from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of positions.
    *
    * @return the number of positions
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
