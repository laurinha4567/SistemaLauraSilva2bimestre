package dao;

import bean.LfsCliente;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class DAO_Cliente extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(LfsCliente.class);
        criteria.add(Restrictions.eq("jmjIdCliente", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsCliente.class);
        criteria.add(Restrictions.like("lfsNomeCompleto", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listCpf(String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsCliente.class);
        criteria.add(Restrictions.like("lfsCpf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNomeCpf(String nome, String cpf) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsCliente.class);
        criteria.add(Restrictions.like("lfsNomeCompleto", "%" + nome + "%"));
        criteria.add(Restrictions.like("lfsCpf", "%" + cpf + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsCliente.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        DAO_Cliente dAO_LfsCliente = new DAO_Cliente();
        dAO_LfsCliente.listAll();
       
    }
}
