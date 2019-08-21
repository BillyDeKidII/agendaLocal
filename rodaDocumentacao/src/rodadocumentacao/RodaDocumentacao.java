package rodadocumentacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RodaDocumentacao {

    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        File arquivo = new File("C:/geraArquivo/Lista.txt");
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
                    if (!arquivo.exists()) {

                        arquivo.createNewFile();
                    } else {
                        FileReader leitorArquivo = new FileReader(arquivo);
                        BufferedReader caminhadorArquivo = new BufferedReader(leitorArquivo);
                        while (caminhadorArquivo.ready())
                        {
                            String linha = caminhadorArquivo.readLine();
                        }
                    }
                    File[] arquivos = arquivo.listFiles();
                    FileWriter leitor = new FileWriter(arquivo, true);
                    BufferedWriter escrita = new BufferedWriter(leitor);
                    Scanner leituraCase1 = new Scanner(System.in);
                    System.out.printf("Diga seu nome \n");
                    String nome = leituraCase1.nextLine();
                    System.out.printf("Diga seu numero \n");
                    String numero = leituraCase1.nextLine();
                    escrita.write(nome);
                    escrita.write(",");
                    escrita.write(numero);
                    escrita.newLine();
                    escrita.close();
                    leitor.close();
                    break;
                case 2:
                    System.out.println("Ainda não implementado! Escolha outra opção!");
                    break;
                case 3:
                    System.out.println("Ainda não implementado! Escolha outra opção!");
                    break;
                case 4:
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
