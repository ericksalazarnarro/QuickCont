package pe.com.quickcont.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.quickcont.business.UsuarioService;
import pe.com.quickcont.dao.UsuarioDAO;
import pe.com.quicksoft.domain.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioDAO usuarioDAO;

    @Override
    public boolean validarUsuario(String codigoUsuario, String clave) {
        Usuario usuario = usuarioDAO.obtenerUsuario(codigoUsuario, clave);
        if (usuario == null) {
            return false;
        }
        return true;
    }

}
