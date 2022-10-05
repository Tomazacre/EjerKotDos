fun main() {
    val MatClf: Map<String, Int> = mapOf(
        "Logica Fun" to 88,
        "Programacion Web" to 98,
        "Ecuaciones" to 69,
        "Sistemas Op" to 82,
        "Investigacion" to 73
    )
    println()
    println(funDesemp(MatClf))
}

fun funDesemp(matCal: Map<String, Int>): Map<String, String> {
    val mutMap: MutableMap<String, String> = mutableMapOf()

    for ((k, v) in matCal) {
        val e = v.toInt()
        var cad = ""

        if(e in 0..69){
            cad = " Desempenio Insuficiente"
        }else if (e in 70..74){
            cad = " Suficiente"
        }else if (e in 75..84){
            cad = " Bueno"
        }else if (e in 85..94){
            cad = " Notable"
        }else if (e in 95..100){
            cad = " Excelente"
        }
        mutMap[k] = cad
    }
    return mutMap
}