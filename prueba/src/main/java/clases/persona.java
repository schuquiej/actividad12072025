package clases;

 public abstract class persona {

    protected String nombre;
    protected int edad;

    public persona (String nombre, int edad){
        this.nombre = nombre ;
        this.edad=edad;
    }


     public abstract void saludar();

    public void mostrarEdad() {
        System.out.println(nombre + " tiene " + edad + " años.");
    }



}
