package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class PizzaOrderDto implements Serializable {
    private int totalCost;
    private List<PizzaDataDto> pizzasList = new LinkedList<>();

    /**
     *
     * @param totalCost
     * @param pizzasList
     */
    public PizzaOrderDto(int totalCost, List<PizzaDataDto> pizzasList) {
        this.pizzasList = pizzasList;
        this.totalCost = totalCost;
    }

    /**
     *
     * @return total cost of order
     */
    public int getTotalCost() {
        return totalCost;
    }

    /**
     *
     * @param totalCost
     */
    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    /**
     *
     * @return list of products
     */
    public List<PizzaDataDto> getPizzasList() {
        return pizzasList;
    }

    /**
     *
     * @param pizzasList
     */
    public void setPizzasList(List<PizzaDataDto> pizzasList) {
        this.pizzasList = pizzasList;
    }
}
