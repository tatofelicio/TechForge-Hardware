# TechForge Hardware | Sistema de PDV e Gestão de Estoque 💻

Este repositório contém o desenvolvimento completo de um sistema corporativo de Ponto de Venda (PDV) e Almoxarifado para uma loja de peças de informática. O projeto foi construído puramente em Java e reflete a evolução de uma arquitetura de software em duas fases distintas: desde a consolidação das lógicas de negócio no terminal (CLI) até a implementação de uma Interface Gráfica (GUI) com persistência em memória via Collections.

## 🚀 Fase 1: Entrega Parcial (Core Lógico e CLI)

A primeira etapa do projeto teve como foco o desenvolvimento do "motor" do sistema, garantindo regras de negócio rígidas e a aplicação dos pilares da Programação Orientada a Objetos.

* **Almoxarifado Inteligente:** Cadastro de peças físicas (Processadores, Placas de Vídeo, Memórias RAM e Placas-Mãe) utilizando Herança e Polimorfismo.
* **Motor de Vendas e Comissões:** Lógica de carrinho de compras com baixa automática no estoque. Inclusão de um gerador de comissões escalonadas para vendedores baseado em agrupamento financeiro (metas de vendas).
* **Tratamento de Exceções Customizadas:** Criação de classes de erro próprias de domínio (`EstoqueInvalidoException`, `PrecoInvalidoException`) para blindar o sistema contra entradas maliciosas ou falhas humanas de digitação.
* **Interface via Terminal:** Navegação em menus de múltiplas camadas blindados com laços de repetição lógicos, garantindo uma operação sem *crashes*.

## 🚀 Fase 2: Entrega Final (Interface Gráfica e Collections)

A segunda etapa marca a migração do sistema para um ambiente visual interativo (Desktop), substituindo os menus do terminal por formulários responsivos, seguindo rigorosos padrões de projeto.

* **Interface Gráfica (Java Swing):** Construção de formulários (`JFrame`) através da IDE NetBeans, utilizando componentes nativos como `JTable`, `JComboBox`, `JTextField` e `JOptionPane` para uma navegação fluida através de menus (`JMenuBar`).
* **Banco de Dados em Memória (Collections):** Implementação de classes de banco de dados (`BDEstoque`, `BDVendas`) baseadas exclusivamente em `List/ArrayList` para armazenar o estado da aplicação.
* **Operações CRUD Completas:** Os bancos de dados suportam integralmente as quatro operações fundamentais: Inserção (Create), Consulta Individual e em Grupo (Read), Alteração (Update) e Exclusão (Delete).
* **Padrão de Projeto Singleton:** Aplicação estrita do *Singleton Design Pattern* tanto nas instâncias de Banco de Dados quanto na invocação das janelas (`JFrames`), garantindo a integridade dos dados e impedindo a duplicidade de formulários abertos simultaneamente.

## 🧠 Arquitetura e Engenharia Aplicada

Este software foi desenhado para simular o rigor de um ERP corporativo, separando claramente as responsabilidades das classes visuais (Views) das regras de banco (Data) e entidades lógicas (Models). Todo o projeto foi construído sem dependências externas, utilizando apenas o ecossistema nativo do Java (JDK 17+).

## 👨‍💻 Autor
**Otávio Felício**
*Estudante de Engenharia de Software*
Projeto desenvolvido na Disciplina de Programação Orientada a Objetos
<img width="480" height="347" alt="image" src="https://github.com/user-attachments/assets/756eecf7-2f39-497a-91d6-176dadd5fd5e" />
