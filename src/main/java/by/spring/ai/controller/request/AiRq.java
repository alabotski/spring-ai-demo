package by.spring.ai.controller.request;

import jakarta.validation.constraints.NotNull;
import lombok.Value;

@Value
public class AiRq {

  @NotNull
  String prompt;
}
