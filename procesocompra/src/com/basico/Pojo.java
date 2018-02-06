package com.basico;

public class Pojo {
	
	private String correo;
	private String producto;
	private int unidades;
	private float precio;
	private float iva = 1.21f;
	
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	
	public float getPrecio() {
		if (producto != null) {
			if (producto.equalsIgnoreCase("Camisas"))	{
				precio = 10f*unidades;
			} else if (producto.equalsIgnoreCase("Pantalones")) {
				precio = 15f*unidades;
			} else if (producto.equalsIgnoreCase("Otros")){
				precio = 30f*unidades;
			}
		}
		return precio*iva;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Pojo() {};
	
	public Pojo(String correo, String producto, int unidades) {
		this.correo = correo;
		this.producto = producto;
		this.unidades = unidades;
	}

}
