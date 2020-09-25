package com.gao.channelcore.pojo;

import lombok.Data;

@Data
public class Product {

  private Long id;

  private String productName;

  private Integer price;

  private Integer stock;


  /*public Product(String productName, Integer price, int stock) {
    this.productName = productName;
    this.price = price;
    this.stock = stock;
  }*/
}