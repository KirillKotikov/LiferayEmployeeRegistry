package ru.kotikov.registry.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import ru.kotikov.registry.service.BankLocalServiceUtil;
import ru.kotikov.registry.service.ClpSerializer;
import ru.kotikov.registry.service.EmployeeLocalServiceUtil;
import ru.kotikov.registry.service.PositionLocalServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            BankLocalServiceUtil.clearService();

            EmployeeLocalServiceUtil.clearService();

            PositionLocalServiceUtil.clearService();
        }
    }
}
