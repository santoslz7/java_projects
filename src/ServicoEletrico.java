
public class ServicoEletrico extends Manutencao {
    private double tensao;
    public ServicoEletrico(int codigo, String descricao, double valorBase, int prazoEStimado, boolean status) {
        super(codigo, descricao, valorBase, prazoEStimado, status);
        this.tensao = tensao;
    }
    @Override
    public void iniciarServico(boolean servico) {
        if (tensao >= 110 || tensao <= 220) {
            servico = true;
        } else {
            servico = false;
            System.out.println("Fora dos padroes");
        }
    }
    public double custoFinal(){
        double taxa = 0;
        if (tensao >= 110 || tensao <= 220) {
            taxa += valorBase * 0.15;
        }
        return taxa;
    }
}
    

