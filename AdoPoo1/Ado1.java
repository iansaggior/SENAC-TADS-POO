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
        ArrayList <Informacao> estados = new ArrayList <Informacao> ();
        float soma = 0;
        String arquivoEntradaPib = "C:../AdoPoo1/pib.txt";

/*      --------------------------------------------    */
/*      Abertura do arquivo pib.txt e loop de leitura   */
/*      --------------------------------------------    */


        try {
            FileReader leitorDeArquivo = new FileReader(arquivoEntradaPib);
            BufferedReader bufferDeArquivo = new BufferedReader(leitorDeArquivo);
            
            while((linha = bufferDeArquivo.readLine()) != null) {
                String [] dados = linha.split(";");
                Informacao informacao = new Informacao();

                //Extrair os nomes dos estados
                informacao.setNomeEstado(dados[0]);
                //Extrair os PIBs dos estados
                informacao.setPib(Float.parseFloat(dados[1]));
                //Fazer a soma de todos os PIBs
                informacao.setSoma(soma += informacao.getPib());                    
                
                estados.add(informacao);
            }
            
            System.out.println("PIB do Brasil: " + soma + " Trilhões\n");                
            bufferDeArquivo.close();

        }
        catch(FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + arquivoEntradaPib + "'");                
        }
        catch(IOException ex) {
            System.out.println("Erro lendo o arquivo '" + arquivoEntradaPib + "'");                  
        }

        //Realizar a porcentagem do PIB de cada estado do Brasil
        for (Informacao i: estados) {
            i.setPorcentagem((i.getPib() / soma) * 100);
            System.out.println(i);
        }

/*      ------------------------------------------------- */
/*      Abertura do arquivo regioes.txt e loop de leitura */
/*      ------------------------------------------------- */

        String arquivoEntradaRegioes = "C:../AdoPoo1/regioes.txt";
        String linha1 = null;
        
        ArrayList <Informacao> regioesBrasil = new ArrayList <Informacao> ();

        try {
            FileReader flrd = new FileReader(arquivoEntradaRegioes);
            BufferedReader bfrd = new BufferedReader(flrd);
            
            while((linha1 = bfrd.readLine()) != null) {
                String[] regiao = linha1.split(System.lineSeparator());
                Informacao informacao = new Informacao();
                //informacao.setRegiao(regiao);

                System.out.print(Arrays.toString(regiao).replace("[]", "\n"));
                regioesBrasil.add(informacao);
            }
            
            bfrd.close();

        }
        catch(FileNotFoundException ex) {
            System.out.println("Arquivo inexistente: '" + arquivoEntradaRegioes + "'");                
        }
        catch(IOException ex) {
            System.out.println("Erro lendo o arquivo '" + arquivoEntradaRegioes + "'");                  
        }


        
/*      -------------------------------------   */
/*      Escrita no arquivo .txt                 */
/*      -------------------------------------   */

        String arquivoSaida = "C:../AdoPoo1/saida.txt";
        String states = estados.toString();

        states = states.replace("[", "");
        states = states.replace("]", "");
        states = states.replace(", ", "\n");
        try {
            
            FileWriter fileWriter = new FileWriter(arquivoSaida);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter escritorDeArquivo = new PrintWriter(bufferedWriter);
            
                escritorDeArquivo.append("PIB do Brasil: " + soma + " Trilhoes\n");
                escritorDeArquivo.append("Estados \t - \t PIB \t - \tPorcentagem \n\n" + states);
                
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoSaida + "'");
        }
    }
}
