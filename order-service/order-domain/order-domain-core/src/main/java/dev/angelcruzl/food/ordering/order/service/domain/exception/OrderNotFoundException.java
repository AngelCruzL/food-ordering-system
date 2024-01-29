package dev.angelcruzl.food.ordering.order.service.domain.exception;

import dev.angelcruzl.food.ordering.domain.exception.DomainException;

public class OrderNotFoundException extends DomainException {
  public OrderNotFoundException(String message) {
    super(message);
  }

  public OrderNotFoundException(String message, Throwable cause) {
    super(message, cause);
  }
}
