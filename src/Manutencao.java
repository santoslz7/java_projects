public abstract class  Manutencao {
    protected int codigo;
    protected String descricao;
    protected double valorBase;
    protected int prazoEStimado;

    public Manutencao(int codigo, String descricao, double valorBase, int prazoEStimado, boolean status) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valorBase = valorBase;
        this.prazoEStimado = prazoEStimado;
    }
    public abstract void iniciarServico (boolean servico);

    
    public void gerarRelatorio(double valor,boolean statusServico,double custo,boolean status){
        double valorFinal = valor + custo;  
        System.out.println("Codigo: "+codigo);
        System.out.println("Descricao: "+descricao);
        System.out.println("Prazo: "+prazoEStimado);
        System.out.println("Valor Final: "+valorFinal);
        System.out.println(status);
    }
}
