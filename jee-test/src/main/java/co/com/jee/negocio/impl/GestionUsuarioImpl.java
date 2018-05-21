package co.com.jee.negocio.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import co.com.jee.negocio.iface.GestionUsuarioIface;
import co.com.jee.vo.UsuarioVO;


@Stateless
public class GestionUsuarioImpl implements GestionUsuarioIface {
	
	List<UsuarioVO> listUsuario = new ArrayList<>();

	@Override
	public List<UsuarioVO> getUsuarios() {
		// TODO Auto-generated method stub
		UsuarioVO usuarioVO = new UsuarioVO("julio.izquierdo", true);
		listUsuario.add(usuarioVO);
		usuarioVO = new UsuarioVO("juan.izquierdo", true);
		listUsuario.add(usuarioVO);
		usuarioVO = new UsuarioVO("mari.veron", true);
		listUsuario.add(usuarioVO);
		return listUsuario;
	}

}
