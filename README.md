# InnoTech Connect Project

The InnoTech Connect project is a Java application that facilitates communication and collaboration between foreign companies. The project employs various design patterns, adheres to SOLID principles, and supports the DRY and KISS principles.

## Table of Contents

- [Introduction](#introduction)
- [Key Features](#key-features)
- [Design Patterns](#design-patterns)
- [SOLID Principles](#solid-principles)
- [DRY and KISS Principles](#dry-and-kiss-principles)
- [Usage](#usage)
- [How to Run](#how-to-run)
- [Dependencies](#dependencies)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The InnoTech Connect project aims to create a collaborative environment for foreign companies. It includes features such as company creation, language support, translation, and communication among different roles within the companies.

## Key Features

- **Company Creation:** Create English and Russian companies with directors, managers, and accountants.
- **Language Support:** Implement language-specific classes (English and Russian) and a LanguageFactory for creating identities.
- **Translation:** Utilize a Translator class for adapting communication between companies with different languages.
- **Communication Hub:** Implement a ConcreteSubject and ConcreteObserver for real-time communication updates among assistants.

## Design Patterns

The project incorporates the following design patterns:

- **Strategy Pattern:** Makes the code flexible and reusable.
- **Decorator Pattern:** Provides people from both organisations with roles in companies.
- **Singleton Pattern:** Ensures a single instance of the Translator class.
- **Observer Pattern:** Facilitates communication updates through ConcreteSubject and ConcreteObserver.
- **Builder Pattern:** Separates the construction of complex objects (companies) from their representation.
- **Factory Method Pattern:** Provides an interface for creating identity objects in different languages.

## SOLID Principles

The code adheres to SOLID principles:

- **Single Responsibility Principle (SRP):** Classes have a single responsibility, promoting modular and maintainable code.
- **Open/Closed Principle (OCP):** Code is designed to be open for extension but closed for modification.
- **Liskov Substitution Principle (LSP):** Subtypes can be substituted for their base types without affecting program behavior.
- **Interface Segregation Principle (ISP):** Clients are not forced to implement interfaces they do not use.
- **Dependency Inversion Principle (DIP):** Abstractions depend on abstractions rather than concrete implementations.

## DRY and KISS Principles

- **DRY (Don't Repeat Yourself):** The code aims to minimize redundancy, and further refactoring may be considered to reduce repetition.
- **KISS (Keep It Simple, Stupid):** The overall structure is straightforward, and efforts are made to ensure simplicity. The completeness and simplicity of the Translator class need attention.

## Usage

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/InnoTech-Connect.git
   cd InnoTech-Connect
