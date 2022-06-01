package ru.kotikov.registry.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.kotikov.registry.model.Position;
import ru.kotikov.registry.service.PositionLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class PositionActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PositionActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PositionLocalServiceUtil.getService());
        setClass(Position.class);

        setClassLoader(ru.kotikov.registry.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("positionId");
    }
}
