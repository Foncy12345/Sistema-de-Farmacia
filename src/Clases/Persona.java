
package Clases;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int dni;
    
    Persona(String n, String ap, int d){
        this.nombre=n;
        this.apellido=ap;
        this.dni=d;
    }
    
    public String getNombre() {
        return nombre;
        
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
        
    }
    public String getApellido() {
        return apellido;
        
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
        
    }
    public int getDni() {
        return dni;
        
    }
    public void setDni(int dni) {
        this.dni = dni;
        
    }    
           
}
