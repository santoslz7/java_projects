public class ServicoClimatizacao extends Manutencao{
    private int qtdEquip;

    public ServicoClimatizacao(int codigo, String descricao, double valorBase, int prazoEStimado, boolean status) {
        super(codigo, descricao, valorBase, prazoEStimado, status);
        this.qtdEquip = qtdEquip;
    }
    @Override
    public void iniciarServico(boolean servico) {
        if(qtdEquip < 0){
            servico = false;
            System.out.println("Quantidade invalida");
        }else{
            servico = true;
        }
      }      
     public double custoFinal(){
         return custoFinal(0);
    }
     public double custoFinal(double desconto){
         double taxa = 0;
         taxa = valorBase * (0.05 * qtdEquip) - desconto;
         return taxa;   
     }      
}
