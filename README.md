🚀 BuzzCreator – AI Social Media Caption Generator

BuzzCreator is a full-stack Spring Boot application that uses **Spring AI** and the **Gemma 2B model (via Ollama)** to generate engaging social media captions based on user input like topic, tone, platform, and occasion.

---

✨ Features

- 🧠 **AI-Powered**: Uses Ollama's locally hosted Gemma 2B model.
- 🎯 **Customizable Prompts**: Users can specify topic, tone, platform, and occasion.
- 🔒 **No API Keys Required**: Runs completely offline with Ollama.
- ⚙️ **Spring Boot + Spring AI**: Clean architecture with service layers and RESTful APIs.

---

🛠️ Tech Stack

| Layer       | Technology         |
|-------------|--------------------|
| Backend     | Spring Boot 3.x    |
| AI Engine   | Ollama (Gemma:2b)  |
| AI Wrapper  | Spring AI 1.0.0    |
| Build Tool  | Maven              |
| Language    | Java 17+           |

---

🚀 Getting Started

1. Prerequisites

- Java 17+
- [Ollama installed](https://ollama.com/)
- Git & Maven

2. Run Gemma Model

```bash
ollama run gemma:2b

