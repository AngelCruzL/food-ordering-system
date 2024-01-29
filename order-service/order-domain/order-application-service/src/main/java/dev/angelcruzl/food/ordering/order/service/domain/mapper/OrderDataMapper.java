package dev.angelcruzl.food.ordering.order.service.domain.mapper;

import dev.angelcruzl.food.ordering.domain.valueobject.CustomerId;
import dev.angelcruzl.food.ordering.domain.valueobject.Money;
import dev.angelcruzl.food.ordering.domain.valueobject.ProductId;
import dev.angelcruzl.food.ordering.domain.valueobject.RestaurantId;
import dev.angelcruzl.food.ordering.order.service.domain.dto.create.CreateOrderCommand;
import dev.angelcruzl.food.ordering.order.service.domain.dto.create.CreateOrderResponse;
import dev.angelcruzl.food.ordering.order.service.domain.dto.create.OrderAddress;
import dev.angelcruzl.food.ordering.order.service.domain.dto.track.TrackOrderResponse;
import dev.angelcruzl.food.ordering.order.service.domain.entity.Order;
import dev.angelcruzl.food.ordering.order.service.domain.entity.OrderItem;
import dev.angelcruzl.food.ordering.order.service.domain.entity.Product;
import dev.angelcruzl.food.ordering.order.service.domain.entity.Restaurant;
import dev.angelcruzl.food.ordering.order.service.domain.valueobject.StreetAddress;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class OrderDataMapper {
  public Restaurant createOrderCommandToRestaurant(CreateOrderCommand createOrderCommand) {
    return Restaurant.Builder.builder()
      .restaurantId(new RestaurantId(createOrderCommand.getRestaurantId()))
      .products(createOrderCommand.getItems().stream().map(orderItem ->
          new Product(new ProductId(orderItem.getProductId())))
        .collect(Collectors.toList()))
      .build();
  }

  public Order createOrderCommandToOrder(CreateOrderCommand createOrderCommand) {
    return Order.Builder.builder()
      .customerId(new CustomerId(createOrderCommand.getCustomerId()))
      .restaurantId(new RestaurantId(createOrderCommand.getRestaurantId()))
      .deliveryAddress(orderAddressToStreetAddress(createOrderCommand.getAddress()))
      .price(new Money(createOrderCommand.getPrice()))
      .items(orderItemsToOrderItemEntities(createOrderCommand.getItems()))
      .build();
  }

  public CreateOrderResponse orderToCreateOrderResponse(Order order) {
    return CreateOrderResponse.builder()
      .orderTrackingId(order.getTrackingId().getValue())
      .orderStatus(order.getOrderStatus())
      .build();
  }

  public TrackOrderResponse orderToTrackOrderResponse(Order order) {
    return TrackOrderResponse.builder()
      .orderTrackingId(order.getTrackingId().getValue())
      .orderStatus(order.getOrderStatus())
      .failureMessages(order.getFailureMessages())
      .build();
  }

  private List<OrderItem> orderItemsToOrderItemEntities(
    List<dev.angelcruzl.food.ordering.order.service.domain.dto.create.OrderItem> orderItems) {
    return orderItems.stream().map(orderItem ->
      OrderItem.Builder.builder()
        .product(new Product(new ProductId(orderItem.getProductId())))
        .quantity(orderItem.getQuantity())
        .price(new Money(orderItem.getPrice()))
        .subTotal(new Money(orderItem.getSubTotal()))
        .build()).collect(Collectors.toList());
  }

  private StreetAddress orderAddressToStreetAddress(OrderAddress orderAddress) {
    return new StreetAddress(
      UUID.randomUUID(),
      orderAddress.getStreet(),
      orderAddress.getPostalCode(),
      orderAddress.getCity()
    );
  }
}
