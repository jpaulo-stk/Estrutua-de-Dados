public class Vetores {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 1;

        System.out.println("Numeros: " + numeros[4]);

        String nome = "Curso TADS";
        for(int i =0; i < nome.length(); i++){
            System.out.println(nome.charAt(i));
        }
    }
}
