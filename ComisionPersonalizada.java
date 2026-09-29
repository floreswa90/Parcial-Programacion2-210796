public class ComisionPersonalizada implements EstrategiaComision {

    private int letrasPrimerNombre;

    public ComisionPersonalizada(int letrasPrimerNombre) {
        this.letrasPrimerNombre = letrasPrimerNombre;
    }

    @Override
    public double calcularComision(double montoVenta) {
        return montoVenta * ((5 + letrasPrimerNombre) / 100.0);
    }
}