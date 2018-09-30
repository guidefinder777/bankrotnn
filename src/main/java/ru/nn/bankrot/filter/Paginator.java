package ru.nn.bankrot.filter;

/**
 * Created by Parfenov on 30.09.2018
 */
public class Paginator {

    private int row = 0;
    private int limit = 25;

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
