package Clase01;
//clase hija
public class Empleado extends Persona
{
    private String cargo;
    private double sueldo;

   public  Empleado (String nombre, String apellido,int dni,int anioNac,String cargo, double sueldo)
    {
        super(nombre, apellido, dni, anioNac);
        this.cargo=cargo;
        this.sueldo=sueldo;
    }

    public String getCargo()
    {
        return cargo;
    }

    public double getSueldo()
    {
        return sueldo;
    }

    public String toString()
    {
        return ("\nNombre: "+getNombre()+
        "\nApellido: "+getApellido()+
        "\nDni: "+getDni()+
        "\nAnio de Nac.: "+getFechaNacimiento()+
        "\nCargo : "+getCargo()+
        "\nSueldo: "+getSueldo());
    }
}
