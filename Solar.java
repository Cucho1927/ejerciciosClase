public class solar {
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
    tipoPlaneta tipoP;
    boolean esObservable = false;

    sistema_solar (String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, tipoPlaneta tipoP, boolean esObservable){
        this.nombre = nombre;
        this.cantidadSatelites =  cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipoP = tipoP;
        this.esObservable = esObservable;
    }

    void imprimir() {
        System.out.println("Nombre del planeta = " + nombre);
        System.out.println("Cantidad de satélites = " + cantidadSatelites);
        System.out.println("Masa del planeta = " + masa);
        System.out.println("Volumen del planeta = " + volumen);
        System.out.println("Diámetro del planeta = " + diametro);
        System.out.println("Distancia al sol = " + distanciaSol);
        System.out.println("Tipo de planeta = " + tipoP);
        System.out.println("Es observable = " + esObservable);
    }

    double calcularDensidad() {
        return masa / volumen;
    }

    boolean esPlanetaExterior(){
        float limiteInferior = (float) (149597870 * 2.1);
        float limiteSuperior = (float) (149597870 * 3.4);
        return distanciaSol > limiteInferior && distanciaSol < limiteSuperior;
    }

    public static void main(String args[]) {
        sistema_solar p1 = new sistema_solar("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, tipoPlaneta.TERRESTRE, true);
        sistema_solar p2 = new sistema_solar("Marte", 2, 6.4171E23, 1.6318E11, 6779, 227900000, tipoPlaneta.TERRESTRE, true);

        System.out.println("Planeta 1:");
        p1.imprimir();
        System.out.println("Densidad del planeta 1 = " + p1.calcularDensidad());
        System.out.println("Es planeta exterior = " + p1.esPlanetaExterior());

        System.out.println("\nPlaneta 2:");
        p2.imprimir();
        System.out.println("Densidad del planeta 2 = " + p2.calcularDensidad());
        System.out.println("Es planeta exterior = " + p2.esPlanetaExterior());
    }
}
