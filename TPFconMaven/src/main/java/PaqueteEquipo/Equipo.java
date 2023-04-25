package PaqueteEquipo;

import java.util.Scanner;

public class Equipo {
    
    // Atributos
    private String nombre;
    private final int titulares = 11;
    private final int suplentes = 8;
    private String directorTecnico;
    private int puntos;
    private int partidosJugados;
    
    // Constructor
    public Equipo(String nombreEquipo) {
        nombre = nombreEquipo;
    };
    
    
    //Métodos
    public void setDt(String dt) {
        directorTecnico = dt;
    }
    
    public void addPartido() {
        System.out.println("Ingrese el resultado del partido");
        System.out.println("1 = ganado. 2 = perdido. 3 = empate");
        Scanner lectura = new Scanner(System.in);
        int resultado = lectura.nextInt();
        
        if (resultado == 1) {
            puntos = puntos + 3;
            this.partidosJugados = partidosJugados + 1;
            System.out.println("Agregados 3 puntos");
        } 
        else if (resultado == 2) {
            System.out.println("No se han agregado puntos");
        }
        else if (resultado == 3) {
            puntos = puntos + 1;
            this.partidosJugados = partidosJugados + 1;
            System.out.println("Agregado 1 punto");
        }
        else {
            System.out.println("No se ha encontrado la opción seleccionada");
        }
    }
   
    public void mostrarInformacion() {
        System.out.println("Información del equipo " + nombre);
        System.out.println("Titulares: " + titulares);
        System.out.println("Suplentes: " + suplentes);
        System.out.println("El director técnico es: " + directorTecnico);
        System.out.println("Cantidad de puntos: " + puntos);
        System.out.println("Partidos jugados: " + partidosJugados);
    }
}
