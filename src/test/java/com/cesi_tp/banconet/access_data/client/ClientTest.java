package com.cesi_tp.banconet.access_data.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientTest {

  @Test
  void controleClient() {
    Client clienTest = new Client("Rodolphe", "Lassalle");
    // assertEquals(ce qui est attendu, ce qu je test);
    assertEquals("Rodolphe Lassalle", clienTest.toString());
  }
}
