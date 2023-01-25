package shop.mtcoding.buyer3.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductRepository {

    public int insert();

    public List<Product> findAll();

    public Product findById(int id);

    public int delete();

    public int update();
}
