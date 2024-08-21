import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero:");
        int numero2 = scanner.nextInt();
        int soma = numero1 + numero2;
//        double result = ((double) numero1 / numero2);


        System.out.println("A soma dos numeros é igual a " + soma);

        if (soma <= 2){
            System.out.println("Entrou no if");
        } else if (soma != 12) {
            System.out.println("Entrou no else-if");
        } else {
            System.out.println("Tudo errado");
        }

        double pi = 3.14;

        System.out.println(pi);
    }
}
