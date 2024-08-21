public class ValidandoComando {
    public static void main(String[] args) {
        String[] comandosValidos = {"use", "help", "get", "invetory", "with"};
        String comando = "use FILTRO with CAFE";

        String[] strings = comando.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (i == 0) {
                String cmd = strings[i];
                for (int j = 0; j < comandosValidos.length; j++) {
                    if (cmd.equalsIgnoreCase(comandosValidos[j])) {
                        System.out.println("Comando válido: " + cmd);
                        break;
                    } else {
                        System.out.println("não entendi...");
                    }
                }
            }else {
                System.out.println("outros comando: " + strings[i]);
            }
        }
    }
}
