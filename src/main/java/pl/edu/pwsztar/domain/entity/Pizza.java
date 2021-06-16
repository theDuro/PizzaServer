package pl.edu.pwsztar.domain.entity;

import pl.edu.pwsztar.domain.dto.PizzaDataDto;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "pizzas")
public class Pizza extends PizzaDataDto implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pizza_id")
    private Long pizzaId;

    @Column(name = "title")
    private String title;

    @Column(name = "cost")
    private int cost;

    public Pizza() {
    }

    /**
     *
     * @return product id from sql file
     */
    public Long getPizzaId() {
        return pizzaId;
    }

    /**
     *
     * @param pizzaId
     */
    public void setPizzaId(Long pizzaId) {
        this.pizzaId = pizzaId;
    }

    /**
     *
     * @return product title from sql file
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return product cost from sql file
     */
    public int getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
}
