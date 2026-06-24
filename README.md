# TechForge Hardware - PDV & Gerenciador de Estoque 💻

Um sistema back-end de Ponto de Venda (PDV) e Gerenciamento de Estoque construído puramente em Java. Este projeto simula a lógica transacional de uma loja de peças de informática, focado na aplicação rigorosa dos pilares da Programação Orientada a Objetos (POO).

## 🚀 Funcionalidades (Versão Terminal)

* **Módulo de Almoxarifado (Cadastros):** Inserção de componentes físicos (Processadores, Placas de Vídeo, Memórias RAM e Placas-Mãe) com validação de regras de negócio.
* **Frente de Caixa (PDV):** Sistema de carrinho de compras que utiliza código numérico (ID) para dar baixa automática no estoque físico.
* **Auditoria e Relatórios:** Rastreamento do histórico de vendas, identificação do operador (matrícula) e do cliente (CPF), com cálculo automático de receita total.
* **Promoções Dinâmicas:** Aplicação de descontos específicos por tipo de hardware através de contratos de interface.

## 🧠 Arquitetura e Padrões Aplicados

Este projeto foi desenvolvido com foco em escalabilidade e manutenção de código, utilizando:
* **Herança e Polimorfismo:** Classe abstrata `Hardware` como superclasse, permitindo que o carrinho de compras (`List<Hardware>`) aceite qualquer componente dinamicamente.
* **Encapsulamento e Reflexividade:** Proteção de estado das entidades e uso de classes compostas (Ex: Objeto `Fabricante` dentro de `Hardware`).
* **Interfaces:** Implementação do contrato `Promocional` para garantir que novas peças possuam regras de precificação.
* **Tratamento de Exceções Customizadas:** Criação de exceções de domínio (`EstoqueInvalidoException`, `PrecoInvalidoException`, `EstoqueExcedidoException`) para blindar o sistema contra erros de operação ou falhas de input humano (buffer do Scanner).

## 🛠️ Tecnologias Utilizadas
* **Linguagem:** Java (JDK 17+)
* **Paradigma:** Orientação a Objetos (POO)
* **Interface:** Command Line Interface (CLI)

## 👨‍💻 Autor
**Otávio Felício**
*Estudante de Engenharia de Software*
Projeto desenvolvido na Disciplina de Programação Orientada a Objetos
<img width="480" height="347" alt="image" src="https://github.com/user-attachments/assets/756eecf7-2f39-497a-91d6-176dadd5fd5e" />
