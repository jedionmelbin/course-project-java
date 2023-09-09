package com.xprotech.app.model;

/**
 *
 * @author jedionmelbin
 */
public class Account {

    private float balance;

    public void modify(float difference) {
        float value = this.balance;
        this.balance = value + difference;
    }
}
