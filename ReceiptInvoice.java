import java.util.ArrayList;
import java.util.List;

public class ReceiptInvoice {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public void print(){
        double netto8 = 0;
        double netto23 = 0;
        double brutto8 = 0;
        double brutto23 = 0;
        double sumNetto = 0;
        double sumBrutto= 0;

        for (int i=0; i<products.size();i++){
            if (products.get(i).getVat()==8.0){
                netto8+= products.get(i).getPrice();
                brutto8+= products.get(i).getPrice()+ (products.get(i).getPrice()*0.08);
            } else if (products.get(i).getVat()==23.0){
                netto23+=products.get(i).getPrice();
                brutto23+=products.get(i).getPrice()+ (products.get(i).getPrice()*0.23);
            }
        }
        sumBrutto=brutto23+brutto8;
        sumNetto=netto23+netto8;

        System.out.println("|               | Total netto | Total brutto |\n");
        System.out.println("|---------------|-------------|--------------|\n");
        System.out.println("| Vat 8 %       |   "+netto8+"     |   "+brutto8+"      |");
        System.out.println("| Vat 23 %      |   "+netto23+"      |   "+brutto23+"       |");
        System.out.println("|---------------|-------------|--------------|\n");
        System.out.println("|Total          |   "+sumNetto+"     |   "+sumBrutto+"      |");
    }
}
