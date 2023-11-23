package org.example;


public class Comprador {

    public String darLance(String mensagem) {
        return AuctionHouse.getInstancia().receberLanceItemDeJogador(mensagem);
    }

    public String comprarBuyout(String mensagem) {
        return AuctionHouse.getInstancia().compraPorBuyoutItemDeJogador(mensagem);
    }

}