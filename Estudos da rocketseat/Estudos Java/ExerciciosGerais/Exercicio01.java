import java.util.Scanner;


public class Exercicio01 {

    public void sacar(int valor) {
        System.out.println("Valor Sacado\nValor de R$" + valor + ",00 adicionado à carteira");
    }

    public void transferir(int valor, int contaEstrangeira) {
        System.out.println("Valor de R$" + valor + ",00 transferido para o dono da conta " + contaEstrangeira + ", obrigado!");
    }

    public void extrato(int saldoAtual) {
        System.out.println("O valor da sua carteira é: R$" + saldoAtual + ",00");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Exercicio01 e = new Exercicio01();

        System.out.println("---------------");
        System.out.println("     BANCO     ");
        System.out.println("---------------");

        System.out.print("Número da conta corrente: ");
        int numeroContaCorrente = input.nextInt();
        input.nextLine();

        System.out.print("Número da agência: ");
        int numeroAgencia = input.nextInt();
        input.nextLine();

        System.out.print("Nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.print("Data de nascimento [xx/xx/xxxx]: ");
        String dataNascimento = input.nextLine();

        System.out.print("Saldo da conta: ");
        double saldoConta = input.nextDouble();
        input.nextLine();

        System.out.println("---------------------------------------------");
        System.out.println("Obrigado, pegamos todos os dados necessários.");
        System.out.println("---------------------------------------------\n");

        System.out.println("Agora escolha o que quer fazer:\n[1] Sacar\n[2] Transferir\n[3] Cancelar conta\n[4] Consultar extrato\n[5] Ver saldo\n[0] Sair");

        int decisao = input.nextInt();
        input.nextLine(); // limpa buffer

        switch (decisao) {
            case 1:
                System.out.print("Qual o valor que deseja sacar? ");
                int reais = input.nextInt();
                e.sacar(reais);
                break;

            case 2:
                System.out.print("Qual o valor que deseja transferir? ");
                int dinheiro = input.nextInt();
                System.out.print("Digite a conta que vai receber esse valor: ");
                int contaEstrangeira = input.nextInt();
                e.transferir(dinheiro, contaEstrangeira);
                break;

            case 3:
                System.out.print("Deseja cancelar sua conta? [s/n]: ");
                String simOUnao = input.next();
                input.nextLine();
                if (simOUnao.equalsIgnoreCase("s")) {
                    System.out.println("Descreva o motivo do cancelamento:");
                    String motivo = input.nextLine();
                    System.out.println("Descrição salva com sucesso: " + motivo);
                } else {
                    System.out.println("OK, continue conosco.");
                }
                break;

            case 4:
            case 5:
                int carteira = 15000;
                e.extrato(carteira);
                break;

            default:
                System.out.println("Programa Finalizado");
                break;
        }

        input.close();
    }
}
