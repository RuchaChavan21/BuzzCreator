package com.buzzcreator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.buzzcreator.Model.Content;
import com.buzzcreator.Service.ContentService;




@RestController
@RequestMapping("/ai/content")
public class ContentController {
	
	
	@Autowired
	private ContentService contentService;
	
	
	@PostMapping("/generate")
	public String askAi(@RequestBody Content content) {
		return contentService.getAiCaption(content);
	}
}
