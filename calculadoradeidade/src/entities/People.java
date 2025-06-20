package entities;

import java.time.LocalDate;
import java.time.Period;

public class People {
    private String name;
    private LocalDate birthDate;
    private LocalDate startedWorking;

    public People(String name, LocalDate birthDate, LocalDate startedWorking) {
        this.name = name;
        this.birthDate = birthDate;
        this.startedWorking = startedWorking;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public LocalDate getStartedWorking() {
        return startedWorking;
    }

    public int age() {
        Period period = Period.between(birthDate, LocalDate.now());
        return period.getYears();
    }

    public int yearsWorking() {
        Period period = Period.between(startedWorking, LocalDate.now());
        return period.getYears();
    }
}