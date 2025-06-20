package application;

import entities.People;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual seu nome? ");
        String name = sc.nextLine();

        System.out.print("Qual sua data de nascimento (dd/MM/yyyy)? ");
        String birthDateInput = sc.nextLine();

        System.out.print("Quando você começou a trabalhar (dd/MM/yyyy)? ");
        String startedWorkingInput = sc.nextLine();

        LocalDate birthDate = LocalDate.parse(birthDateInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate startedWorking = LocalDate.parse(startedWorkingInput, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        People person = new entities.People(name, birthDate, startedWorking);

        if (person.getBirthDate().isAfter(LocalDate.now()) || person.getStartedWorking().isAfter(LocalDate.now())) {
            System.out.println("Data de nascimento ou data de início de trabalho inválida.");
        } else if (person.getStartedWorking().isBefore(person.getBirthDate())) {
            System.out.println("Não há como começar a trabalhar antes de nascer.");
        } else {
            System.out.printf("Olá %s!\nVocê tem %d anos e está trabalhando há %d anos.", person.getName(), person.age(), person.yearsWorking());
        }

        sc.close();
    }
}