package main.java.domain;

import main.java.domain.cart.Cart;
import main.java.domain.cart.Item;
import main.java.domain.cart.RemovedProducts;
import main.java.domain.product.Product;

public class Application
{
  private Cart cart;
  
  public static void main (String[] args)
  {
    Application application = new Application();
    Cart cart=application.createCart();
    Item applePencil = new Item(new Product("Apple Pencil"), 2);
    cart.addItem(applePencil);
    Item sonyWirelessHeadphone = new Item(new Product("Sony Wireless headphone"), 1);
    cart.addItem(sonyWirelessHeadphone);
    cart.removeItem(applePencil);
    System.out.println(cart.getItems().size());
    System.out.println(RemovedProducts.getProductNames().size());
  }
  
  private Cart createCart ()
  {
    this.cart = new Cart();
    return this.cart;
  }
}
