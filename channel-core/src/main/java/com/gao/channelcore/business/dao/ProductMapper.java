package com.gao.channelcore.business.dao;

import com.gao.channelcore.pojo.Product;
import java.util.List;

public interface ProductMapper {

  int insert(Product record);

  int insertSelective(Product record);

  List<Product> selectAll();

  List<Product> selectByParams(Product record);
}