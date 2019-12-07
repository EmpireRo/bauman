package service;

import domain.u_pro;

import java.util.List;

public interface UserService {
    void add(u_pro u_pro);
    List<u_pro> select(String u_name);
    void delete(String u_name);
    void update(u_pro u_pro);
}
