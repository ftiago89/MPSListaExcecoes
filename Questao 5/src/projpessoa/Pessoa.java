package projpessoa;

//classe modelo de pessoa
public class Pessoa {
    private String cpf, nome;
    private Data dataNascimento;
    
    //construtor
    public Pessoa(String nome, String cpf, Data nascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = nascimento;
    }

    //getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa: nome = " + nome + ", cpf = " + cpf + ", dataNascimento = " + dataNascimento +  '\n';
    }
    
    
}
