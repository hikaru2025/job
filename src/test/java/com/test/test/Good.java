package com.test.test;

import java.math.BigDecimal;
import java.util.List;

class Good {
   private String key = PrintDataVO.key;
   private String spuId;
   private Volume valume;
   private List<Quantity> quantity;
   private Double finalQuantity;

   private BigDecimal orderAmount;
   private BigDecimal price;

   private String color;

   private String unit;

   public String getKey() {
       return key;
   }

   public void setKey(String key) {
       this.key = key;
   }

   public String getSpuId() {
       return spuId;
   }

   public void setSpuId(String spuId) {
       this.spuId = spuId;
   }

   public Volume getValume() {
       return valume;
   }

   public void setValume(Volume valume) {
       this.valume = valume;
   }

   public List<Quantity> getQuantity() {
       return quantity;
   }

   public void setQuantity(List<Quantity> quantity) {
       this.quantity = quantity;
   }

   public Double getFinalQuantity() {
       return finalQuantity;
   }

   public void setFinalQuantity(Double finalQuantity) {
       this.finalQuantity = finalQuantity;
   }

   public BigDecimal getOrderAmount() {
       return orderAmount;
   }

   public void setOrderAmount(BigDecimal orderAmount) {
       this.orderAmount = orderAmount;
   }

   public BigDecimal getPrice() {
       return price;
   }

   public void setPrice(BigDecimal price) {
       this.price = price;
   }

   public String getColor() {
       return color;
   }

   public void setColor(String color) {
       this.color = color;
   }

   public String getUnit() {
       return unit;
   }

   public void setUnit(String unit) {
       this.unit = unit;
   }
}
