/*
    *   Ian Saggioratto Pereira                     ***
    *    TADS - 3º Semestre - Noturno - Turma A     ***
    *    ADO1 - PROGRAMAÇÃO ORIENTADA A OBJETOS     ***
*/

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class Ado1 {
    public static void main(String[] args) {
        String linha = null;
        ArrayList <Informacao> estados = new ArrayList <Informacao> ();
        float soma = 0;
        String arquivoEntradaPib = "C:../Ado1Poo/pib.txt";

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
            
            System.out.println("PIB do Brasil: \t" + soma + " Trilhões\n");                
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

        String arquivoEntradaRegioes = "C:../Ado1Poo/regioes.txt";

        ArrayList <Regiao> regioesDoBrasil = new ArrayList <Regiao> ();
        String nomeRegiao = null;
        float pibRegiaoPorcentual = 0;
        float pibRegiaoEmDinheiro = 0;
        int cont = 0;

        try {
            //extrair os nomes das regioes e seus respectivos estados
            FileReader flrd = new FileReader(arquivoEntradaRegioes);
            BufferedReader bfrd = new BufferedReader(flrd);

            while((linha = bfrd.readLine()) != null) {
                if (linha.isEmpty()) {
                    Regiao regiao = new Regiao();

                    regiao.setRegiao(nomeRegiao);
                    regiao.setPibRegiao(pibRegiaoPorcentual);
                    regiao.setPibRegiaoDinheiro(pibRegiaoEmDinheiro);
                    nomeRegiao = null;
                    pibRegiaoPorcentual = 0;
                    pibRegiaoEmDinheiro = 0;
                    cont = 0;

                    regioesDoBrasil.add(regiao);
                } else {
                    if (cont == 0) {
                        nomeRegiao = linha;
                        cont++;
                    } else {
                        for (Informacao aux: estados) {
                            if (aux.getNomeEstado().equalsIgnoreCase(linha)) {
                                pibRegiaoPorcentual += aux.getPorcentagem(); // fazer a soma da porcentagem de cada estado e atribuir a sua respectiva regiao
                                pibRegiaoEmDinheiro += aux.getPib();// fazer a soma do valor em R$ de cada estado e atribuir a sua respectiva regiao
                                break;
                            }
                        }
                    }
                }
            }
            bfrd.close();

            Regiao regiao = new Regiao();

            regiao.setRegiao(nomeRegiao);
            regiao.setPibRegiao(pibRegiaoPorcentual);
            regiao.setPibRegiaoDinheiro(pibRegiaoEmDinheiro);
            regioesDoBrasil.add(regiao);

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

        String arquivoSaida = "C:../Ado1Poo/saida.txt";

        try {
            
            FileWriter fileWriter = new FileWriter(arquivoSaida);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter escritorDeArquivo = new PrintWriter(bufferedWriter);
            FileReader flrd = new FileReader(arquivoEntradaRegioes);
            BufferedReader bfrd = new BufferedReader(flrd);


            boolean verificadorRegiao = false;
            DecimalFormat format = new DecimalFormat("###0.00");
            
                escritorDeArquivo.append("PIB do Brasil: R$ " + soma + " Trilhoes\n\n");
                escritorDeArquivo.append("PIB dos estados em relacao ao PIB do Brasil \n\n");

                while ((linha = bfrd.readLine()) != null) {
                    for (Regiao aux: regioesDoBrasil) {
                        if (aux.getRegiao().equalsIgnoreCase(linha)) {
                            if (verificadorRegiao) {
                                bufferedWriter.newLine();
                            }         
                            escritorDeArquivo.append("PIB " + aux.getRegiao() + ": \t" +
                            "R$ " + (aux.getPibRegiaoDinheiro()) + " Bi" + " = " + 
                            format.format(aux.getPibRegiao()) + "%");
                            verificadorRegiao = true;
                            break;
                        }
                    }
                }

            bfrd.close(); 
            bufferedWriter.close();
        }
        catch(IOException ex) {
            System.out.println("Erro de escrita em '" + arquivoSaida + "'");
        }
    }
}
