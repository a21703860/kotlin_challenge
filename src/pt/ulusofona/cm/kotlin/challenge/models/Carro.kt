package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Carro {
    val identificador:String
    val motor:Motor

    constructor(identificador:String,motor: Motor){
        this.identificador=identificador;
        this.motor=motor
    }

    fun Carro(identificador: String,motor: Motor){

    }
    fun toString(identificador: String,dataDeAquisicao:String, posicao: Posicao,x:Int,y:Int): String? {
        return "Carro | $identificador | $dataDeAquisicao | $posicao | $x:0 | $y:0"
    }
}