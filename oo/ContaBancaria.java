package entidade;

import java.text.NumberFormat;
import java.util.Locale;

public class ContaBancaria {

    private String agencia;
    private String conta;
    private String titular;
    private double saldo;

    public ContaBancaria(String agencia, String conta, String titular, double saldo) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private String obterValorEmReal(double valor) {
        Locale locale = new Locale("pt", "BR");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

        return numberFormat.format(valor);
    }

    @Override
    public String toString() {
        String texto = "O titular da conta %s / agencia %s é %s e o saldo é %s";
        return String.format(texto, getConta(), getAgencia(), getTitular(), obterValorEmReal(getSaldo()));
    }
}
