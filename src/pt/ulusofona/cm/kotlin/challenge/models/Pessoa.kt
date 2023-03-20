package pt.ulusofona.cm.kotlin.challenge.models

import java.util.*

abstract class Pessoa {
    val nome : String
    val veiculos = mutableListOf<Veiculo>()
    val dataDeNascimento: Date
    val carta : Carta
    val posicao : Posicao

    constructor(nome: String,dataDeNascimento:Date,carta:Carta,posicao:Posicao) {
        this.nome = nome
        this.dataDeNascimento=dataDeNascimento
        this.carta=carta
        this.posicao=posicao
    }

    fun Pessoa(nome:String,dataDeNascimento: Date){

    }
    fun comprarVeiculo(veiculo: Veiculo){
        veiculos.add(veiculo)
    }
    fun pesquisarVeiculo(identificador:String): Veiculo {

    }
    fun venderVeiculo(identificador: String,comprador:Pessoa){

    }
    fun moverVeiculoPara(identificador: String,x:Int,y:Int){

    }
    fun temCarta():Boolean{
        return false
    }

    fun tirarCarta(){

    }
     fun toString(nome: String,dataDeNascimento:Date,posicao: Posicao,x:Int,y:Int): String? {
        return "Pessoa | $nome | $dataDeNascimento | $posicao | $x:0 | $y:0"
    }
}