package ru.kotikov.registry.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import ru.kotikov.registry.model.Position;
import ru.kotikov.registry.service.PositionLocalServiceUtil;

/**
 * The extended model base implementation for the Position service. Represents a row in the &quot;registry_Position&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PositionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PositionImpl
 * @see ru.kotikov.registry.model.Position
 * @generated
 */
public abstract class PositionBaseImpl extends PositionModelImpl
    implements Position {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a position model instance should use the {@link Position} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PositionLocalServiceUtil.addPosition(this);
        } else {
            PositionLocalServiceUtil.updatePosition(this);
        }
    }
}
