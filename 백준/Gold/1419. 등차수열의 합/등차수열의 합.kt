import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val writer = BufferedWriter(OutputStreamWriter(System.out))
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val left = reader.readLine().toInt()
    val right = reader.readLine().toInt()
    val count = when (reader.readLine().toInt()) {
        2 -> maxOf(right - maxOf(left, 3) + 1, 0)
        3 -> {
            var count = 0
            val min = maxOf(left, 6)
            for (i in min .. right) {
                if (i % 3 == 0) {
                    count++
                }
            }

            count
        }
        4 -> {
            var count = 0
            val min = maxOf(left, 10)
            for (i in min .. right) {
                if (i and 1 == 0 && i != 12) {
                    count++
                }
            }

            count
        }
        5 -> {
            var count = 0
            val min = maxOf(left, 15)
            for (i in min..right) {
                if (i % 5 == 0) {
                    count++
                }
            }

            count
        }
        else -> throw AssertionError("k range error")
    }

    writer.write("$count\n")
    writer.flush()
    return
}