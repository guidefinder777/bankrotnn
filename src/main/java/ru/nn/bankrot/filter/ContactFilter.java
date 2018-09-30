package ru.nn.bankrot.filter;


import javax.persistence.criteria.Order;

/**
 * Created by Parfenov on 30.09.2018
 */
public class ContactFilter extends BaseFilter {


    private String orderName;
    private boolean ascending;

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public boolean isAscending() {
        return ascending;
    }

    public void setAscending(boolean ascending) {
        this.ascending = ascending;
    }
}
