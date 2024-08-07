public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan", middleName = "Ivanovich", lastName = "Ivanov";

        //Part 1
        System.out.println("Задание 1");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф. И. О. сотрудника — " + fullName);
        System.out.println();

        //Part 2
        System.out.println("Задание 2");
        String fullNameUpperCase = fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullNameUpperCase);
        System.out.println();

        //Part 3
        System.out.println("Задание 3");
        String fullName1 = "Иванов Семён Семёнович";
        fullName1 = fullName1.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName1);
        System.out.println();
    }
}