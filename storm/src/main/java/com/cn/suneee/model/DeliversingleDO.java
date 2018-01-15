package com.cn.suneee.model;

import java.math.BigDecimal;
import java.util.Date;

public class DeliversingleDO {
    private String deliverno;

    private String deliver;

    private String contactway;

    private Date destatictime;

    private Date deendtime;

    private String delivercommodity;

    private String deliverarea;

    private String deliverstatus;

    private String deliverid;

    private BigDecimal withdrawmoney;

    private String staffcode;

    private Date settleaccountstime;

    private Date confirmtime;

    private String waveid;

    private BigDecimal deliverticket;

    public String getDeliverno() {
        return deliverno;
    }

    public void setDeliverno(String deliverno) {
        this.deliverno = deliverno == null ? null : deliverno.trim();
    }

    public String getDeliver() {
        return deliver;
    }

    public void setDeliver(String deliver) {
        this.deliver = deliver == null ? null : deliver.trim();
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway == null ? null : contactway.trim();
    }

    public Date getDestatictime() {
        return destatictime;
    }

    public void setDestatictime(Date destatictime) {
        this.destatictime = destatictime;
    }

    public Date getDeendtime() {
        return deendtime;
    }

    public void setDeendtime(Date deendtime) {
        this.deendtime = deendtime;
    }

    public String getDelivercommodity() {
        return delivercommodity;
    }

    public void setDelivercommodity(String delivercommodity) {
        this.delivercommodity = delivercommodity == null ? null : delivercommodity.trim();
    }

    public String getDeliverarea() {
        return deliverarea;
    }

    public void setDeliverarea(String deliverarea) {
        this.deliverarea = deliverarea == null ? null : deliverarea.trim();
    }

    public String getDeliverstatus() {
        return deliverstatus;
    }

    public void setDeliverstatus(String deliverstatus) {
        this.deliverstatus = deliverstatus == null ? null : deliverstatus.trim();
    }

    public String getDeliverid() {
        return deliverid;
    }

    public void setDeliverid(String deliverid) {
        this.deliverid = deliverid == null ? null : deliverid.trim();
    }

    public BigDecimal getWithdrawmoney() {
        return withdrawmoney;
    }

    public void setWithdrawmoney(BigDecimal withdrawmoney) {
        this.withdrawmoney = withdrawmoney;
    }

    public String getStaffcode() {
        return staffcode;
    }

    public void setStaffcode(String staffcode) {
        this.staffcode = staffcode == null ? null : staffcode.trim();
    }

    public Date getSettleaccountstime() {
        return settleaccountstime;
    }

    public void setSettleaccountstime(Date settleaccountstime) {
        this.settleaccountstime = settleaccountstime;
    }

    public Date getConfirmtime() {
        return confirmtime;
    }

    public void setConfirmtime(Date confirmtime) {
        this.confirmtime = confirmtime;
    }

    public String getWaveid() {
        return waveid;
    }

    public void setWaveid(String waveid) {
        this.waveid = waveid == null ? null : waveid.trim();
    }

    public BigDecimal getDeliverticket() {
        return deliverticket;
    }

    public void setDeliverticket(BigDecimal deliverticket) {
        this.deliverticket = deliverticket;
    }
}