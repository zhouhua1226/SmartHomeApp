package com.gatz.smarthomeapp.bean;

import java.io.Serializable;
import java.util.List;


public class AirConditioning implements Serializable {
    private String deviceid;
    private String roomid;
    private String devicename;
    private String devicestype;
    private String protocoltype;
    private String keywords;
    private String did;
    private String inputtime;
    private String updatetime;
    private String state;//空调状态 通风、换气、温度
    private String bedroomid;
    private String apartmentid;
    private String devicestypename;
    private String bedroomname;
    private String roomname;
    private List<KnxProtocol> protocols;
    private String stateView;
    private String apartmentView;
    private String community;

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getRoomid() {
        return roomid;
    }

    public void setRoomid(String roomid) {
        this.roomid = roomid;
    }

    public String getDevicename() {
        return devicename;
    }

    public void setDevicename(String devicename) {
        this.devicename = devicename;
    }

    public String getDevicestype() {
        return devicestype;
    }

    public void setDevicestype(String devicestype) {
        this.devicestype = devicestype;
    }

    public String getProtocoltype() {
        return protocoltype;
    }

    public void setProtocoltype(String protocoltype) {
        this.protocoltype = protocoltype;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime;
    }

    public String getInputtime() {
        return inputtime;
    }

    public void setInputtime(String inputtime) {
        this.inputtime = inputtime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getBedroomid() {
        return bedroomid;
    }

    public void setBedroomid(String bedroomid) {
        this.bedroomid = bedroomid;
    }

    public String getApartmentid() {
        return apartmentid;
    }

    public void setApartmentid(String apartmentid) {
        this.apartmentid = apartmentid;
    }

    public String getDevicestypename() {
        return devicestypename;
    }

    public void setDevicestypename(String devicestypename) {
        this.devicestypename = devicestypename;
    }

    public String getBedroomname() {
        return bedroomname;
    }

    public void setBedroomname(String bedroomname) {
        this.bedroomname = bedroomname;
    }

    public String getRoomname() {
        return roomname;
    }

    public void setRoomname(String roomname) {
        this.roomname = roomname;
    }

    public List<KnxProtocol> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<KnxProtocol> protocols) {
        this.protocols = protocols;
    }

    public String getStateView() {
        return stateView;
    }

    public void setStateView(String stateView) {
        this.stateView = stateView;
    }

    public String getApartmentView() {
        return apartmentView;
    }

    public void setApartmentView(String apartmentView) {
        this.apartmentView = apartmentView;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    @Override
    public String toString() {
        return "AirConditioning{" +
                "deviceid='" + deviceid + '\'' +
                ", roomid='" + roomid + '\'' +
                ", devicename='" + devicename + '\'' +
                ", devicestype='" + devicestype + '\'' +
                ", protocoltype='" + protocoltype + '\'' +
                ", keywords='" + keywords + '\'' +
                ", did='" + did + '\'' +
                ", inputtime='" + inputtime + '\'' +
                ", updatetime='" + updatetime + '\'' +
                ", state='" + state + '\'' +
                ", bedroomid='" + bedroomid + '\'' +
                ", apartmentid='" + apartmentid + '\'' +
                ", devicestypename='" + devicestypename + '\'' +
                ", bedroomname='" + bedroomname + '\'' +
                ", roomname='" + roomname + '\'' +
                ", protocols=" + protocols +
                ", stateView='" + stateView + '\'' +
                ", apartmentView='" + apartmentView + '\'' +
                ", community='" + community + '\'' +
                '}';
    }
}
