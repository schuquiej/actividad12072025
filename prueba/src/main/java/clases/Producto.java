package clases;

public class Producto {


    private String codigo;
    private String nombre;
    private int precio;


    public Producto(String codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;

    }



    public String codigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String nombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int precio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
