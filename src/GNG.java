import java.util.Scanner;

public class GNG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (100 * Math.random());
        int K = 10;

        System.out.println("Um número foi escolhido entre 1 e 100. Tente adivinhar o número dentro de 5 tentativas.");

        for (int i = 0; i < K; i++) {
            System.out.print("Tente adivinhar o número: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Parabéns! Você adivinhou o número.");
                return;
            } else if (guess < number) {
                System.out.println("O número é maior que " + guess);
            } else {
                System.out.println("O número é menor que " + guess);
            }
        }

        System.out.println("Você esgotou suas " + K + " tentativas.");
        System.out.println("O número era " + number);
    }
}
