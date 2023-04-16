package java_familiarity_intro.HW3.Ex1.model;
import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров, название которых содержит «высший»
 */
@Data
@AllArgsConstructor
public class Items {
    private String name;
    private Integer price;
    private Integer type;
}
