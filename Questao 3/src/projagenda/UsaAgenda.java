package projagenda;

import agenda.Agenda;
import agenda.Pessoa;

//classe de testes da agenda
public class UsaAgenda {


    public static void main(String[] args) {
        Pessoa pessoa1, pessoa2, pessoa3, pessoa4, pessoa5, pessoa6;
        Agenda agenda;
        
        //inicializando os objetos que representam as pessoas e a agenda
        pessoa1 = new Pessoa("pessoa1", "1111-1111","endereco1");
        pessoa2 = new Pessoa("pessoa2", "2222-2222","endereco2");
        pessoa3 = new Pessoa("pessoa3", "3333-3333","endereco3");
        pessoa4 = new Pessoa("pessoa4", "4444-4444","endereco4");
        pessoa5 = new Pessoa("pessoa5", "5555-5555","endereco5");
        pessoa6 = new Pessoa("pessoa6", "6666-6666","endereco6");
        
        agenda = new Agenda();
        
        //inserindo na agenda
        agenda.inserePessoa(pessoa1);
        agenda.inserePessoa(pessoa2);
        agenda.inserePessoa(pessoa3);
        agenda.inserePessoa(pessoa4);
        agenda.inserePessoa(pessoa5);
        agenda.inserePessoa(pessoa6);
        
        //imprimindo os nomes da agenda
        System.out.println(agenda.listarNomes().toString());
        
        //imprimindo os objetos do mapa da agenda
        System.out.println(agenda.listarPessoas().toString());
        
        //imprimindo os dados da pessoa pesquisada a partir do seu nome
        System.out.println("Pessoa pesquisada: " + agenda.buscaPessoa("pessoa1"));
    }
    
}
