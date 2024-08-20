# DSCommerce

## Sobre o projeto

DSCommerce é uma aplicação web fullstack projetada para e-commerce onde poderá pesquisar, selecionar e comprar produtos. 

Para isto o usuário deverá acessar sua conta através de um login. Uma vez logado o cliente poderá adicionar produtos a sua lista de carrinho. Assim, tendo concluído seu carrinho com todos os produtos desejados o cliente estará pronto para concluir a compra clicando em finalizar pedido.
Após finalizar pedido o sistema registrará a ordem de compra e emitirá uma nota de "compra realizada com sucesso!".
Uma vez concluída a compra a lista de carrinho voltará a estar vazia, pronta para realizar uma nova compra.

A aplicação web abrange itens das mais diversas categorias como: eletrônicos, livros, computadores.
Os produtos são inseridos na aplicação por um admin. Depois são listados no catálogo o qual é apresentado em um *dashboard*. 
O sistema conta com Login e Autenticação, onde é selecionado o tipo de perfil de *'cliente'* ou *'admin'* através do nível de acesso.

### Tipo de Perfil
* Usuário (sem login)
* Cliente
* Admin

## Perfil Cliente
<img src="https://github.com/user-attachments/assets/e6b84698-fc1f-4429-bd5e-6bf8367122a9" width="100%" height="700" alt="Login apresentando" />

## Layout
<div>
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/user/login.JPG?raw=true" width="100%" height="330" alt="login" />
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/user/list.JPG?raw=true" width="100%" height="330" alt="lista" />
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/user/description.JPG?raw=true" width="100%" height="330" alt="descrição" />
</div>
<div>
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/user/cart.JPG?raw=true" width="100%" height="330" alt="carrinho"/>
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/user/buy.JPG?raw=true" width="100%" height="330" alt="compra"/>
</div>

## Perfil Admin
<img src="https://github.com/user-attachments/assets/ef8255d0-9edb-4c4f-a35d-7727f51bf907" width="100%" height="700" alt="novo produto"/>

## Layout 
<div>
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/admin/admin%20home.JPG?raw=true" width="100%" height="330" alt="área administrativa" />
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/admin/edit-list.JPG?raw=true" width="100%" height="330" alt="editar produto" />
</div>
<div>
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/admin/validation.JPG?raw=true" width="100%" height="330" alt="validando campos" />
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/admin/new-product.JPG?raw=true" width="100%" height="330" alt="novo produto" />
  <img src="https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/admin/search.JPG?raw=true" width="100%" height="330" alt="buscar produto" />
</div>

## Modelo conceitual
![Modelo Conceitual](https://github.com/Caelest1s/datafiles/blob/main/assets/DSCommerce/readme/modelo-conceitual/ORM.JPG?raw=true)

## Características do projeto & permissões
Login -> cliente/admin 

Catálogo de produtos -> usuário 

Carrinho de produtos -> usuário 

Detalhes do Produto -> usuário 

Comprar Produto -> cliente/admin 

Editar Produto -> admin 

Inserir Novo Produto -> admin 

Excluir Produto -> admin 

## Tecnologias utilizadas
### Backend
`Java` </br>
`Spring Boot` </br>
`JPA / Hibernate` </br>
`SQL` </br>
`Postgres` </br>
`Maven` 
### Frontend
`ReactJS / TypeScript` </br>
`Javascript` </br>
`HTML / CSS` 

## Competências 
- REST
- Postman
- JWT
- OAuth2
- Hooks
    - UseState
    - UseEffect
- Axios
- Local Storage
- Global Variable

### Implantação em produção (hospedagem)
Backend: 🚧 uploading... 🚧

Frontend: Netlify 

Futuramente disponibilizarei o backend do projeto numa *cloud platform* para melhor visualização. 
O frontend encontra-se hospedado no netlify. 
Para ter acesso ao projeto 100% basta executar os passos descritos abaixo:

## Como executar o projeto 
pré-requisito:
- Java 17 (mínimo)
- Spring Boot 2.7.3 (mínimo)


```bash
# clonar repositório
git clone https://github.com/Caelest1s/DSCommerce-backend

# entrar na pasta do projeto
cd DSCommerce-backend

# executar o projeto
mvnw spring-boot:run

# acessar o link: 
https://evirtualstore.netlify.app/
```

```bash
#Perfil Client
email: maria@gmail.com
pass: 123456

#Perfil Admin
email: alex@gmail.com
pass: 123456
```

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Caelest1s/DSCommerce-frontend-vite/blob/main/LICENSE) 

# Autor 
| [<img loading="lazy" src="https://avatars.githubusercontent.com/u/134893850?v=4" width=130><br><sub>Jefferson Celestino</sub>](https://github.com/caelest1s)
| :---: |

[![LinkedIn](https://img.shields.io/badge/-LinkedIn-000?style=for-the-badge&logo=linkedin&logoColor=0e53f0&color:FFF)](https://www.linkedin.com/in/caelestis/)
