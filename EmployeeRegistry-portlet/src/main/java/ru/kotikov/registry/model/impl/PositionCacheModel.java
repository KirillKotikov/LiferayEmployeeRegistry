package ru.kotikov.registry.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import ru.kotikov.registry.model.Position;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Position in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see Position
 * @generated
 */
public class PositionCacheModel implements CacheModel<Position>, Externalizable {
    public long positionId;
    public String positionName;
    public boolean archiveStatus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{positionId=");
        sb.append(positionId);
        sb.append(", positionName=");
        sb.append(positionName);
        sb.append(", archiveStatus=");
        sb.append(archiveStatus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Position toEntityModel() {
        PositionImpl positionImpl = new PositionImpl();

        positionImpl.setPositionId(positionId);

        if (positionName == null) {
            positionImpl.setPositionName(StringPool.BLANK);
        } else {
            positionImpl.setPositionName(positionName);
        }

        positionImpl.setArchiveStatus(archiveStatus);

        positionImpl.resetOriginalValues();

        return positionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        positionId = objectInput.readLong();
        positionName = objectInput.readUTF();
        archiveStatus = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(positionId);

        if (positionName == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(positionName);
        }

        objectOutput.writeBoolean(archiveStatus);
    }
}
