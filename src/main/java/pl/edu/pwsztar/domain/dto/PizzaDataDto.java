package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;


public class PizzaDataDto implements Serializable {

    public PizzaDataDto() {
    }

    /**
     *
     * @param title
     * @param cost
     */
    public PizzaDataDto(String title, int cost) {
        this.cost = cost;
        this.title = title;
    }

    private String title;
    private int cost;

    /**
     *
     * @return title of product
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
     * @return cost of product
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
