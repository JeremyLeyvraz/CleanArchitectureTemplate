## Template for a Kotlin application using Clean Architecture

# App layer
Simple application to display a message using [HelloUseCase].

# Use case
Implements a simple use case to display a 'Hello' message.
The message is generated using a [Message] provides by a repository.

# Data
Implements a simple repository to get a [Message].

# Domain
Define the model [Message] and the repository and use case interfaces.

# ToDo
- Add detekt
- Add Lint
- Add a CI
- Add unit test
- Add ui test (composable)
- Clean gradle file (using variable for imports)
