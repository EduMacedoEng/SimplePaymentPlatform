
# SimplePaymentPlatform

**SimplePaymentPlatform** is a scalable, event-driven microservice architecture designed to manage user wallets, financial transactions, and notifications between users and merchants. The system is built with modern principles such as CQRS, Event Sourcing, and microservices, ensuring a robust and flexible platform capable of handling high loads and large numbers of users.

## Features

- **User Wallet Management**: Create, update, and manage user wallets with security and scalability.
- **Financial Transactions**: Handle money transfers between users and merchants with validations and notifications.
- **Event-Driven Architecture**: Uses CQRS and Event Sourcing to ensure data consistency and scalability.
- **Microservices Architecture**: The system is modularized into multiple services to ensure high maintainability, scalability, and independent deployments.
- **Notifications**: Sends notifications (email or SMS) to users and merchants upon successful transactions.
- **External Authorization Service**: Simulates the authorization of transactions using external mock services.

---

## Table of Contents

1. [Technology Stack](#technology-stack)
2. [Architecture](#architecture)
3. [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Local Setup](#local-setup)
4. [Usage](#usage)
5. [Contributing](#contributing)
6. [License](#license)

---

## Technology Stack

- **Java 21**: Core language for service implementation.
- **Spring Boot**: Framework for building the microservices.
- **Axon Framework**: For implementing CQRS and Event Sourcing patterns.
- **Kafka**: Used for message brokering between microservices.
- **PostgreSQL**: Database for persisting data (e.g., user information, transaction history).
- **Docker**: Containerization for microservices and dependencies.
- **Jib**: Used to build and push Docker images automatically.
- **Kubernetes**: For orchestration of microservices (optional for deployment).
- **Gradle**: Build automation and dependency management.

---

## Architecture

The system follows an **event-driven architecture** with **CQRS** and **Event Sourcing**. Here are the main components:

1. **User Service**: Manages user accounts and wallets.
2. **Transaction Service**: Manages money transfers between users and merchants.
3. **Notification Service**: Sends out notifications upon successful transactions.
4. **External Authorization Service**: Mock service to authorize money transfers.
5. **Axon Server**: Manages event storage and routing of commands and queries between microservices.
6. **Kafka**: Broker for messaging between services.
7. **PostgreSQL**: Database for storing projections (read models) and other data.

---

## Getting Started

### Prerequisites

Ensure that the following software is installed on your local machine:

- **Docker** (including Docker Compose)
- **Java 21**
- **Gradle**
- **Git**

### Local Setup

#### Step 1: Clone the Repository

```bash
git clone https://github.com/EduMacedoEng/SimplePaymentPlatform.git
cd SimplePaymentPlatform
```

#### Step 2: Build the Project

```bash
./gradlew clean build
```

#### Step 3: Run the Services with Docker Compose

The project includes a `docker-compose.yml` file for starting the services (PostgreSQL, Kafka, Axon Server, etc.). Run the following command to start everything:

```bash
docker-compose up -d
```

This will spin up the required services, including **Zookeeper**, **Kafka**, **PostgreSQL**, and **Axon Server**.

#### Step 4: Start the Microservices

Each microservice (e.g., User Service, Transaction Service) is containerized and configured to run with **Docker**. If using **Jib**, run:

```bash
./gradlew jibDockerBuild
```

This will create Docker images for the services, which can be run using the Docker Compose setup.

---

## Usage

### API Endpoints

Here are some examples of the key API endpoints for each service:

- **User Service**: `http://localhost:8081/api/users`
    - Create a new user
    - View user wallet information

- **Transaction Service**: `http://localhost:8082/api/transactions`
    - Transfer money between users and merchants
    - Validate transaction before processing

- **Notification Service**: (Background notifications)

### Simulating a Transaction

1. **Create a User** via the User Service endpoint.
2. **Transfer Money** between two users using the Transaction Service.
3. Check the notifications or event logs to confirm the transaction and notification.

---

## Contributing

We welcome contributions to improve the SimplePaymentPlatform project! Here's how you can contribute:

1. **Fork the Repository**: Click the "Fork" button at the top-right of the GitHub page.
2. **Clone your Fork**:
   ```bash
   git clone https://github.com/your-username/SimplePaymentPlatform.git
   cd SimplePaymentPlatform
   ```
3. **Create a Branch** for your changes:
   ```bash
   git checkout -b feature-branch
   ```
4. **Make Your Changes**: Add new features, fix bugs, or improve documentation.
5. **Commit and Push Your Changes**:
   ```bash
   git add .
   git commit -m "feat: add new feature"
   git push origin feature-branch
   ```
6. **Open a Pull Request**: Once your changes are pushed, open a Pull Request (PR) from your fork.

### Guidelines

- Ensure that your code follows the project structure and uses clean, modular practices.
- Each PR must be reviewed and approved by at least two reviewers before merging into the `development` branch.

---

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

### Additional Notes

- **Documentation**: Refer to the `5-docs` folder for detailed system diagrams, API documentation, and architecture design.
- **CI/CD**: The project uses GitHub Actions (or an alternative CI tool) for continuous integration and deployment. Review the pipeline configuration in `.github/workflows` (or equivalent).
