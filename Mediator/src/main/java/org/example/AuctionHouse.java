package org.example;

public class AuctionHouse {

    private static AuctionHouse instancia = new AuctionHouse();

    private AuctionHouse() {}

    public static AuctionHouse getInstancia() {
        return instancia;
    }

    public String receberLanceItemDeJogador(String mensagem){
        return "Lance efetuado com sucesso!\n" + "Confirmação do Vendedor: " + Jogador.getInstancia().receberLance(mensagem);
    }

    public String compraPorBuyoutItemDeJogador(String mensagem){
        return "Buyout efetuado com sucesso!\n" + "Vendedor informa: " + Jogador.getInstancia().receberBuyout(mensagem);
    }
}
