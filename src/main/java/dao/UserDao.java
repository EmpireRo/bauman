package dao;

import domain.u_pro;

import java.util.List;

public interface UserDao {
     void add(u_pro u_pro) ;
    //select All
    List<u_pro> selectAll();
    //select by name
      List<u_pro> select(String u_name);
      //delete by name
       void delete(String u_name);
       //update
        void update(u_pro u_pro) ;

}
