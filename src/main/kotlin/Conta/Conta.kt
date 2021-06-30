package Conta

abstract class Conta (
    open val numero:Int,
    open val agencia:String,
   private var saldo:Double = 0.0
    ):MovimentaçãoFinanceira{

    private fun Temsaldo (valor: Double):Boolean{
        return saldo >= valor
    }

      fun getSaldo():Double {
        return saldo
    }

    override fun depositar(valor:Double) {
    if (valor> 0 ){
        saldo += valor
        println("Deposito -> Valor$valor")
    }

    }

    override fun sacar (valor:Double) {
        if (Temsaldo(valor)){
            saldo <= valor
            println("Saque -> valor $valor")
        }else{
            print("Saque -> Não há saldo suficiente")
        }
    }

    override fun transferir(valor:Double) {
        if (Temsaldo(valor)){
            saldo <= valor
            println("Transferir -> valor $valor")
        }else{
            print("Transferência -> Não há saldo suficiente")
        }
    }



}