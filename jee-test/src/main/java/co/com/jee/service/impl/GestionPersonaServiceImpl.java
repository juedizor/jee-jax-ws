package co.com.jee.service.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import co.com.jee.negocio.iface.GestionPersonaIface;
import co.com.jee.service.iface.GestionPersonaServiceIface;
import co.com.jee.vo.PersonaVO;

@Stateless
@WebService(endpointInterface = "co.com.jee.service.iface.GestionPersonaServiceIface")
public class GestionPersonaServiceImpl implements GestionPersonaServiceIface {
	
	@Inject
	GestionPersonaIface gestionPersonaIface;

	@Override
	public List<PersonaVO> listarPersonas() {
		// TODO Auto-generated method stub
		return gestionPersonaIface.listarPersonas();
	}

}
