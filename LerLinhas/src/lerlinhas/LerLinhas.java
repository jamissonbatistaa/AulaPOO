package lerlinhas;

import java.nio.file.*;
import java.io.IOException;
import java.util.List;

public class LerLinhas {
    public static void main(String[] args) {
        try {
            Path caminho = Paths.get("alertas.txt");
            List<String> linhas = Files.readAllLines(caminho);

            System.out.println("Conteúdo do arquivo linha por linha:");
            for (String linha : linhas) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
