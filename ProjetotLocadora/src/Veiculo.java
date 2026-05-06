public abstract  class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private double valorDiaria;
    private boolean status;
    private Motor motor;

    public Veiculo(String placa, String marca, String modelo, double valorDiaria, boolean status,Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
        this.status = status;
        this.motor = motor;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    public Motor getMotor() {
        return motor;
    }
    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    @Override
public String toString() {
    return "Veiculo [Modelo: " + modelo + ", Placa: " + placa + ", Diaria: R$ " + valorDiaria + "]";
    }
}
