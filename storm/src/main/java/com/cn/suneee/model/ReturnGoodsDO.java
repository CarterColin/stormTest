package com.cn.suneee.model;

import java.io.Serializable;
import java.util.Date;

public class ReturnGoodsDO implements Serializable {
    private String returngoodsid;

    private String returngoodscode;

    private String enteroddnumber;

    private String receivingcontactr;

    private String telephone;

    private String address;

    private String deliveryclerk;

    private String returngoodstatus;

    private Date returngoodstime;

    private String deliverytelephone;

    private String deliveryid;

    private String ordernumber;

    private String storeordernumber;

    private Date orderenddate;

    private Date orderstartdate;

    private Date completetime;

    private static final long serialVersionUID = 1L;

    public String getReturngoodsid() {
        return returngoodsid;
    }

    public void setReturngoodsid(String returngoodsid) {
        this.returngoodsid = returngoodsid == null ? null : returngoodsid.trim();
    }

    public String getReturngoodscode() {
        return returngoodscode;
    }

    public void setReturngoodscode(String returngoodscode) {
        this.returngoodscode = returngoodscode == null ? null : returngoodscode.trim();
    }

    public String getEnteroddnumber() {
        return enteroddnumber;
    }

    public void setEnteroddnumber(String enteroddnumber) {
        this.enteroddnumber = enteroddnumber == null ? null : enteroddnumber.trim();
    }

    public String getReceivingcontactr() {
        return receivingcontactr;
    }

    public void setReceivingcontactr(String receivingcontactr) {
        this.receivingcontactr = receivingcontactr == null ? null : receivingcontactr.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getDeliveryclerk() {
        return deliveryclerk;
    }

    public void setDeliveryclerk(String deliveryclerk) {
        this.deliveryclerk = deliveryclerk == null ? null : deliveryclerk.trim();
    }

    public String getReturngoodstatus() {
        return returngoodstatus;
    }

    public void setReturngoodstatus(String returngoodstatus) {
        this.returngoodstatus = returngoodstatus == null ? null : returngoodstatus.trim();
    }

    public Date getReturngoodstime() {
        return returngoodstime;
    }

    public void setReturngoodstime(Date returngoodstime) {
        this.returngoodstime = returngoodstime;
    }

    public String getDeliverytelephone() {
        return deliverytelephone;
    }

    public void setDeliverytelephone(String deliverytelephone) {
        this.deliverytelephone = deliverytelephone == null ? null : deliverytelephone.trim();
    }

    public String getDeliveryid() {
        return deliveryid;
    }

    public void setDeliveryid(String deliveryid) {
        this.deliveryid = deliveryid == null ? null : deliveryid.trim();
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public String getStoreordernumber() {
        return storeordernumber;
    }

    public void setStoreordernumber(String storeordernumber) {
        this.storeordernumber = storeordernumber == null ? null : storeordernumber.trim();
    }

    public Date getOrderenddate() {
        return orderenddate;
    }

    public void setOrderenddate(Date orderenddate) {
        this.orderenddate = orderenddate;
    }

    public Date getOrderstartdate() {
        return orderstartdate;
    }

    public void setOrderstartdate(Date orderstartdate) {
        this.orderstartdate = orderstartdate;
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }
}