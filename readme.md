# LCC 2021/2

## Geração do analisador léxico

Para gerar o analisador léxico é necessário executar a classe `src/main/java/br/ufsc/ine5622/GeradorDeAnalisadorLexico`. Esse gerador irá utilizar o ANTLR  para gerar um analisador léxico com base na gramática definida em `src/main/resources/Lexica.g4`. O analisador léxico gerado pelo ANTLR é colocado na pasta `src/main/java/br/ufsc/ine5622/antlr/lexico`.

## Utilização do analisador léxico

O analisador léxico gerado pelo ANTLR é usado pelo nosso analisador léxico disponível em `src/main/java/br/ufsc/ine5622/AnalisadorLexico`. O nosso analisador léxico basicamente carrega os exemplos localizados em `src/main/resources/exemplos/lexico/` e chama o analisador léxico gerado pelo ANTLR.
