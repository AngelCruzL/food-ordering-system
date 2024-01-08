package dev.angelcruzl.food.ordering.order.service.domain.ports.output.repository;

import dev.angelcruzl.food.ordering.order.service.domain.entity.Order;
import dev.angelcruzl.food.ordering.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {
  Order save(Order order);

  Optional<Order> findByTrackingId(TrackingId trackingId);
}
