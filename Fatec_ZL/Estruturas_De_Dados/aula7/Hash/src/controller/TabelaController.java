package controller;

import java.util.LinkedList;

import model.Morador;

public class TabelaController {
    private LinkedList<Morador>[] tabela;
    private static final int CAPACIDADE = 100;  

    @SuppressWarnings("unchecked")
	public TabelaController() {
        tabela = new LinkedList[CAPACIDADE];
        for (int i = 0; i < CAPACIDADE; i++) {
            tabela[i] = new LinkedList<>();
        }
    }

    private int funcaoHash(int numeroApartamento) {
        return numeroApartamento % CAPACIDADE;
    }

    public void cadastrarMorador(Morador morador) {
        int indice = funcaoHash(morador.getNumeroApartamento());
        tabela[indice].add(morador);
    }

    public Morador consultarMorador(int numeroApartamento) {
        int indice = funcaoHash(numeroApartamento);
        for (Morador morador : tabela[indice]) {
            if (morador.getNumeroApartamento() == numeroApartamento) {
                return morador;
            }
        }
        return null;  
    }

    public void excluirMorador(int numeroApartamento) {
        int indice = funcaoHash(numeroApartamento);
        tabela[indice].removeIf(morador -> morador.getNumeroApartamento() == numeroApartamento);
    }

    public void listarMoradoresPorAndar(int andar) {
        System.out.println("Moradores do andar " + andar + ":");
        for (LinkedList<Morador> lista : tabela) {
            for (Morador morador : lista) {
                int andarMorador = morador.getNumeroApartamento() / 100; 
                if (andarMorador == andar) {
                    System.out.println(morador);
                }
            }
        }
    }
}
