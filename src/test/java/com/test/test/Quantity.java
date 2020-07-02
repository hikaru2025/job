package com.test.test;

class Quantity{
   private Double value;
   private boolean error;
   private String key = PrintDataVO.key;

    public Quantity(Double value) {
        this.value = value;
    }

    public Quantity() {
    }

    public Double getValue() {
       return value;
   }

   public void setValue(Double value) {
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
}
