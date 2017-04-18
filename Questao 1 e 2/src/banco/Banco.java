package banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Banco {
    private Map<Conta, Cliente> clientes;
    
    //inicializacao do hashmap
    public Banco(){
        clientes = new HashMap();
    }
    
    //inserindo um cliente no mapa
    public void inserir(Conta conta, Cliente cliente){
        clientes.put(conta, cliente);
    }
    
    //busca uma conta no mapa a partir do seu numero
    public Conta buscaConta(String numero){
        for (Conta c: clientes.keySet()){
            if (c.getNumero().equals(numero)){
                return c;
            }
        }
        return null;
    }
    
    //busca cliente no mapa a partir do cpf
    public Cliente buscaCliente(String cpf){
        for (Cliente c: clientes.values()){
            if (c.getCpf().equals(cpf)){
                return c;
            }
        }
        return null;
    }
    
    //busca todas as contas de um mesmo cliente no mapa a partir do cpf
    //e retorna uma lista das contas do cliente
    public List<Conta> buscaContasDeUmCliente(String cpf){
        List<Conta> contas = new ArrayList();
        for (Entry<Conta, Cliente> c: clientes.entrySet()){
            if (c.getValue().getCpf().equals(cpf)){
                contas.add(c.getKey());
            }
        }
        return contas;
    }
}
