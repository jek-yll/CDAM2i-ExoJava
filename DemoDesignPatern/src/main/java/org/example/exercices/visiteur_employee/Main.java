package org.example.exercices.visiteur_employee;

public class Main {
    public static void main(String[] args) {

        Developer dev = new Developer.DeveloperBuilder()
                .name("dev1")
                .salary(2300)
                .performance(100)
                .build();

        Designer des = new Designer.DesignerBuilder()
                .name("des1")
                .salary(1950)
                .performance(20)
                .build();

        dev.accept(new PerformanceEvaluator());
        des.accept(new SalaryAdjuster());

    }
}
