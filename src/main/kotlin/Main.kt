fun main() {
    println("El precio con descuento es: " + descPres(50.0,10.0))
    println("El precio con IVA es: " + ivaAplic(50.0))
    val arA = listOf<Double>(12.3 , 12.8, 46.7, 67.3, 345.9)
    println("El precio con total del carrito con descuentos es: " + descCarrito(arA))
}

private fun descPres(prec: Double, desscu: Double): Double{
    var aux = desscu / 100
    var desc = aux * prec
    var descFin = prec - desc
    return descFin
}

private fun ivaAplic(prec: Double): Double{
    var descFin = 1.16 * prec
    return descFin
}

private fun descCarrito(listProd: List<Double>): Double{
    var listaTerm = 0.0;
    var cont = 0
    var arAux = 0.0
    for (aux in listProd){
        if (aux.toInt() != listProd.count()){
            var au = listProd[cont]
            arAux += descPres(au, 25.0)
        }
        cont++
    }
    return arAux
}