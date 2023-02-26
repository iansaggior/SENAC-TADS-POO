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

        /* ------------------------------------- */
        /* Abertura de arquivo e loop de leitura */
        /* ------------------------------------- */

        ArrayList<Informacao> estados = new ArrayList<Informacao>();
        float soma = 0;
        try {
            FileReader leitorDeArquivo = new FileReader(arquivoEntrada);
            BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);

            while ((linha = bufferDeArquivo.readLine()) != null) {
                String[] dados = linha.split(";");

                Informacao informacao = new Informacao();
                informacao.setNomeEstado(dados[0]);
                informacao.setPib(Float.parseFloat(dados[1]));
                soma += informacao.getPib();
                estados.add(informacao);

                /*
                 * usar os dados ja separados no split, pegando o pib d cada estado e dividir
                 * com a variavel soma e multiplicar por 100
                 */
            }
            System.out.println(estados);
            System.out.println("Total: " + soma);
            bufferDeArquivo.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + arquivoEntrada + "'");
        } catch (IOException ex) {
            System.out.println("Erro lendo o arquivo '" + arquivoEntrada + "'");
        }
        System.out.println();
       
         Informacao informacao = new Informacao();
        for (float porcentagem : (estados)) {
            porcentagem = (informacao.getPib() / soma) * 100;
            System.out.println(porcentagem);
        }


        /* ------------------------------------- */
        /* Exemplo de escrita em arquivo */
        /* ------------------------------------- */

        String arquivoSaida = "C:../AdoPoo1/saida.txt";
        try {
            FileWriter fileWriter = new FileWriter(arquivoSaida);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter imprimirArquivo = new PrintWriter(bufferedWriter);

            bufferedWriter.write("pib da regiao X = $$$$");
            bufferedWriter.newLine();
            bufferedWriter.write("pib da regiao Y = $$$$");
            bufferedWriter.newLine();
            // bufferedWriter.write("Estados: " + estados);
            imprimirArquivo.append("\nEstados: \n" + estados);

            bufferedWriter.close();

        } catch (IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoSaida + "'");
        }

    }
}
