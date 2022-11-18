package main.java.domain;

import main.java.domain.entity.Cart;
import main.java.domain.cart.Item;
import main.java.domain.product.Price;
import main.java.domain.product.Product;

import java.util.UUID;

public class Application
{
  private Cart cart;
  
  public static void main (String[] args)
  {
    Application application = new Application();
    Cart cart=application.createCart();
    Item applePencil = new Item(new Product("Apple Pencil", new Price(100)), 2);
    cart.addItem(applePencil);
    Item sonyWirelessHeadphone = new Item(new Product("Sony Wireless headphone", new Price(200)), 1);
    cart.addItem(sonyWirelessHeadphone);
    cart.removeItem(applePencil);
    System.out.println(cart.getItems().size());
    System.out.println(cart.getRemovedItems().size());
    
    Cart cart1 = application.createCart();
    cart1.addItem(new Item(new Product("Apple Pencil", new Price(300)), 2));
    Cart cart2 = application.createCart();
    cart2.addItem(new Item(new Product("Apple Pencil", new Price(400)), 2));
    
    System.out.println(cart1.equals(cart2));
    
  }
  
  private Cart createCart ()
  {
    this.cart = new Cart(UUID.randomUUID().getMostSignificantBits());
    return this.cart;
  }
}
