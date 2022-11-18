package main.java.domain;

import main.java.domain.cart.Cart;
import main.java.domain.product.Product;

public class Application
{
  private Cart cart;
  
  public static void main (String[] args)
  {
    Application application = new Application();
    Cart cart=application.createCart();
    cart.addProduct(new Product("Apple Pencil"));
    cart.addProduct(new Product("Sony Wireless headphone"));
    
  }
  
  private Cart createCart ()
  {
    this.cart = new Cart();
    return this.cart;
  }
}
