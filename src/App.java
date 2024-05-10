public class App {
    public static void main(String[] args) throws Exception {

        Cliente fulano = new Cliente();
        fulano.setNome("fulaninho");

        Conta cc = new ContaCorrente(fulano);
        Conta cp = new ContaPoupanca(fulano);

        cc.depositar(200);
        cc.transferir(100, cp);
        
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
