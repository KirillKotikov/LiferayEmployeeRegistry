package ru.kotikov.registry.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import ru.kotikov.registry.service.ClpSerializer;
import ru.kotikov.registry.service.PositionLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;


public class PositionClp extends BaseModelImpl<Position> implements Position {
    private long _position_id;
    private String _position_name;
    private boolean _archive_status;
    private BaseModel<?> _positionRemoteModel;
    private Class<?> _clpSerializerClass = ru.kotikov.registry.service.ClpSerializer.class;

    public PositionClp() {
    }

    @Override
    public Class<?> getModelClass() {
        return Position.class;
    }

    @Override
    public String getModelClassName() {
        return Position.class.getName();
    }

    @Override
    public long getPrimaryKey() {
        return _position_id;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPosition_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _position_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("position_id", getPosition_id());
        attributes.put("position_name", getPosition_name());
        attributes.put("archive_status", getArchive_status());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long position_id = (Long) attributes.get("position_id");

        if (position_id != null) {
            setPosition_id(position_id);
        }

        String position_name = (String) attributes.get("position_name");

        if (position_name != null) {
            setPosition_name(position_name);
        }

        Boolean archive_status = (Boolean) attributes.get("archive_status");

        if (archive_status != null) {
            setArchive_status(archive_status);
        }
    }

    @Override
    public long getPosition_id() {
        return _position_id;
    }

    @Override
    public void setPosition_id(long position_id) {
        _position_id = position_id;

        if (_positionRemoteModel != null) {
            try {
                Class<?> clazz = _positionRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition_id", long.class);

                method.invoke(_positionRemoteModel, position_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPosition_name() {
        return _position_name;
    }

    @Override
    public void setPosition_name(String position_name) {
        _position_name = position_name;

        if (_positionRemoteModel != null) {
            try {
                Class<?> clazz = _positionRemoteModel.getClass();

                Method method = clazz.getMethod("setPosition_name", String.class);

                method.invoke(_positionRemoteModel, position_name);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchive_status() {
        return _archive_status;
    }

    @Override
    public boolean isArchive_status() {
        return _archive_status;
    }

    @Override
    public void setArchive_status(boolean archive_status) {
        _archive_status = archive_status;

        if (_positionRemoteModel != null) {
            try {
                Class<?> clazz = _positionRemoteModel.getClass();

                Method method = clazz.getMethod("setArchive_status",
                        boolean.class);

                method.invoke(_positionRemoteModel, archive_status);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPositionRemoteModel() {
        return _positionRemoteModel;
    }

    public void setPositionRemoteModel(BaseModel<?> positionRemoteModel) {
        _positionRemoteModel = positionRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _positionRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_positionRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PositionLocalServiceUtil.addPosition(this);
        } else {
            PositionLocalServiceUtil.updatePosition(this);
        }
    }

    @Override
    public Position toEscapedModel() {
        return (Position) ProxyUtil.newProxyInstance(Position.class.getClassLoader(),
            new Class[] { Position.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PositionClp clone = new PositionClp();

        clone.setPosition_id(getPosition_id());
        clone.setPosition_name(getPosition_name());
        clone.setArchive_status(getArchive_status());

        return clone;
    }

    @Override
    public int compareTo(Position position) {
        int value = 0;

        value = getPosition_name().compareTo(position.getPosition_name());

        if (value != 0) {
            return value;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PositionClp)) {
            return false;
        }

        PositionClp position = (PositionClp) obj;

        long primaryKey = position.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    public Class<?> getClpSerializerClass() {
        return _clpSerializerClass;
    }

    @Override
    public int hashCode() {
        return (int) getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{position_id=");
        sb.append(getPosition_id());
        sb.append(", position_name=");
        sb.append(getPosition_name());
        sb.append(", archive_status=");
        sb.append(getArchive_status());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(13);

        sb.append("<model><model-name>");
        sb.append("ru.kotikov.registry.model.Position");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>position_id</column-name><column-value><![CDATA[");
        sb.append(getPosition_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>position_name</column-name><column-value><![CDATA[");
        sb.append(getPosition_name());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archive_status</column-name><column-value><![CDATA[");
        sb.append(getArchive_status());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
