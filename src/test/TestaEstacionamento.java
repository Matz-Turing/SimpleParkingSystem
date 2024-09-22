public class TestaEstacionamento {
    public static void main(String[] args) {
        // Criar um objeto Segurado
        Segurado veicSeg = new Segurado(10);

        // Definir valores para os atributos
        veicSeg.setValorHora(5);
        veicSeg.setValorAdicional(2);
        veicSeg.setHoras(2);

        // Exibir cupom
        System.out.println(veicSeg.doViewCupom());

        // Criar um objeto BalancoDiario
        BalancoDiario bd = new BalancoDiario();

        // Adicionar o objeto veicSeg ao objeto bd
        bd.doAdd(veicSeg);

        // Exibir relatório
        System.out.println("\n" + bd.doGerarRelatorio());
    }
}