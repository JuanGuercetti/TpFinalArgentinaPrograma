package PaqueteEquipo;

public class PruebaManual {
     public static void main(String[] args) {
         
        Equipo sanLorenzo = new Equipo("San Lorenzo de Almagro");
        
        sanLorenzo.setDt("Rubén Darío Insúa");
        
        for (int i = 0; i < 3; i++) {
            sanLorenzo.addPartido();
        }
        
        sanLorenzo.mostrarInformacion();
    }
}
