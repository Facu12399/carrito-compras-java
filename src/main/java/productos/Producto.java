package productos;

public class Producto {
	private String nombre;
	private String codigo;
	private double precio;
	
	public Producto() {
		super();
	}
	
	public Producto(String nombre, String codigo, double precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "[nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
	}
	
}
