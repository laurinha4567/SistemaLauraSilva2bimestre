package dao;

import bean.LfsUsuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class DAO_Usuarios extends DAO_Abstract {

    @Override
    public void insert(Object objeto) {
        session.beginTransaction();
        session.save(objeto);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(objeto);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object objeto) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(objeto);
        session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsUsuario.class);
        criteria.add(Restrictions.eq("jmjIdUsuarios", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsUsuario.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

  
    public LfsUsuario login(String apelido, String senha) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsUsuario.class);
        
      
        criteria.add(Restrictions.eq("mscApelido", apelido));
        criteria.add(Restrictions.eq("mscSenha", senha));

        List<LfsUsuario> lista = criteria.list();
        session.getTransaction().commit();

        if (!lista.isEmpty()) {
            return lista.get(0); 
        } else {
            return null; 
        }
    }

    public static void main(String[] args) {
        DAO_Usuarios dao_usuario = new DAO_Usuarios();
        
      
        LfsUsuario usuario = dao_usuario.login("apelidoDoUsuario", "senhaDoUsuario");

        if (usuario != null) {
            System.out.println("Login bem-sucedido! Usuário: " + usuario.getLfsNome());
        } else {
            System.out.println("Apelido ou senha inválidos.");
        }
    }
}