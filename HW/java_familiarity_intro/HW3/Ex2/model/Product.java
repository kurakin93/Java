package java_familiarity_intro.HW3.Ex2.model;
import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * Сведения о товаре состоят из наименования, страны-производителя,
 * веса, цены, сорта. Получить наименования товаров
 * заданного сорта с наименьшей ценой.
 */
@AllArgsConstructor
@Data
public class Product {
    private String name;
    private String producingCountry;
    private Integer weight;
    private Integer price;
    private Integer type;
}
