package eva2_20_polimorfismo_figuras;

public class Triangulo implements  Figuras, Mostrardatos{
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return ((base*altura)/2);
    }

    @Override
    public double calcularPeri() {
        double hipo=Math.sqrt((Math.pow(base,2)+Math.pow(altura,2)));
        return base+altura+hipo;
    }

    @Override
    public void imprimirdatos() {
        System.out.println("Base: "+base);
        System.out.println("Altura: "+altura);
        System.out.println("Area: "+calcularArea());
        System.out.println("Perimetro: "+calcularPeri());
    }
}
