package projmapa;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

//classe para testar hashmap e treemap
public class UsaMapas {


    public static void main(String[] args) {
        Map<String, String> mapa, mapa2;
        
        mapa = new HashMap();
        
        //inserindo as chaves e os valores no hashmap
        mapa.put("ronaldo", "1111");
        mapa.put("romario", "2222");
        mapa.put("roberto", "3333");
        
        //imprimindo os dados
        System.out.println(mapa.toString());
        
        mapa2 = new TreeMap();
        
        //inserindo as chaves e valores no treemap
        mapa2.put("ronaldo", "1111");
        mapa2.put("romario", "2222");
        mapa2.put("roberto", "3333");

        //imprimindo os dados
        System.out.println(mapa2.toString());
    }
    
}
