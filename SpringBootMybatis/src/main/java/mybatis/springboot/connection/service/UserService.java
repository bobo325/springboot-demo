package mybatis.springboot.connection.service;

import mybatis.springboot.connection.bean.User;

import java.util.List;

public interface UserService {
    /**
     * @ClassName: mybatis.springboot.connection.service
     * @Description:
     * @Date
     */
    User getUserById(Integer id);

    public List<User> getUserList();

    public int add(User user);

    public int update(Integer id, User user);

    public int delete(Integer id);
}
