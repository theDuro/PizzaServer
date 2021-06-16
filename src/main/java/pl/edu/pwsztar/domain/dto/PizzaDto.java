package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class PizzaDto implements Serializable {

    private Long pizzaId;
    private String title;
    private int cost;


    public PizzaDto() {
    }

    /**
     *
     * @return product id
     */
    public Long getPizzaId() {
        return pizzaId;
    }

    /**
     *
     * @return product title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return product cost
     */
    public int getCost() {
        return cost;
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
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @param cost
     */
    public void setCost(int cost) {
        this.cost = cost;
    }
}
