package main.java.domain.entity;

import main.java.domain.cart.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cart
{
  List<Item> itemList;
  List<Item> removedItems;
  long id;
  
  @Override
  public boolean equals (Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Cart cart = (Cart) o;
    return id == cart.id;
  }
  
  @Override
  public int hashCode ()
  {
    return Objects.hash(id);
  }
  
  public Cart (long id)
  {
    this.itemList = new ArrayList<>();
    this.removedItems = new ArrayList<>();
    this.id = id;
  }
  
  public void addItem (Item item){
    itemList.add(item);
  }
  
  public void removeItem(Item item){
     itemList.remove(item);
    removedItems.add(item);
  }
  
  public List<Item> getItems ()
  {
    return itemList;
  }
  
  public List<Item> getRemovedItems ()
  {
    return removedItems;
  }
}
