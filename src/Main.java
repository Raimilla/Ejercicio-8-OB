public class Main {
    public static void main(String[] args) {

        /*
        Para practicar la encapsulación:
        Crear clase Persona. OK
        Crear variables las privadas edad, nombre y telefono de la clase Persona. OK
        Crear gets y sets de cada propiedad. OK
        Crear un objeto persona en el main. OK
        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
        */

        persona Persona1 = new persona();
        Persona1.setEdad(28);
        Persona1.setNombre("Juan Montes");
        Persona1.setTelefono("989983645");

        System.out.println("Mi nombre es" + " " + Persona1.getNombre() + " " + "tengo " + Persona1.getEdad() + " años " + "mi contacto es: " + Persona1.getTelefono());
    }
}

class persona{

    //Declaración de las propiedades de la clase persona
    private int edad;
    private String nombre;
    private String telefono;

    //Creación de las funciones setter de las propiedades privadas.
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }


    //Creación de las funciones getter de las propiedades privadas.
    public String getNombre(){
        return this.nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getTelefono(){
        return this.telefono;
    }
}
