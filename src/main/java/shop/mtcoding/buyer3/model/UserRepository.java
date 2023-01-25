package shop.mtcoding.buyer3.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRepository {

    public int insert();

    public List<User> findAll();

    public User findById();

    public int delete();

    public int update();
}
