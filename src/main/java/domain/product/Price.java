package main.java.domain.product;

import java.util.Currency;

public class Price
{
  Currency currency = Currency.getInstance("USD");
  float amount;
  
  public Price (float amount)
  {
    this.amount = amount;
  }
}
