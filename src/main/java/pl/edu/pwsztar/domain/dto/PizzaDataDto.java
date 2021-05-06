package pl.edu.pwsztar.domain.dto;


import java.io.Serializable;

public class PizzaDataDto implements Serializable {
    public PizzaDataDto() {
    }
    public PizzaDataDto(String title,int cost) {
        this.cost= cost;
        this.title= title;
    }

    private String title;
    private int cost;

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
