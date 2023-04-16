package java_familiarity_intro.HW3.Ex3.model;

/**
 * Сведения о книге состоят из
 * названия, фамилии автора, цены, года издания и количества страниц.
 * Найти названия книг, в которых
 * простое количество страниц, фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */

public class Book {
    public Book(String name, String authorName, Integer price, Integer yearsOFpublication, Integer numbPages) {
        this.name = name;
        this.authorName = authorName;
        this.price = price;
        this.yearsOFpublication = yearsOFpublication;
        this.numbPages = numbPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getYearsOFpublication() {
        return yearsOFpublication;
    }

    public void setYearsOFpublication(Integer yearsOFpublication) {
        this.yearsOFpublication = yearsOFpublication;
    }

    public Integer getNumbPages() {
        return numbPages;
    }

    public void setNumbPages(Integer numbPages) {
        this.numbPages = numbPages;
    }

    private String name;
    private String authorName;
    private Integer price;
    private Integer yearsOFpublication;
    private Integer numbPages;
}
