package Clase01;

public class Persona
{
    protected String nombre;
    protected String apellido;
    protected int dni;
    protected int anioNac;
    
    
    public Persona(String nombre,String apellido,int dni,int anioNac)
    {
        this.nombre=nombre;
        this.apellido= apellido;
        this.dni=dni;
        this.anioNac=anioNac;
      
        
        
    }
    protected String getNombre()
    {
       return nombre;  
    }
    protected String getApellido()
    {
        return apellido;
    }
    protected int getDni()
    {
       return dni;  
    }
    protected int getFechaNacimiento()
    {
        return anioNac;
    
    }
    
}