# projeto-algoritmos

[![Build status](https://travis-ci.com/giuliana-bezerra/projeto-algoritmos.svg?branch=master)](https://travis-ci.com/giuliana-bezerra/projeto-algoritmos) [![Quality Gate](https://sonarcloud.io/api/badges/gate?key=com:projeto-algoritmos)](https://sonarcloud.io/dashboard/index/com:projeto-algoritmos)

#### Índice

1. [Introdução](#overview)
2. [Configuração](#setup)
3. [Uso](#usage)
4. [Referências](#reference)
5. [Limitações](#limitations)
6. [Desenvolvimento](#development)

## Introdução

Esse projeto permite a execução de algoritmos para o ensino do seu funcionamento através de uma abordagem prática. A ideia é permitir que o usuário veja o funcionamento do algoritmo e assim seja capaz de implementá-lo e inclusive adicionar variações necessárias.


## Configuração
Esse aplicativo depende de:

- Java 8
- Maven 3.5.x

Seguir as seguintes etapas para executar o aplicativo:

1. Baixar o repositório:
```
git clone git@github.com:giuliana-bezerra/projeto-algoritmos.git
```
2. Gerar o jar com dependências usando o Maven:
```
mvn clean
mvn package
```
3. Executar o jar gerado:
```
cd target
java -jar projeto-algoritmos-0.0.1-SNAPSHOT-jar-with-dependencies.jar url
```

## Uso
O programa apresenta um menu de opções para a seleção do algoritmo desejado. São exibidas as opções em categorias e cabe ao usuário informar a categoria desejada ou encerrar a execução do programa.

## Reference
Ver javadoc.

## Limitations
Esse projeto ainda está em fase de desenvolvimento, portanto só possui suporte inicial a alguns algoritmos de ordenação.

## Desenvolvimento
Constribuições são muito bem-vindas através de implementação de outros algoritmos conhecidos e a adição deles ao menu de opções do programa. Inicialmente a interface com o usuário foi feita via terminal, mas poderia evoluir para outras formas. O projeto é bastante testado incluindo a análise de métricas via *SonarLint*, por isso é importante desenvolver mantendo esse padrão de qualidade dos artefatos. **Novas contribuiuções sempre devem ser acompanhadas de testes unitários**.