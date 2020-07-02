package com.test.test;

class AccountData{
    private Element phone;
    private Element address;
    private Element orderSn;

    public Element getPhone() {
        return phone;
    }

    public void setPhone(Element phone) {
        this.phone = phone;
    }

    public Element getAddress() {
        return address;
    }

    public void setAddress(Element address) {
        this.address = address;
    }

    public Element getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Element orderSn) {
        this.orderSn = orderSn;
    }

    public AccountData() {
    }
    public AccountData(String phone,String address,String orderSn) {
        this.phone = new Element(phone);
        this.address = new Element(address);
        this.orderSn = new Element(orderSn);
    }

}
