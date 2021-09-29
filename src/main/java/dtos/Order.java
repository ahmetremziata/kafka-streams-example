package dtos;

public class Order {
  private Integer orderId;
  private String status;
  private Long orderDate;
  private String city;
  private String customerFullName;

  public Integer getOrderId() {
    return orderId;
  }

  public void setOrderId(Integer orderId) {
    this.orderId = orderId;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Long getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Long orderDate) {
    this.orderDate = orderDate;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCustomerFullName() {
    return customerFullName;
  }

  public void setCustomerFullName(String customerFullName) {
    this.customerFullName = customerFullName;
  }
}
