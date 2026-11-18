package org.example;

import org.example.control.Controlador;
import org.example.modelo.Coleccion;
import org.example.vista.VistaConsola;

public class Main {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();
        Coleccion coleccion = new Coleccion();
        Controlador controlador = new Controlador(vista, coleccion);
        controlador.iniciar();
    }
}
