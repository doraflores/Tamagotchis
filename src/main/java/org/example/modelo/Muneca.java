package org.example.modelo;

public class Muneca extends Tamagotchi implements TamagotchiActions{
    //¿Atributos?

    public Muneca(String nombre, int hambre, int energia, int felicidad, int salud){
        super(nombre, hambre, energia, felicidad, salud);
    }

    public Muneca(){
        super("Cynthia", 2, 7, 8, 10);
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

    //Que hace una muñeca
    public void caminar(){
        System.out.println("*Camina*");
    }

    public void hablar(String frase){
        System.out.println(frase);
    }

    public void llorar(){
        System.out.println("AAAAAA :(");
    }

    public void reir(){
        System.out.println("JAJAJAJA :D");
    }

    @Override
    public String toString(){
        return nombre + " tiene:  " + hambre + " de hambre, " +  energia + " de energía, " + felicidad + " pts de felicidad, " + salud + " pts de salud.";
    }
}
