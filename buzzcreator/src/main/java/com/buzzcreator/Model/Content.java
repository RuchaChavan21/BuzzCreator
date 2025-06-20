package com.buzzcreator.Model;

public class Content {
	private String topic;
	private String tone;
	private String occasion;
	private String platform;

	public Content(String topic, String tone, String occasion, String platform) {
		super();
		this.topic = topic;
		this.tone = tone;
		this.occasion = occasion;
		this.platform = platform;
	}

	public Content() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getTone() {
		return tone;
	}

	public void setTone(String tone) {
		this.tone = tone;
	}

	public String getOccasion() {
		return occasion;
	}

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
