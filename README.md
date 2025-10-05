# Resolução Exercício Prova Estrutura de Dados, utilizando Algoritmo de Pilha
## Alunos
- Matheus Galasso Romera
- Paulo Henrique do Amaral Cavalcante
## Professor
- Rafael Muniz - BRAESTD

## Contexto
Durante a expedição antártica de Ernest Shackleton, o navio Endurance ficou preso e acabou naufragando entre as geleiras. Isolados no frio extremo, a tripulação montou um acampamento improvisado sobre o gelo, onde cada recurso era precioso — inclusive a água derretida usada para lavar os utensílios da cozinha.

O cozinheiro do grupo, Perce Blackborow, precisou improvisar um sistema para organizar os utensílios sujos.
Sem prateleiras nem pia, ele utilizou uma caixa de madeira como pilha:

Cada novo utensílio sujo era colocado em cima dos anteriores.

Quando havia água quente disponível, ele lavava o item do topo da pilha primeiro.

Ao acabar a água, o processo era interrompido imediatamente.

## Desafio
Implementar o Algoritmo de Pilha utilizado pelo cozinheiro do Navio, para que os utensílio pudessem ser lavados

### Regras do Desafio
| Entrada | Ação                | Descrição                                           |
| ------- | ------------------- | --------------------------------------------------- |
| `1`     | Empilhar “Prato”    | Um prato sujo é adicionado à pilha.                 |
| `2`     | Empilhar “Talheres” | Um talhere sujos é adicionado à pilha.              |
| `3`     | Empilhar “Copo”     | Um copo sujo é adicionado à pilha.                  |
| `0`     | Desempilhar         | O cozinheiro lava o item do topo da pilha.          |
| `-1`    | Encerrar            | A água acabou e o processo deve ser encerrado.      |

### Testes e Exemplos
| **Entrada Fornecida**                                 | **Saída Esperada** |
| ----------------------------------------------------- | ------------------ |
| `1`<br>`2`<br>`3`<br>`0`<br>`1`<br>`-1`               | `1`<br>`2`<br>`1`  |
| `2`<br>`3`<br>`0`<br>`0`<br>`1`<br>`3`<br>`2`<br>`-1` | `2`<br>`3`<br>`1`  |
| `3`<br>`1`<br>`2`<br>`3`<br>`0`<br>`0`<br>`-1`        | `1`<br>`3`         |


