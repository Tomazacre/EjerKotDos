import java.text.DecimalFormat
import kotlin.math.pow

fun main() {
    val auxP = Pair(88.3, -4.8)
    val auxT = Triple(56.8, 20.5, -7.2)
    val df = DecimalFormat("#.####")

    println("Result -> " + df.format(modU(auxP)))
    println("Result -> " + df.format(modD(auxT)))
}

fun modU(auxA: Pair<Double, Double>): Double{
    var aux = kotlin.math.sqrt(auxA.first.pow(2.0) + auxA.second.pow(2.0))
    return aux
}

fun modD(auxA: Triple<Double, Double, Double>): Double{
    var aux = kotlin.math.sqrt(auxA.first.pow(2.0) + auxA.second.pow(2.0) + auxA.third.pow(2.0))
    return aux
}

