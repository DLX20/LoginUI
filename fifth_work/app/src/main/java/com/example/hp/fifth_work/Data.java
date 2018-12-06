package com.example.hp.fifth_work;

import org.litepal.crud.LitePalSupport;

public class Data extends LitePalSupport {
    private String phone;
    private String pass;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
