# Currency Converter Console Application

This is a Java console application for currency conversion. It allows users to convert between different currencies using real-time exchange rates obtained from the [ExchangeRate-API](https://www.exchangerate-api.com/).

## Introduction

This project is part of the ONE (Oracle Next Education) Program, Group 6, organized by Alura Latam. It aims to demonstrate the implementation of a currency converter application using Java.

## Features

- Converts between various currencies including Dollar, Argentine Peso, Brazilian Real, and Colombian Peso.
- Retrieves real-time exchange rates from the [ExchangeRate-API](https://www.exchangerate-api.com/).
- Allows users to input the amount they want to convert.
- Displays the converted amount with two decimal places.
- Utilizes modular design for easy scalability and maintenance.
- Implements the Command design pattern for encapsulating operations as objects.
- Uses a HashMap for the main menu to improve code readability and maintainability.

## How to Use

1. Clone this repository to your local machine.
2. Open the project in your preferred Java IDE.
3. Navigate to the `src` directory.
4. Open the `api/ExchangeAPI.java` file and replace `YOUR_API_LINK` with your actual API link generated from [ExchangeRate-API](https://www.exchangerate-api.com/).
5. Run the `Main.java` file to start the application.
6. Follow the on-screen instructions to select the currency conversion and input the amount.

## Dependencies

This project relies on the following dependencies:

- [Gson](https://github.com/google/gson): A Java library for converting Java Objects into their JSON representation and vice versa.

Make sure to have these dependencies installed in your project before running the application.

## Acknowledgements

Special thanks to Alura Latam for organizing the ONE Program and providing the opportunity to work on this project.
