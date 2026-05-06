public class ContratoLocacao {
    private Veiculo veic;
    private Cliente cliente;
    private int quantDias;
    private double valorTotal;
    private String data;

    public ContratoLocacao(Veiculo veic, Cliente cliente,int quantDias,double valorTotal,String data) {
        this.veic = veic;
        this.cliente = cliente;
        this.quantDias = quantDias;
        this.valorTotal = valorTotal;
        this.data = data;
    }
    public double calcularValortt(){
        return this.veic.getValorDiaria() * this.quantDias;
    }
    public double getValorTotal() {
        return valorTotal;
    }
    public String getData() {
        return data;
    }
}
