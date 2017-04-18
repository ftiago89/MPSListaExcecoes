package banco;

//classe de modelo da conta
public class Conta {
    private String numero;
    private double saldo;
    
    //construtores
    public Conta(){
        this.numero = "7777";
        this.saldo = 77;
    }
    
    public Conta(String numero, double valor){
        this.numero = numero;
        this.saldo = valor;
    }
    
    //getters e setters
    public void setNumero(String numero){
        this.numero = numero;
    }
    
    public String getNumero(){
        return this.numero;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    //debita um valor da conta
    public void debitar(double valor){
        this.saldo -= valor;
    }
    
    //credita um valor na conta
    public void creditar(double valor){
        this.saldo += valor;
    }
    
    @Override
    public String toString(){
        return "Numero: " + this.numero + " Saldo: " + Double.toString(saldo);
    }
}
