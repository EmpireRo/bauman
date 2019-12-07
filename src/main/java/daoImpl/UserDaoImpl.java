package daoImpl;

import dao.UserDao;
import domain.u_pro;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.hibernate_utils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
@SuppressWarnings("unchecked")
public class UserDaoImpl implements UserDao {
    @Override
    public void add(u_pro u_pro)  {
        Session session = hibernate_utils.getCurrentSession();
        session.save(u_pro);
    }
    //sele All
    @Override
    public List<u_pro> selectAll() {
        Session session = hibernate_utils.getCurrentSession();
        String hql="from u_pro";
        Query query = session.createQuery(hql);
        return query.list();
    }
    //sele by name
    @Override
    public List<u_pro> select(String u_name) {
        Session session = hibernate_utils.getCurrentSession();
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<u_pro> query = criteriaBuilder.createQuery(u_pro.class);
        //equal  sql from(和sql中的from差不多)
        Root<u_pro> root = query.from(u_pro.class);
        query.select(root).where(criteriaBuilder.like(root.<String>get("u_name"),"%"+u_name+"%"));
        Query<u_pro> query1 = session.createQuery(query);
        List<u_pro> u_proList = query1.list();
        return u_proList;
    }
    @Override
    public void delete(String u_name) {
        Session session = hibernate_utils.getCurrentSession();
        //首先要先能找到
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<u_pro> query = criteriaBuilder.createQuery(u_pro.class);
        Root<u_pro> root = query.from(u_pro.class);
        query.select(root).where(criteriaBuilder.equal(root.<String>get("u_name"), u_name));
        Query<u_pro> query1 = session.createQuery(query);
        List<u_pro> u_proList = query1.list();
        if(u_proList==null||u_proList.size()==0)
            throw new RuntimeException("------dele------error---not in database----");
        //找到后删除
        for(u_pro pro:u_proList)
            session.delete(pro);


    }
    @Override
    public void update(u_pro u_pro) {
        Session session = hibernate_utils.getCurrentSession();
        //首先要先能找到
        CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
        CriteriaQuery<u_pro> query = criteriaBuilder.createQuery(u_pro.class);
        Root<u_pro> root = query.from(u_pro.class);
        query.select(root).where(criteriaBuilder.equal(root.<String>get("u_name"),u_pro.getU_name()));
        Query<u_pro> query1 = session.createQuery(query);
        List<u_pro> u_proList = query1.list();
        if(u_proList==null||u_proList.size()==0)
            throw new RuntimeException("------updata------error---not in database----");
        for(u_pro pro:u_proList)
        {
            pro.setU_job(u_pro.getU_job());
            session.save(pro);
        }

    }

}
