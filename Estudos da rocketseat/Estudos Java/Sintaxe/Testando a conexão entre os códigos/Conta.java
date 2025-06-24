public class Conta {
    //variável da classe conta
    int saldo = 10;
    
    public void sacar(Integer valor){
        //variável do método.
        int novoSaldo = saldo - valor;
        System.out.println(novoSaldo);
    }

    public void imprimirSaldo(){
        //disponíivel em toda classe.
        System.out.println(saldo);
        //somente o método sacar conhece esta variável.
        System.out.println(novoSaldo);
    }
    
}
