package com.cesi_tp.banconet.access_data.comptecourant;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CompteCourantTest {

  @Test
  void controleCompteCourant() {
    CompteCourant ccTest = new CompteCourant("cCourant1", 200.0);
    // assertEquals(ce qui est attendu, ce que je test);
    assertEquals("cCourant1, solde: 200.0", ccTest.toString());
  }
}
