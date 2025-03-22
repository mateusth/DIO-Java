import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Captura o primeiro número
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Captura o segundo número

        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprime a mensagem da exceção
            System.out.println(exception.getMessage());
        }

        terminal.close(); // Boa prática: fechar o scanner para evitar desperdício de recursos
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Calcula a quantidade de interações
        int contagem = parametroDois - parametroUm;

        // Realiza o loop para imprimir os números
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

// public class ParametrosInvalidosException extends Exception {
//     public ParametrosInvalidosException(String mensagem) {
//         super(mensagem);
//     }
// }



