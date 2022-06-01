package ru.kotikov.registry.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PositionSoap implements Serializable {
    private long _positionId;
    private String _positionName;
    private boolean _archiveStatus;

    public PositionSoap() {
    }

    public static PositionSoap toSoapModel(Position model) {
        PositionSoap soapModel = new PositionSoap();

        soapModel.setPositionId(model.getPositionId());
        soapModel.setPositionName(model.getPositionName());
        soapModel.setArchiveStatus(model.getArchiveStatus());

        return soapModel;
    }

    public static PositionSoap[] toSoapModels(Position[] models) {
        PositionSoap[] soapModels = new PositionSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PositionSoap[][] toSoapModels(Position[][] models) {
        PositionSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PositionSoap[models.length][models[0].length];
        } else {
            soapModels = new PositionSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PositionSoap[] toSoapModels(List<Position> models) {
        List<PositionSoap> soapModels = new ArrayList<PositionSoap>(models.size());

        for (Position model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PositionSoap[soapModels.size()]);
    }

    public long getPrimaryKey() {
        return _positionId;
    }

    public void setPrimaryKey(long pk) {
        setPositionId(pk);
    }

    public long getPositionId() {
        return _positionId;
    }

    public void setPositionId(long positionId) {
        _positionId = positionId;
    }

    public String getPositionName() {
        return _positionName;
    }

    public void setPositionName(String positionName) {
        _positionName = positionName;
    }

    public boolean getArchiveStatus() {
        return _archiveStatus;
    }

    public boolean isArchiveStatus() {
        return _archiveStatus;
    }

    public void setArchiveStatus(boolean archiveStatus) {
        _archiveStatus = archiveStatus;
    }
}
