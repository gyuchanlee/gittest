package test;

/**
 * 2024-01-05
 */
public class EmployeeDTO implements Comparable<EmployeeDTO> {

    /**
     * 1. 관리하려는 항목은 사원번호, 이름, 직급, 기본급, 수당, 합계, 세율, 세금, 월급 이다.
     * 2. 세율은 합계가 200만원 이하 : 1%(0.01), 400만원 이하 : 2%(0.02), 400만원 초과 : 3%(0.03)으로 설정한다.
     */

    private Long id;
    private String name;
    private String job;
    private int base;
    private int extra;
    private int tot;
    private double taxRate;
    private double tax;
    private double salary;

    public EmployeeDTO(Long id, String name, String job, int base, int extra) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.base = base;
        this.extra = extra;
    }

    public void calc() {
        tot = base + extra;

        if (tot > 4000000) {
            taxRate = 0.03;
        } else if (tot > 2000000) {
            taxRate = 0.02;
        } else {
            taxRate = 0.01;
        }
        tax = tot * taxRate;
        salary = tot - tax;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getExtra() {
        return extra;
    }

    public void setExtra(int extra) {
        this.extra = extra;
    }

    public int getTot() {
        return tot;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getTax() {
        return tax;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", base=" + base +
                ", extra=" + extra +
                ", tot=" + tot +
                ", taxRate=" + taxRate +
                ", tax=" + tax +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(EmployeeDTO o) {
        if (this.getSalary() > o.getSalary()) {
            return 1;
        } else if (this.getSalary() < o.getSalary()) {
            return -1;
        } else {
            return 0;
        }
    }
}
