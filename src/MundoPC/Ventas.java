package MundoPC;
import com.gm.mundopc.*;
public class Ventas {
    public static void main(String[] args) {
        Monitor monitor1 =new Monitor("lg", 20);
        Teclado teclado1 = new Teclado("usb", "logitech");
        Raton raton1 = new Raton("usb", "Noga");
        Computadora computadora1 = new Computadora("LG", monitor1,teclado1,raton1);
        Orden orden1 =new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();

        Monitor monitor2 = new Monitor("samsung", 15);
        Teclado teclado2 = new Teclado("usb", "samsung");
        Raton raton2 =new Raton("usb", "samsung");
        Computadora computadora2 = new Computadora("Samsuns", monitor2,teclado2,raton2);

        Orden orden2 =new Orden();
        orden2.agregarComputadora(computadora2);
        orden2.mostrarOrden();
    }
}
