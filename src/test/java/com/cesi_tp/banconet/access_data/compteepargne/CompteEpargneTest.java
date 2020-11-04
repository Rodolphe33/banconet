package com.cesi_tp.banconet.access_data.compteepargne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompteEpargneTest {

  @Test
  void controleCompteEpargne() {
    CompteEpargne ceTest = new CompteEpargne("hell666", 200, 5.5);
    // assertEquals(ce qui est attendu, ce que je test);
    assertEquals(
      "Numéro du Compte Epargne: hell666, solde: 200.0 - Taux d'intéret: 5.5",
      ceTest.toString()
    );
  }
}
