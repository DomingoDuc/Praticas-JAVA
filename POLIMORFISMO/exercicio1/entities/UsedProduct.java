package UNIDADE14.exercicio1.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct  extends Product{

    private LocalDate manufacturedate;

    public UsedProduct(String name, Double price, LocalDate manufacturedate) {
        super(name, price);
        this.manufacturedate = manufacturedate;
    }

    public LocalDate getManufacturedate() {
        return manufacturedate;
    }

    public void setManufacturedate(LocalDate manufacturedate) {
        this.manufacturedate = manufacturedate;
    }

    @Override
    public String priceTag(){
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date:  "
                + manufacturedate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                +")";
    }
}
