# Chat P2P - PROJETO DE ESTUDOS

Este é um projeto de chat baseado em uma arquitetura **Peer-to-Peer (P2P)**, implementado em **Java** com **JavaFX** para a interface gráfica e **UDP (DatagramSocket)** para a comunicação entre peers.

## Descrição

A aplicação permite que múltiplos usuários se conectem diretamente entre si e enviem mensagens de texto em tempo real. A comunicação é feita utilizando pacotes UDP, e a interface gráfica foi desenvolvida com **JavaFX**, com recursos como o envio de mensagens e suporte a emotes.

### Funcionalidades

- **Conexão Peer-to-Peer**: Estabelece uma conexão direta entre clientes através de **UDP**.
- **Envio de Mensagens**: Permite o envio de mensagens de texto entre os usuários conectados.
- **Emotes**: Implementação de botões para envio de emotes, que podem ser adicionados às mensagens.
- **Interface Gráfica**: Utiliza **JavaFX** para construir a interface de usuário, com campos para nome de usuário, IP, porta, e áreas de chat e usuários online.

## Estrutura do Projeto

O projeto é dividido em várias classes principais:

### 1. `Listener.java`

Classe responsável por escutar as mensagens recebidas de outros peers. Utiliza um **DatagramSocket** para escutar os pacotes UDP e processar as mensagens recebidas.

### 2. `PeerToPeer.java`

Classe principal da aplicação, onde a interface gráfica é carregada e o ciclo de vida da aplicação é iniciado.

### 3. `TelaInicial.fxml`

Arquivo FXML que define a estrutura da interface do usuário, incluindo campos de entrada (nome de usuário, IP, porta) e áreas de exibição (chat e lista de usuários online).

### 4. `TelaInicialController.java`

Controlador da interface, gerencia a lógica de interação com os componentes da tela, incluindo a conexão entre os peers, envio de mensagens e emotes. A comunicação é feita via **DatagramSocket** utilizando pacotes UDP.

## Tecnologias Utilizadas

- **Java 8 ou superior**
- **JavaFX** para a interface gráfica
- **UDP (DatagramSocket)** para comunicação entre os peers

## Como Rodar o Projeto

### Pré-requisitos

- **JDK 8 ou superior** instalado na máquina.


### Compile o projeto: 
Navegue até o diretório do projeto e compile os arquivos Java:
```bash
javac PeerToPeer.java´´´

### Execute o projeto: 

Execute a aplicação com o seguinte comando:

```bash

java PeerToPeer´´´


