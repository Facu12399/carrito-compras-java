package productos;

import productos.ItemCarrito;

import java.util.ArrayList;
import java.util.List;

import personas.Comprador;

public class CarritoDeCompras {
	private Comprador comprador;
	private Producto producto;
	private ItemCarrito item1;
	private ItemCarrito item2;
	private ItemCarrito item3;
	private ItemCarrito item;
	private List<ItemCarrito> items; //Siempre que tengo una coleccion como atributo debo inicializarla en el constructor
	
	public CarritoDeCompras() {
		this.items = new ArrayList<>(); //ArrayList<> vacio
	}
	
	public void agregarItem(ItemCarrito item) {
		this.items.add(item);
	}
	
	public void eliminarItem(ItemCarrito item) {
		this.items.remove(item);
	}
	
	public Comprador getComprador() {
		return comprador;
	}
	public void setComprador(Comprador comprador) {
		this.comprador = comprador;
	}
	public ItemCarrito getItem1() {
		return item1;
	}
	public void setItem1(ItemCarrito item1) {
		this.item1 = item1;
	}
	public ItemCarrito getItem2() {
		return item2;
	}
	public void setItem2(ItemCarrito item2) {
		this.item2 = item2;
	}
	public ItemCarrito getItem3() {
		return item3;
	}
	public void setItem3(ItemCarrito item3) {
		this.item3 = item3;
	}
	public List<ItemCarrito> getItems() {
		return items;
	}
	public void setItems(List<ItemCarrito> items) {
		this.items = items;
	}
	
	public double total() {
		double precio = 0.0;
		double total= 0.0;

		for (int i = 0; i < this.items.size(); i++) {
			total = total + (this.items.get(i).getCantidad() * this.items.get(i).precioDelItem());
		}
		
		
		return total;
	}
	
}
