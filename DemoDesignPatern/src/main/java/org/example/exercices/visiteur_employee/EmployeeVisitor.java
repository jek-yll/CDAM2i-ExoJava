package org.example.exercices.visiteur_employee;

public interface EmployeeVisitor {
    void visit(Designer designer);
    void visit(Manager manager);
    void visit(Developer developer);
}
