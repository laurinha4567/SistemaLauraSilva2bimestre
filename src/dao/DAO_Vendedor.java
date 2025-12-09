package dao;

import bean.LfsVendedor;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class DAO_Vendedor extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(LfsVendedor.class);
        criteria.add(Restrictions.eq("jmjIdCliente", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listNome(String Nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsVendedor.class);
        criteria.add(Restrictions.like("lfsNome", "%" + Nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listSalario(double salario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsVendedor.class);
        criteria.add(Restrictions.ge("lfsSalario", salario ));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNomeSalario(String Nome, double salario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsVendedor.class);
        criteria.add(Restrictions.like("lfsNome", "%" + Nome + "%"));
        criteria.add(Restrictions.ge("lfsSalario", salario));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsVendedor.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        DAO_Vendedor dAO_LfsVendedor = new DAO_Vendedor();
        dAO_LfsVendedor.listAll();
    }
}
