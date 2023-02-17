import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int contract = 0;
        String data;
        float value = 0;
        int installments;
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

        
    }
}
