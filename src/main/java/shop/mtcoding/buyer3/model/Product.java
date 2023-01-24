package shop.mtcoding.buyer3.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

// name, price, qty, created_at/
@Getter
@Setter
public class Product {
    private int id;
    private String name;
    private int price;
    private int qty;
    private Timestamp createdAt;
}
