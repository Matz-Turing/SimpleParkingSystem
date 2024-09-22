public class Veiculo {
    private double valorHora;
    private double valorAdicional;
    private double horas;

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double doTotal() {
        if (horas <= 1) {
            return valorHora;
        } else {
            return valorHora + valorAdicional * (horas - 1);
        }
    }

    public String doViewCupom() {
        return "Valor por hora: " + valorHora + "\n" +
                "Valor adicional por hora: " + valorAdicional + "\n" +
                "Horas: " + horas + "\n" +
                "Total: " + doTotal();
    }
}