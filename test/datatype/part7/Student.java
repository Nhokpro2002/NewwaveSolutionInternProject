package test.datatype.part7;

enum Grade {EXCELLENT, GOOD, AVERAGE, WEAK};

public class Student {
    private String name;
    private double score;
    private Grade grade;


    public Student(String name, double score) {
        this.name = name;
        this.score = score;

    }

    public void classify(double score) {
        if (score >= 8.5) {
            grade = Grade.EXCELLENT;
        } else if (score >= 7.4 && score <= 8.4) {
            grade = Grade.GOOD;
        } else if (score >= 5 && score <= 6.9) {
            grade = Grade.AVERAGE;
        }
        else {
            grade = Grade.WEAK;
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", grade=" + grade +
                '}';
    }
}
