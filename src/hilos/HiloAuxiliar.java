package hilos;

public class HiloAuxiliar extends Thread {

    String nombre;
    int miliSegundos;
    // constructor
    public HiloAuxiliar(String nb, int ms) {
        this.nombre = nb;
        this.miliSegundos = ms;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                this.sleep(miliSegundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(nombre + ": " + i);
            try {
                this.sleep(miliSegundos);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
