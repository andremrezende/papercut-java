# Projeto com Papercut

Este projeto demonstra o uso da biblioteca **Papercut** para gerenciar dívidas técnicas em uma base de código Java. O Papercut permite adicionar anotações que ajudam a identificar e gerenciar áreas do código que precisam ser refatoradas, removidas ou melhoradas, com base em prazos, versões ou marcos específicos.

## Dependências

Para utilizar o Papercut, você precisa adicionar a biblioteca ao seu projeto. Certifique-se de que a dependência do **Papercut** esteja corretamente configurada no seu `pom.xml` (para Maven).

## Anotações Utilizadas

Este projeto faz uso das seguintes anotações fornecidas pelo Papercut:

- **@Milestone**: Marca um marco importante no ciclo de desenvolvimento, utilizado para identificar partes do código que devem ser revisadas quando o marco é atingido.
- **@Refactor**: Indica que uma determinada área do código precisa ser refatorada. Esta anotação pode ser configurada com uma data específica ou atrelada a um marco.
- **@RemoveThis**: Marca código que deve ser removido em uma data futura ou em uma versão específica.

## Uso
Se possuir o Maven instalar e configurado as variáveis de ambiente para execução do comando:
```shell
mvn clean install
```
E com isso poderá verificar os `Warnings` e os erros de compilação do projeto.