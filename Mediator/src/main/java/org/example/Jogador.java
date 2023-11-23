package org.example;

public class Jogador implements Vendedor{

    private static Jogador instancia = new Jogador();

    private Jogador() {}

    public static Jogador getInstancia() {return instancia; }

    public String receberLance(String mensagem){
        return "Seu Lance de " + mensagem + " foi Recebido";
    }
    public String receberBuyout(String mensagem){
        return "Seu item foi comprado por " + mensagem;
    }
}
