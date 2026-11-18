package org.uabc.luisnava.modelo;

public class Cuyo extends Tamagotchi implements TamagotchiActions{
    public Cuyo(String nombre, int hambre, int energia, int felicidad, int salud){
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

    //Que hacen los cuyos
    public void silbido(){
        System.out.println("Cui cui");
    }

    //Esta enojado
    public void castaneoDientes(){
        System.out.println("Chac-chac");
    }

    public void zumbidoTerritorial(){
        System.out.println("BURU-BURU!!");
    }

    public void chillidoAlterado(){
        System.out.println("CUUUIII CUUUIIII!!!!");
    }

}
