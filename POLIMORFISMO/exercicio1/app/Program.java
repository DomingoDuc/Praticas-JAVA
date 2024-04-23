package UNIDADE14.exercicio1.app;

import UNIDADE14.exercicio1.entities.ImportedProduct;
import UNIDADE14.exercicio1.entities.Product;
import UNIDADE14.exercicio1.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("enter the number of products: ");
        int Pn = sc.nextInt();

        for (int i=1; i<=Pn;i++){
            System.out.println("---- Product #" + i + " data ---- ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (ch == 'c') {
                list.add(new Product(name, price));
            }else if (ch == 'i'){
                System.out.print("Customs fee: ");
                Double c_fee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, c_fee));
            }else if (ch == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, date));
            }
        }

        System.out.println();
        System.out.println("---- ETIQUETAS DE PRECO ----");
        for (Product prod : list){
            System.out.println(prod.priceTag());
        }

        sc.close();





    }


}
