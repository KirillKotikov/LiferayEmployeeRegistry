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
    private long _positionId;
    private String _positionName;
    private boolean _archiveStatus;
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
        return _positionId;
    }

    @Override
    public void setPrimaryKey(long primaryKey) {
        setPositionId(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _positionId;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Long) primaryKeyObj).longValue());
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("positionId", getPositionId());
        attributes.put("positionName", getPositionName());
        attributes.put("archiveStatus", getArchiveStatus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Long positionId = (Long) attributes.get("positionId");

        if (positionId != null) {
            setPositionId(positionId);
        }

        String positionName = (String) attributes.get("positionName");

        if (positionName != null) {
            setPositionName(positionName);
        }

        Boolean archiveStatus = (Boolean) attributes.get("archiveStatus");

        if (archiveStatus != null) {
            setArchiveStatus(archiveStatus);
        }
    }

    @Override
    public long getPositionId() {
        return _positionId;
    }

    @Override
    public void setPositionId(long positionId) {
        _positionId = positionId;

        if (_positionRemoteModel != null) {
            try {
                Class<?> clazz = _positionRemoteModel.getClass();

                Method method = clazz.getMethod("setPositionId", long.class);

                method.invoke(_positionRemoteModel, positionId);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPositionName() {
        return _positionName;
    }

    @Override
    public void setPositionName(String positionName) {
        _positionName = positionName;

        if (_positionRemoteModel != null) {
            try {
                Class<?> clazz = _positionRemoteModel.getClass();

                Method method = clazz.getMethod("setPositionName", String.class);

                method.invoke(_positionRemoteModel, positionName);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public boolean getArchiveStatus() {
        return _archiveStatus;
    }

    @Override
    public boolean isArchiveStatus() {
        return _archiveStatus;
    }

    @Override
    public void setArchiveStatus(boolean archiveStatus) {
        _archiveStatus = archiveStatus;

        if (_positionRemoteModel != null) {
            try {
                Class<?> clazz = _positionRemoteModel.getClass();

                Method method = clazz.getMethod("setArchiveStatus",
                        boolean.class);

                method.invoke(_positionRemoteModel, archiveStatus);
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

        clone.setPositionId(getPositionId());
        clone.setPositionName(getPositionName());
        clone.setArchiveStatus(getArchiveStatus());

        return clone;
    }

    @Override
    public int compareTo(Position position) {
        int value = 0;

        value = getPositionName().compareTo(position.getPositionName());

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

        sb.append("{positionId=");
        sb.append(getPositionId());
        sb.append(", positionName=");
        sb.append(getPositionName());
        sb.append(", archiveStatus=");
        sb.append(getArchiveStatus());
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
            "<column><column-name>positionId</column-name><column-value><![CDATA[");
        sb.append(getPositionId());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>positionName</column-name><column-value><![CDATA[");
        sb.append(getPositionName());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>archiveStatus</column-name><column-value><![CDATA[");
        sb.append(getArchiveStatus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
