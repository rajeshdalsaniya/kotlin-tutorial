/**
 * Created by Rajesh Dalsaniya on 06/08/17.
 */

/**
 *EMI = [P x R x (1+R)^N]/[(1+R)^N-1], where P stands for the loan amount or principal, R is the interest rate per month [if the interest rate per annum is 11%, then the rate of interest will be 11/(12 x 100)], and N is the number of monthly instalments. When you use the above formula, you will get the same result that you will get in the Excel spreadsheet.
*/

fun main(args: Array<String>) {

    // Placeholder for storing values
    var principal: Double?
    var interestRate: Double?
    var loadTerm: Double?
    var emiAmount: Double?


    // Input values
    print("Enter principal: ")
    principal = readLine()?.toDouble()

    print("Enter interest rate: ")
    interestRate = readLine()?.toDouble()

    print("Enter loal term in year: ")
    loadTerm = readLine()?.toDouble()

    // check for null
    if (principal == null || interestRate == null || loadTerm == null) {
        print("You entered wrong values!, Try Again")
        return
    }
    // Calculate interest for one month
    interestRate /= (12 * 100)

    // Convert loan term in months
    loadTerm *= 12

    // Calculate EMI
    emiAmount = (principal * interestRate * Math.pow(1 + interestRate, loadTerm)) / (Math.pow(1 + interestRate, loadTerm) - 1)

    // Print Monthly EMI
    print("Monthly EMI is: $emiAmount")

}