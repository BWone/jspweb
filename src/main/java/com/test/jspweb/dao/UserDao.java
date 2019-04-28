package com.test.jspweb.dao;

import com.test.jspweb.bean.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Select("select * from user where id = #{id}")
    User findById(int id);

    @Select("select * from user")
    List<User> findAll();

    @Select("select * from user where usn = #{usn}")
    List<User> findUserByUsn(String usn);//User不是唯一的，用List

    //当参数是User类型时#{}中的变量名必须与实体类的变量名一致
    @Insert("insert into user values(null,#{usn},#{pwd},#{salary})")
    int insert(User user);

    @Delete("delete from user where id = #{id}")
    int delete(int id);

    @Update("update user set usn=#{usn},pwd=#{pwd},salary=#{salary} where id=#{id}")
    int update(User user);
}
