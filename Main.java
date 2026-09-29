public class Main {
    public static void main(String[] args) {

        Vendedor vendedor =
            new Vendedor("Walter", 1500.0, new ComisionEstandar());

        vendedor.cambiarEstrategia(new ComisionPersonalizada(6));

        vendedor.mostrarDetalle();
    }
}