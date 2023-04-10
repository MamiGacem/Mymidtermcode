package design;



public enum Months {
    January, February, March, April, May, June, July, August, September, October, November, December;
    private int monthOrder;

    public void Month(int monthOrder) {
        this.monthOrder = monthOrder;
    }

    public int getMonthOrder() {
        return this.monthOrder;
    }

}


