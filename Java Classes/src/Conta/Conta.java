package Conta;

public class Conta {
    private String identificador;
    private double saldo;

    public Conta(String identificador, double saldo) {
        this.identificador = identificador;
        this.saldo = saldo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public double getSaldo() {
        return saldo;
    }

}