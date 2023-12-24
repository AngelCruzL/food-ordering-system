package dev.angelcruzl.food.ordering.order.service.domain.valueobject;

import dev.angelcruzl.food.ordering.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
  public OrderItemId(Long value) {
    super(value);
  }
}
