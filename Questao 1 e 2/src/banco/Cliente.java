package banco;

//classe de modelo do cliente
public class Cliente {
    private String cpf;
    private String nome;
    
    //construtores
    public Cliente(){
        this.cpf = "111.111.111-77";
        this.nome = "Nome e Sobrenome";
    }
    
    public Cliente(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }
    
    //getters e setters
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + " cpf: " + this.cpf;
    }
}
