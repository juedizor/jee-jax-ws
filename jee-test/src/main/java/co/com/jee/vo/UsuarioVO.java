package co.com.jee.vo;

public class UsuarioVO {

	private String nombreUsuario;
	private boolean activo;
	
	
	public UsuarioVO(String nombreUsuario, boolean activo) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.activo = activo;
	}
	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return the activo
	 */
	public boolean isActivo() {
		return activo;
	}
	/**
	 * @param activo the activo to set
	 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	
}
