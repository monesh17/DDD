package main.java.domain.cart;

import main.java.domain.product.Product;

public class Item
{
  Product item;
  int quantity;
  
  public Item (Product item, int quantity)
  {
    this.item = item;
    this.quantity = quantity;
  }
}
