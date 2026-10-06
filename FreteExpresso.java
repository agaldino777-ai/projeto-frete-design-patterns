public class FreteExpresso implements Frete {
    public double calcular(double pesoKg) {
        return 40.0 + (pesoKg * 6.0);
    }
    public String getNome() {
        return "Expresso";
    }
}
