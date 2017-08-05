import java.util.*
import kotlin.concurrent.fixedRateTimer

/**
 * Created by rajeshdalsaniya on 05/08/17.
 */

fun main(args: Array<String>) {
    // Random Number Generator Object
    val newRandom = RandomNumber()
    // Timer Print Random Numbers
    var fixRateTimer = fixedRateTimer("randomNumber", false, 1000, 1000) {
        // First Random Number
        var random1 = newRandom.randomBetween(1,7)
        // Second Random Number
        var random2 = newRandom.randomBetween(1,7)
        // Print Random Numbers
        print("Random Numbers: $random1, $random2 \n")
    }
    // Run fix Rate Timer
    try {
        Thread.sleep(50000)
    } finally {
        fixRateTimer.cancel()
    }

}

// Random Number Generator Class
class RandomNumber {

    // Java Random Object
    var random = Random()

    /**
     * Min is inclusive and max is exclusive in this case
     */
    fun randomBetween(min: Int, max: Int): Int {
        return random.nextInt(max - min) + min
    }


}