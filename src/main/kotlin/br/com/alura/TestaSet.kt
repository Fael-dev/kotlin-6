package br.com.alura

fun testaSet() {
    val assistiramCursoAndroid: MutableSet<String> = mutableSetOf("João", "Maria", "Fran", "José")
    val assistiramCursoKotlin: MutableSet<String> = mutableSetOf("João", "Maria", "Fran")
//    val assistiramAmbos = assistiramCursoAndroid + assistiramCursoKotlin
    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)
    assistiramAmbos.add("Bea")
    assistiramAmbos.add("Bea")
    println(assistiramAmbos)
    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid union assistiramCursoKotlin)
    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid.subtract(assistiramCursoKotlin))
    println(assistiramCursoAndroid.intersect(assistiramCursoKotlin))

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Bea")
    println(assistiramList)
    println(assistiramList.toSet())
}