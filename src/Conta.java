import javax.swing.*;

public abstract class Conta {

    private int numero;
    private double saldo;

    public Conta(int numero) {
        this.numero = numero;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$  " + valor + " realizado com sucesso.");
        }else {
            System.out.println("Valor do depósito inválido");
        }
    }

    public void sacar(double valor) {

        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado na conta " + numero);
        }else {
            System.out.println("Saque não realizado. Saldo insuficiente ou valor invávlido");
        }
    }
    public void transferir(Conta destino, double valor){
        if (valor > 0 && valor <= saldo){
            sacar(valor);
            destino.depositar(valor);
            System.out.println("Transferência de " + valor + " da conta " + numero + " para a conta " + destino.getNumero() + " Realizada com sucesso.");
        }else {
            System.out.println("Saldo insuficiente ou valor invávlido");
        }
    }
}





