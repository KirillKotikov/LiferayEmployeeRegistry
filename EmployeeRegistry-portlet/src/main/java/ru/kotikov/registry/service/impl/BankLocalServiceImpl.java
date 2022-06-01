package ru.kotikov.registry.service.impl;

import ru.kotikov.registry.service.base.BankLocalServiceBaseImpl;

/**
 * The implementation of the bank local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link ru.kotikov.registry.service.BankLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ru.kotikov.registry.service.base.BankLocalServiceBaseImpl
 * @see ru.kotikov.registry.service.BankLocalServiceUtil
 */
public class BankLocalServiceImpl extends BankLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link ru.kotikov.registry.service.BankLocalServiceUtil} to access the bank local service.
     */
}
