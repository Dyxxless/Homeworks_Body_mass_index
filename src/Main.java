public class Main {
    public static void main(String[] args) {
        //Cервис, который рассчитывает индекс массы тела (body mass index).

        BmiService service = new BmiService();
        int weight = 100; //вес в килограммах
        double height = 1.92d; //рост в метрах
        double height2 = height * height; //значение роста в квадрате
        double index = service.calculate(weight, height2);
        System.out.println("Индекс массы тела равен " + index);
    }
}