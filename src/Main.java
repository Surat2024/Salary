public class Main {
    public static void main(String[] args) {


        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        double newMashaSalary = mashaSalary * 1.1;
        double newDenisSalary = denisSalary * 1.1;
        double newKristinaSalary = kristinaSalary * 1.1;

        double mashaYearlyIncomeDiff = newMashaSalary * 12 - mashaSalary * 12;
        double denisYearlyIncomeDiff = newDenisSalary * 12 - denisSalary * 12;
        double kristinaYearlyIncomeDiff = newKristinaSalary * 12 - kristinaSalary * 12;

        System.out.println("Маша теперь получает "  + newMashaSalary + " рублей. Годовой доход вырос на " + mashaYearlyIncomeDiff + " рублей.");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + denisYearlyIncomeDiff + " рублей.");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + kristinaYearlyIncomeDiff + " рублей.");
        System.out.println("Решил зарплату");


       }
    }