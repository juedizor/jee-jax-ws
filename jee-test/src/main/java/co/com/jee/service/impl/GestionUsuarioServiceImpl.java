package co.com.jee.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import co.com.jee.negocio.iface.GestionUsuarioIface;
import co.com.jee.service.iface.GestionUsuarioServiceIface;
import co.com.jee.vo.UsuarioVO;

@Stateless
@WebService(endpointInterface = "co.com.jee.service.iface.GestionUsuarioServiceIface")
public class GestionUsuarioServiceImpl implements GestionUsuarioServiceIface {

	@Inject
	GestionUsuarioIface gestionUsuarioIface;

	@Override
	public List<UsuarioVO> getUsuarios() {
		// TODO Auto-generated method stub
		return gestionUsuarioIface.getUsuarios();
	}

}
