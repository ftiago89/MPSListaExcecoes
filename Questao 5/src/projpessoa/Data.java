package projpessoa;

//classe modelo de data
public class Data {
    private int dia, mes, ano;
    
    //construtores
    public Data(){
        this.dia = 01;
        this.mes = 01;
        this.ano = 17;
    }
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    //getters e setters
    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getDia(){
        return this.dia;
    }
    
    public void setMes(int mes){
        this.mes = mes;
    }
    
    public int getMes(){
        return this.mes;
    }
    
    public void setAno(int ano){
        this.ano = ano;
    }
    
    public int getAno(){
        return this.ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
    
}
