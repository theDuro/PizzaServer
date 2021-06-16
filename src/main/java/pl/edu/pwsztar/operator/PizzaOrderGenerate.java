package pl.edu.pwsztar.operator;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import pl.edu.pwsztar.domain.dto.PizzaDataDto;
import pl.edu.pwsztar.service.PizzaService;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class PizzaOrderGenerate {

    /**
     * Method create template for paragon and calculate total cost of products
     * @param pizzaParagon
     * @throws DocumentException
     * @throws IOException
     */
    public static void createPdf(List<PizzaDataDto> pizzaParagon)
            throws DocumentException, IOException {
        PizzaService pizzaService;
        int totalCost = 0;
        Document document = new Document();
        PdfWriter.getInstance(
                document, new FileOutputStream("Order.pdf"));
        document.open();

        Font font = new Font(Font.FontFamily.TIMES_ROMAN, 40.0f);
        Paragraph title = new Paragraph("PizzaOrder", font);
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        document.add(Chunk.NEWLINE);
        for (PizzaDataDto pizza : pizzaParagon) {
            document.add(new Paragraph("" + pizza.getTitle() + ": " + pizza.getCost() + " zl"));
            totalCost += pizza.getCost();
        }
        document.add(new Paragraph("Koszt zamówienia: " + totalCost + " zl"));
        document.close();
    }
}
