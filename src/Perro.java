public class Perro {
    private String nombre;
    private int edad;
    private double peso;

    // Constructor
    public Perro(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    // Getter y Setter para el atributo "nombre"
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter y Setter para el atributo "edad"
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter y Setter para el atributo "peso"
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para que el perro coma
    public void comer(String tipoComida, double cantidadGramos) {
        System.out.println(nombre + " está comiendo " + tipoComida + " (" + cantidadGramos + " gramos)");
    }

    // Método para que el perro ladre
    public String ladrar() {
        return "guau guau";
    }
}
