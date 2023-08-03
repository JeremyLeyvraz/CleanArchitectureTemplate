# Template for a Kotlin application using Clean Architecture

## Layers

### App layer
Simple application to display a message using [HelloUseCase].

### Use case layer
This layer implements the use cases defined in domain layer.
It implements a simple use case to display a 'Hello' message.
The message is generated using a [Message] provides by a repository.

### Data layer
This layer implements the repositories defined in domain layer.
It implements a simple repository to get a [Message].

### Domain
This layer defines all business models, interfaces, use cases.
It defines the [Message] model and the repository and use case interfaces.

## Detekt
Detekt is a static analysis tool for Kotlin. 
It searches for style issues and bugs in your code. 
The goal is to improve code quality and prevent errors. 
Detekt is fully customizable to adapt to your coding conventions.
Run detekt with ./gradlew detekt

## Lint
Lint is a tool that provides static checks of your Android code in order to identify issues such as 
performance leaks, accessibility problems, etc.
Run Lint with ./gradlew lint

## CI
The CI is hosted in GitHub. 
There is only one workflow runs for each pull request.
This workflow runs detekt and lint, and the project is built and the unit tests are run.
A pull request can be merged only when the workflow is a success.

## ToDo
- Add ui test in CI
