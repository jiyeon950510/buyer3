
package shop.mtcoding.buyer3.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseRepository {
    public int insert();

    public List<Purchase> findAll();

    public Purchase findById();

    public int delete();

    public int update();
}