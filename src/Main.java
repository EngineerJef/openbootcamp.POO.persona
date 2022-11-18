public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(26);
        persona.setTelefono("+573007076311");
        persona.setNombre("Jefersson Bedoya");


        System.out.println("edad: "+persona.getEdad()+" "+"telefono: "+ persona.getTelefono()+" "+"Nombre: "+persona.getNombre());
    }
}

class Persona{
    private int edad;
    private String telefono;
    private String nombre;



    public void setEdad(int edad){
        this.edad=edad;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getEdad(){
        return this.edad;
    }

    public String getTelefono(){
        return this.telefono;
    }

    public String getNombre(){
        return this.nombre;
    }
}