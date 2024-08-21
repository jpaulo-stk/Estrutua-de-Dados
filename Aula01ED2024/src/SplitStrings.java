public class SplitStrings {
    public static void main(String[] args) {
//        String nome = new String();
        String comando = "use FILTRO janpaulo";
        String csv = "ivan;33;araruna;professor";

        String[] strings = csv.split(";");
        for (int i = 0; i < strings.length; i++) {
            System.out.println("pedacos do csv" + strings[i]);
        }
    }
}
