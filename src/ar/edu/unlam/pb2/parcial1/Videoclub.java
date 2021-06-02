package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;

public class Videoclub {
	private String nombre;
	private List <Producto> productos;

	public Videoclub(String nOMBRE_VIDEOCLUB) {
		this.nombre = nOMBRE_VIDEOCLUB;
		this.productos = new ArrayList<Producto>();
	}

	public void agregarProducto(Producto nuevoProducto) {
		this.productos.add(nuevoProducto);		
	}

}
