public class Main {
    public static void main(String[] args) {
        CPF cpf = new CPF("00000000000");
        ValidadorCPF validador = new ValidadorCPF(cpf);

        if (validador.isValido()) {
            System.out.println("CPF válido"); 
        } else {
            System.out.println("CPF inválido");
        }
    }
}
