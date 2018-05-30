package com.example.jose.bancoean.Mundo

import ean.collections.IList
import ean.collections.LinkedList

class Cuenta: Comparable<Cuenta>{

    private var numero:Int=0
    private var nombre: String=""
    private var saldo:Int=0

    constructor()

    constructor(numero:Int,nombre:String,saldo: Int){
        this.numero = numero
        this.nombre = nombre
        this.saldo = saldo
    }

    fun darNumero() = numero
    fun darNombre()= nombre
    fun darSaldo()=saldo

    fun depositar(cantidadADepositar:Int){
        require(cantidadADepositar>0,{"debe ser mayor a cero"})
    }

    fun retirar(cantidadaRtirarar:Int){
        require(cantidadaRtirarar <= saldo,{"no tiene suficiente dinero"})
        saldo-=cantidadaRtirarar
    }

    override fun compareTo(other:Cuenta): Int =
            compareValues(this.numero,other.numero)

}


object Banco {
    var cuentas:IList<Cuenta> = LinkedList()

    fun existeCuenta(numCuenta:Int):Boolean{
        for(c in cuentas){
            if (c.darNumero() == numCuenta){
                return true
            }
        }
        return false
    }

    fun agregarCuenta(num:Int, nom:String, saldo: Int){
        val cuenta = Cuenta(num,nom,saldo)
        cuentas.add(cuenta)
    }

    fun cantidadDeCuentas()= cuentas.size
}