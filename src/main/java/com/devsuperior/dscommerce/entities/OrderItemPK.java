package com.devsuperior.dscommerce.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class OrderItemPK {

    /**
     * A anotação ManyToOne é utilizada pois diferente de como está no diagrama
     * (ORM)
     * na programação é esta classe que irá associar as duas classes (Order &
     * Product)
     * podendo ter muitos para uma order e muitos para um product.
     */

    // Attributes
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    // Constructor
    public OrderItemPK() {

    }

    // Attributes
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

}
