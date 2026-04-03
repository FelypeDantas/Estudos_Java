package com.fatec.produto.persistencia;

import com.fatec.produto.model.Produto;
import com.fatec.produto.repository.ProdutoRepository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Rep01CadastrarProdutoTest {

    @Autowired
    private ProdutoRepository repository;

    @Test
    @DisplayName("Deve cadastrar produto com sucesso")
    void cd01_cadastrar_produto_com_sucesso() {
        // Arrange (dado)
        repository.deleteAll();

        Produto produto = new Produto(
                "Eletrobomba 110v para máquina de lavar",
                "Máquina de Lavar",
                new BigDecimal("51.66"),
                10
        );

        // Act (quando)
        Produto resultado = repository.save(produto);

        // Assert (então)
        assertAll("Validação do cadastro",
                () -> assertEquals(1, repository.count()),
                () -> assertNotNull(resultado.getId()),
                () -> assertEquals("Eletrobomba 110v para máquina de lavar", resultado.getDescricao())
        );
    }

    @Test
    @DisplayName("Não deve cadastrar produto com descrição vazia")
    void ct02_cadastrar_produto_com_descricao_invalida() {
        // Arrange
        Produto produto = new Produto();

        // Act + Assert
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> produto.setDescricao("")
        );

        assertEquals("A descrição não pode ser nula ou vazia", exception.getMessage());
    }
}
