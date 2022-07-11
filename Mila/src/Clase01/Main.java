package Clase01;

public class Main 
{
    public static void main(String args[])
    {
        Cliente cliente = new Cliente("Jenifer", "Moya", 67656578, 2000, "moto", 1234567);
        System.out.println(cliente.toString());
        Empleado empleado = new Empleado("Rodrigo", "Romero", 78987578, 1989, "vendedor", 700.50);
        System.out.println(empleado.toString());
        venta venta = new venta(2022);
        System.out.println("Año actual: "+venta.getAnioActual());
        venta.setCliente(cliente);
        venta.setEmpleado(empleado);

    }
}
