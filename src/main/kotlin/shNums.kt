import kotlin.collections.ArrayList

fun main() {
    var list = listOf<Double>(15.0,17.0,18.0,19.0,20.0,25.0,30.0,35.0,40.0,45.0,50.0,51.0,53.0,55.0,59.0,66.0)
    numAtip(list)
}

fun calcMed(aux: List<Double>): Double {
    var au = 0.0
    if (aux.size % 2 == 0){
        au = (aux[aux.size / 2] + aux[aux.size / 2 - 1]) / 2
    }else {
        au = aux[aux.size / 2]
    }
    return au
}

fun numAtip(lstAux: List<Double>){
    var auxArU: List<Double> = ArrayList()
    var auxArD: List<Double> = ArrayList()
    var res: MutableList<Double> = ArrayList()
    
    if (lstAux.size % 2 == 0) {
        auxArU = lstAux.subList(0, lstAux.size / 2)
        auxArD = lstAux.subList(lstAux.size / 2, lstAux.size)

    } else {
        auxArU = lstAux.subList(0, lstAux.size / 2)
        auxArD = lstAux.subList(lstAux.size / 2 + 1, lstAux.size)
    }
    
    var auxM = calcMed(auxArU)
    var auxN = calcMed(auxArD)
    println("Media 1 -> $auxM")
    println("Media 2 -> $auxN")

    var auxO = auxN - auxM
    var auxD = (auxN + 1.5) * auxO
    var auxU = (auxM - 1.5) * auxO

    var cont = 0
    for (i in lstAux.indices) {
        if (lstAux[cont] < auxU || lstAux[i] > auxD) {
            res.add(lstAux[cont])
        }
    }
}