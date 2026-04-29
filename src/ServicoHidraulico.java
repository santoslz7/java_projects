public class ServicoHidraulico extends Manutencao {
    private String tipoEncanamento;

    public ServicoHidraulico(int codigo, String descricao, double valorBase, int prazoEStimado, boolean status) {
        super(codigo, descricao, valorBase, prazoEStimado, status);
        this.tipoEncanamento = tipoEncanamento;
    }
    @Override
    public void iniciarServico(boolean servico) {
        if(tipoEncanamento.equals("PVC") || tipoEncanamento.equals("COBRE")){
            servico = true;
            System.out.println("Sucesso");
            System.out.println("Material compativel");
        }else{
            servico = false;
            System.out.println("Material incompativel");      
        }
        
    }
    public double custoFinal(){
        double taxa = 0;
        if(tipoEncanamento.equals("PVC") || tipoEncanamento.equals("COBRE")){
            taxa = valorBase * 0.10;
        }
        return taxa;
    }
}
