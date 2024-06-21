public class Banco {
   public static void main(String[] args) {
      ContaPoupanca cp = new ContaPoupanca(124587);
      ContaCorrente cc = new ContaCorrente(123585);


      cc.depositar(1000.00);
      cp.depositar(500.00);

      cc.sacar(200);
      cp.sacar(100.0);

      cc.transferir(cp, 300.0);

      System.out.println("Saldo da Conta Corrente: R$ " + cc.getSaldo());
      System.out.println("Saldo da Conta Poupança: R$ " + cp.getSaldo());
   }
}
