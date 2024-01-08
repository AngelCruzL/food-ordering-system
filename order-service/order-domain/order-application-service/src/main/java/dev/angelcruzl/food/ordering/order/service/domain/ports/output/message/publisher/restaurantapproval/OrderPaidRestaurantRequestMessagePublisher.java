package dev.angelcruzl.food.ordering.order.service.domain.ports.output.message.publisher.restaurantapproval;

import dev.angelcruzl.food.ordering.domain.event.publisher.DomainEventPublisher;
import dev.angelcruzl.food.ordering.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
