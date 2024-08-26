# Student Grading System

## Overview

The Student Grading System is a simple Java application designed to manage and calculate student grades based on their performance in various subjects. It utilizes object-oriented programming concepts such as Classes, Inheritance, Encapsulation, and Polymorphism to provide a robust and extendable solution.

## Features

- **Classes**:
  - `Student`: The base class containing common attributes and methods for students.
  - `UndergraduateStudent`: A derived class that applies a specific grading policy for undergraduate students.
  - `GraduateStudent`: A derived class that applies a specific grading policy for graduate students.

- **Inheritance**:
  - `UndergraduateStudent` and `GraduateStudent` inherit from the `Student` class, allowing for the reuse of common functionality while adding specific behaviors.

- **Encapsulation**:
  - Student records, including names, roll numbers, and marks, are encapsulated within the `Student` class using private fields and public getter/setter methods.

- **Polymorphism**:
  - The grading system is designed to be flexible, allowing different grading methods to be applied based on the student type (undergraduate or graduate).

## Concepts Used

- **Classes**: Representation of students and their attributes.
- **Inheritance**: `UndergraduateStudent` and `GraduateStudent` classes extend the base `Student` class.
- **Encapsulation**: Protecting student data using private fields and accessing them through public methods.
- **Polymorphism**: Different grading methods applied in derived classes.

## How to Use

1. **Clone the repository**:
   ```bash
   git clone https://github.com/sharath-66b6/Module_3_StudentGradingSystem.git
