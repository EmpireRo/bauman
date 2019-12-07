package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import domain.u_pro;
import service.UserService;
import serviceImpl.UserServiceImpl;


import java.util.List;

public class OpeAction extends ActionSupport  implements ModelDriven{
    private u_pro u_pro=new u_pro();
    UserService service=new UserServiceImpl();
    public String select() throws Exception {

        List<u_pro> u_proList= service.select(u_pro.getU_name());
        //转发到actionContext
        ActionContext.getContext().put("u_proList",u_proList);
        return "select";
    }
    public String add() throws Exception {
        service.add(u_pro);
        return "add";

    }
    public String update() throws Exception {
        service.update(u_pro);
        return "update";
    }
    public String delete() throws Exception {
        service.delete(u_pro.getU_name());
        return "delete";
    }


    @Override
    public Object getModel() {
        return u_pro;
    }
}
