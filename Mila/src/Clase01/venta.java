package Clase01;

public class venta 
{
    private int anioAct;
    private Cliente cliente;
    private Empleado empleado;

   public venta(int anioAct)
    {
       this.anioAct=anioAct;
      
    }

    public int getAnioActual()
    {
       return anioAct;
    }

    void setCliente(Cliente cliente)
    {
        this.cliente=cliente;
    }
    public Cliente getCliente()
    {
        return cliente;
    }

    void setEmpleado(Empleado empleado)
    {
        this.empleado=empleado;
    }
    public Empleado getEmpleado()
    {
        return empleado;
    }


}
