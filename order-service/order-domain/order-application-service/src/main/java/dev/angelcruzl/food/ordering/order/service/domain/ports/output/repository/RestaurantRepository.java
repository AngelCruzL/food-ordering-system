package dev.angelcruzl.food.ordering.order.service.domain.ports.output.repository;

import dev.angelcruzl.food.ordering.order.service.domain.entity.Restaurant;

import java.util.Optional;

public interface RestaurantRepository {
  Optional<Restaurant> findRestaurantInformation(Restaurant restaurant);
}
