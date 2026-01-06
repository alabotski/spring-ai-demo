package by.spring.ai.controller;


import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import by.spring.ai.controller.request.AiRq;
import by.spring.ai.controller.response.AiRs;
import by.spring.ai.service.SpringAiService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@Validated
@RequiredArgsConstructor
public class SpringAiController {

  private final SpringAiService service;

  @PostMapping
  public AiRs sendPrompt(@RequestBody @Valid AiRq rq) {
    return service.sendPrompt(rq);
  }
}
