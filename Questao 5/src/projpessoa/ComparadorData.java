package projpessoa;

import java.util.Comparator;

//classe que implementa a interface compartor
public class ComparadorData implements Comparator<Pessoa>{
    
    //compara a data de nascimento de dois objetos
    @Override
    public int compare(Pessoa p1, Pessoa p2){
        
        if ((p1.getDataNascimento().getAno()) == p2.getDataNascimento().getAno()){
            if ((p1.getDataNascimento().getMes()) == p2.getDataNascimento().getMes()){
                if ((p1.getDataNascimento().getDia()) == p2.getDataNascimento().getDia()){
                    //se as duas pessoas nasceram no mesmo dia
                    return 0;
                }else{//se nasceram no mesmo mes, compara os dias
                    if ((p1.getDataNascimento().getDia()) > p2.getDataNascimento().getDia()){
                        return -1;
                    }else{
                        return 1;
                    }
                }
            }else{//se as pessoas nasceram no mesmo ano, compara os meses
                if ((p1.getDataNascimento().getMes()) > p2.getDataNascimento().getMes()){
                    return -1;
                }else{
                    return 1;
                }
            }
        }else{//se as pessoas nao naceram no mesmo ano, compara os anos
            if ((p1.getDataNascimento().getAno()) > p2.getDataNascimento().getAno()){
                return -1;
            }else{
                return 1;
            }
        }
    }    
}
