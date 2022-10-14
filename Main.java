public class Main {
    public static void main(String[] args) {

        Persona nombre = new Persona();
        nombre.setTipo("Nombre: Adil");

        Persona edad = new Persona();
        edad.setTipo( "Edad: 40");

        Persona telefono= new Persona();
        telefono.setTipo("Teléfono: 123456789");

        System.out.println(nombre.getTipo());
        System.out.println(edad.getTipo());
        System.out.println(telefono.getTipo());
    }
}

class Persona {
    private String tipo;

    public void setTipo(String tipo){
        this.tipo = tipo;

    }
    public String getTipo() {
        return this.tipo;
    }
}