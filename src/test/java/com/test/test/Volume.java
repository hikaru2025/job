package com.test.test;

class Volume{
    private Integer value;
    private boolean error;
    private String key = PrintDataVO.key;
    private boolean isFocus;

     public Volume() {
     }

     public Volume(Integer value) {
         this.value = value;
     }

     public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public boolean isFocus() {
        return isFocus;
    }

    public void setFocus(boolean focus) {
        isFocus = focus;
    }
}
