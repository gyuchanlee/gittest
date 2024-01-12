package class_;

/**
 * 2023-12-28
 */
public class SungJuk {

    private String name;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;
    private String grade;

    public void setData(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    // logic
    public void calc() {
        this.tot = kor + eng + math;
        this.avg = tot / 3.0;
        if (avg >= 90) {
            if (avg >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            }
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

     SungJuk() {}

    public SungJuk(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getTot() {
        return tot;
    }

    public double getAvg() {
        return avg;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "SungJuk{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", tot=" + tot +
                ", avg=" + avg +
                ", grade='" + grade + '\'' +
                '}';
    }
}
