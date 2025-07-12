package clases;

public class catedraticos extends persona {



    public catedraticos(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void saludar() {
        System.out.println("hola, hola: " + nombre);
    }
}
