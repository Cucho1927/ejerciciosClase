import java.util.Scanner;

public class Automovil {
    String marca;
    int modelo;
    int motor;
    enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODISESEL,
    GAS_NATURAL}
    tipoCom tipoCombustible;
    enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR,
    EJECUTIVO, SUV}
    tipoA tipoAutomovil;
    enum tipoM {MANUAL, AUTOMATICO}
    tipoM tipoMarcha;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;
    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA,
    AMARILLO, VERDE, AZUL, VIOLETA}
    tipoColor color;
    int velocidadActual = 0;
    int cantidadMultas = 0;
    int valorMulta = 0;
   
    Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, tipoM tipoMarcha, int numeroPuertas,  int cantidadAsientos,
     int velocidadMaxima, tipoColor color) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.tipoMarcha = tipoMarcha;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }


    public tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }



    public void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }


    public void setTipoMarcha(tipoM tipoMarcha) {
        this.tipoMarcha = tipoMarcha;
    }


    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    void acelerar(int incrementoVelocidad, Automovil automovil) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
        velocidadActual = velocidadActual + incrementoVelocidad;
    } else { 
            automovil.valorMulta += 500000; 
            automovil.cantidadMultas++;
            System.out.println("Se supero el limite de velocidad, se ha generado una multa: "+ automovil.valorMulta);
        }
    
  

    void desacelerar(int decrementoVelocidad) {
    
    if ((velocidadActual - decrementoVelocidad) > 0) {
        velocidadActual = velocidadActual - decrementoVelocidad;
    } else { 
        System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    
    void frenar() {
        velocidadActual = 0;
    }
    
    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }
    
    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Número de puertas = " + numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocida máxima = " + velocidadMaxima);
        System.out.println("Color = " + color);
    }

    void imprimirMultas(){
        System.out.println("La cantidad de multas que tiene son: "+cantidadMultas);
    }

    
    public static void main(String args[]) {
        
        Automovil auto1 = new Automovil("Ford",2018,3,tipoCom.DIESEL,tipoA.EJECUTIVO , tipoM.AUTOMATICO,5,6,250,tipoColor.NEGRO);
        // Preguntar desde consolo Marca
        Scanner lectura = new Scanner(System.in);
        String marca1 = lectura.next();

        
        
        auto1.imprimir();
        auto1.setVelocidadActual(100);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.acelerar(200, auto1);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);
        auto1.desacelerar(20);
        auto1.imprimirMultas();
    }


  
}
