package JavaSE.overrideEquals;

public class Order {
    int orderID;
    String orderName;

    public Order(int orderId, String orderName) {
        this.orderID = orderId;
        this.orderName = orderName;
    }

    public int getOrderID() {
        return orderID;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof Order) {
            Order o = (Order) obj;
            if (this.orderID == o.orderID && this.orderName.equals(o.orderName)) {
                result = true;
            }
        }
        return result;
    }
}

class myDate {
    int year;
    int month;
    int day;

    public myDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public boolean equals(Object obj) {
        int result = 1;
        if (obj instanceof myDate) {
            myDate md = (myDate) obj;
            result = 0;
            if (this.year != md.year) {
                result += 1;
            }
            if (this.month != md.month) {
                result += 1;
            }
            if (this.day != md.day) {
                result += 1;
            }
        }
        if (result == 0) {
            return true;
        } else {
            return false;
        }
    }
}
