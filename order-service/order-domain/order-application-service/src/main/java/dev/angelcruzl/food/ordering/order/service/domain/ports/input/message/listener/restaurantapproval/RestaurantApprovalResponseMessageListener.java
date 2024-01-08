package dev.angelcruzl.food.ordering.order.service.domain.ports.input.message.listener.restaurantapproval;

import dev.angelcruzl.food.ordering.order.service.domain.dto.message.RestaurantApprovalResponse;

public interface RestaurantApprovalResponseMessageListener {
  void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

  void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
