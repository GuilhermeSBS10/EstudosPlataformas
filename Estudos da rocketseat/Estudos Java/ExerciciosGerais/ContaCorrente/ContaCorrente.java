package ContaCorrente;

import java.time.LocalDate;
import java.util.List;

public class ContaCorrente {
    Integer numero;
    Integer agencia;
    String nomeCliente;
    LocalDate dataNascimento;
    private Double saldo;
    boolean ativo = true;

    Double consultarSaldo(){

        return saldo;
    }

    public List<String> consultarExtrato(LocalDate dataInicial, LocalDate dataFinal) {
        return List.of(); // lista vazia de strings
                          // sempre que o método for diferente de void, sempre deve haver um 'return'
    }

    void cancelar(String justificativa){
        //algoritimo irá manipular o atributo
        //ativo para que se torne false
    }

    void transferir(ContaCorrente contaDestino, Double valoTransferido){

    }


    void sacar(Double valorSolicitado){
        //não solicitei lógica
    }
}
