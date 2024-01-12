package sungJuk;

/**
 * 2024-01-04
 */
public class SungJukDTO implements Comparable<SungJukDTO> {


    private int no;
    private String name;
    private int kor;
    private int eng;
    private int math;
    private int tot;
    private double avg;

    public SungJukDTO(int no, String name, int kor, int eng, int math) {
        this.no = no;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public void calc() {
        tot = kor + eng + math;
        avg = tot / 3.0;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getTot() {
        return tot;
    }


    public double getAvg() {
        return avg;
    }


    @Override
    public String toString() {
        return "성적 [" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                ", tot=" + tot +
                ", avg=" + avg +
                ']';
    }

    @Override
    public int compareTo(SungJukDTO o) {
        if (this.tot > o.tot) {
            return 1;
        } else if (this.tot < o.tot) {
            return -1;
        } else {
            return 0;
        }
    }

}
