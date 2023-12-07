package org.example.exercices.visiteur_employee;

public class SalaryAdjuster implements EmployeeVisitor{
    @Override
    public void visit(Designer designer) {
        System.out.println("Prime de décembre des designer: +1000€");
        designer.setSalary(designer.getSalary() + 1000);
        System.out.println("Salaire de décembre : " + designer.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Prime de décembre des manager: +1200");
        manager.setSalary(manager.getSalary()+ 1200);
        System.out.println("Salaire de décembre : " + manager.getSalary());
    }

    @Override
    public void visit(Developer developer) {
        System.out.println("Prime de décembre des developper: +2000");
        developer.setSalary(developer.getSalary()+2000);
        System.out.println("Salaire de décembre : " + developer.getSalary());
    }
}
