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

    public Long getMovieId() {
        return pizzaId;
    }

    public void setPizzaId(Long pizzaId) {
        this.pizzaId= pizzaId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
