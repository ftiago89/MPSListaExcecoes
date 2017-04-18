package projpessoa;

import java.util.Set;
import java.util.TreeSet;

//classe que contem duas treesets ordenadas de modo diferente
public class TestaComparator {

    
    public static void main(String[] args) {
        Set<Pessoa> pessoas1, pessoas2;
        
        //passando para a primeira treeset o comparator de nomes
        //se os nomes forem iguais, usa-se o cpf para ordenar
        pessoas1 = new TreeSet(new ComparadorNome());
        
        pessoas1.add(new Pessoa("Ana", "111.111.111-11", new Data(01,01,2000)));
        pessoas1.add(new Pessoa("Ana", "222.222.222-22", new Data(05,05,1989)));
        pessoas1.add(new Pessoa("Marcelo", "333.333.333-33", new Data(04,06,1980)));
        
        //imprimindo a treeset ordenada por nomes
        System.out.println("Pessoas ordenadas por nome e cpf:");
        System.out.println(pessoas1.toString());
        
        //passando para a segunda treeset o comparator de datas
        pessoas2 = new TreeSet(new ComparadorData());
        
        pessoas2.add(new Pessoa("Ana", "111.111.111-11", new Data(1,1,2000)));
        pessoas2.add(new Pessoa("Pedro", "222.222.222-22", new Data(4,8,1980)));
        pessoas2.add(new Pessoa("Joao", "333.333.333-33", new Data(3,2,1970)));
        
        //imprimindo a treeset ordenada por data de nascimento
        System.out.println("Pessoas ordenadas por Data de Nascimento (mais novo antes do mais velho):");
        System.out.println(pessoas2.toString());
        
    }
    
}
