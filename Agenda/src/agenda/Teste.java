package agenda;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Teste 
{
    public static void main(String[] args) throws IOException
    {
        File arquivo = new File("C:/geraArquivo/teste.txt");//instancia um objeto
        boolean existe = arquivo.exists();//verifica se existe
        arquivo.createNewFile();//cria o arquivo
        File [] arquivos = arquivo.listFiles();//lista os arquivos do diretorio
        arquivo.delete();//deleta o arquivo
        FileWriter fw = new FileWriter(arquivo);//recebe o objeto do tipo arquivo
        FileWriter fw2 = new FileWriter(arquivo, true);//altera o objeto para ser adicionado ao inves de excluido(append)
        BufferedWriter bw = new BufferedWriter(fw);//recebe como argumento o objeto do tipo File Writer
        bw.write("Informação a ser adicionada ao arquivo");//escreve o que vai pro arquivo
        bw.newLine();//quebra de linha
        bw.close();//fecha o argumento 
        fw.close();//fecha o argumento
        FileReader fr = new FileReader(arquivo);//recebe o objeto do tipo arquivo
        BufferedReader br = new BufferedReader(fr);//recebe o objeto do tipo FileReader
        while (br.ready())//lê enquanto tiver linhas
        {
            String linha = br.readLine();
        }
        br.close();//fecha os recursos
        fr.close();//fecha os recursos
    }
}
