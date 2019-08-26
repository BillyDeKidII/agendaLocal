package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int escolha = 1;
        do {
            System.out.println("1 - Insira um contato");
            System.out.println("2 - Exclua um contato");
            System.out.println("3 - Busque um contato");
            System.out.println("4 - Liste todos contatos");
            System.out.println("0 - Encerrar aplicação");
            escolha = leitura.nextInt();
            switch (escolha) {
                case 1:
                    File arquivo = new File("Lista.txt");
                    HashMap<String, String> leituraInicial = new HashMap<>();
                    if (!arquivo.exists()) {

                        arquivo.createNewFile();
                    } else {
                        FileReader leitorArquivo = new FileReader(arquivo);
                        BufferedReader caminhadorArquivo = new BufferedReader(leitorArquivo);
                        while (caminhadorArquivo.ready()) {
                            String linha = caminhadorArquivo.readLine();
                            String[] textoSeparado = linha.split(",");
                            leituraInicial.put(textoSeparado[0], textoSeparado[1]);
                        }
                    }
                    File[] arquivos = arquivo.listFiles();
                    FileWriter leitor1 = new FileWriter(arquivo);
                    BufferedWriter escrita1 = new BufferedWriter(leitor1);
                    Scanner leituraCase1 = new Scanner(System.in);
                    System.out.printf("Diga seu nome \n");
                    String nome = leituraCase1.nextLine();
                    System.out.printf("Diga seu numero \n");
                    String numero = leituraCase1.nextLine();
                    escrita1.write(nome);
                    escrita1.write(",");
                    escrita1.write(numero);
                    escrita1.newLine();
                    for (String i : leituraInicial.keySet()) {
                        escrita1.write(i);
                        escrita1.write(",");
                        escrita1.write(leituraInicial.get(i));
                        escrita1.newLine();
                    }
                    escrita1.close();
                    leitor1.close();
                    break;
                case 2:
                    arquivo = new File("Lista.txt");
                    HashMap<String, String> listaExcluido = new HashMap<>();
                    if (!arquivo.exists()) {

                        arquivo.createNewFile();
                    } else {
                        FileReader leitorArquivo = new FileReader(arquivo);
                        BufferedReader caminhadorArquivo = new BufferedReader(leitorArquivo);
                        while (caminhadorArquivo.ready()) {
                            String linha = caminhadorArquivo.readLine();
                            String[] textoSeparado = linha.split(",");
                            listaExcluido.put(textoSeparado[0], textoSeparado[1]);
                        }
                    }
                    leitor1 = new FileWriter(arquivo);
                    escrita1 = new BufferedWriter(leitor1);
                    Scanner leituraCase2 = new Scanner(System.in);
                    System.out.println("Digite o nome para ser excluido \n");
                    String excluido = leituraCase2.nextLine();
                    listaExcluido.remove(excluido);
                    for (String i : listaExcluido.keySet()) {
                        escrita1.write(i);
                        escrita1.write(",");
                        escrita1.write(listaExcluido.get(i));
                        escrita1.newLine();
                    }
                    escrita1.close();
                    leitor1.close();
                    break;
                case 3:
                    arquivo = new File("Lista.txt");
                    HashMap<String, String> listando = new HashMap<>();
                    if (!arquivo.exists()) {

                        arquivo.createNewFile();
                    } else {
                        FileReader leitorArquivo = new FileReader(arquivo);
                        BufferedReader caminhadorArquivo = new BufferedReader(leitorArquivo);
                        while (caminhadorArquivo.ready()) {
                            String linha = caminhadorArquivo.readLine();
                            String[] textoSeparado = linha.split(",");
                            listando.put(textoSeparado[0], textoSeparado[1]);
                        }
                    }
                    leitor1 = new FileWriter(arquivo);
                    escrita1 = new BufferedWriter(leitor1);
                    Scanner leituraCase3 = new Scanner(System.in);
                    System.out.println("Digite o nome para ser buscado \n");
                    String buscado = leituraCase3.nextLine();
                    System.out.println(buscado + "," + listando.get(buscado));
                    //System.out.println(listando.get(buscado));
                    for (String i : listando.keySet()) {
                        escrita1.write(i);
                        escrita1.write(",");
                        escrita1.write(listando.get(i));
                        escrita1.newLine();
                    }
                    escrita1.close();
                    leitor1.close();
                    break;
                case 4:
                    arquivo = new File("Lista.txt");
                    if (!arquivo.exists()) {
                        System.out.println("Arquivo não existe meu companheiro! Execute a função 1 para gera um arquivo!");
                    } else {
                        FileReader leitorArquivo = new FileReader(arquivo);
                        BufferedReader caminhadorArquivo = new BufferedReader(leitorArquivo);
                        while (caminhadorArquivo.ready()) {
                            String linha = caminhadorArquivo.readLine();
                            System.out.println(linha);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema!Adeus");
            }
        } while (escolha != 0);

    }

}
