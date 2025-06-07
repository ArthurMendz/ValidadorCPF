import java.util.ArrayList;
import java.util.List;

public class ValidadorCPF {
    private final CPF cpf;

    public ValidadorCPF(CPF cpf) {
        this.cpf = cpf;
    }

    public boolean isValido() {
        int d1 = calcularPrimeiroDigito();
        int d2 = calcularSegundoDigito(d1);
        String digitosCalculados = "" + d1 + d2;
        return digitosCalculados.equals(cpf.getDigitosVerificadores());
    }

    private int calcularPrimeiroDigito() {
        List<Integer> numeros = new ArrayList<>();
        for (char c : cpf.getBase().toCharArray()) {
            numeros.add(Character.getNumericValue(c));
        }

        int peso = 10;
        int soma = 0;
        for (int n : numeros) {
            soma += n * peso;
            peso--;
        }

        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto;
    }

    private int calcularSegundoDigito(int digito1) {
        List<Integer> numeros = new ArrayList<>();
        for (char c : cpf.getBase().toCharArray()) {
            numeros.add(Character.getNumericValue(c));
        }
        numeros.add(digito1);

        int peso = 11;
        int soma = 0;
        for (int n : numeros) {
            soma += n * peso;
            peso--;
        }

        int resto = soma % 11;
        return (resto < 2) ? 0 : 11 - resto;
    }
}
