# nicole_oliveira_validacaocpf

By: Nicole Inaê de Oliveira - contato: nicole.oliveira.pb@compasso.com.br

- Repositório criado no desenvolvimento de um desafio da semana 04 do Programa de Bolsas do Compass UOL com foco em Spring Boot

# **Desafio:**
Dada uma lista de CPFs,
o sistema deve percorrer cada CPF, validá-lo e atribuí-lo à lista correspondente (válidos ou inválidos),
de acordo com os critérios estabelecidos.
Enquanto isso, deve-se garantir que a lista de CPFs válidos não contenha duplicatas.

  *task-01*
  Montar estrutura do programa
  - entrada
    - processo
    - saida (impressão)
    - Validação de tamanho 11

  Se o tamanho for 11, é válido.
  Se o tamanho não for 11, é inválido.

  *task-02*
  Verificação se é numerico

  Se for um numerico, é válido.
  Se não for um numerico, é inválido.

  *task-03*
  Retirada de pontos e traços

  Se após remover os pontos e traços o tamanho for 11, é válido.
  Se após remover os pontos e traços o tamanho não for 11, é inválido.


Dada a lista de CPFs, o sistema deve imprimir:
 - Lista de CPFs válidos:
 - Lista de CPFs inválidos:

## Criação das Branches

- **Branch dev:**
    - Criada a partir da branch `main`.
    - Destinada ao desenvolvimento da task 01:


##Relatos:
- senti bastante dificuldade para instanciar o objeto pois fiquei tentando usar os metodos da classe para acessar o objeto, com a ajuda da squad simplifiquei o processo.
- tive um problema com o metodo toString do objeto cpf, ao gerar pelo IDE, senti facilidade em identificar o problema.


**Tipos de commit:**

**feat:** Para commits que adicionam uma nova funcionalidade ao projeto. Exemplo de mensagem de commit: "feat: Adicionada seção de criação das branches no README.md".

**docs:** Para commits que apenas alteram a documentação, como o README.md. Exemplo de mensagem de commit: "docs: Documentado processo de criação das branches no README.md".

**chore:** Para commits relacionados a tarefas de manutenção ou organização do código, como a adição de scripts ou configurações. Exemplo de mensagem de commit: "chore: Adicionado arquivo .gitignore".

**fix:** Para commits que corrigem um bug no código. Exemplo de mensagem de commit: "fix: Corrigido erro de digitação no README.md".

**refactor:** Para commits que reestruturam o código sem alterar seu comportamento. Exemplo de mensagem de commit: "refactor: Reorganizado código na classe X para melhor legibilidade".

**style:** Para commits que fazem ajustes na formatação do código, como espaçamento, indentação, etc. Exemplo de mensagem de commit: "style: Corrigido espaçamento inconsistente no arquivo Y".

