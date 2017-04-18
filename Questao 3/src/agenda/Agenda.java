package agenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//classe que representa a agenda
public class Agenda {
    private Map<String, Pessoa> contatos;
    
    //inicialização do hashmap
    public Agenda(){
       this.contatos = new HashMap(); 
    }
    
    //buscando um contato na agenda a partir do nome
    public Pessoa buscaPessoa(String nome){
        for (Pessoa p: contatos.values()){
            if (p.getNome().equals(nome)){
                return p;
            }
        }
        return null;
    }
    
    //inserindo um contato na agenda
    public void inserePessoa(Pessoa pessoa){
        contatos.put(pessoa.getNome(), pessoa);
    }
    
    //listando os nomes na agenda
    public List<String> listarNomes(){
        List<String> nomes = new ArrayList();
        for (String s: contatos.keySet()){
            nomes.add(s);
        }
        return nomes;
    }
    
    //retorna uma lista de todos os objetos pessoas no mapa
    public List<Pessoa> listarPessoas(){
        List<Pessoa> pessoas = new ArrayList();
        for (Pessoa p: contatos.values()){
            pessoas.add(p);
        }
        return pessoas;
    }
}
