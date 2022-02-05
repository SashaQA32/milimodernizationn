public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 69_25;
        float height = 1_70;
        float indexMassBody = service.calculate(mass,height);
        System.out.println("Индекс Массы Тела равен = " + indexMassBody);
    }
}
