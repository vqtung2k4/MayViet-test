package Models;

import java.sql.Timestamp;

public class Order {
    private int orderId;
    private Integer userId;
    private String orderCode;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String shippingAddress;
    private String shippingCity;
    private String shippingDistrict;
    private String paymentMethod;
    private double totalAmount;
    private double shippingFee;
    private double discountAmount;
    private double finalAmount;
    private String status;
    private String note;
    private Timestamp createdAt;
    private Timestamp updatedAt;


}
