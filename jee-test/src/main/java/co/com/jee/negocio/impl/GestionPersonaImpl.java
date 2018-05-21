package co.com.jee.negocio.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import co.com.jee.negocio.iface.GestionPersonaIface;
import co.com.jee.vo.PersonaVO;


@Stateless
public class GestionPersonaImpl implements GestionPersonaIface {
	
	List<PersonaVO> listPersonas = new ArrayList<>();

	@Override
	public List<PersonaVO> listarPersonas() {
		// TODO Auto-generated method stub
		PersonaVO personaVO = new PersonaVO("Julio", "Izquierdo", "juedizor@gmail.com");
		listPersonas.add(personaVO);
		personaVO = new PersonaVO("Juan", "Izquierdo", "juan@gmail.com");
		listPersonas.add(personaVO);
		personaVO = new PersonaVO("Mariana", "Veron", "mari.veron@gmail.com");
		listPersonas.add(personaVO);
		return listPersonas;
	}

}
