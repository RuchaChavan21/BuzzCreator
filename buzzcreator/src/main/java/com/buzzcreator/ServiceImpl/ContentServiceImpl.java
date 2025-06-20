package com.buzzcreator.ServiceImpl;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buzzcreator.Model.Content;
import com.buzzcreator.Service.ContentService;

@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ChatClient chatClient;
	
	@Override
	public String getAiCaption(Content content) {
		String prompt = buildPrompt(content);
		return chatClient.prompt().user(prompt).call().content();
	}
	
	private String buildPrompt(Content content) {
		return String.format(
				"Generate a catchy and engaging social media caption for the topic '%s' "
						+ "in a '%s' tone, targeting the '%s' platform, for the occasion '%s'. "
						+ "Keep it under 280 characters.",
				content.getTopic(), content.getTone(), content.getPlatform(), content.getOccasion());
	}


}
