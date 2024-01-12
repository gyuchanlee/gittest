package book;

import java.io.Serializable;

/**
 * 2024-01-08
 */
public class BookDTO implements Comparable<BookDTO>, Serializable {


    private String code;
    private String title;
    private String author;
    private int price;
    private int quantity = 0;
    private String company;
    private int total = 0;

    public BookDTO() {
    }

    public BookDTO(String title) {
        this.title = title;
    }

    public BookDTO(String code, String title, String author, int price, int quantity, String company) {
        this.code = code;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
        this.company = company;
        this.total = this.price * this.quantity; // 총가격
    }

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCompany() {
        return company;
    }

    public int getTotal() {
        return total;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void changeQuantity(int quantity) {
        this.quantity += quantity;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void changeTotal(int total) {
        this.total += total;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "code='" + code + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", company='" + company + '\'' +
                ", total=" + total +
                '}';
    }

    @Override
    public int compareTo(BookDTO o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}

/**
 * field : code, title, author, price, quantity, company(출판사), total
 */
