package dao;

import bean.LfsJogos;
import bean.LfsUsuario;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

public class DAO_Jogos extends DAO_Abstract {

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
        Criteria criteria = session.createCriteria(LfsJogos.class);
        criteria.add(Restrictions.eq("jmjIdCliente", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
     public Object listNomeJogo(String NomeJogo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsJogos.class);
        criteria.add(Restrictions.like("lfs_nome_jogo", "%" + NomeJogo + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listValor(double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsJogos.class);
        criteria.add(Restrictions.ge("lfs_preco", "%" + valor + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public Object listNomeJogoValor(String NomeJogo, double valor) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsJogos.class);
        criteria.add(Restrictions.like("lfsNomeJogo", "%" + NomeJogo + "%"));
        criteria.add(Restrictions.ge("lfs_preco", "%" + valor + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(LfsJogos.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }

    public static void main(String[] args) {
        DAO_Jogos dAO_LfsJogos = new DAO_Jogos();
        dAO_LfsJogos.listAll();
        System.out.println("Deu certo");
    }
}
