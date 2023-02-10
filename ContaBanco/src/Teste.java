public class Teste {

    public static void main(String[] args) {
        Conta cc = new Conta();
        cc.saldo = 100;
        cc.agencia = 132;
        cc.numero = 52;

        cc.retirar(52);

        System.out.println(cc.saldo);

    }
}
