## Campo Minado

## Descrição do Projeto de Campo Minado em Java

# Objetivo:
Foi desenvolvido um jogo de Campo Minado (Minesweeper) em Java,
onde a interação do usuário ocorre exclusivamente via console. 
O projeto foi desenvolvido e executado no Eclipse IDE.

## Funcionalidades

# Inicialização do Jogo:
- Definição do tamanho do tabuleiro (n x n) e do número de minas pelo usuário.
- Geração aleatória das minas no tabuleiro.
- Cálculo dos números nas células adjacentes às minas.

# Interação do Usuário:
- Exibição do tabuleiro no console, ocultando minas e mostrando apenas as células reveladas.
- Entrada do usuário para escolher uma célula para revelar.
- Validação da entrada do usuário, garantindo coordenadas válidas.

# Lógica do Jogo:

# Revelação de células:
- Se a célula contém uma mina, o jogo termina e todas as minas são reveladas.
- Se a célula não contém uma mina, o número de minas adjacentes é exibido.
- Se a célula não tem minas adjacentes, uma expansão automática revela todas as células adjacentes vazias.

# Verificação de vitória: 
- se todas as células sem minas forem abertas, o usuário vence.

# Finalização do Jogo:
- Exibição de mensagens de vitória ou derrota.
 - Opção de iniciar um novo jogo ou sair.
