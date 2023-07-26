

fun calcularPromedio(numeros: List<Double>): Double {
    if (numeros.isEmpty()) {
        throw IllegalArgumentException("La lista no puede estar vacía.")
    }
    val suma = numeros.reduce { acc, numero -> acc + numero }
    val tam=numeros.size
    return suma / tam
}
fun separador(){
    println("#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-#-")
}
fun impares(lista:List<Int>):List<Int>{
    return lista.filter{it%2!=0}
}

fun isPalindrome(cadena:String):Boolean=cadena==cadena.reversed()

fun saludar(nombres: List<String>):List<String>{
    return nombres.map{"Hola: $it"}
}




fun main(){
    //Ejercicio 1
    val numeros1=listOf(10.0,5.0,7.5,8.2,6.5,9.3)
    val promedio= calcularPromedio(numeros1)
    println("El promedio es: $promedio")
    separador()
    //Ejercicio 2
    val numeros2= listOf(1,2,3,4,5,6,7,8,9,10)
    val impares= impares(numeros2)
    println("Numeros impares: $impares")
    separador()
    //Ejercicio 3
    val cadena="reconocer"
    println("La cadena $cadena es palindroma: ${isPalindrome(cadena)}")
    separador()
    //Ejercicio 4
    val nombres= listOf("Jimena","Julio","Hugo","Santiago","Gaby")
    val nombresHola=saludar(nombres)
    for(i in nombresHola){
        print(i+"\n")
    }
    separador()

}
