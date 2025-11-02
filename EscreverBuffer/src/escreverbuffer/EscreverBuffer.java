package escreverbuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscreverBuffer {

    public static void main(String[] args) {

        try {
              // crie um bufferedwriter para escrever no arquivo "saida.txt"
            BufferedWriter writer = new BufferedWriter(new FileWriter("saida.txt",true));

            writer.write("Ola mundo");
            writer.newLine();//quebra de linha
            writer.write("Usando buffer em java");
           
            writer.close();//fecha o arquivo (importante)
            System.out.println("Arquivo escrito com sucesso!");
        }catch (IOException e){
            System.out.println("erro ao escrever no arquivo"+e.getMessage());
        }

    }

}
