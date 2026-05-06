public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String validadeCNH;
    private String formaPagamento; 
    
    public Cliente(String nome, String cpf, int idade, String validadeCNH){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.validadeCNH = validadeCNH;
    }
    public String getNome(){ 
        return nome; 
    }
    public void setNome(String nome){ 
        this.nome = nome;
    }
    public String getCpf(){ 
        return cpf; 
    }
    public void setCpf(String cpf){ 
        this.cpf = cpf; 
    }
    public int getIdade(){
        return idade; 
    }
    public void setIdade(int idade){  
    if (idade >= 21) {
        this.idade = idade;
    } else {
        System.out.println("Erro: Idade mínima para cadastro e 21 anos.");
        this.idade = 0; 
    }

    }
    public String getValidadeCNH(){ 
        return validadeCNH; 
    }
    public void setValidadeCNH(String validadeCNH){ 
        this.validadeCNH = validadeCNH; 
    }
    public String getFormaPagamento(){ 
        return formaPagamento; 
    }
    public void setFormaPagamento(String formaPagamento) { 
        this.formaPagamento = formaPagamento; 
    }
    @Override
    public String toString() {
        return "Cliente: " + nome + " | CPF: " + cpf + " | CNH: " + validadeCNH;
    }
}

