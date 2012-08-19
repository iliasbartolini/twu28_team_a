package example.scam.persistence;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import example.scam.domain.User;


public interface UserMapper {
    @Select("SELECT id,name FROM user where name = #{name}")
    User getUser(String name);

    @Insert("INSERT INTO user (id, name) VALUES(#{id}, #{name})")
    void insertUser(User user);
}
