package view;

import controller.TabelaController;
import model.Carro;
import model.Morador;

public class Principal {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fusca", "Azul", "ABC1234");
        Carro carro2 = new Carro("Gol", "Preto", "XYZ5678");
        Carro carro3 = new Carro("Civic", "Branco", "LMN9012");

        Morador morador1 = new Morador(101, "João", carro1);
        Morador morador2 = new Morador(202, "Maria", carro2);
        Morador morador3 = new Morador(701, "Carlos", carro3);

        TabelaController tabela = new TabelaController();

        tabela.cadastrarMorador(morador1);
        tabela.cadastrarMorador(morador2);
        tabela.cadastrarMorador(morador3);

        Morador consultado = tabela.consultarMorador(202);
        System.out.println("Consultado: " + consultado);

        tabela.excluirMorador(101);

        tabela.listarMoradoresPorAndar(7);
    }
}

