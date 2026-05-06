public class Motor {
    private int cavalos;
    private String tipoCombustivel;

    public Motor(int cavalos, String tipoCombustivel) {
        this.cavalos = cavalos;
        this.tipoCombustivel = tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public int getCavalos() {
        return cavalos;
    }
    public void setCavalos(int cavalos) {
        this.cavalos = cavalos;
    }
}
