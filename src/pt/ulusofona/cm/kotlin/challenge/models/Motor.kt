package pt.ulusofona.cm.kotlin.challenge.models

class Motor {
    val cavalos:Int
    val cilindrada:Int
    val ligado:Boolean
    constructor(cavalos:Int,cilindrada:Int,ligado:Boolean){
        this.cavalos=cavalos
        this.cilindrada=cilindrada
        this.ligado=ligado
    }
    fun Motor(cavalos: Int,cilindrada: Int){

    }

    fun toString(cavalos: Int,cilindrada: Int): String? {
        return "Motor | $cavalos | $cilindrada"
    }
}