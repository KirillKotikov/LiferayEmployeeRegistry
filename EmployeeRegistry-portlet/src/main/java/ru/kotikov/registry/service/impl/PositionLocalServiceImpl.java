package ru.kotikov.registry.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import ru.kotikov.registry.model.Employee;
import ru.kotikov.registry.model.Position;
import ru.kotikov.registry.service.base.PositionLocalServiceBaseImpl;

import java.util.List;

/**
 * The implementation of the position local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.kotikov.registry.service.PositionLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.kotikov.registry.service.base.PositionLocalServiceBaseImpl
 * @see ru.kotikov.registry.service.PositionLocalServiceUtil
 */
public class PositionLocalServiceImpl extends PositionLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link ru.kotikov.registry.service.PositionLocalServiceUtil} to access the position local service.
     */
    public List<Position> getByArchiveStatus(boolean archive) throws SystemException {
        return positionPersistence.findByArchiveStatus(archive);
    }
    public List<Employee> getPositionEmployees (Long positionId) throws SystemException {
        return employeePersistence.findByPositionId(positionId);
    }
}
