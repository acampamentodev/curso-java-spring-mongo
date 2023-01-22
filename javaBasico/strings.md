## Exemplos de código com Strings

```java
String nome = "Maria ";
String sobrenome = "Santos";

System.out.println(nome + sobrenome);

String nome = "João";
String sobrenome = "Santos";

System.out.println(nome + “ ” + sobrenome);
```

```java
String nome = "João Paulo";

System.out.println(nome.toUpperCase());
System.out.println(nome.toLowerCase());
System.out.println(nome.length());
System.out.println(nome.indexOf(‘a’));
System.out.println(nome.substring(5, 10));
System.out.println(nome.contains("Paulo"));
System.out.println(nome.replace("Paulo", "Santos"));
```

```java
Scanner leitor = new Scanner(System.in); 
String linhaDigitada = leitor.nextLine();
System.out.println(linhaDigitada);
```
