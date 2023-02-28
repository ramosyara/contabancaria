public class Programa {
    public static void main(String[] args) {
        Conta minhaConta;
        minhaConta = new Conta();
        minhaConta.numero=1;
        minhaConta.titular="Yara Ramos";
        minhaConta.saldo=2.500;

        Conta minhaConta2;
        minhaConta2 = new Conta();
        minhaConta2.numero=2;
        minhaConta2.titular="Zeus";
        minhaConta2.saldo=3.000;

        System.out.println( minhaConta.numero);
        System.out.println( minhaConta.titular);
        System.out.println( minhaConta.saldo);

        System.out.println( "\n");

        System.out.println( minhaConta2.numero);
        System.out.println( minhaConta2.titular);
        System.out.println( minhaConta2.saldo);

    
    }
    
}
