package Models;

import java.sql.Timestamp;

public class OrderDetail {
    private int orderDetailId;
    private int orderId;
    private int productId;
    private String productName;
    private String productImage;
    private double price;
    private int quantity;
    private double subtotal;
    private Timestamp createdAt;
}
