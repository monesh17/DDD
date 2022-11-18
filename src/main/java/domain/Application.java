package main.java.domain;

import main.java.domain.cart.Cart;
import main.java.domain.product.Product;

public class Application
{
  public static void main (String[] args)
  {
    Cart myCart = new Cart();
    myCart.addProduct(new Product("Apple Pencil"));
  }
}
