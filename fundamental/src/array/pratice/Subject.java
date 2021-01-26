package array.pratice;

public class Subject {
    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        if (score > 100) {
            score = 100;
            this.score = score;
        } else {
            this.score = score;
        }
    }

}
