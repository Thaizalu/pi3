# 🩺 Sistema de Gerenciamento de Pacientes Oncológicos

![GitHub last commit](https://img.shields.io/github/last-commit/Thaizalu/gacci_frontend?style=for-the-badge)
![GitHub repo size](https://img.shields.io/github/repo-size/Thaizalu/gacci_frontend?style=for-the-badge)
![GitHub license](https://img.shields.io/github/license/Thaizalu/gacci_frontend?style=for-the-badge)

## 📚 Projeto Integrador - Curso de Tecnologia da Informação (UNIVESP)

Este projeto tem como objetivo o desenvolvimento de um sistema web completo para o gerenciamento de pacientes oncológicos, atendendo aos requisitos do Projeto Integrador do curso de Tecnologia da Informação da UNIVESP.

A aplicação foi desenvolvida com foco na acessibilidade, segurança de dados (LGPD), integração contínua, testes automatizados e uso de banco de dados. O sistema contempla funcionalidades como cadastro, visualização, edição e inativação de pacientes, com controle de versão via GitHub.

---

## 🚀 Tecnologias Utilizadas

### 💻 Backend
- **Java**
- **Spring Boot**
- **MySQL**
- **Maven**
- **JPA/Hibernate**

### 🌐 Frontend
- **Angular**
- **TypeScript**
- **Bootstrap**
- **RxJS**

### ☁️ Outros Requisitos
- **Controle de versão com Git/GitHub**
- **Testes unitários**
- **Integração contínua (CI)**
- **Princípios da LGPD**
- **Possibilidade de uso com IoT no futuro**

---

## 📂 Estrutura dos Repositórios

- 🔗 [Repositório Backend (Java)](https://github.com/Thaizalu/gacci_backend)
- 🔗 [Repositório Frontend (Angular)](https://github.com/Thaizalu/gacci_frontend)

---

## 🧪 Funcionalidades Desenvolvidas

- Cadastro de pacientes
- Visualização de registros
- Edição de dados
- Inativação de perfil (sem exclusão do banco de dados)
- Validação de dados
- Aplicação acessível e responsiva

---

## 🔐 LGPD e Segurança de Dados

Foi implementada uma lógica de inativação de perfis ao invés de exclusão, visando conformidade com a Lei Geral de Proteção de Dados (LGPD). Para as futuras versões, será avaliado o uso de criptografia em campos sensíveis e mascaramento de dados pessoais.

---

## 📊 Futuras Melhorias

- Criptografia dos dados sensíveis
- Dashboards com análises preditivas
- Integração com sensores IoT para coleta automatizada
- Migração para uma nuvem de baixo custo ou uso local

---

## 🛠️ Instalação Local

1. Clone os dois repositórios:
   git clone https://github.com/Thaizalu/gacci_backend.git
   git clone https://github.com/Thaizalu/gacci_frontend.git
Configure o banco de dados MySQL e variáveis de ambiente.

No backend:
mvn spring-boot:run

No frontend:
npm install
ng serve
Acesse em http://localhost:4200

🧑‍💼 Autora
Thaiza Ludmila Bueno da Silva
Curso: Tecnologia da Informação – UNIVESP
LinkedIn: linkedin.com/in/thaizalu

📄 Licença
Este projeto está sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.
