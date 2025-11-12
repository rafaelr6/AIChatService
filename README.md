# AIChatService

This repository implements an AI-powered chat service, designed to leverage GPT-based models for conversational applications. The branch `ChatGptService` contains the latest source code and configuration for building and running the service.

## Features

- GPT-based conversational backend for chat applications
- Configured as a Java application (Maven project structure)
- Ready-to-use scripts for building and running (`mvnw`, `mvnw.cmd`)
- Extensible design for integrating with messaging platforms or other applications

## Project Structure

- `.gitattributes`, `.gitignore`: Standard git configuration files.
- `pom.xml`: Maven project descriptor with dependencies and build configuration.
- `mvnw`, `mvnw.cmd`: Maven wrapper scripts for building/running without needing a global Maven installation.
- `src/main`: Main Java source directory (typically contains implementation code).
- `src/test`: Java test source directory (for unit and integration tests).
- `.mvn`: Maven wrapper support files.

## Prerequisites

- Java JDK 17 or later
- Git
- No need to install Maven manually (Maven Wrapper included)

## Getting Started

### Clone the Repository

```bash
git clone --branch ChatGptService https://github.com/rafaelr6/AIChatService.git
cd AIChatService
```

### Build the Project

Use the Maven Wrapper scripts to build:

Linux/macOS:
```bash
./mvnw clean install
```

Windows:
```bash
mvnw.cmd clean install
```

### Configuration

You may need to configure API keys if the application integrates with external AI services (such as OpenAI GPT). Look for instructions or property files under `src/main/resources` or within the code for environment variable setup.

### Run the Application

After building, run the main class (location depends on your source layout):
```bash
./mvnw spring-boot:run
```
or
```bash
java -jar target/AIChatService-*.jar
```

### Testing

To run tests:
```bash
./mvnw test
```

## Usage

The application exposes endpoints or interfaces for chat interaction (details depend on the service implementation in `src/main`). Consult the Java source files for controller/service classes to see available endpoints.

## Contributing

1. Fork the repository.
2. Create a feature branch (`git checkout -b feature-name`)
3. Commit your changes.
4. Push to your fork and open a pull request against the `ChatGptService` branch.

## License

This project is licensed under your chosen license. Specify details in a LICENSE file if present.

## Links

- [Repository on GitHub](https://github.com/rafaelr6/AIChatService/tree/ChatGptService)
