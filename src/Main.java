import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Tabuleiro tabuleiro = new Tabuleiro();

        IO.println("============================================");
        IO.println("   MASMORRA DO DESTINO - JOGO DE TABULEIRO  ");
        IO.println("============================================");

        String nome = Leitor.lerTexto("Informe o nome do seu Herói: ");

        IO.println("\nEscolha a sua classe:");
        IO.println("1. Guerreiro (120 HP, Escudo de Defesa)");
        IO.println("2. Mago (80 HP, Ataque de Bola de Fogo)");

        int opcao = Leitor.lerInteiro("Opção (1 ou 2): ");

        Heroi jogador;
        if (opcao == 2) {
            jogador = new Mago(nome);
        } else {
            jogador = new Guerreiro(nome);
        }

        IO.println(String.format("\nBem-vindo, %s! Vamos começar a sua missão.\n", jogador.getNome()));

        while (jogador.estaVivo() && jogador.getPosicao() < tabuleiro.getTamanho() - 1) {
            IO.println("------------------------------------------");

            IO.println(String.format("Posição: Casa %d/%d | HP: %d/%d",
                    jogador.getPosicao(), tabuleiro.getTamanho() - 1, jogador.getHpAtual(), jogador.getHpMax()));

            Leitor.aguardarEnter(" Aperte ENTER para rolar o dado...");

            int passos = random.nextInt(2) + 1;
            IO.println(String.format(" Tirou no dado: %d", passos));

            jogador.mover(passos);

            Casa casaAtual = tabuleiro.getCasa(jogador.getPosicao());
            IO.println(String.format("%s", casaAtual.getDescricao()));

            casaAtual.executarAcao(jogador);
            IO.println("");
        }

        IO.println("==========================================");
        if (jogador.estaVivo()) {
            IO.println(" PARABÉNS! Derrotou os desafios e completou o tabuleiro!");
        } else {
            IO.println(" GAME OVER! O seu herói caiu em combate na masmorra.");
        }
    }
}