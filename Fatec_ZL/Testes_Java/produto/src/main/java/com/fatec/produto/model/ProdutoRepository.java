package com.fatec.produto.repository;

import com.fatec.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // Buscar por descrição (contendo texto)
    List<Produto> findByDescricaoContainingIgnoreCase(String descricao);

    // Buscar por categoria
    List<Produto> findByCategoriaIgnoreCase(String categoria);

    // Buscar produtos com estoque abaixo de um valor
    List<Produto> findByQuantidadeNoEstoqueLessThan(int quantidade);

}
