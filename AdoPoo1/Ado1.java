/*
    *   Ian Saggioratto Pereira                     ***
    *    TADS - 3º Semestre - Noturno - Turma A     ***
    *    ADO1 - PROGRAMAÇÃO ORIENTADA A OBJETOS     ***
*/

import java.io.*;
import java.util.*;


public class Ado1 {
    public static void main(String[] args) {
        String linha = null;
        String arquivoEntrada = "C:../AdoPoo1/pib.txt";

/*      ------------------------------------- */
/*      Abertura de arquivo e loop de leitura */
/*      ------------------------------------- */

            try {
                FileReader leitorDeArquivo = new FileReader(arquivoEntrada);
                BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);

                List <Informacao> estados = new ArrayList <Informacao> ();
                
                while((linha = bufferDeArquivo.readLine()) != null) {
                    //Float soma;
                    String [] dados = linha.split(";");

                    Informacao informacao = new Informacao();
                    informacao.setNomeEstado(dados[0]);
                    informacao.setPib(Float.parseFloat(dados[1]));
                    //tentativa de somar todos os pibs para conseguir fazer uma porcentagem
                    //informacao.setSoma(soma =+ Float.parseFloat(dados[1]));

                    estados.add(informacao);
                }
                
                /* while (true) {
                    linha = bufferDeArquivo.readLine();
                    
                    if (linha == null) {
                        break;
                    }
                    System.out.println(linha);
                } */
                
                System.out.println(estados);
            
            bufferDeArquivo.close();         
      
            } catch(FileNotFoundException ex) {
                System.out.println("Arquivo inexistente: '" + arquivoEntrada + "'");                
            }
            catch(IOException ex) {
                System.out.println("Erro lendo o arquivo '" + arquivoEntrada + "'");                  
            }
        System.out.println();            


/*      ------------------------------------- */
/*      Exemplo de escrita em arquivo         */
/*      ------------------------------------- */

        String arquivoSaida = "C:../AdoPoo1/saida.txt";
        try {
            FileWriter fileWriter = new FileWriter(arquivoSaida);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            
            bufferedWriter.write("pib da regiao X = $$$$");
            bufferedWriter.newLine();
            bufferedWriter.write("pib da regiao Y = $$$$");

            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoSaida + "'");
        }    

        }
}
