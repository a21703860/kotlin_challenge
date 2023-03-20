package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

class Bicicleta {
    val identificador:String
    constructor(identificador:String){
        this.identificador=identificador
    }
    fun Bicicleta(identificador:String){

    }
    fun toString(identificador: String,dataDeAquisicao:String, posicao: Posicao,x:Int,y:Int): String? {
        return "Bicicleta | $identificador | $dataDeAquisicao | $posicao | $x:0 | $y:0"
    }
}