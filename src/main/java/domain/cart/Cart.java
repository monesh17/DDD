package main.java.domain.cart;

import main.java.domain.product.Product;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Cart
{
  List<Item> itemList = new ArrayList<>();
  
  
  public void addItem (Item item){
    itemList.add(item);
  }
  
  public void removeItem(Item item){
     itemList.remove(item);
     RemovedProducts.captureRemovedProduct(item.product.getName());
  }
  
  public List<Item> getItems ()
  {
    return itemList;
  }
}
