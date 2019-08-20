package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author Thiago Romão
 */
public class Agenda {

    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        String nome;
        String numero;
        FileWriter lista = new FileWriter("C:/geraArquivo/lista.txt");
        PrintWriter gravar = new PrintWriter(lista, true);
        FileReader leitor = new FileReader("C:/geraArquivo/lista.txt");
        BufferedReader br = new BufferedReader(leitor);
        BufferedWriter bw = new BufferedWriter(gravar);
        int escolha = 1;
        do {
            System.out.println("1 - Adicionar novo contato");
            System.out.println("2 - Buscar contato");
            System.out.println("3 - Carregar lista de contato");
            System.out.println("0 - Sair do Menu");
            escolha = leitura.nextInt();
            switch (escolha) {
                case 1:
                    Scanner leituraCase1 = new Scanner(System.in);
                    System.out.printf("Diga seu nome \n");
                    nome = leituraCase1.nextLine();
                    System.out.printf("Diga seu numero \n");
                    numero = leituraCase1.nextLine();
                    gravar.printf(nome);
                    gravar.printf(",");
                    gravar.println(numero);
                    bw.newLine();
                    break;
                case 2:
                    System.out.println("Ainda não implementado! Escolha outra opção");
                    break;
                case 3:
                    System.out.println("Ainda não implementado! Escolha outra opção");
                    break;
                case 0:
                    System.out.println("Saindo do sistema");
                    lista.close();
                    gravar.close();
                    break;
            }
        } while (escolha != 0);

    }
}
