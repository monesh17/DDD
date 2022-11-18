package main.java.domain.cart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovedProducts
{
  static Set<String> productNames = new HashSet<>();
  
  public static void captureRemovedProduct(String productName){
    productNames.add(productName);
  }
  
  public static Set<String> getProductNames ()
  {
    return productNames;
  }
}
