package pe.com.quickcont.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import pe.com.quickcont.dao.UsuarioDAO;
import pe.com.quicksoft.domain.Usuario;

@Repository
public class UsuarioDAOImpl implements UsuarioDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Usuario obtenerUsuario(String codigoUsuario, String clave) {
        try {
            Usuario usuario = entityManager.find(Usuario.class, codigoUsuario);
            return usuario;
        } catch (NoResultException e) {
            return null;
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
