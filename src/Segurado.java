public class Segurado extends Veiculo implements ISeguroService {
    private double seguro;

    public Segurado(double seguro) {
        this.seguro = seguro;
    }

    @Override
    public double doDesconto() {
        return super.doTotal() * seguro / 100;
    }

    @Override
    public double doTotal() {
        return super.doTotal() - doDesconto();
    }

    @Override
    public String doViewCupom() {
        return super.doViewCupom() + "\n" +
                "Desconto: " + doDesconto() + "\n" +
                "Total com desconto: " + doTotal();
    }
}