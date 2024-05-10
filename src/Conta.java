public abstract class Conta implements IConta{

    protected int agencia;
    protected int numero;
    protected double saldo = 0.0;
    protected Cliente cliente;
    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQ = 1;
    
    public void sacar(){}
    public void depositar(){}
    public void transferir(){}

    public Conta (Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQ++;
        this.cliente= cliente;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
       if(this.saldo < valor){
            System.out.println("Saldo insuficiente! Operação cancelada");
       }else{
            this.saldo -= valor;
            System.out.println(String.format("Saque de %d realizado com sucesso!",valor));
       }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;       
        System.out.println("Deposito de ");
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s%nAgencia: %d%nNumero: %d%nSaldo: %.2f%n", this.cliente.getNome(),this.agencia,this.numero,this.saldo));
	}
}
