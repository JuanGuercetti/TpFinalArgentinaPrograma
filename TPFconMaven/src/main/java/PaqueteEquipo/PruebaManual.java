package PaqueteEquipo;

public class PruebaManual {
     public static void main(String[] args) {
         
        Equipo sanLorenzo = new Equipo("San Lorenzo de Almagro");
        
        sanLorenzo.setDt("Rubén Darío Insúa");
        
        // Bucle de 3 vueltas para probar los 3 resultados posibles (Victoria, 
        // derrota e empate).
        for (int i = 0; i < 3; i++) {
            sanLorenzo.addPartido();
        }
        
        sanLorenzo.mostrarInformacion();
    }
}
