# Chat P2P - PROJETO DE ESTUDOS

Este � um projeto de chat baseado em uma arquitetura **Peer-to-Peer (P2P)**, implementado em **Java** com **JavaFX** para a interface gr�fica e **UDP (DatagramSocket)** para a comunica��o entre peers.

## Descri��o

A aplica��o permite que m�ltiplos usu�rios se conectem diretamente entre si e enviem mensagens de texto em tempo real. A comunica��o � feita utilizando pacotes UDP, e a interface gr�fica foi desenvolvida com **JavaFX**, com recursos como o envio de mensagens e suporte a emotes.

### Funcionalidades

- **Conex�o Peer-to-Peer**: Estabelece uma conex�o direta entre clientes atrav�s de **UDP**.
- **Envio de Mensagens**: Permite o envio de mensagens de texto entre os usu�rios conectados.
- **Emotes**: Implementa��o de bot�es para envio de emotes, que podem ser adicionados �s mensagens.
- **Interface Gr�fica**: Utiliza **JavaFX** para construir a interface de usu�rio, com campos para nome de usu�rio, IP, porta, e �reas de chat e usu�rios online.

## Estrutura do Projeto

O projeto � dividido em v�rias classes principais:

### 1. `Listener.java`

Classe respons�vel por escutar as mensagens recebidas de outros peers. Utiliza um **DatagramSocket** para escutar os pacotes UDP e processar as mensagens recebidas.

### 2. `PeerToPeer.java`

Classe principal da aplica��o, onde a interface gr�fica � carregada e o ciclo de vida da aplica��o � iniciado.

### 3. `TelaInicial.fxml`

Arquivo FXML que define a estrutura da interface do usu�rio, incluindo campos de entrada (nome de usu�rio, IP, porta) e �reas de exibi��o (chat e lista de usu�rios online).

### 4. `TelaInicialController.java`

Controlador da interface, gerencia a l�gica de intera��o com os componentes da tela, incluindo a conex�o entre os peers, envio de mensagens e emotes. A comunica��o � feita via **DatagramSocket** utilizando pacotes UDP.

## Tecnologias Utilizadas

- **Java 8 ou superior**
- **JavaFX** para a interface gr�fica
- **UDP (DatagramSocket)** para comunica��o entre os peers

## Como Rodar o Projeto

### Pr�-requisitos

- **JDK 8 ou superior** instalado na m�quina.


### Compile o projeto: 
Navegue at� o diret�rio do projeto e compile os arquivos Java:
```bash
javac PeerToPeer.java���

### Execute o projeto: 

Execute a aplica��o com o seguinte comando:

```bash

java PeerToPeer���


