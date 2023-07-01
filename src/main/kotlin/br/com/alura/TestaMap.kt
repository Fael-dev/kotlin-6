package br.com.alura

fun testaMap(pedidos: MutableMap<Int, Double?>) {
    println(pedidos)
    val ped = pedidos[1]

    ped?.let {
        println("Pedido $it")
    }

    for (pedido: Map.Entry<Int, Double?> in pedidos) {
        println("Número pedido: ${pedido.key}")
        println("Valor pedido: ${pedido.value}")
    }
    pedidos[4] = 90.9
    println(pedidos)
    pedidos.put(5, 80.0)
    println(pedidos)
    pedidos[1] = 100.0
    println(pedidos)
    pedidos.putIfAbsent(6, 200.0) // Insere apenas se não existir ainda e não atualiza um item existente
    println(pedidos)
    pedidos.remove(6) // OU pedidos.remove(6, 200.0) => Só será removido se o valor de 6 for igual a 200.0
    println(pedidos)
}

fun testaComportamentosMap() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 2.0),
        2 to 20.0,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    )
//    val valorPedido = pedidos.getValue(5)
//    println(valorPedido)

    println(pedidos.getOrElse(0) { "Não tem um pedido" })
    println(pedidos.getOrDefault(0, -1.0))
    println(pedidos.getOrDefault(1, -1.0))
    println(pedidos.getOrDefault(7, -1.0))

    println("Chaves: ${pedidos.keys}")
    println("Valores: ${pedidos.values}")

    for(numeros in pedidos.keys) {
        println("Pedido $numeros")
    }

    for(valores in pedidos.values) {
        println("Valor $valores")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) -> numero % 2 == 0 && valor > 50.0 }
    val pedidosFiltradosKeys = pedidos.filterKeys { numero -> numero % 2 == 0 }
    val pedidosFiltradosValor = pedidos.filterValues { valor -> valor > 50.0 }

    println("Pedidos filtratos: $pedidosFiltrados")
    println("Pedidos filtrados chaves: $pedidosFiltradosKeys")
    println("Pedidos filtrados valores: $pedidosFiltradosValor")

    println(pedidos + Pair(8, 90.0))
    println(pedidos + (9 to 90.0))
    println(pedidos)
    println(pedidos - 6)
    println(pedidos - listOf(6, 1))
    println(pedidos)

    pedidos.putAll(setOf<Pair<Int, Double>>(10 to 4.4, 11 to 98.9))
    pedidos += listOf<Pair<Int, Double>>(16 to 4.4, 15 to 98.9)
    println(pedidos)

    pedidos.keys.remove(2)
    println(pedidos)

    pedidos.values.remove(4.4) // Não remove valores duplicados, apenas o 1
    println(pedidos)

    pedidos -= 16 // Funciona apenas informando a chave
    println(pedidos)
}