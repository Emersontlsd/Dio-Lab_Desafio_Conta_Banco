package Desafio_Dio_Banco;

public interface iConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, iConta contaDestino);

    void imprimirExtrato ();

}
