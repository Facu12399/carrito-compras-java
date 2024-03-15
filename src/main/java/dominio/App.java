package dominio;

import personas.*;
import productos.*;

public class App 
{
    public static void main( String[] args )
    {
    	
    	CarritoDeCompras carrito = new CarritoDeCompras();
    	
    	Producto alfajor = new Producto("Alfajor Tatin","787899",230.0);
    	Producto gaseosa = new Producto("Mirinda 550ml","456745",550.0);
		Producto papas_fritas = new Producto("Papas Fritas MCCain", "249000", 1000.0);
    	
    	ItemCarrito item1 = new ItemCarrito(alfajor,3);
    	ItemCarrito item2 = new ItemCarrito(gaseosa,1);
		ItemCarrito item3 = new ItemCarrito(papas_fritas,1);
    	
    	carrito.agregarItem(item1);
    	carrito.agregarItem(item2);
		carrito.agregarItem(item3);

    	
    	System.out.println("Su total es: " + carrito.total());
    	
    }
}
