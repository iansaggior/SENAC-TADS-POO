//código do professor 

import java.io.*;

/**
 * Class Description . . . 
 *
 * @author: Autor
 * @version: 1.0 
 * Main Class File:  topAXX.java
 * File: Structure.java
 * Date: DD/MM/YYYY
 */

public class lab1 {
    public static void main(String [] args) {

        // nome do arquivo
        String nomeDoArquivo1 = "pib.txt";
//      String nomeDoArquivo2 = "regioes.txt";

        // linha temporaria
        String linha = null;
        
/*      ------------------------------------- */
/*      Abertura de arquivo e loop de leitura */
/*      ------------------------------------- */
        try {
            FileReader fileReader = new FileReader(nomeDoArquivo1);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // loop por cada linha do arquivo
            while((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }   

            // feche o arquivo
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + nomeDoArquivo1 + "'");                
        }
        catch(IOException ex) {
            System.out.println("Erro lendo o arquivo '" + nomeDoArquivo1 + "'");                  
        }
        
        
/*      ------------------------------------- */
/*      Exemplo de escrita em arquivo         */
/*      ------------------------------------- */
        String arquivoDeSaida = "saida.txt";

        try {

            FileWriter fileWriter = new FileWriter(arquivoDeSaida);

            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("pib da regiao X = $$$$");
            bufferedWriter.newLine();
            bufferedWriter.write("pib da regiao Y = $$$$");

            // feche o arquivo
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoDeSaida + "'");
        }    

    }
}

