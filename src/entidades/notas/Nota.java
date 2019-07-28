package entidades.notas;

public class Nota {

    private double notaSegimiento;
    private double notaParcial;
    private double notaFinal;

    public double getNotaSegimiento() {
        return notaSegimiento;
    }

    public void setNotaSegimiento(double notaSegimiento) {
        this.notaSegimiento = notaSegimiento;
    }

    public double getNotaParcial() {
        return notaParcial;
    }

    public void setNotaParcial(double notaParcial) {
        this.notaParcial = notaParcial;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }

    public double calcularNota()
    {
        return ((this.getNotaSegimiento()*0.4)+(this.getNotaParcial()*0.3)+(getNotaFinal()*0.3));
    }
}