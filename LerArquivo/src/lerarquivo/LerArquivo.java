package lerarquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LerArquivo {
    public static void main(String[] args) {
        try {
            Path caminho = Paths.get("alertas.txt");
            String conteudo = Files.readString(caminho);
            System.out.println("Conteúdo do arquivo:\n" + conteudo);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
