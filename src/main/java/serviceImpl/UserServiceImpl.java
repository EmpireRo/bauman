package serviceImpl;

import dao.UserDao;
import daoImpl.UserDaoImpl;
import domain.u_pro;
import org.hibernate.Session;
import org.hibernate.Transaction;
import service.UserService;
import utils.hibernate_utils;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao=new UserDaoImpl();
    @Override
    public void add(u_pro u_pro) {
        if(u_pro==null)
            throw new RuntimeException("------add-----error---------");
        Session session = hibernate_utils.getCurrentSession();
        Transaction tx = session.beginTransaction();
        dao.add(u_pro);
        tx.commit();
    }
    @Override
    public List<u_pro> select(String u_name) {
        List<u_pro> u_proList=null;
        Session session = hibernate_utils.getCurrentSession();
        Transaction tx = session.beginTransaction();
        if(u_name==null||"".equals(u_name))
            u_proList=dao.selectAll();
        else
            u_proList=dao.select(u_name);
        tx.commit();
        return u_proList;
    }
    @Override
    public void delete(String u_name) {
        if(u_name==null||"".equals(u_name))
            throw  new RuntimeException("--------dele---error------- ");
        Session session = hibernate_utils.getCurrentSession();
        Transaction tx = session.beginTransaction();
        dao.delete(u_name);
        tx.commit();
    }
    @Override
    public void update(u_pro u_pro) {
        if(u_pro==null)
            throw new RuntimeException("---update---empty--error-----");
        if(u_pro.getU_name()==null)
            throw new RuntimeException("---update---name empty--error-----");
        Session session = hibernate_utils.getCurrentSession();
        Transaction tx = session.beginTransaction();
        dao.update(u_pro);
        tx.commit();

    }
}
