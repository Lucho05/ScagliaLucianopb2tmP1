package ar.edu.unlam.pb2.parcial1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

import ar.edu.unlam.pb2.parcial1.Enumeradores.Genero;

public class Pelicula implements Vendible {
	
	private List<String> actores;
	private Integer codigo;
	private String descripcion;
	private Genero genero;
	private Integer añoEstreno;
	private String director;
	private Double precioVenta;	

	public Pelicula(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, Genero gENERO_ESPERADO,
			Integer aNO_DE_ESTRENO_ESPERADO, String dIRECTOR_ESPERADO) {
		this.actores = new ArrayList<String>();
		this.codigo = cODIGO_ESPERADO;
		this.descripcion = dESCRIPCION_ESPERADA;
		this.genero = gENERO_ESPERADO;
		this.añoEstreno = aNO_DE_ESTRENO_ESPERADO;
		this.director = dIRECTOR_ESPERADO;
		this.precioVenta = 0.0;
	}

	public void agregarActor(String aCTOR_1_ESPERADO) {
		this.actores.add(aCTOR_1_ESPERADO);
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public Genero getGenero() {
		return genero;
	}

	public Integer getAnoDeEstreno() {
		return añoEstreno;
	}

	public String getDirector() {
		return director;
	}

	public Boolean actua(String aCTOR_1_ESPERADO) {
		for (String actorActual : actores) {
			if (actores.contains(aCTOR_1_ESPERADO)) {
				return true;
			}
		}
		return false;
	}

	
	public void setPrecioVenta(Double pRECIO_VENTA) {
		this.precioVenta = pRECIO_VENTA;		
	}

	public Double getPrecioVenta() {		
		return this.precioVenta;
	}

}
