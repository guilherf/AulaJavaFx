# Aula de JavaFX

Projeto de estudo de **JavaFX**: uma janela com um botão que, ao ser clicado, mostra a data e a hora atuais.

## Para que serve

Foi criado como primeiro contato com interfaces gráficas em Java. Demonstra os conceitos básicos do JavaFX:

- uma classe `Application` que abre a janela;
- um layout descrito em **FXML**;
- um **controller** que trata o evento de clique;
- uso de imagens (ícone da janela e uma figura na tela).

## Como funciona

- A janela tem 600 × 400, com o texto "Clique pra ver a hora e data", um botão **Clique Aqui!** e uma imagem à esquerda.
- Ao clicar no botão, o método `clicouButao` do controller preenche o texto com a data e hora do sistema (`java.util.Date`).
- O ícone da janela é carregado de `src/resources`.

## Estrutura

| Arquivo | Papel |
|---|---|
| `src/java/net/bifewagyu/Main.java` | Abre a janela, define o ícone e carrega o FXML. |
| `src/java/net/bifewagyu/Controller.java` | Trata o clique do botão. |
| `src/resources/main.fxml` | Layout da tela. |
| `src/resources/*.png` | Ícone e imagem usados na interface. |

## Como executar

Pré-requisitos: **JDK 21 ou superior** e o **JavaFX SDK** (o `main.fxml` foi gerado para o JavaFX 25).

1. Abra a pasta no IntelliJ IDEA (módulo `AulaJavaFx.iml`).
2. Adicione o JavaFX SDK como biblioteca.
3. Nas opções de execução de `Main`, adicione:
   `--module-path /caminho/do/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml`
4. Execute `Main`.

### Atenção: caminho da imagem

No `main.fxml`, a imagem da esquerda é referenciada por um **caminho absoluto do Windows** (`C:\Users\...\imagemca.png`). Em outro computador ela não aparece. Para corrigir, troque a referência por um caminho relativo ao classpath:

```xml
<Image url="@/imagemca.png" />
```

## Autor

Guilherme Ferreira — [@guilherf](https://github.com/guilherf)
