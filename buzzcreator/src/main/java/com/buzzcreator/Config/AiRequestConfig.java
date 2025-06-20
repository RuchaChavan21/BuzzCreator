package com.buzzcreator.Config;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AiRequestConfig {
	
	private final ChatModel chatModel;

	public AiRequestConfig(ChatModel chatModel) {
		super();
		this.chatModel = chatModel;
	}
	
	
	@Bean
	public ChatClient chatClient() {
		return ChatClient.builder(chatModel).build();
	}
}
