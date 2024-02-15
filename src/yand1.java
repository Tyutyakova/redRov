import java.util.Scanner;

class Praktikum2 {
    public static void main(String[] args) {
        double rateUSD = 78;
        double rateEUR = 85;
        double rateJPY = 0.74;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble(); // Считали число типа double

        System.out.println("Сколько дней до зарплаты?"); // Считали число типа int
        int daysBeforeSalary = scanner.nextInt();

        System.out.println("Введите команду. Доступные команды: convert и advice.");
        String command = scanner.next(); // Считали команду

        if (command.equals("convert")) {
            String currency = "USD";
            System.out.println("Вы хотите конвертировать рубли в " + currency);
            System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);


        } else if (command.equals("advice"))
        {
            // Здесь нужно давать советы
            if (moneyBeforeSalary < 3000) {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            } else if (moneyBeforeSalary < 10000) {
                // Здесь нужное условие уже добавили
                if (daysBeforeSalary < 10) {
                    System.out.println("Окей, пора в Макдак!");
                } else {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                }

            } else if (moneyBeforeSalary < 30000) {
                // Допишите условие
                if (daysBeforeSalary < 10) {
                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
                } else {
                    System.out.println("Окей, пора в Макдак!");
                }

            } else {
                // Если до зарплаты меньше 10 дней, то едим крабов
                if (daysBeforeSalary < 10){
                    System.out.println("Отлично! Заказывайте крабов!");}
                // Иначе — доллары и ужин в хорошем ресторане
                else {
                    System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");}

            }
        }

        else {  System.out.println("Извините, такой команды пока нет."); }

    }
}