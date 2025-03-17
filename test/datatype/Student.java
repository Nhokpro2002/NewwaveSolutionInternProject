package test.datatype;

public class Student {
    private String name;
    private byte score;

    public Student(String name, byte score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public byte getScore() {
        return score;
    }

    public void setScore(byte score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
