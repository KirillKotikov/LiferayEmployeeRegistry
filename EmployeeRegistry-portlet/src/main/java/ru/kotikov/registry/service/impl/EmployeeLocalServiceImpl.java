package ru.kotikov.registry.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import ru.kotikov.registry.model.Employee;
import ru.kotikov.registry.portlets.EmployeesPortlet;
import ru.kotikov.registry.service.EmployeeLocalService;
import ru.kotikov.registry.service.EmployeeLocalServiceUtil;
import ru.kotikov.registry.service.base.EmployeeLocalServiceBaseImpl;
import ru.kotikov.registry.service.persistence.EmployeeUtil;

import java.util.List;

/**
 * The implementation of the employee local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.kotikov.registry.service.EmployeeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.kotikov.registry.service.base.EmployeeLocalServiceBaseImpl
 * @see ru.kotikov.registry.service.EmployeeLocalServiceUtil
 */
public class EmployeeLocalServiceImpl extends EmployeeLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link ru.kotikov.registry.service.EmployeeLocalServiceUtil} to access the employee local service.
     */

    public List<Employee> getByArchiveStatus(boolean archive) throws SystemException {
        return employeePersistence.findByArchiveStatus(archive);
    }

    public List<Employee> getBankClients(long bankId) throws SystemException {
        return employeePersistence.findByBankId(bankId);
    }
}
