package class_;

/**
 * 2023-12-28
 */
public class SalaryDTO {
    /**
     * DTO : Data Transfer Object
     * VO : Value Object
     */

    private String name;
    private String job;
    private int basic;
    private int extra;
    private int total;
    private double rate;
    private double tax;
    private double salary;

    public void setData(String name, String job, int basic, int extra) {
        this.name = name;
        this.job = job;
        this.basic = basic;
        this.extra = extra;
    }

    public void calc() {
        total = basic + extra;
        if (total >= 5000000) {
            rate = 0.03;
        } else if (total >= 3000000) {
            rate = 0.02;
        } else {
            rate = 0.01;
        }
        tax = total * rate;
        salary = total - tax;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getBasic() {
        return basic;
    }

    public int getExtra() {
        return extra;
    }

    public int getTotal() {
        return total;
    }

    public double getRate() {
        return rate;
    }

    public double getTax() {
        return tax;
    }

    public double getSalary() {
        return salary;
    }
}
