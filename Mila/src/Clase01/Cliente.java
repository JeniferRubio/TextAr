package Clase01;
//clase hija
public class Cliente extends Persona
{
    private String producto;
    private int codCliente;

    public Cliente (String nombre,String apellido,int dni,int anioNac, String producto,int codCliente)
    {
       super(nombre, apellido, dni, anioNac);
       this.producto=producto;
       this.codCliente=codCliente;
    }

    public String getProducto()
    {
        return producto;
    }
    public int getCodCliente()
    {
        return codCliente;
    }
    public String toString()
    {
        return ("\nNombre: "+getNombre()+
        "\nApellido: "+getApellido()+
        "\nDni: "+getDni()+
        "\nAnio de Nac.: "+getFechaNacimiento()+
        "\nProducto: "+getProducto()+
        "\nCodigo de Cliente: "+getCodCliente());
    }
}
