## Como utilizar a estrutura condicional SWITCH / CASE

### Exemplo 1

```java
// Modos disponíveis: 1, 2 e 3
int modoDeJogo = 15;

switch (modoDeJogo) {
  case 1:
    System.out.println("Modo fácil");
    break;

  case 2:
    System.out.println("Modo normal");
    break;
        
  case 3:
    System.out.println("Modo difícil");
    break;

  default:
    System.out.println("Modo desconhecido");
}
```

### Exemplo 2

```java
// Modos disponíveis: 1, 2 e 3
int modoDeJogo = 1;

switch (modoDeJogo) {
  case 1 -> {
    System.out.println("Modo fácil");
  }

  case 2 -> {
    System.out.println("Modo normal");
  }

  case 3 -> {
    System.out.println("Modo difícil");
  }

  default -> {
    System.out.println("Modo desconhecido");
  }
}
```
