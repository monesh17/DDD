package main.java.domain;

import java.util.ArrayList;
import java.util.List;

public class Cart
{
  List<Product> productList = new ArrayList<>();
  
  public void addProduct(Product product){
    productList.add(product);
  }
}
