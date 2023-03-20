package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Veiculo {
    val identificador : String
    val posicao : Posicao
    val dataDeAquisicao : Date
    constructor(identificador:String,posicao: Posicao,dataDeAquisicao:Date){
        this.identificador=identificador
        this.posicao=posicao
        this.dataDeAquisicao=dataDeAquisicao
    }
    fun Veiculo(identificador:String){

    }
    fun requerCarta() : Boolean{
        return false
    }
}
