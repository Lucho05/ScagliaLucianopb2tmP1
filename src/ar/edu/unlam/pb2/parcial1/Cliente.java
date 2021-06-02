package ar.edu.unlam.pb2.parcial1;

public class Cliente {

	private Integer codigo;
	private String apellido;
	private String nombre;
	private Integer edad;

	public Cliente(Integer cODIGO_ESPERADO, String aPELLIDO_ESPERADO, String nOMBRE_ESPERADO, Integer eDAD_ESPERADA) {
		this.codigo = cODIGO_ESPERADO;
		this.apellido = aPELLIDO_ESPERADO;
		this.nombre = nOMBRE_ESPERADO;
		this.edad = eDAD_ESPERADA;
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getEdad() {
		return edad;
	}

}
