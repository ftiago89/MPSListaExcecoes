package teste;

import banco.Banco;
import banco.Cliente;
import banco.Conta;

//classe para teste do banco
public class TestaBanco {


    public static void main(String[] args) {
        //clientes e contas e banco
        Conta conta1, conta2, conta3, conta4, conta5, conta6;
        Cliente cliente1, cliente2, cliente3, cliente4;
        Banco banco;
        
        //inicializando as contas e clientes
        conta1 = new Conta("1111", 11);
        conta2 = new Conta("2222", 22);
        conta3 = new Conta("3333", 33);
        conta4 = new Conta("4444", 44);
        conta5 = new Conta("5555", 55);
        conta6 = new Conta("6666", 66);
        
        cliente1 = new Cliente("111.111.111-11", "cliente1");
        cliente2 = new Cliente("222.222.222-22", "cliente2");
        cliente3 = new Cliente("333.333.333-33", "cliente3");
        cliente4 = new Cliente("444.444.444-44", "cliente4");
        
        banco = new Banco();
        
        //inserindo as contas e clientes no banco
        banco.inserir(conta1, cliente1);
        banco.inserir(conta2, cliente2);
        banco.inserir(conta3, cliente3);
        banco.inserir(conta4, cliente4);
        banco.inserir(conta5, cliente1);
        banco.inserir(conta6, cliente2);
        
        //imprimindo a busca por uma conta
        System.out.println(banco.buscaConta("1111").toString());
        
        //imprimindo a busca de um cliente por um cpf
        System.out.println(banco.buscaCliente("222.222.222-22").toString());
        
        //imprimindo a busca de diferentes contas de um mesmo cliente
        System.out.println(banco.buscaContasDeUmCliente("111.111.111-11"));
        
    }
    
}
