package JavaEE.ioc.ioc_1.dao;

import org.springframework.stereotype.*;

@Repository
public class UserDao {
    public String hello(){
        return "Hello,DAO.";
    }
}
