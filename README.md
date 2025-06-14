# DSCommerce


[![NPM](https://img.shields.io/npm/l/react)](https://github.com/GuilhermeDavino/DScommerce/blob/main/LICENSE) 

# Sobre o projeto

**DSCommerce** é uma aplicação web que simula um e-commerce completo, desenvolvida com foco em boas práticas de desenvolvimento backend e frontend. O sistema conta com as seguintes funcionalidades:

## 🔧 Funcionalidades

- 📦 **Catálogo de Produtos**  
  Lista todos os produtos disponíveis para os usuários navegarem e escolherem.

- 🔍 **Página de Produto Detalhada**  
  Cada produto possui uma página com informações completas.

- 🛒 **Carrinho de Compras**  
  Os usuários podem adicionar e remover produtos do carrinho antes de finalizar a compra.

- 🔐 **Autenticação de Usuário**  
  Tela de login com controle de acesso via token JWT.

- 🛠️ **Área Administrativa (Admin)**  
  Exclusiva para usuários com perfil `ADMIN`, permitindo o gerenciamento completo dos produtos da loja (CRUD).

## 🗂️ Estrutura de Permissões

| Perfil | Acesso |
|--------|--------|
| Público | Visualização do catálogo de produtos |
| Usuário logado | Carrinho de compras |
| ADMIN | Área administrativa (CRUD de produtos) |

---

## Layout mobile
![Mobile 1](https://user-images.githubusercontent.com/91570669/206563191-6439ec73-9a3a-42cb-bc1d-8d0f9045c06a.png) ![Mobile 2](https://user-images.githubusercontent.com/91570669/206563193-b19b90df-817e-4c9c-8e75-04393a5cd04e.png) ![Mobile 3](https://user-images.githubusercontent.com/91570669/206563197-5dd4b1b7-e215-465a-bcd6-e3a0cc00d3b9.png)

## Layout web
![Web 1](https://user-images.githubusercontent.com/91570669/206563257-9ed8ea6e-c18d-4893-a696-407e8a21a618.png)

![Web 2](https://user-images.githubusercontent.com/91570669/206563258-bddb163c-40a3-4ebb-9367-b960411c147c.png)

![Web 3](https://user-images.githubusercontent.com/91570669/206563261-d66c954c-985b-415c-b0ee-9eaeeab6c5a1.png)

![Web 4](https://user-images.githubusercontent.com/91570669/206563249-4ce550f1-fd7d-4088-9c55-0dd54b7d6ab1.png)

## Modelo conceitual
![Modelo Conceitual](https://user-images.githubusercontent.com/91570669/206563729-68b3128d-03f5-4870-8350-52c3655a8ac7.png)

## 🚀 Tecnologias Utilizadas

- Backend: **Java + Spring Boot + Spring Data JPA**
- Segurança: **JWT + Spring Security + Spring Oauth2**
- Banco de dados: **PostgreSQL**
- Frontend: **React + TypeScript**
- Controle de estado: **React Context API**
- Requisições HTTP: **Axios**

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/GuilhermeDavino/DScommerce.git
# entrar na pasta do projeto back end
cd backend
# executar o projeto
./mvnw spring-boot:run
```

## Front end web [Acesse o repósitorio fronte-end](https://github.com/GuilhermeDavino/dscommerce-frontend)
Pré-requisitos: npm / yarn

```bash
# clonar repositório
git clone https://github.com/GuilhermeDavino/dscommerce-frontend.git
# entrar na pasta do projeto front end web
cd frontend
# instalar dependências
yarn install
# executar o projeto
yarn dev
```

# Autor

Guilherme de Albuquerque Davino
https://www.linkedin.com/in/guilherme-albuquerque-davino/
