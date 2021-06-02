package ar.edu.unlam.pb2.parcial1;

import ar.edu.unlam.pb2.parcial1.Enumeradores.TipoDeConsola;

public class Videojuego implements Alquilable {

	private Integer codigo;
	private String descripcion;
	private TipoDeConsola tipoConsola;
	private Double precio;

	public Videojuego(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, TipoDeConsola cONSOLA_ESPERADA) {
		this.codigo = cODIGO_ESPERADO;
		this.descripcion = dESCRIPCION_ESPERADA;
		this.tipoConsola = cONSOLA_ESPERADA;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public TipoDeConsola getTipo() {
		return tipoConsola;
	}

	public void setPrecioAlquiler(Double pRECIO_ALQUILER) {
		this.precio = pRECIO_ALQUILER;

	}

	public Double getPrecioAlquiler() {
		return this.precio;
	}

}
