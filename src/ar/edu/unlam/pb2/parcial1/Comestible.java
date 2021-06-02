package ar.edu.unlam.pb2.parcial1;

public class Comestible {

	private Integer codigo;
	private String descripcion;

	public Comestible(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA) {
		this.codigo = cODIGO_ESPERADO;
		this.descripcion = dESCRIPCION_ESPERADA;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public Object getDescripcion() {
		return this.descripcion;
	}

}
