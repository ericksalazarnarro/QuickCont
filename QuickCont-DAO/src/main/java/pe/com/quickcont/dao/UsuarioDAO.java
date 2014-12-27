package pe.com.quickcont.dao;

import pe.com.quicksoft.domain.Usuario;

public interface UsuarioDAO {
    Usuario obtenerUsuario(String codigoUsuario, String clave);

}
