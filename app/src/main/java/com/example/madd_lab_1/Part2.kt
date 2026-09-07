package com.example.madd_lab_1

/**
 * 1. Create an abstract class named Employee. Create a new class named TemporaryStaff
 * and extend the Employee class and add some unique properties and methods.
 * Create a new class named PermanentStaff by extending the Employee class and add
 * unique properties and methods to it.
 */
abstract class Employee(val name: String, val id: String) {
    abstract fun calculateSalary(): Double
    
    fun displayInfo() {
        println("Employee Name: $name, ID: $id")
    }
}

class TemporaryStaff(name: String, id: String, val hourlyRate: Double, val hoursWorked: Int) : Employee(name, id) {
    override fun calculateSalary(): Double {
        return hourlyRate * hoursWorked
    }

    fun showWorkDetails() {
        println("  Type: Temporary Staff")
        println("  Hours Worked: $hoursWorked, Hourly Rate: $hourlyRate")
    }
}

class PermanentStaff(name: String, id: String, val basicSalary: Double, val allowance: Double) : Employee(name, id) {
    override fun calculateSalary(): Double {
        return basicSalary + allowance
    }

    fun showBenefits() {
        println("  Type: Permanent Staff")
        println("  Basic Salary: $basicSalary, Allowance: $allowance")
    }
}

/**
 * 2. Create an interface called Shape. Declare two methods named setup and draw.
 * Create different shape classes by extending the interface and override the methods
 * by adding uniqueness to each class.
 */
interface Shape {
    fun setup()
    fun draw()
}

class CircleShape(val radius: Double) : Shape {
    override fun setup() {
        println("Setting up Circle with radius $radius...")
    }

    override fun draw() {
        println("Drawing a Circle. O")
    }
}

class SquareShape(val side: Double) : Shape {
    override fun setup() {
        println("Setting up Square with side $side...")
    }

    override fun draw() {
        println("Drawing a Square. []")
    }
}

fun main() {
    println("--- Task 1: Employee Hierarchy ---")
    val tempStaff = TemporaryStaff("Alice", "T001", 15.0, 40)
    val permStaff = PermanentStaff("Bob", "P001", 3000.0, 500.0)

    tempStaff.displayInfo()
    tempStaff.showWorkDetails()
    println("  Total Salary: ${tempStaff.calculateSalary()}")

    println()

    permStaff.displayInfo()
    permStaff.showBenefits()
    println("  Total Salary: ${permStaff.calculateSalary()}")

    println("\n--- Task 2: Shape Interface ---")
    val shapes: List<Shape> = listOf(CircleShape(5.0), SquareShape(4.0))
    for (shape in shapes) {
        shape.setup()
        shape.draw()
        println()
    }
}
