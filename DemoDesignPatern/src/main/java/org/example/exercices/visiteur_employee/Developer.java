package org.example.exercices.visiteur_employee;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Developer implements PartElement{

    String name;
    int performance;
    int salary;

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
