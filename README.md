# Restaurant Task Assignment

## Description

This Java program randomly assigns one of seven daily restaurant tasks to
seven employees. Each task has a number from `0` through `6`:

| Number | Task |
| ---: | --- |
| 0 | Dish washing |
| 1 | Kitchen cleaning |
| 2 | Dining hall cleaning |
| 3 | Exterior cleaning |
| 4 | Manage supplies |
| 5 | Manage linens |
| 6 | Miscellaneous |

The program generates a random task number for each employee. A task cannot
be assigned more than once. Boolean variables remember which tasks have
already been assigned, and the program generates another number whenever it
selects a duplicate.

## Requirements

- Java Development Kit (JDK)
- No user input is required.
- The program does not use arrays, `ArrayList`, or `HashMap`.

## How to run

### IntelliJ IDEA

1. Open the `Conditional` project.
2. Open `src/Restaurant.java`.
3. Click the green run button next to the `main` method.
4. View the employee assignments in the Run window.

### Terminal

From the project folder, compile the program:

```bash
javac -d out src/Restaurant.java
```

Run it with:

```bash
java -cp out Restaurant
```

## Example output

The order changes each time because the tasks are selected randomly.

```text
Hi Team, I am your manager for the day and to be fair, I will assign tasks randomly between you. Here it is:

Dish Washing
Assigning task to employee 1

Manage Linens
Assigning task to employee 2

Kitchen Cleaning
Assigning task to employee 3
```

The complete output contains one unique task for each of the seven employees.

## Program structure

- The `for` loop processes employees 1 through 7.
- `Math.random()` selects a number from 0 through 6.
- The `do-while` loop repeats the selection if the task was already assigned.
- The `if-else` statements check which task boolean belongs to the selected
  number.
- The `switch` statement marks the selected task as assigned and prints its
  name.
