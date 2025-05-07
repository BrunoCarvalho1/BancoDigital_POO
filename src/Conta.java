public abstract class Conta implements IConta {

   private static final int AGENCIA_PADRAO = 0001;
   private static int SEQUENCIAL = 1;

   protected int agencia;
   protected int numero;
   protected double saldo;

   public Conta() {
      this.agencia = AGENCIA_PADRAO;
      this.numero = SEQUENCIAL++;
   }

   public int getAgencia() {
      return agencia;
   }

   public double getSaldo() {
      return saldo;
   }

   public int getNumero() {
      return numero;
   }
   @Override
   public void depositar(double valor) {
      saldo = saldo + valor;
   }
   @Override
   public void sacar(double valor) {
      saldo = saldo - valor;
   }

   @Override
   public void transferir(double valor, Conta contaDestino) {
      this.sacar(valor);
      contaDestino.depositar(valor);
   }

   protected void imprimirInfoComuns() {
      System.out.printf("Agencia: %d%n", this.agencia);
      System.out.printf("Numero: %d%n", this.numero);
      System.out.printf("Saldo: %.2f%n", this.saldo);
   }
}
