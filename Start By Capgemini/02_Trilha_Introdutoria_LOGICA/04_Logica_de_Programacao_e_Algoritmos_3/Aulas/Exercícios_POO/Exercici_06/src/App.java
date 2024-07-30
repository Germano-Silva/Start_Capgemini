public class App {
    public static void main(String[] args) throws Exception {
        Invoice inv = new Invoice(1,"Mouse", -1, 100.0f);
        System.out.println("Valor total = " + inv.getInvoceAmount());
    }
}
