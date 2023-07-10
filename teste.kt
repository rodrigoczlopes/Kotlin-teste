fun main() {
    println("Bem vindo ao Bytebank!!!")
	val titular : String = "Rodrigo"
    val numeroConta: Int = 1000
    var saldo = 0.0 
    //saldo = 100 + 2.0 
    //saldo += 200
    //saldo -= 500
	println("Titular: $titular")
    println("Conta Número: $numeroConta")
    
    if(saldo > 0.0){
        println("Seu saldo é positivo, de: $saldo")
    }else if(saldo == 0.0){
        println("Seu saldo é de: $saldo")
    }else{
        println ("Seu saldo está negativo: $saldo")
    }
    // when e if são iguais, só muda a maneira como eles são escritos
    when{
        saldo > 0.0 -> println("Seu saldo é positivo, de: $saldo")
        saldo == 0.0 -> println("Seu saldo é de: $saldo")
        else -> println ("Seu saldo está negativo: $saldo")
        
    }
	
}
