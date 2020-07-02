package com.test.test;

class Element {
   private String value;
   private String key = PrintDataVO.key;
   private boolean error;

    public Element() {
    }

    public Element(String value) {
        this.value = value;
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

   public boolean isError() {
       return error;
   }

   public void setError(boolean error) {
       this.error = error;
   }

}
