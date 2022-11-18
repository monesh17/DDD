package main.java.domain;

import main.java.domain.cart.Cart;
import main.java.domain.cart.Item;
import main.java.domain.product.Product;

public class Application
{
  private Cart cart;
  
  public static void main (String[] args)
  {
    Application application = new Application();
    Cart cart=application.createCart();
    cart.addItem(new Item(new Product("Apple Pencil"), 2));
    cart.addItem(new Item(new Product("Sony Wireless headphone"),1));
    
  }
  
  private Cart createCart ()
  {
    this.cart = new Cart();
    return this.cart;
  }
}
