public class FreteFacade {
    public void mostrarFretes(double pesoKg) {
        Frete[] opcoes = { new FretePAC(), new FreteSedex(), new FreteExpresso() };
        for (Frete frete : opcoes) {
            System.out.println(frete.getNome() + ": R$ " + frete.calcular(pesoKg));
        }
    }
}
