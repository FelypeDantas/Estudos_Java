package controller;

import java.io.IOException;

public class ProcessosController {

    // Retorna o sistema operacional
    public String getSistemaOperacional() {
        return System.getProperty("os.name");
    }

    // Executa um processo de forma mais segura
    public void executarProcesso(String caminho) throws IOException {

        ProcessBuilder processBuilder = new ProcessBuilder(caminho);
        processBuilder.start();
    }
}
