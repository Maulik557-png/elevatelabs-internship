# SimpleCalculator (Java Console Application)

A basic console-based calculator written in **Java**.  
It supports addition, subtraction, multiplication, and division, with input validation and error handling.

---

## Features

- Four basic operations: `+`, `-`, `*`, `/`
- Menu-driven interface
- Input validation:
  - Ensures menu choice is between **1-5**
  - Handles invalid (non-numeric) inputs gracefully
  - Checks division by zero
  - Warns if numbers exceed `double` limits
- Continuous loop until the user chooses **Exit**

---

## Project Structure

SimpleCalculator/
|- SimpleCalculator.java # Main program
|- README.md # Project documentation

---

## How to Run

1. **Clone or download** the project.
2. Open a terminal and navigate to the project folder.
3. Compile the program:
   ```bash
   javac SimpleCalculator.java
   java SimpleCalculator
   ```

## Example Usage

```bash
--- Simple Calculator ---

1. Addition
2. Subtraction
3. Multiplication
4. Division
5. Exit
   What's in your mind today? (1 - 5): 1
   Enter a value: 10
   Enter another value: 20
   Result: 30.0
```

## Error Handling Examples

- Invalid choice:
  ```bash
  Not a valid choice! Please enter 1–5.
  ```
- Invalid number:

  ```bash
  Not a valid number! Try again.
  ```

- Division by zero:

  ```bash
  Cannot divide by zero.
  ```

- Exceeding double range:
  ```bash
  Error: Number exceeds allowable range for double.
  ```
