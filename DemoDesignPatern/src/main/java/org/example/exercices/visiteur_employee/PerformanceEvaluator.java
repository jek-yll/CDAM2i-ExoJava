package org.example.exercices.visiteur_employee;

public class PerformanceEvaluator implements EmployeeVisitor{
    @Override
    public void visit(Designer designer) {
        System.out.println("Evaluation des performance du designer : "+ designer.getPerformance());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("Evaluation des performance du manager : "+ manager.getPerformance());
    }

    @Override
    public void visit(Developer developer) {
        System.out.println("Evaluation des performance du developer : "+ developer.getPerformance());
    }
}
