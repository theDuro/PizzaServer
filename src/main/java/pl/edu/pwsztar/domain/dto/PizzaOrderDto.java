package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

public class PizzaOrderDto implements Serializable {
    private int totalCost;
    private List<PizzaDataDto> piizasList = new LinkedList<>();
    public PizzaOrderDto(int toltalCost,List<PizzaDataDto> piizasList) {
        this.piizasList=piizasList;
        this.totalCost=toltalCost;
    }

    public int getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public List<PizzaDataDto> getPiizasList() {
        return piizasList;
    }

    public void setPiizasList(List<PizzaDataDto> piizasList) {
        this.piizasList = piizasList;
    }
}
