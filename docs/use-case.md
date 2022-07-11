No processo de conectar softwares de uma empresa através de uma API, a Stack oferece velocidade e confiança para times de desenvolvimento.

Ao iniciar o seu produto através desse template base oferecido, é possível compilar e executar o projeto localmente. É importante lembrar que a Stack não é intrusiva. Os códigos são criados para ajudar times de desenvolvimento, mas cada desenvolvedor opta pelo que prefere usar. 

Para começar sua jornada de desenvolvimento utilizando os recursos disponibilizados pelo Estúdio **NOT DEFINED**, aplique o template base para iniciar o desenvolvimento de uma API completa usando **Java**, **Spring Boot**, **Spring Webflux** e **REST**.  

### Visão Geral
O template **spring-webflux-template** adiciona em uma stack a capacidade de provisionar serviços REST reativos utilizando Spring Webflux.

### Pré-requisitos
Para utilizar esse template você precisa utilizar o `CLI` do `StackSpot` que você pode baixar [**aqui**](https://stackspot.com/).
- Java 11 LTS ou superior.

### Inputs
Os inputs necessários para utilizar o template são:  

| **Campo** | **Valor** | **Descrição** |
| :--- | :--- | :--- |
| Project Name| ex.: MyApp | Nome da aplicação  |

## Execução do projeto criado

Após criar o projeto, acesse o diretório onde se encontra a **`Solution`** e os demais arquivos do projeto. 

Para realizar a compilação do projeto, execute o comando abaixo:

```bash
    ./mvnw package
```

Realize a execução dos testes unitários e de integração. Execute o seguinte comando:

```bash
    ./mvnw test
```

Para executar a aplicação em modo dev, ainda no mesmo diretório da `Solution`. Execute o seguinte comando:

```bash
    ./mvnw spring-boot:run
```

### Configuração do Docker

1. Para construir e executar os containers Docker, execute o seguinte comando na raiz da solução onde você encontra o arquivo **`docker-compose.yml`**:

 ```bash
 docker-compose -f 'docker-compose.yml' up --build
 ```

2. Em seguida, abra http://localhost:5000 no seu navegador.

> Dica: Você também pode utilizar uma IDE (VSCode, Visual Studio) de sua preferência para realizar os passos acima.

Com a aplicação em execução, acesse a url https://localhost:5001/swagger, acesse os detalhes da aplicação e clique em "Ir para localhost (não seguro)" no Chrome. Ao acessar o endereço acima, você poderá ver a documentação (*Swagger*) da sua aplicação.

> Dica: Neste caso, a estrutura de projeto com exemplo foi criada automaticamente. 

Aplicando este projeto base, é possível adicionar as seguintes capacidades ao seu template base:


#### Queue  
O plugin Queue simplifica toda a configuração e implementação de um ambiente descentralizado, voltado à micro serviços e que se comunicam entre si, utilizando filas de mensagens. Comparado a criar uma classe, o plugin Queue consegue abstrair toda a complexidade para a comunicação com a sua fila AWS SQS.

Veja mais detalhes de cada plugin, casos e formas de uso disponíveis através do menu lateral esquerdo. 