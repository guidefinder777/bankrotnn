package ru.nn.bankrot.dto;

import java.util.List;

/**
 * Created by Parfenov on 30.09.2018
 */
public class GridDTO {

    private List items;
    private Long count;

    public GridDTO() {

    }

    public GridDTO(List items, Long count) {
        this.items = items;
        this.count = count;
    }

    public List getItems() {
        return items;
    }

    public void setItems(List items) {
        this.items = items;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
