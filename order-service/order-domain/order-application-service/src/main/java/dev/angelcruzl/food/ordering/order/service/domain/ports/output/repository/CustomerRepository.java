package dev.angelcruzl.food.ordering.order.service.domain.ports.output.repository;

import dev.angelcruzl.food.ordering.order.service.domain.entity.Customer;

import java.util.Optional;
import java.util.UUID;

public interface CustomerRepository {
  Optional<Customer> findCustomer(UUID customerId);
}
