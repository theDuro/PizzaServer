package pl.edu.pwsztar.operator;

import com.itextpdf.text.DocumentException;
import pl.edu.pwsztar.domain.dto.PizzaDataDto;
import pl.edu.pwsztar.service.PizzaService;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TotalCostCalculate {

    final PizzaService pizzaService;

    /**
     *
     * @param pizzaService
     */
    public TotalCostCalculate(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    /**
     * Method creates pdf with ordered products and total cost
     * @param idList
     * @throws IOException
     * @throws DocumentException
     */
    public void getParagon(List<Integer> idList) throws IOException, DocumentException {

        List<PizzaDataDto> pizzaList = new LinkedList<>();
        for (int pizzaId : idList) {
            pizzaList.add(pizzaService.findOneByPizzaId((long) pizzaId));

        }
        PizzaOrderGenerate.createPdf(pizzaList);

    }

}
