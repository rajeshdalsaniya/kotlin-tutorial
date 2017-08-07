package com.rajeshdalsaniya.FibonacciSeries


// Fibonacci Number Generator Class
class FibonacciSeries {
    // Fibonacci Number: https://en.wikipedia.org/wiki/Fibonacci_number

    /*
     * Kotlin program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number for a given number
     * @return Fibonacci number
     */


    fun fibonacciRecursion(number: Int): Int {
        if (number == 1 || number == 2) {
            return 1
        }

        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2) // tail recursion
    }

    /*
    * Kotlin program to calculate Fibonacci number using loop or Iteration.
    * @return Fibonacci number
    */

    fun fibonacciLoop(number: Int): Int {
        if (number == 1 || number == 2) {
            return 1
        }
        var fibo1 = 1
        var fibo2 = 1
        var fibonacci = 1
        for (i in 3..number) {
            // Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2
            fibo1 = fibo2
            fibo2 = fibonacci

        }
        return fibonacci // Fibonacci number
    }

    // Print output on console
    fun printNumber(number: String) {
        println(number)

    }
}

// Main Function

fun main(args: Array<String>) {
    // Fibonacci Object
    var fibonacci = FibonacciSeries()
    // input to print Fibonacci series upto how many numbers
    fibonacci.printNumber("Enter number upto which Fibonacci series to print: ")
    val number = readLine()!!.toInt()

    fibonacci.printNumber("\nUsing Recursion. Provided Number: " + number)
    // printing Fibonacci series upto number
    for (i in 1..number) {
        fibonacci.printNumber(fibonacci.fibonacciRecursion(i).toString() + " ")
    }

    fibonacci.printNumber("\nFibonacci number at location " + number + " is ==> " + (fibonacci.fibonacciLoop(number).toString() + ""))
}