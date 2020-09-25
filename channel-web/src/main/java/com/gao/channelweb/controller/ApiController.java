package com.gao.channelweb.controller;

import com.alibaba.fastjson.JSONObject;
import com.gao.channelcore.business.dao.ProductMapper;
import com.gao.channelcore.pojo.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("api")
@Controller
public class ApiController {

  @Autowired
  private ProductMapper productMapper;

  @GetMapping("insert")
  @ResponseBody
  public String addProducts() {
    Product product1 = new Product();
    product1.setProductName("香蕉");
    product1.setPrice(2);
    product1.setStock(100);
    Product product2 = new Product();
    product2.setProductName("菠萝");
    product2.setPrice(2);
    product2.setStock(100);
    Product product3 = new Product();
    product3.setProductName("菠萝1");
    product3.setPrice(2);
    product3.setStock(100);
    Product product4 = new Product();
    product4.setProductName("橘子");
    product4.setPrice(2);
    product4.setStock(100);
    Product product5 = new Product();
    product5.setProductName("橘子1");
    product5.setPrice(2);
    product5.setStock(100);
    Product product6 = new Product();
    product6.setProductName("西瓜");
    product6.setPrice(2);
    product6.setStock(100);
    Product product7 = new Product();
    product7.setProductName("杏子");
    product7.setPrice(2);
    product7.setStock(100);
    Product product8 = new Product();
    product8.setProductName("草莓");
    product8.setPrice(2);
    product8.setStock(100);
    Product product9 = new Product();
    product9.setProductName("芒果");
    product9.setPrice(2);
    product9.setStock(100);
    Product product10 = new Product();
    product10.setProductName("猕猴桃");
    product10.setPrice(2);
    product10.setStock(100);
    ArrayList<Product> products = new ArrayList() {
      {
        add(product1);
        add(product2);
        add(product3);
        add(product4);
        add(product5);
        add(product6);
        add(product7);
        add(product8);
        add(product9);
        add(product10);
      }
    };
    for (Product product : products) {
      productMapper.insertSelective(product);
    }
    return "success";
  }

  @GetMapping("listProducts")
  @ResponseBody
  public String listProducts() {
    List list = productMapper.selectAll();
    return JSONObject.toJSONString(list);
  }

  @GetMapping("listProductsByParams")
  @ResponseBody
  public String listProductsByParams(@RequestParam String productName) {
    Product product = new Product();
    product.setProductName(productName);
    List list = productMapper.selectByParams(product);
    return JSONObject.toJSONString(list);
  }

}
