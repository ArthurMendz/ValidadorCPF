public class CPF {
    private final String numero;

    public CPF(String numero) {
        this.numero = numero;
    }

    public String getBase() {
        return numero.substring(0, 9);
    }

    public String getDigitosVerificadores() {
        return numero.substring(9);
    }

    public String getNumeroCompleto() {
        return numero;
    }
}
