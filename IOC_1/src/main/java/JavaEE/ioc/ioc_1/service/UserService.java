package JavaEE.ioc.ioc_1.service;

import org.springframework.stereotype.*;

import java.util.*;

/**
 * @author zheng
 */
@Service("us")
public class UserService {
//    @Autowired
//    UserDao userDao;
    public List<String> getAllUsers() {
//        String hello = userDao.hello();
//        System.out.println("hello = " + hello);
        List<String> users = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            users.add("张三" + i);
        }
        return users;
    }
}
