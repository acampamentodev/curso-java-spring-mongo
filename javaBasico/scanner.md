## Como utilizar o Scanner

```java
Scanner scanner1 = new Scanner(System.in);

System.out.println("Quantas pessoas você deseja convidar? ");
int totalDeConvidados = scanner1.nextInt();

Scanner scanner2 = new Scanner(System.in);

String[] convidados = new String[totalDeConvidados];

for (int i = 0; i < totalDeConvidados; i++) {
    System.out.println("Informe o nome do " + (i + 1) + "º convidado: ");
    convidados[i] = scanner2.nextLine();
}

System.out.println("Os convidados são:");

for (String convidado : convidados) {
    System.out.println("- ".concat(convidado));
}
```
