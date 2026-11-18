package org.uabc.luisnava.modelo;

import java.util.ArrayList;

public class Coleccion {
    private ArrayList<Tamagotchi> misJuguetes;

    public Coleccion(){
        misJuguetes = new ArrayList<>();
    }

    public void agregar(Tamagotchi t){
        misJuguetes.add(t);
    }

    public void agregarPerro(String nombre, int hambre, int energia, int felicidad, int salud, int agresivo, int hiper, int olfato){
        agregar(new Perro(nombre, hambre, energia, felicidad, salud, agresivo, hiper, olfato));
    }

    public void agregarGato(String nombre, int hambre, int energia, int felicidad, int salud){
        agregar(new Gato(nombre, hambre, energia, felicidad, salud));
    }


    public String listaJuguetes(){
        StringBuffer cadena = new StringBuffer();
        for (Tamagotchi t:misJuguetes){
            cadena.append(t);
        }
        return cadena.toString();
    }

}
