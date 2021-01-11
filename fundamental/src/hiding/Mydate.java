package hiding;

public class Mydate {
    private int day;
    private int month;
    private int year;
    private boolean isValid;

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            isValid = true;
            this.month = month;
        }
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일");
        } else {
            System.out.println("유효하지 않은 날짜입니다.");
        }
    }
}
