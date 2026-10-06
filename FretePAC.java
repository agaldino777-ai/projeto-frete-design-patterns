public class FretePAC implements Frete {
    public double calcular(double pesoKg) {
        return 15.0 + (pesoKg * 2.5);
    }
    public String getNome() {
        return "PAC";
    }
}
