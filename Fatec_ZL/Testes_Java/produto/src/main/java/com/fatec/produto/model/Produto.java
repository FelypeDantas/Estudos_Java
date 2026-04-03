package com.fatec.produto.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private String categoria;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal custo;

    @Column(nullable = false)
    private int quantidadeNoEstoque;

    // Construtor padrão (obrigatório para JPA)
    protected Produto() {
    }

    // Construtor útil
    public Produto(String descricao, String categoria, BigDecimal custo, int quantidadeNoEstoque) {
        setDescricao(descricao);
        setCategoria(categoria);
        setCusto(custo);
        setQuantidadeNoEstoque(quantidadeNoEstoque);
    }

    public Long getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("A descrição não pode ser nula ou vazia");
        }
        this.descricao = descricao.trim();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        if (categoria == null || categoria.isBlank()) {
            throw new IllegalArgumentException("A categoria não pode ser nula ou vazia");
        }
        this.categoria = categoria.trim();
    }

    public BigDecimal getCusto() {
        return custo;
    }

    public void setCusto(BigDecimal custo) {
        if (custo == null || custo.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("O custo não pode ser nulo ou negativo");
        }
        this.custo = custo;
    }

    public int getQuantidadeNoEstoque() {
        return quantidadeNoEstoque;
    }

    public void setQuantidadeNoEstoque(int quantidadeNoEstoque) {
        if (quantidadeNoEstoque < 0) {
            throw new IllegalArgumentException("A quantidade não pode ser negativa");
        }
        this.quantidadeNoEstoque = quantidadeNoEstoque;
    }

    // equals e hashCode (importante para entidades)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto)) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
