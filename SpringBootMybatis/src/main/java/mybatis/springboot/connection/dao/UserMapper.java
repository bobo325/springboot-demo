package mybatis.springboot.connection.dao;

import mybatis.springboot.connection.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
//因为使用了ConponentScan，这里不需要@Conponent；如果是xml配置，则需要。
public interface UserMapper {
    @Select("SELECT * FROM tb_user WHERE id = #{id}")
    User getUserById(Integer id);

    @Select("SELECT * FROM tb_user")
    List<User> getUserList();

    @Insert("insert into tb_user(username, age, ctm) values(#{username}, #{age}, now())")
    int add(User user);

    @Update("UPDATE tb_user SET username = #{user.username} , age = #{user.age} WHERE id = #{id}")
    int update(@Param("id") Integer id, @Param("user") User user);

    @Delete("DELETE from tb_user where id = #{id}")
    int delete(Integer id);

}
