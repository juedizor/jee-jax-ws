package co.com.jee.service.iface;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import co.com.jee.vo.UsuarioVO;


@WebService
public interface GestionUsuarioServiceIface {
	
	@WebMethod
	List<UsuarioVO> getUsuarios();

}
