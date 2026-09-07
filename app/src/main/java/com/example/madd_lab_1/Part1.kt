package com.example.madd_lab_1

/**
 * 1. Create a function named whoAmI and make it return the type of the parameter
 * passed to it. Print several data types in the main function.
 */
fun whoAmI(param: Any): String {
    return param::class.java.simpleName
}

/**
 * 2. Create a program to calculate Circumference and Area of a circle. Assume that PI = 3.14.
 */
fun calculateCircle(radius: Double) {
    val pi = 3.14
    val circumference = 2 * pi * radius
    val area = pi * radius * radius
    println("Circle with radius $radius:")
    println("  Circumference: $circumference")
    println("  Area: $area")
}

/**
 * 3. Create a function named greetings. Get the name and the age as parameters.
 * Print a greeting message inside the function. Check the age and modify the program
 * to check the eligibility for applying to a driving license (Age limit 18).
 * Notify the person’s eligibility in the program.
 */
fun greetings(name: String, age: Int) {
    println("Hello, $name! Nice to meet you.")
    if (age >= 18) {
        println("  Status: You are eligible to apply for a driving license.")
    } else {
        println("  Status: You are not yet eligible for a driving license. (Required: 18, Current: $age)")
    }
}

/**
 * 4. Create a program to store 5 names. Print the names using a for loop.
 * It should be printed with the index of the printed name.
 */
fun printNames() {
    val names = listOf("Alice", "Bob", "Charlie", "David", "Eve")
    println("Printing 5 names with index:")
    for ((index, name) in names.withIndex()) {
        println("  $index: $name")
    }
}

fun main() {
    println("--- Task 1: whoAmI ---")
    println("Type of 10: ${whoAmI(10)}")
    println("Type of 'Hello': ${whoAmI("Hello")}")
    println("Type of 3.14: ${whoAmI(3.14)}")
    println("Type of true: ${whoAmI(param = true)}")

    println("\n--- Task 2: Circle Calculation ---")
    calculateCircle(5.0)

    println("\n--- Task 3: Greetings & License ---")
    greetings("John", 20)
    greetings("Doe", 16)

    println("\n--- Task 4: Names List ---")
    printNames()
}
