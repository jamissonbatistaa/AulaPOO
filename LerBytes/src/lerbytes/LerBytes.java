package lerbytes;

import java.nio.file.*;
import java.nio.file.Path;
import java.io.IOException;

public class LerBytes {

    public static void main(String[] args) {
        try {
            Path caminho = Paths.get("alerta.txt");
            byte[] dados = Files.readAllBytes(caminho);

            System.out.println("arquivo lido com sucesso");
            System.out.println("tamanho: " + dados.length + "bytes");
            String conteudo = new String();
            System.out.println("conteudo:" + conteudo.length());
        } catch (IOException e) {
            System.out.println("erro ao ler o arquivo " + e.getMessage());

        }

    }

}
