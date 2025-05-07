public class Main{
   public static void main(String[] args) {
      Conta cc = new ContaCorrente();
      Conta poupanca = new ContaPoupanca();
      Conta poupanca1 = new ContaPoupanca();

      cc.depositar(100);
      cc.sacar(50);

      cc.transferir(20, poupanca1);
      cc.imprimirExtrato();
      //poupanca.imprimirExtrato();
   }
}