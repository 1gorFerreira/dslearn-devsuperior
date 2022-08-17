# ⚡ DSLearn

# Sobre o projeto

DSLearn é uma aplicação full stack web construída durante as aulas do bootcamp Spring da [DevSuperior](https://devsuperior.com.br "Site da DevSuperior").

**PS: Como o foco dos meus estudos é o back-end, esse repositório não conterá o front-end.**

O sistema consiste em uma plataforma de ensino que mantém informações de cursos, suas turmas e alunos, bem como um fórum para perguntas e respostas sobre os conteúdos do curso. Os atores do sistema podem ser alunos e professores. Há também usuários administradores, que são os únicos autorizados a cadastrar cursos e turmas.

Um curso é composto de vários “recursos”, que são grupos de conteúdos. Estes recursos podem ser trilhas de aprendizado, bônus, links externos, e o próprio fórum de perguntas e respostas do curso. Cada recurso pode conter seções, e estas seções por sua vez é que vão conter as aulas, que podem ser conteúdos em vídeo e/ou texto, ou tarefas para serem entregues pelos alunos.

Uma tarefa pode ter um peso, uma data de entrega, um número de questões e a quantidade mínima de acertos necessários para ser aceita. Quando um aluno entrega a tarefa, esta fica aguardando pelo feedback do professor, e ela pode ser aceita ou rejeitada.

Cada nova turma do curso corresponde a uma oferta ou edição deste curso, que possui uma data de início e fim. Diferentes ofertas do mesmo curso podem ter pequenas variações no conteúdo, conforme a necessidade de customização para cada turma.

Os usuários (alunos e professores) devem receber notificações.

Com relação ao fórum de perguntas e respostas, este consiste em uma coleção de tópicos (com um título e a descrição da pergunta), e cada tópico pode ter várias respostas. Os requisitos gerais do fórum são:

- Listar tópicos, com as seguintes opções de filtro:

     - Por recurso/seção/aula

     - Por texto (título e/ou corpo do tópico)

     - Perguntas feitas apenas pelo usuário logado

- Criar tópico: título, corpo

- Responder tópico

- Marcar/desmarcar upvote em pergunta (não pode ser o autor)

- Marcar/desmarcar upvote em resposta (não pode ser o autor)

- Marcar/desmarcar melhor resposta (somente autor do tópico e instrutor)

## Figma do DSLearn
https://www.figma.com/file/p8Hawp1w5g0pCZ3h3ZsCUd/DSLearn-Bootcamp

## Modelo conceitual

![modelo-conceitual-com-forum](https://user-images.githubusercontent.com/85773707/174487495-1e925a02-33c7-44b7-9cb5-d0cc20269091.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- Spring Security
- Spring Cloud
- Spring Data
- JPA / Hibernate
- Maven
- JWT
- OAuth2

# Autor

Igor Ferreira Daniel

Linkedin: https://www.linkedin.com/in/igor-ferreira-366a44234/

