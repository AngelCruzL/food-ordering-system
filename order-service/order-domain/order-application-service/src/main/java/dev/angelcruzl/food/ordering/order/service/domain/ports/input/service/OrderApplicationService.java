package dev.angelcruzl.food.ordering.order.service.domain.ports.input.service;

import dev.angelcruzl.food.ordering.order.service.domain.dto.create.CreateOrderCommand;
import dev.angelcruzl.food.ordering.order.service.domain.dto.create.CreateOrderResponse;
import dev.angelcruzl.food.ordering.order.service.domain.dto.track.TrackOrderQuery;
import dev.angelcruzl.food.ordering.order.service.domain.dto.track.TrackOrderResponse;

import javax.validation.Valid;

public interface OrderApplicationService {
  CreateOrderResponse createOrder(@Valid CreateOrderCommand createOrderCommand);

  TrackOrderResponse trackOrder(@Valid TrackOrderQuery trackOrderQuery);
}
