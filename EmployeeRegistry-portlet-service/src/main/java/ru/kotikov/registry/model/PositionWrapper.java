package ru.kotikov.registry.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Position}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Position
 * @generated
 */
public class PositionWrapper implements Position, ModelWrapper<Position> {
    private Position _position;

    public PositionWrapper(Position position) {
        _position = position;
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

    /**
    * Returns the primary key of this position.
    *
    * @return the primary key of this position
    */
    @Override
    public long getPrimaryKey() {
        return _position.getPrimaryKey();
    }

    /**
    * Sets the primary key of this position.
    *
    * @param primaryKey the primary key of this position
    */
    @Override
    public void setPrimaryKey(long primaryKey) {
        _position.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the position ID of this position.
    *
    * @return the position ID of this position
    */
    @Override
    public long getPositionId() {
        return _position.getPositionId();
    }

    /**
    * Sets the position ID of this position.
    *
    * @param positionId the position ID of this position
    */
    @Override
    public void setPositionId(long positionId) {
        _position.setPositionId(positionId);
    }

    /**
    * Returns the position name of this position.
    *
    * @return the position name of this position
    */
    @Override
    public java.lang.String getPositionName() {
        return _position.getPositionName();
    }

    /**
    * Sets the position name of this position.
    *
    * @param positionName the position name of this position
    */
    @Override
    public void setPositionName(java.lang.String positionName) {
        _position.setPositionName(positionName);
    }

    /**
    * Returns the archive status of this position.
    *
    * @return the archive status of this position
    */
    @Override
    public boolean getArchiveStatus() {
        return _position.getArchiveStatus();
    }

    /**
    * Returns <code>true</code> if this position is archive status.
    *
    * @return <code>true</code> if this position is archive status; <code>false</code> otherwise
    */
    @Override
    public boolean isArchiveStatus() {
        return _position.isArchiveStatus();
    }

    /**
    * Sets whether this position is archive status.
    *
    * @param archiveStatus the archive status of this position
    */
    @Override
    public void setArchiveStatus(boolean archiveStatus) {
        _position.setArchiveStatus(archiveStatus);
    }

    @Override
    public boolean isNew() {
        return _position.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _position.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _position.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _position.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _position.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _position.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _position.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _position.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _position.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _position.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _position.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PositionWrapper((Position) _position.clone());
    }

    @Override
    public int compareTo(ru.kotikov.registry.model.Position position) {
        return _position.compareTo(position);
    }

    @Override
    public int hashCode() {
        return _position.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<ru.kotikov.registry.model.Position> toCacheModel() {
        return _position.toCacheModel();
    }

    @Override
    public ru.kotikov.registry.model.Position toEscapedModel() {
        return new PositionWrapper(_position.toEscapedModel());
    }

    @Override
    public ru.kotikov.registry.model.Position toUnescapedModel() {
        return new PositionWrapper(_position.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _position.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _position.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _position.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PositionWrapper)) {
            return false;
        }

        PositionWrapper positionWrapper = (PositionWrapper) obj;

        if (Validator.equals(_position, positionWrapper._position)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Position getWrappedPosition() {
        return _position;
    }

    @Override
    public Position getWrappedModel() {
        return _position;
    }

    @Override
    public void resetOriginalValues() {
        _position.resetOriginalValues();
    }
}
