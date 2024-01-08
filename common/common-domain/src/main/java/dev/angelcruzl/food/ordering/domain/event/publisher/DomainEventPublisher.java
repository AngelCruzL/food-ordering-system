package dev.angelcruzl.food.ordering.domain.event.publisher;

import dev.angelcruzl.food.ordering.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {
  void publish(T domainEvent);
}
