package com.test.test;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class PrintDataVO {

    static String key = "5794459914587258369L";

    private String el;

    private String logo;

    private String title;

    private List<List<Colspan>> ColumnT;

    private List<Good> goodList;

    private FooterData footerData;

    private AccountData accountData;




    public static String getKey() {
        return key;
    }

    public static void setKey(String key) {
        PrintDataVO.key = key;
    }

    public String getEl() {
        return el;
    }

    public void setEl(String el) {
        this.el = el;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<List<Colspan>> getColumnT() {
        return ColumnT;
    }

    public void setColumnT(List<List<Colspan>> columnT) {
        ColumnT = columnT;
    }

    public List<Good> getGoodList() {
        return goodList;
    }

    public void setGoodList(List<Good> goodList) {
        this.goodList = goodList;
    }

    public FooterData getFooterData() {
        return footerData;
    }

    public void setFooterData(FooterData footerData) {
        this.footerData = footerData;
    }

    public AccountData getAccountData() {
        return accountData;
    }

    public void setAccountData(AccountData accountData) {
        this.accountData = accountData;
    }


}

