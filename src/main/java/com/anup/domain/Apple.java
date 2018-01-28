package com.anup.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Apple {

    @Id
    private String period;
    private int iphone;
    private int ipad;
    private int itouch;

    public Apple(){}

    public Apple(String period, int iphone, int ipad, int itouch) {
        this.period = period;
        this.iphone = iphone;
        this.ipad = ipad;
        this.itouch = itouch;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getIphone() {
        return iphone;
    }

    public void setIphone(int iphone) {
        this.iphone = iphone;
    }

    public int getIpad() {
        return ipad;
    }

    public void setIpad(int ipad) {
        this.ipad = ipad;
    }

    public int getItouch() {
        return itouch;
    }

    public void setItouch(int itouch) {
        this.itouch = itouch;
    }
}
