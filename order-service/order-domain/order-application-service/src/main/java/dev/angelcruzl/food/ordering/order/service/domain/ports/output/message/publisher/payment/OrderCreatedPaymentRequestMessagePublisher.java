package dev.angelcruzl.food.ordering.order.service.domain.ports.output.message.publisher.payment;

import dev.angelcruzl.food.ordering.domain.event.publisher.DomainEventPublisher;
import dev.angelcruzl.food.ordering.order.service.domain.event.OrderCreatedEvent;

public interface OrderCreatedPaymentRequestMessagePublisher extends DomainEventPublisher<OrderCreatedEvent> {
}
