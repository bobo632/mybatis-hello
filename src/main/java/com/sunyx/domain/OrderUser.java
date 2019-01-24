package com.sunyx.domain;

/**
 * Created by liuli on 2019/1/24.
 */
public class OrderUser extends Order {
    private String username;
    private String adress;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
