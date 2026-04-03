package view;

import controller.ProcessosController;

public class Principal {

    public static void main(String[] args) {

        ProcessosController processos = new ProcessosController();

        String caminhoArquivo = "C:\\Users\\Windows\\Downloads\\android-studio-2023.3.1.18-windows.exe";

        try {
            processos.executarProcesso(caminhoArquivo);
        } catch (Exception e) {
            System.err.println("Erro ao executar o processo: " + e.getMessage());
        }
    }
}
