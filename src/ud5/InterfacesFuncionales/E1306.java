package ud5.InterfacesFuncionales;

import java.util.function.Consumer;

import ud4.examenTest.Main;
import ud5.Cliente;

/**
 * Implementar el método estático
 * static <T> void paraCada(T[] t, Consumer<T> c)
 * similar a forEach (que no existe para tablas). Este método ejecuta en cada
 * elemento de la
 * tabla la acción implementada en el método Consumer. Utilízalo para mostrar
 * los nombres
 * y edades de los clientes de una tabla.
 * 
 */
public class E1306 {

    public static <T> void paraCada(T[] t, Consumer<T> c) {
        for (T e : t) {
            c.accept(e);
        }
    }

    public static void main(String[] args) {
        Cliente[] clientes = {
                new Cliente("111", "Pepe", "01/01/2000"),
                new Cliente("222", "Marta", "02/02/2012"),
                new Cliente("333", "Juan", "03/03/2009"),
                new Cliente("444", "Lola", "04/04/2004")
        };

        Consumer<Cliente> saludo = c -> System.out.println(c.getNombre() + " " + c.getEdad());

        paraCada(clientes, saludo);
    }
}
