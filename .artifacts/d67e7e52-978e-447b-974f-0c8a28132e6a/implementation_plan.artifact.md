# Implementation Plan - Lab 01 Completion

This plan covers the remaining tasks in the lab sheet, organized into two parts: Basic Programming and Object-Oriented Programming.

## Proposed Changes

### Part 01 – Basic Programming
I will create `Part1.kt` which will include:
1.  **whoAmI function**: (Already exists in `whoAmI.kt`, will be consolidated here).
2.  **Circle Calculator**: Function to calculate Circumference and Area with PI = 3.14.
3.  **Greetings function**: Name and age parameter, printing a greeting and checking driving license eligibility (age 18).
4.  **Names List**: Store 5 names and print them with their index using a for loop.

#### [NEW] [Part1.kt](file:///D:/MADD_LAB_1/app/src/main/java/com/example/madd_lab_1/Part1.kt)
#### [DELETE] [whoAmI.kt](file:///D:/MADD_LAB_1/app/src/main/java/com/example/madd_lab_1/whoAmI.kt)

### Part 02 – Object Oriented Programming
I will create `Part2.kt` which will include:
1.  **Employee Hierarchy**: Abstract class `Employee` with subclasses `TemporaryStaff` and `PermanentStaff`.
2.  **Shape Interface**: Interface `Shape` with `setup` and `draw` methods, implemented by `Circle` and `Square` classes.

#### [NEW] [Part2.kt](file:///D:/MADD_LAB_1/app/src/main/java/com/example/madd_lab_1/Part2.kt)

## Verification Plan

### Automated Tests
- Run the `main` functions in both `Part1.kt` and `Part2.kt` to ensure all logic is correct and outputs match the requirements.
- Run `analyze_file` on new files to check for lint issues.

### Manual Verification
- Review the output of the functions against the lab requirements.
