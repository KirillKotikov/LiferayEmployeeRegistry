package ru.kotikov.registry.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Position service. Represents a row in the &quot;registry_Position&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link ru.kotikov.registry.model.impl.PositionModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ru.kotikov.registry.model.impl.PositionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Position
 * @see ru.kotikov.registry.model.impl.PositionImpl
 * @see ru.kotikov.registry.model.impl.PositionModelImpl
 * @generated
 */
public interface PositionModel extends BaseModel<Position> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. All methods that expect a position model instance should use the {@link Position} interface instead.
     */

    /**
     * Returns the primary key of this position.
     *
     * @return the primary key of this position
     */
    public long getPrimaryKey();

    /**
     * Sets the primary key of this position.
     *
     * @param primaryKey the primary key of this position
     */
    public void setPrimaryKey(long primaryKey);

    /**
     * Returns the position ID of this position.
     *
     * @return the position ID of this position
     */
    public long getPositionId();

    /**
     * Sets the position ID of this position.
     *
     * @param positionId the position ID of this position
     */
    public void setPositionId(long positionId);

    /**
     * Returns the position name of this position.
     *
     * @return the position name of this position
     */
    @AutoEscape
    public String getPositionName();

    /**
     * Sets the position name of this position.
     *
     * @param positionName the position name of this position
     */
    public void setPositionName(String positionName);

    /**
     * Returns the archive status of this position.
     *
     * @return the archive status of this position
     */
    public boolean getArchiveStatus();

    /**
     * Returns <code>true</code> if this position is archive status.
     *
     * @return <code>true</code> if this position is archive status; <code>false</code> otherwise
     */
    public boolean isArchiveStatus();

    /**
     * Sets whether this position is archive status.
     *
     * @param archiveStatus the archive status of this position
     */
    public void setArchiveStatus(boolean archiveStatus);

    @Override
    public boolean isNew();

    @Override
    public void setNew(boolean n);

    @Override
    public boolean isCachedModel();

    @Override
    public void setCachedModel(boolean cachedModel);

    @Override
    public boolean isEscapedModel();

    @Override
    public Serializable getPrimaryKeyObj();

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj);

    @Override
    public ExpandoBridge getExpandoBridge();

    @Override
    public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

    @Override
    public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

    @Override
    public void setExpandoBridgeAttributes(ServiceContext serviceContext);

    @Override
    public Object clone();

    @Override
    public int compareTo(ru.kotikov.registry.model.Position position);

    @Override
    public int hashCode();

    @Override
    public CacheModel<ru.kotikov.registry.model.Position> toCacheModel();

    @Override
    public ru.kotikov.registry.model.Position toEscapedModel();

    @Override
    public ru.kotikov.registry.model.Position toUnescapedModel();

    @Override
    public String toString();

    @Override
    public String toXmlString();
}