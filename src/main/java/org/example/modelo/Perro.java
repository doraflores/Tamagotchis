package org.example.modelo;

public class Perro extends Tamagotchi implements TamagotchiActions{
    private int nivelImperactividad;
    private int nivelAgresividad;


    public Perro(String nombre, int hambre, int energia, int felicidad, int salud, int agresivo, int hiper){
        super(nombre, hambre, energia, felicidad, salud);
        nivelAgresividad = agresivo;
        nivelImperactividad = hiper;

    }

    public Perro(){
        super("Sansa", 0, 5, 5, 10);
        nivelAgresividad = 10;
        nivelImperactividad = 5;
    }


    @Override
    public void comer(int alimento) {
        System.out.println("Estoy comiendo " + alimento);
        alimento--;
        alimento++;
    }

    @Override
    public int jugar() {
        return 0;
    }

    @Override
    public int dormir(int horasDeSueno) {
        return 0;
    }

    @Override
    public boolean morir() {
        return false;
    }

    @Override
    public int sanar() {
        return 0;
    }
}
