package ar.edu.unlam.pb2.parcial1;

public class Libro {

	private Integer codigo;
	private String descripcion;
	private String autor;
	private String editorial;
	
	public Libro(Integer cODIGO_ESPERADO, String dESCRIPCION_ESPERADA, String aUTOR_ESPERADO,
			String eDITORIAL_ESPERADA) {
		this.codigo = cODIGO_ESPERADO;
		this.descripcion = dESCRIPCION_ESPERADA;
		this.autor = aUTOR_ESPERADO;
		this.editorial = eDITORIAL_ESPERADA;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public String getAutor() {
		return autor;
	}

	public String getEditorial() {
		return editorial;
	}

	

}
