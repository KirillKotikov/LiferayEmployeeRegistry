package ru.kotikov.registry.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import ru.kotikov.registry.model.Bank;
import ru.kotikov.registry.service.BankLocalServiceUtil;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public abstract class BankActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public BankActionableDynamicQuery() throws SystemException {
        setBaseLocalService(BankLocalServiceUtil.getService());
        setClass(Bank.class);

        setClassLoader(ru.kotikov.registry.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("bankId");
    }
}
