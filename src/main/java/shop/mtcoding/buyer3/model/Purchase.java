package shop.mtcoding.buyer3.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

// user_id, product_id, count, created_at
@Getter
@Setter
public class Purchase {
    private int id;
    private int userId;
    private int productId;
    private int count;
    private Timestamp createdAt;
}
