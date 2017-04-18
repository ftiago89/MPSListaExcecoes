package projpessoa;

import java.util.Comparator;

//classe que implementa a interface comparator
public class ComparadorNome implements Comparator<Pessoa>{
    
    //compara  o nome de dois objetos, se os nomes forem iguais, usa-se o cpf
    //para ordenar
    @Override
    public int compare(Pessoa p1, Pessoa p2){
        
        if ((p1.getNome().compareToIgnoreCase(p2.getNome())) == 0){
            return p1.getCpf().compareToIgnoreCase(p2.getCpf());
        }
        return p1.getNome().compareToIgnoreCase(p2.getNome());
    }

}
