public class CategPopular extends Veiculo{
    private int capacidadePortamalas;
    
    public CategPopular(String placa, String marca, String modelo, double valorDiaria, boolean status, Motor motor,int capacidadePortamalas) {
        super(placa, marca, modelo, valorDiaria, status, motor);
        this.capacidadePortamalas = capacidadePortamalas;
    }
    public int getCapacidadePortamalas() {
        return capacidadePortamalas;
    }
    public void setCapacidadePortamalas(int capacidadePortamalas) {
        this.capacidadePortamalas = capacidadePortamalas;
    }
}
