package org.uabc.luisnava.modelo;

public class Gato extends Tamagotchi implements TamagotchiActions{
    public Gato(String nombre, int hambre, int energia, int felicidad, int salud){
        super(nombre, hambre, energia, felicidad, salud);
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


    //Que hace solo el gato
    public void maullar(){
        System.out.println("Miauu");
    }

    public void limpiarse(){
        System.out.println("*Se lame*");
    }

    public void ronronear(){
        System.out.println("GRRRR");
    }

    public void aranar(){
        System.out.println("*Rasguña*");
    }

}
