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

import ru.kotikov.registry.NoSuchPositionException;
import ru.kotikov.registry.model.Position;
import ru.kotikov.registry.model.impl.PositionImpl;
import ru.kotikov.registry.model.impl.PositionModelImpl;
import ru.kotikov.registry.service.persistence.PositionPersistence;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the position service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionPersistence
 * @see PositionUtil
 * @generated
 */
public class PositionPersistenceImpl extends BasePersistenceImpl<Position>
    implements PositionPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PositionUtil} to access the position persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PositionImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PositionModelImpl.ENTITY_CACHE_ENABLED,
            PositionModelImpl.FINDER_CACHE_ENABLED, PositionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PositionModelImpl.ENTITY_CACHE_ENABLED,
            PositionModelImpl.FINDER_CACHE_ENABLED, PositionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PositionModelImpl.ENTITY_CACHE_ENABLED,
            PositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_ARCHIVESTATUS =
        new FinderPath(PositionModelImpl.ENTITY_CACHE_ENABLED,
            PositionModelImpl.FINDER_CACHE_ENABLED, PositionImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByArchiveStatus",
            new String[] {
                Boolean.class.getName(),
                
            Integer.class.getName(), Integer.class.getName(),
                OrderByComparator.class.getName()
            });
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS =
        new FinderPath(PositionModelImpl.ENTITY_CACHE_ENABLED,
            PositionModelImpl.FINDER_CACHE_ENABLED, PositionImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByArchiveStatus",
            new String[] { Boolean.class.getName() },
            PositionModelImpl.ARCHIVE_STATUS_COLUMN_BITMASK |
            PositionModelImpl.POSITION_NAME_COLUMN_BITMASK);
    public static final FinderPath FINDER_PATH_COUNT_BY_ARCHIVESTATUS = new FinderPath(PositionModelImpl.ENTITY_CACHE_ENABLED,
            PositionModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByArchiveStatus",
            new String[] { Boolean.class.getName() });
    private static final String _FINDER_COLUMN_ARCHIVESTATUS_ARCHIVE_STATUS_2 = "position.archive_status = ?";
    private static final String _SQL_SELECT_POSITION = "SELECT position FROM Position position";
    private static final String _SQL_SELECT_POSITION_WHERE = "SELECT position FROM Position position WHERE ";
    private static final String _SQL_COUNT_POSITION = "SELECT COUNT(position) FROM Position position";
    private static final String _SQL_COUNT_POSITION_WHERE = "SELECT COUNT(position) FROM Position position WHERE ";
    private static final String _ORDER_BY_ENTITY_ALIAS = "position.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Position exists with the primary key ";
    private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Position exists with the key {";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PositionPersistenceImpl.class);
    private static Position _nullPosition = new PositionImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Position> toCacheModel() {
                return _nullPositionCacheModel;
            }
        };

    private static CacheModel<Position> _nullPositionCacheModel = new CacheModel<Position>() {
            @Override
            public Position toEntityModel() {
                return _nullPosition;
            }
        };

    public PositionPersistenceImpl() {
        setModelClass(Position.class);
    }

    /**
     * Returns all the positions where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @return the matching positions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Position> findByArchiveStatus(boolean archive_status)
        throws SystemException {
        return findByArchiveStatus(archive_status, QueryUtil.ALL_POS,
            QueryUtil.ALL_POS, null);
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
    @Override
    public List<Position> findByArchiveStatus(boolean archive_status,
        int start, int end) throws SystemException {
        return findByArchiveStatus(archive_status, start, end, null);
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
    @Override
    public List<Position> findByArchiveStatus(boolean archive_status,
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

        List<Position> list = (List<Position>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if ((list != null) && !list.isEmpty()) {
            for (Position position : list) {
                if ((archive_status != position.getArchive_status())) {
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

            query.append(_SQL_SELECT_POSITION_WHERE);

            query.append(_FINDER_COLUMN_ARCHIVESTATUS_ARCHIVE_STATUS_2);

            if (orderByComparator != null) {
                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);
            } else
             if (pagination) {
                query.append(PositionModelImpl.ORDER_BY_JPQL);
            }

            String sql = query.toString();

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                QueryPos qPos = QueryPos.getInstance(q);

                qPos.add(archive_status);

                if (!pagination) {
                    list = (List<Position>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Position>(list);
                } else {
                    list = (List<Position>) QueryUtil.list(q, getDialect(),
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
     * Returns the first position in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching position
     * @throws ru.kotikov.registry.NoSuchPositionException if a matching position could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position findByArchiveStatus_First(boolean archive_status,
        OrderByComparator orderByComparator)
        throws NoSuchPositionException, SystemException {
        Position position = fetchByArchiveStatus_First(archive_status,
                orderByComparator);

        if (position != null) {
            return position;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive_status=");
        msg.append(archive_status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPositionException(msg.toString());
    }

    /**
     * Returns the first position in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the first matching position, or <code>null</code> if a matching position could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position fetchByArchiveStatus_First(boolean archive_status,
        OrderByComparator orderByComparator) throws SystemException {
        List<Position> list = findByArchiveStatus(archive_status, 0, 1,
                orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Position findByArchiveStatus_Last(boolean archive_status,
        OrderByComparator orderByComparator)
        throws NoSuchPositionException, SystemException {
        Position position = fetchByArchiveStatus_Last(archive_status,
                orderByComparator);

        if (position != null) {
            return position;
        }

        StringBundler msg = new StringBundler(4);

        msg.append(_NO_SUCH_ENTITY_WITH_KEY);

        msg.append("archive_status=");
        msg.append(archive_status);

        msg.append(StringPool.CLOSE_CURLY_BRACE);

        throw new NoSuchPositionException(msg.toString());
    }

    /**
     * Returns the last position in the ordered set where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
     * @return the last matching position, or <code>null</code> if a matching position could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position fetchByArchiveStatus_Last(boolean archive_status,
        OrderByComparator orderByComparator) throws SystemException {
        int count = countByArchiveStatus(archive_status);

        if (count == 0) {
            return null;
        }

        List<Position> list = findByArchiveStatus(archive_status, count - 1,
                count, orderByComparator);

        if (!list.isEmpty()) {
            return list.get(0);
        }

        return null;
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
    @Override
    public Position[] findByArchiveStatus_PrevAndNext(long position_id,
        boolean archive_status, OrderByComparator orderByComparator)
        throws NoSuchPositionException, SystemException {
        Position position = findByPrimaryKey(position_id);

        Session session = null;

        try {
            session = openSession();

            Position[] array = new PositionImpl[3];

            array[0] = getByArchiveStatus_PrevAndNext(session, position,
                    archive_status, orderByComparator, true);

            array[1] = position;

            array[2] = getByArchiveStatus_PrevAndNext(session, position,
                    archive_status, orderByComparator, false);

            return array;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    protected Position getByArchiveStatus_PrevAndNext(Session session,
        Position position, boolean archive_status,
        OrderByComparator orderByComparator, boolean previous) {
        StringBundler query = null;

        if (orderByComparator != null) {
            query = new StringBundler(6 +
                    (orderByComparator.getOrderByFields().length * 6));
        } else {
            query = new StringBundler(3);
        }

        query.append(_SQL_SELECT_POSITION_WHERE);

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
            query.append(PositionModelImpl.ORDER_BY_JPQL);
        }

        String sql = query.toString();

        Query q = session.createQuery(sql);

        q.setFirstResult(0);
        q.setMaxResults(2);

        QueryPos qPos = QueryPos.getInstance(q);

        qPos.add(archive_status);

        if (orderByComparator != null) {
            Object[] values = orderByComparator.getOrderByConditionValues(position);

            for (Object value : values) {
                qPos.add(value);
            }
        }

        List<Position> list = q.list();

        if (list.size() == 2) {
            return list.get(1);
        } else {
            return null;
        }
    }

    /**
     * Removes all the positions where archive_status = &#63; from the database.
     *
     * @param archive_status the archive_status
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeByArchiveStatus(boolean archive_status)
        throws SystemException {
        for (Position position : findByArchiveStatus(archive_status,
                QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
            remove(position);
        }
    }

    /**
     * Returns the number of positions where archive_status = &#63;.
     *
     * @param archive_status the archive_status
     * @return the number of matching positions
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

            query.append(_SQL_COUNT_POSITION_WHERE);

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
     * Caches the position in the entity cache if it is enabled.
     *
     * @param position the position
     */
    @Override
    public void cacheResult(Position position) {
        EntityCacheUtil.putResult(PositionModelImpl.ENTITY_CACHE_ENABLED,
            PositionImpl.class, position.getPrimaryKey(), position);

        position.resetOriginalValues();
    }

    /**
     * Caches the positions in the entity cache if it is enabled.
     *
     * @param positions the positions
     */
    @Override
    public void cacheResult(List<Position> positions) {
        for (Position position : positions) {
            if (EntityCacheUtil.getResult(
                        PositionModelImpl.ENTITY_CACHE_ENABLED,
                        PositionImpl.class, position.getPrimaryKey()) == null) {
                cacheResult(position);
            } else {
                position.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all positions.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PositionImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PositionImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the position.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Position position) {
        EntityCacheUtil.removeResult(PositionModelImpl.ENTITY_CACHE_ENABLED,
            PositionImpl.class, position.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Position> positions) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Position position : positions) {
            EntityCacheUtil.removeResult(PositionModelImpl.ENTITY_CACHE_ENABLED,
                PositionImpl.class, position.getPrimaryKey());
        }
    }

    /**
     * Creates a new position with the primary key. Does not add the position to the database.
     *
     * @param position_id the primary key for the new position
     * @return the new position
     */
    @Override
    public Position create(long position_id) {
        Position position = new PositionImpl();

        position.setNew(true);
        position.setPrimaryKey(position_id);

        return position;
    }

    /**
     * Removes the position with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param position_id the primary key of the position
     * @return the position that was removed
     * @throws ru.kotikov.registry.NoSuchPositionException if a position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position remove(long position_id)
        throws NoSuchPositionException, SystemException {
        return remove((Serializable) position_id);
    }

    /**
     * Removes the position with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the position
     * @return the position that was removed
     * @throws ru.kotikov.registry.NoSuchPositionException if a position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position remove(Serializable primaryKey)
        throws NoSuchPositionException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Position position = (Position) session.get(PositionImpl.class,
                    primaryKey);

            if (position == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(position);
        } catch (NoSuchPositionException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Position removeImpl(Position position) throws SystemException {
        position = toUnwrappedModel(position);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(position)) {
                position = (Position) session.get(PositionImpl.class,
                        position.getPrimaryKeyObj());
            }

            if (position != null) {
                session.delete(position);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (position != null) {
            clearCache(position);
        }

        return position;
    }

    @Override
    public Position updateImpl(ru.kotikov.registry.model.Position position)
        throws SystemException {
        position = toUnwrappedModel(position);

        boolean isNew = position.isNew();

        PositionModelImpl positionModelImpl = (PositionModelImpl) position;

        Session session = null;

        try {
            session = openSession();

            if (position.isNew()) {
                session.save(position);

                position.setNew(false);
            } else {
                session.merge(position);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew || !PositionModelImpl.COLUMN_BITMASK_ENABLED) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }
        else {
            if ((positionModelImpl.getColumnBitmask() &
                    FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS.getColumnBitmask()) != 0) {
                Object[] args = new Object[] {
                        positionModelImpl.getOriginalArchive_status()
                    };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVESTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS,
                    args);

                args = new Object[] { positionModelImpl.getArchive_status() };

                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_ARCHIVESTATUS,
                    args);
                FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_ARCHIVESTATUS,
                    args);
            }
        }

        EntityCacheUtil.putResult(PositionModelImpl.ENTITY_CACHE_ENABLED,
            PositionImpl.class, position.getPrimaryKey(), position);

        return position;
    }

    protected Position toUnwrappedModel(Position position) {
        if (position instanceof PositionImpl) {
            return position;
        }

        PositionImpl positionImpl = new PositionImpl();

        positionImpl.setNew(position.isNew());
        positionImpl.setPrimaryKey(position.getPrimaryKey());

        positionImpl.setPosition_id(position.getPosition_id());
        positionImpl.setPosition_name(position.getPosition_name());
        positionImpl.setArchive_status(position.isArchive_status());

        return positionImpl;
    }

    /**
     * Returns the position with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the position
     * @return the position
     * @throws ru.kotikov.registry.NoSuchPositionException if a position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPositionException, SystemException {
        Position position = fetchByPrimaryKey(primaryKey);

        if (position == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPositionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return position;
    }

    /**
     * Returns the position with the primary key or throws a {@link ru.kotikov.registry.NoSuchPositionException} if it could not be found.
     *
     * @param position_id the primary key of the position
     * @return the position
     * @throws ru.kotikov.registry.NoSuchPositionException if a position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position findByPrimaryKey(long position_id)
        throws NoSuchPositionException, SystemException {
        return findByPrimaryKey((Serializable) position_id);
    }

    /**
     * Returns the position with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the position
     * @return the position, or <code>null</code> if a position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Position position = (Position) EntityCacheUtil.getResult(PositionModelImpl.ENTITY_CACHE_ENABLED,
                PositionImpl.class, primaryKey);

        if (position == _nullPosition) {
            return null;
        }

        if (position == null) {
            Session session = null;

            try {
                session = openSession();

                position = (Position) session.get(PositionImpl.class, primaryKey);

                if (position != null) {
                    cacheResult(position);
                } else {
                    EntityCacheUtil.putResult(PositionModelImpl.ENTITY_CACHE_ENABLED,
                        PositionImpl.class, primaryKey, _nullPosition);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PositionModelImpl.ENTITY_CACHE_ENABLED,
                    PositionImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return position;
    }

    /**
     * Returns the position with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param position_id the primary key of the position
     * @return the position, or <code>null</code> if a position with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Position fetchByPrimaryKey(long position_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) position_id);
    }

    /**
     * Returns all the positions.
     *
     * @return the positions
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Position> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Position> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Position> findAll(int start, int end,
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

        List<Position> list = (List<Position>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_POSITION);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_POSITION;

                if (pagination) {
                    sql = sql.concat(PositionModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Position>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Position>(list);
                } else {
                    list = (List<Position>) QueryUtil.list(q, getDialect(),
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
     * Removes all the positions from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Position position : findAll()) {
            remove(position);
        }
    }

    /**
     * Returns the number of positions.
     *
     * @return the number of positions
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

                Query q = session.createQuery(_SQL_COUNT_POSITION);

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
     * Initializes the position persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.ru.kotikov.registry.model.Position")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Position>> listenersList = new ArrayList<ModelListener<Position>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Position>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PositionImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
