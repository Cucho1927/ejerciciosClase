public class Geometria {
    public static class Circulo {
        double radio;

        Circulo(double radio) {
            this.radio = radio;
        }

        double calcularArea() {
            return Math.PI * radio * radio;
        }

        double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }
    }

    public static class Rectangulo {
        double base;
        double altura;

        Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        double calcularArea() {
            return base * altura;
        }

        double calcularPerimetro() {
            return 2 * (base + altura);
        }
    }

    public static class Cuadrado {
        double lado;

        Cuadrado(double lado) {
            this.lado = lado;
        }

        double calcularArea() {
            return lado * lado;
        }

        double calcularPerimetro() {
            return 4 * lado;
        }
    }

    public static class TrianguloRectangulo {
        double base;
        double altura;

        TrianguloRectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        double calcularArea() {
            return (base * altura) / 2;
        }

        double calcularPerimetro() {
            double hipotenusa = calcularHipotenusa();
            return base + altura + hipotenusa;
        }

        double calcularHipotenusa() {
            return Math.sqrt(base * base + altura * altura);
        }

        String determinarTipoTriangulo() {
            if (base == altura) {
                return "Equilátero";
            } else if (base == altura || base == calcularHipotenusa() || altura == calcularHipotenusa()) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        }
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(8, 6);
        Cuadrado cuadrado = new Cuadrado(4);
        TrianguloRectangulo triangulo = new TrianguloRectangulo(5, 12);

        System.out.println("Círculo:");
        System.out.println("Área: " + circulo.calcularArea());
        System.out.println("Perímetro: " + circulo.calcularPerimetro());

        System.out.println("\nRectángulo:");
        System.out.println("Área: " + rectangulo.calcularArea());
        System.out.println("Perímetro: " + rectangulo.calcularPerimetro());

        System.out.println("\nCuadrado:");
        System.out.println("Área: " + cuadrado.calcularArea());
        System.out.println("Perímetro: " + cuadrado.calcularPerimetro());

        System.out.println("\nTriángulo Rectángulo:");
        System.out.println("Área: " + triangulo.calcularArea());
        System.out.println("Perímetro: " + triangulo.calcularPerimetro());
        System.out.println("Tipo de triángulo: " + triangulo.determinarTipoTriangulo());
    }
}
