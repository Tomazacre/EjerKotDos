fun main(){
    dicPal("Eeeeeen don camaron tenemos el mejor lugar para comer en familia y en pareja")
}

fun dicPal(orac: String){
    val spac = " "
    var arr = orac.split(spac).toTypedArray()
    println("El diccionario de palabras es:")
    println()

    var cont = 0
    var contA = 2

    for(i in arr){

        print((cont + 1).toString() + ".- " + arr[cont] + " -> Long: " + arr[cont].length)

        if(arr[cont].length < 15){
            var a = arr[cont].length
            if(cont > 9){
                for(a in a..9){
                    print(" ")
                }
            }else{
                for(a in a..10){
                    print(" ")
                }
            }

        }

        if (cont.toInt() == contA.toInt()){
            println()
            contA = contA + 3
        }
        cont++
    }
}
