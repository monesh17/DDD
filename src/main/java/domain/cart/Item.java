package main.java.domain.cart;

import main.java.domain.product.Product;

import java.util.Objects;

public class Item
{
  Product product;
  int quantity;
  
  public Item (Product product, int quantity)
  {
    this.product = product;
    this.quantity = quantity;
  }
  
  @Override
  public boolean equals (Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Item item = (Item) o;
    return Objects.equals(product, item.product);
  }
  
  @Override
  public int hashCode ()
  {
    return Objects.hash(product, quantity);
  }
}
