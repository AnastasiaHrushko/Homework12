package Homework12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order<T> {
    Product product = new Product();
    private List<T> productsList = new ArrayList<>();
    private Date dateOfPlacingOrder;
    private int id;

    public Order(List<Product> goodsList, Date dateOfPlacingOrder, int id){
        this.productsList = (List<T>) goodsList;
        this.dateOfPlacingOrder = dateOfPlacingOrder;
        this.id = id;
    }

    public Order(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDateOfPlacingOrder() {
        return dateOfPlacingOrder;
    }

    public void setDateOfPlacingOrder(Date dateOfPlacingOrder) {
        this.dateOfPlacingOrder = dateOfPlacingOrder;
    }

    public List<T> getProductsList() {
        return productsList;
    }

    public void setProductsList(List<T> productsList) {
        this.productsList = productsList;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
