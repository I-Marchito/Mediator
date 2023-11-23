package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void deveDarLanceEmItem() {
        Player player = new Player();
        assertEquals("Lance efetuado com sucesso!\nConfirmação do Vendedor: Seu Lance de 390 gp foi Recebido",
                player.darLance("390 gp"));
    }

    @Test
    void deveDarBuyoutEmItem() {
        Player player = new Player();
        assertEquals("Buyout efetuado com sucesso!\nVendedor informa: Seu item foi comprado por 4000 gp",
                player.comprarBuyout("4000 gp"));
    }

}