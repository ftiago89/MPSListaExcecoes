package agenda;

//classe modelo de pessoa
public class Pessoa {
    private String nome, telefone, endereco;
    
    //construtores
    public Pessoa(){
        this.nome = "Nome e Sobrenome";
        this.telefone = "7777-1111";
        this.endereco = "Logradouro Xpto";
    }
    
    public Pessoa(String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    //getters e setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return this.telefone;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + " Telefone: " + this.telefone + " Endereco: " + this.endereco + '\n';
    }
}
