package UserTest;

import dao.UserDao;
import daoImpl.UserDaoImpl;
import domain.u_pro;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import service.UserService;
import serviceImpl.UserServiceImpl;
import utils.hibernate_utils;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

public class test1 {
    private List<u_pro> u_proList=new ArrayList<u_pro>();
    @Before
    public void setUp()
    {
        u_proList.add(new u_pro("wang","stu"));
        u_proList.add(new u_pro("wang1","stu1"));
    }
    
    //测试service的add方法添加null参数时候
    @Test(expected = RuntimeException.class)
    public void testAddNull() {
        UserService userService = new UserServiceImpl();

        doThrow(new RuntimeException("参数为空")).when(userService).add(isA(u_pro.class));
        userService.add(null);

    }
    @Test(expected = RuntimeException.class)
    public void testUpdateNull() {
        UserService userService = new UserServiceImpl();

        doThrow(new RuntimeException("参数为空")).when(userService).update(isA(u_pro.class));

        userService.update(null);

    }
    @Test(expected = RuntimeException.class)
    public void testDeleteNullI() {
        UserService userService = new UserServiceImpl();

        doThrow(new RuntimeException("不存在")).when(userService).delete(isA(String.class));

        userService.delete("");
    }
    @Test
    public void testDeleteInDao() {
        UserDao userDao = mock(UserDaoImpl.class);
        final String name="sssssss";
        doAnswer(new Answer() {
            @Override
            public Object answer(InvocationOnMock invocationOnMock) throws Throwable {
                boolean flag=false;
                for(u_pro pro:u_proList)
                {
                    if(name.equals(pro.getU_name()))
                    {
                        flag=true;
                        break;
                    }
                }
                if (flag)
                {
                   System.out.println("delete success");
                }
                else
                {
                    System.out.println("delete error");
                }
                return  null;
            }
        }).when(userDao).delete(isA(String.class));

        userDao.delete("sss");
    }

}
