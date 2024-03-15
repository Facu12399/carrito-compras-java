package productos;

public class ItemCarrito {
	private Producto producto;
	private int cantidad;
	
	public ItemCarrito() {
		super();
	}
	
	public ItemCarrito(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ItemCarrito [producto=" + producto + ", cantidad=" + cantidad + "]";
	}

	public double precioDelItem() {
		return producto.getPrecio();
	}
	
}
