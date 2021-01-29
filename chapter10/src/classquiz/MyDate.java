package classquiz;

public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyDate) {
            MyDate oDate = (MyDate) obj;
            if (this.day == oDate.day && this.month == oDate.month && this.year == oDate.year) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return day * 11 + month * 101 + year * 1001;
    }

}
