package dev.angelcruzl.food.ordering.application.handler;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ErrorDto {
    private String statusCode;
    private String message;
}
