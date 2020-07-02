package com.test.test;

class Colspan{
    private Integer colspan;
    private String value;
    private String key;

    public Colspan(Integer colspan, String value, String key) {
        this.colspan = colspan;
        this.value = value;
        this.key = key;
    }

    public Colspan(Integer colspan, String value) {
        this.colspan = colspan;
        this.value = value;
    }

    public Colspan() {
    }

    public Integer getColspan() {
        return colspan;
    }

    public void setColspan(Integer colspan) {
        this.colspan = colspan;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
