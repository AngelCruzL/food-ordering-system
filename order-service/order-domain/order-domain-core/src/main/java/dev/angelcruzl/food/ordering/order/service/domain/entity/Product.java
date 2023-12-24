package dev.angelcruzl.food.ordering.order.service.domain.entity;

import dev.angelcruzl.food.ordering.domain.entity.BaseEntity;
import dev.angelcruzl.food.ordering.domain.valueobject.Money;
import dev.angelcruzl.food.ordering.domain.valueobject.ProductId;

public class Product extends BaseEntity<ProductId> {
  private final String name;
  private final Money price;

  public Product(ProductId productId, String name, Money price) {
    super.setId(productId);
    this.name = name;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public Money getPrice() {
    return price;
  }
}
