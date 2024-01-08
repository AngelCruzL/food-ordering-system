package dev.angelcruzl.food.ordering.order.service.domain.ports.input.message.listener.payment;

import dev.angelcruzl.food.ordering.order.service.domain.dto.message.PaymentResponse;

public interface PaymentResponseMessageListener {
  void paymentCompleted(PaymentResponse paymentResponse);

  void paymentCancelled(PaymentResponse paymentResponse);
}
