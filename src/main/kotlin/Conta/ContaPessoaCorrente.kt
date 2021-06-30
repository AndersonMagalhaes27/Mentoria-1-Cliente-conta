package Conta

import java.lang.ClassCastException
class ContaPessoaCorrente (
    pNumero:Int,
    pAgencia:String,

    ): Conta(pNumero,pAgencia) {

}

fun main(){
 val conta = ContaPessoaPoupanca(123,"001")
    conta.depositar(5000.0)
    println(conta.getSaldo())

 
}

