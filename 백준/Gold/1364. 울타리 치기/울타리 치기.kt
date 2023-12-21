import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var answer = 1L
    var x = 1L
    for(i in 2..n){
        if(i%6==0) x++
        if(i%6==1) answer--
        answer += x
    }
    println(answer)
}