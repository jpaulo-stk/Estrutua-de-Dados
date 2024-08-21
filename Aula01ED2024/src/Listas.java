import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Digite o primeiro nome: ");
        String nome = scanner.nextLine();
        while (!nome.equals("break")) {
            nomes.add(nome);
            System.out.println("Digite o proximo nome: ");
            nome = scanner.nextLine();
        }

        for (String aluno: nomes) {
            System.out.println("Nome do aluno  " + aluno);
        }

        for (int i = 0; i < nomes.size(); i++) {
            String aluno = nomes.get(i);
            System.out.println("Nome aluno: " + aluno);
        }

        String nome2 = "Nome 2";
        nomes.set(1, nome2);
    }
}
