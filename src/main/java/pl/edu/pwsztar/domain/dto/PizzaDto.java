package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class PizzaDto implements Serializable {

    private Long pizzaId;
    private String title;
    private int cost;

    public PizzaDto() {
    }

    public Long getPizzaId() {
        return pizzaId;
    }

    public String getTitle() {
        return title;
    }

    public int getCost() {
        return cost;
    }

    public void setPizzaId(Long pizzaId) {
        this.pizzaId = pizzaId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
