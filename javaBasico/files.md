## Escrevendo em arquivos em Texto

```java
String[] alunos = { "Paulo", "Maria", "João", "Bianca" };

try {
    FileWriter writer = new FileWriter("meu-primeiro-arquivo.txt");
    writer.write("Olá Acampamento Dev!\n");
    writer.write("Sejam todos muito bem-vindos!\n");

    for (String aluno : alunos) {
        writer.write("- ".concat(aluno) + "\n");
    }

    writer.close();

    System.out.println("Seu arquivo foi criado com sucesso!");
} catch (IOException e) {
    System.out.println("Ocorreu um problema: " + e.getMessage());
}
```

## Lendo em arquivos de Texto

```java
String fileContent = "";
FileReader reader = null;
try {
    reader = new FileReader("meu-primeiro-arquivo.txt");
    BufferedReader bufferedReader = new BufferedReader(reader);
    String line = bufferedReader.readLine();

    while(line != null) {
        fileContent = fileContent.concat(line);
        line = bufferedReader.readLine();
    }

    bufferedReader.close();
    reader.close();
} catch (FileNotFoundException e) {
    System.out.println("O arquivo não foi encontrado!");
} catch (IOException e) {
    System.out.println("Ocorreu um problema ao ler esse arquivo: " + e.getMessage());
}

String[] frutas = fileContent.split("- ");

for (String fruta : frutas) {
    if (fruta.contains("-")) {
        System.out.println(fruta);
    }
}
```

## Massa de dados

```
345.246.041-20 PEDRO APARECIDO CARDOSO 16-02-2015
136.534.118-79 JOANA SANTOS MARTINS 12-12-2012
543.827.458-75 BIANCA NUNES DE JESUS 17-07-2022
288.434.543-20 ADRIANA LORENZETTI 06-02-2015
123.123.878-61 ADRIANA DIAS SILVA 22-02-1999
867.140.876-58 ANDREIA VELAME MACHADO 13-08-2018
114.786.878-78 DIOGO APARECIDO DA SILVA 22-11-2010
777.678.618-57 VANSSE FERNANDA LUIZ DIAS 26-07-2013
```

## Análise com Regex

```java
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodigoCPF {
    public static void main(String[] args) {
        String conteudo = obterConteudoDoArquivo("lista.txt");
        ArrayList<String> cpfs = obterCpfsDoTexto(conteudo);
        System.out.println(cpfs);
    }

    public static String obterConteudoDoArquivo(String caminhoParaOArquivo) {
        String conteudo = "";

        try {
            FileReader reader = new FileReader(caminhoParaOArquivo);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line = bufferedReader.readLine();

            while(line != null) {
                conteudo = conteudo.concat(line.concat("\n"));
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo informado não existe!");
        } catch (IOException e) {
            System.out.println("Ocorreu um problema: " + e.getMessage());
        }

        return conteudo;
    }

    public static ArrayList<String> obterCpfsDoTexto(String texto) {
        ArrayList<String> cpfs = new ArrayList<>();

        Pattern pattern = Pattern.compile("(([0-9]){3}[\\.|\\-]){3}([0-9]){2}");
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()) {
            cpfs.add(matcher.group());
        }

        return cpfs;
    }
}
```
