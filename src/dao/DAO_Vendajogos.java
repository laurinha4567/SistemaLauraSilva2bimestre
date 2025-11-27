/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.LfsVenda;
import bean.LfsVendasJogos;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;



/**
 *
 * @author u1845853
 */
public class DAO_Vendajogos extends DAO_Abstract{

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();        
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();        
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();        
        session.delete(object);
        session.getTransaction().commit();        
    }
      
     public void deleteJogos(LfsVenda lfsvenda) {
        List lista = (List) listVendas(lfsvenda);
        session.beginTransaction();
        for (int i = 0; i < lista.size(); i++) {
            LfsVendasJogos lfsVendasjogos = (LfsVendasJogos) lista.get(i);
            session.flush();
            session.clear();
            session.delete(lfsVendasjogos);
        }
        session.getTransaction().commit();
    }
    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsVendasJogos.class);
        criteria.add(Restrictions.eq("lfsIdVendaJogos", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
    }

      public Object listVendas(LfsVenda venda) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsVendasJogos.class);
        criteria.add(Restrictions.eq("lfsVenda", venda));
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;
    }
    
    
    @Override
        public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsVendasJogos.class);
        List lista = criteria.list();
        session.getTransaction().commit();        
        return lista;    
    }

    public static void main(String[] args) {
        DAO_Venda DAO_venda = new DAO_Venda();
        DAO_venda.listAll();
    }
}
