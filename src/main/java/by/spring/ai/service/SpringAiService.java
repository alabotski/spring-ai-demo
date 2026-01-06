package by.spring.ai.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import by.spring.ai.controller.request.AiRq;
import by.spring.ai.controller.response.AiRs;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SpringAiService {

  private final ChatClient.Builder chatClientBuilder;

  public AiRs sendPrompt(AiRq rq) {
    var answer = chatClientBuilder.build()
        .prompt()
        .user(rq.getPrompt())
        .call()
        .content();
    return AiRs.builder()
        .answer(answer)
        .build();
  }
}
