package homework;

/**
 * 2023-12-29
 * 
 * 데이터
 *  * 이름 입력 :
 *  * 나이 입력 :
 *  * 핸드폰 입력 :
 *  * 주소 입력 :
 */
public class MemberDTO {

    private String name;
    private Integer age;
    private String phone;
    private String address;

    public MemberDTO(String name, Integer age, String phone, String address) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " "+name+"\t\t\t"+age+"\t\t"+phone+"\t\t"+address+"\n";
    }
}
