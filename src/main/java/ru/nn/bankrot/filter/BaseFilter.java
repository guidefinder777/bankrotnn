package ru.nn.bankrot.filter;

/**
 * Created by Parfenov on 30.09.2018
 */
public abstract class BaseFilter {

    public BaseFilter() {
        paginator = new Paginator();
    }

    public Paginator paginator;

    public Paginator getPaginator() {
        return paginator;
    }

    public void setPaginator(Paginator paginator) {
        this.paginator = paginator;
    }
}
