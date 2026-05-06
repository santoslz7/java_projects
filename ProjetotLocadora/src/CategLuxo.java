public class CategLuxo extends Veiculo{
    private boolean tetoSolar;
    
    public CategLuxo(String placa, String marca, String modelo, double valorDiaria, boolean status, Motor motor,boolean tetoSolar) {
        super(placa, marca, modelo, valorDiaria, status, motor);
        this.tetoSolar = tetoSolar;
    }
    public void setTetoSolar(Boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }
    public boolean isTetoSolar() {
    return tetoSolar;
  }
}

