package org.example.modelo;

public class Cuyo extends Tamagotchi implements TamagotchiActions{

    // Constructor parametrizado
    public Cuyo(String nombre, int hambre, int energia, int felicidad, int salud){
        super(nombre, hambre, energia, felicidad, salud);
    }

    // constructor inicializado
    public Cuyo(){
        super("Sr. Cobaya", 4, 9, 7, 9);
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

    @Override
    public String toString(){
        return nombre + " tiene:  " + hambre + " de hambre, " +  energia + " de energía, " + felicidad + " pts de felicidad, " + salud + " pts de salud.";
    }
}
