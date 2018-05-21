package co.com.client.ws.servicio.test;

import java.util.List;

import co.com.client.ws.servicio.GestionPersonaServiceIface;
import co.com.client.ws.servicio.GestionPersonaServiceImplService;
import co.com.client.ws.servicio.PersonaVO;

public class TestWs {

	public static void main(String[] args) {
		GestionPersonaServiceIface gestionPersonaServiceIface = new GestionPersonaServiceImplService()
				.getGestionPersonaServiceImplPort();
		List<PersonaVO> listPersona = gestionPersonaServiceIface.listarPersonas();
		for (PersonaVO personaVO : listPersona) {
			System.out.println(personaVO.getNombre() + " " + personaVO.getApellido() + " " + personaVO.getEmail());
		}
	}

}
