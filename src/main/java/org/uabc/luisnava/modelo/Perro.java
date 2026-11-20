package org.uabc.luisnava.modelo;

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
        energia--;
        felicidad++;
        return felicidad;
    }
//Cambiar a switch-case
    @Override
    public int dormir(int horasDeSueno) {
        if (horasDeSueno == 1){
            energia++;
        }
        else if (horasDeSueno == 2){
            energia += 2;
        }
        else if (horasDeSueno == 3){
            energia += 3;
        }
        else if (horasDeSueno == 4){
            energia += 4;
        }
        else if (horasDeSueno == 5){
            energia += 5;
        }
        else if (horasDeSueno == 6){
            energia += 6;
        }
        else if (horasDeSueno == 7){
            energia += 7;
        }
        else if (horasDeSueno == 8) {
            energia += 8;
        }
        else if (horasDeSueno == 9){
            energia += 9;
        }
        return energia;
    }

    @Override
    public boolean morir() {
        boolean murio = false;

        if (hambre == 0 || energia == 0 || felicidad == 0 || salud == 0){
            murio = true;
        }

        return murio;
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

    public void grunir (){
        System.out.println("GRRRRR GRRRR >:(");
    }

    public int getNivelOlfato() {
        return nivelOlfato;
    }

    public void setNivelOlfato(int nivelOlfato) {
        this.nivelOlfato = nivelOlfato;
    }

    public String toString(){
        return super.toString() + " Perro";
    }




}