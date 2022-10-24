public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1.\n");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.printf("ФИО сотрудника — %s", fullName);

        System.out.println("\n\nЗадача 2.\n");
        fullName = fullName.toUpperCase();
        System.out.printf("Данные ФИО сотрудника для заполнения отчета — %s", fullName);

        System.out.println("\n\nЗадача 3.\n");
        fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace ('ё', 'е');
        System.out.printf("Данные ФИО сотрудника — %s", fullName);
    }
}