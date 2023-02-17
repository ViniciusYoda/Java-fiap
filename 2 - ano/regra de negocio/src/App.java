import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int contract = 0;
        String data;
        float value = 0;
        int installments = 0;
        Scanner number  = new Scanner(System.in);
        Scanner dataInput = new Scanner(System.in);
        Scanner valueInput = new Scanner(System.in);
        Scanner installmentsInput = new Scanner(System.in);
        System.out.println("Enter contract data: ");
        contract = number.nextInt();
        System.out.println("Date (dd/mm/yyyy): ");
        data = dataInput.nextLine();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date date = formatter.parse(data);
        System.out.println("Contract value");
        value = valueInput.nextFloat();
        System.out.println("Enter number of instalments: ");
        installments = installmentsInput.nextInt();
        float parcela = 0;
        parcela = value / installments;
        float parcela1 = parcela + (1/100) * 1 + (2/100);
        float parcela2 = parcela + (1/100) * 2 + (2/100);
        float parcela3 = parcela + (1/100) * 3 + (2/100);
        System.out.println(parcela1);
        System.out.println(parcela2);
        System.out.println(parcela3);

        
    }
}
