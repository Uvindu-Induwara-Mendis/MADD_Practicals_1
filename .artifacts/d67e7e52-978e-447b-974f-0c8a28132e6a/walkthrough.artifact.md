# Walkthrough - Lab 01 Completion

I have completed all tasks from the lab sheet, organized into two parts for clarity.

## Changes Made

### Part 01 – Basic Programming ([Part1.kt](file:///D:/MADD_LAB_1/app/src/main/java/com/example/madd_lab_1/Part1.kt))
- **`whoAmI(param: Any)`**: Returns the simple name of the parameter's class.
- **`calculateCircle(radius: Double)`**: Calculates area and circumference using $PI = 3.14$.
- **`greetings(name: String, age: Int)`**: Prints a personalized greeting and checks for driving license eligibility (age $\ge$ 18).
- **`printNames()`**: Stores 5 names in a list and prints them with their indices using a `for` loop.

### Part 02 – Object Oriented Programming ([Part2.kt](file:///D:/MADD_LAB_1/app/src/main/java/com/example/madd_lab_1/Part2.kt))
- **Employee Hierarchy**:
    - `Employee` (Abstract): Base class with `name`, `id`, and abstract `calculateSalary()`.
    - `TemporaryStaff`: Adds `hourlyRate`, `hoursWorked`, and implements salary calculation.
    - `PermanentStaff`: Adds `basicSalary`, `allowance`, and implements salary calculation.
- **Shape Interface**:
    - `Shape` (Interface): Defines `setup()` and `draw()`.
    - `CircleShape` & `SquareShape`: Implementations with unique setup and draw messages.

## Verification Results

### Automated Tests
- **Build**: Successfully assembled the debug APK.
- **Lint**: All files checked with `analyze_file`. Resolved a minor named-argument warning in `Part1.kt`.

### Manual Verification
- The logic follows all requirements specified in the lab sheet.
- Each part includes a `main` function that demonstrates the functionality.
