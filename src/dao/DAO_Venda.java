package dao;

import bean.LfsVenda;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class DAO_Venda extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(LfsVenda.class);
        criteria.add(Restrictions.eq("lfsIdVenda", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listStatusVenda(String status) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(LfsVenda.class);
    criteria.add(Restrictions.like("lfsStatusVenda",  "%" + status + "%"));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}


    public Object listValor(double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsVenda.class);
        criteria.add(Restrictions.ge("lfsTotal", valor));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listStatusValor(String status, double valor) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(LfsVenda.class);
    criteria.add(Restrictions.like("lfsStatusVenda", "%" + status + "%"));
    criteria.add(Restrictions.ge("lfsTotal", valor));
    List lista = criteria.list();
    session.getTransaction().commit();
    return lista;
}

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsVenda.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        DAO_Venda dAO_LfsVenda = new DAO_Venda();
        dAO_LfsVenda.listAll();
 
    }
}
