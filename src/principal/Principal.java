package principal;

import hilos.HiloAuxiliar;

public class Principal {
    public static void main(String[] args) {

        HiloAuxiliar hilo1 = new HiloAuxiliar("Hilo 1", 100);
        HiloAuxiliar hilo2 = new HiloAuxiliar("Hilo 2", 101);

        hilo1.start();
        hilo2.start();
    }
}