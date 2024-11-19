package usoCorrecto.claseAbstractaBaseComun;

public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(7);

        System.out.println("El área del circulo es: " + circulo.calcularArea());
    }
}
