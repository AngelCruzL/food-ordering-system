package dev.angelcruzl.food.ordering.order.service.domain.event;

import dev.angelcruzl.food.ordering.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelledEvent extends OrderEvent {
  public OrderCancelledEvent(Order order, ZonedDateTime createdAt) {
    super(order, createdAt);
  }
}