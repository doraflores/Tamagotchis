package org.example.modelo;

public class Perro extends Tamagotchi implements TamagotchiActions {
    private int nivelImperactividad;
    private int nivelAgresividad;
    private int nivelOlfato;


    public Perro(String nombre, int hambre, int energia, int felicidad, int salud, int agresivo, int hiper, int olfato){
        super(nombre, hambre, energia, felicidad, salud);
        nivelAgresividad = agresivo;
        nivelImperactividad = hiper;
        nivelOlfato = olfato;

    }

    public Perro(){
        super("Sansa", 0, 5, 5, 10);
        nivelAgresividad = 10;
        nivelImperactividad = 5;
        nivelOlfato = 10;
    }


    @Override
    public void comer(int alimento) {
        System.out.println("Estoy comiendo " + alimento);
        alimento--;
        energia++;
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

    public int getNivelImperactividad() {
        return nivelImperactividad;
    }

    public void setNivelImperactividad(int nivelImperactividad) {
        this.nivelImperactividad = nivelImperactividad;
    }

    public int getNivelAgresividad() {
        return nivelAgresividad;
    }

    public void setNivelAgresividad(int nivelAgresividad) {
        this.nivelAgresividad = nivelAgresividad;
    }

    public void ladrar(){
        System.out.println("Guau Guau!");
    }

    public void aullar(){
        System.out.println("AAUU!!");
    }

    public int getNivelOlfato() {
        return nivelOlfato;
    }

    public void setNivelOlfato(int nivelOlfato) {
        this.nivelOlfato = nivelOlfato;
    }

    @Override
    public String toString(){
        return nombre + " tiene:  " + hambre + " de hambre, " +  energia + " de energía, " + felicidad + " pts de felicidad, " + salud + " pts de salud, " + nivelAgresividad + " pts de agresividad, " + nivelImperactividad + " pts de imperactividad, " + nivelOlfato + " calidad de olfato";
    }
}