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
    public long position_id;
    public String position_name;
    public boolean archive_status;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(7);

        sb.append("{position_id=");
        sb.append(position_id);
        sb.append(", position_name=");
        sb.append(position_name);
        sb.append(", archive_status=");
        sb.append(archive_status);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Position toEntityModel() {
        PositionImpl positionImpl = new PositionImpl();

        positionImpl.setPosition_id(position_id);

        if (position_name == null) {
            positionImpl.setPosition_name(StringPool.BLANK);
        } else {
            positionImpl.setPosition_name(position_name);
        }

        positionImpl.setArchive_status(archive_status);

        positionImpl.resetOriginalValues();

        return positionImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        position_id = objectInput.readLong();
        position_name = objectInput.readUTF();
        archive_status = objectInput.readBoolean();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeLong(position_id);

        if (position_name == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(position_name);
        }

        objectOutput.writeBoolean(archive_status);
    }
}
