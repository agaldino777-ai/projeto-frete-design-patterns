public class FreteSedex implements Frete {
    public double calcular(double pesoKg) {
        return 25.0 + (pesoKg * 4.0);
    }
    public String getNome() {
        return "Sedex";
    }
}
