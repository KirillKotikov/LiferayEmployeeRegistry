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
    private long _position_id;
    private String _position_name;
    private boolean _archive_status;

    public PositionSoap() {
    }

    public static PositionSoap toSoapModel(Position model) {
        PositionSoap soapModel = new PositionSoap();

        soapModel.setPosition_id(model.getPosition_id());
        soapModel.setPosition_name(model.getPosition_name());
        soapModel.setArchive_status(model.getArchive_status());

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
        return _position_id;
    }

    public void setPrimaryKey(long pk) {
        setPosition_id(pk);
    }

    public long getPosition_id() {
        return _position_id;
    }

    public void setPosition_id(long position_id) {
        _position_id = position_id;
    }

    public String getPosition_name() {
        return _position_name;
    }

    public void setPosition_name(String position_name) {
        _position_name = position_name;
    }

    public boolean getArchive_status() {
        return _archive_status;
    }

    public boolean isArchive_status() {
        return _archive_status;
    }

    public void setArchive_status(boolean archive_status) {
        _archive_status = archive_status;
    }
}
