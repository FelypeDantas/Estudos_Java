package com.fatec.produto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@SpringBootTest
class ProdutoApplicationTests {

    @Test
    @DisplayName("Deve carregar o contexto da aplicação sem erros")
    void contextLoads() {
        assertDoesNotThrow(() -> {
            // Se o contexto subir sem exceções, o teste passa
        });
    }
}
