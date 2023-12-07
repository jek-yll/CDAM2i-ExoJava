package org.example.exercices.visiteur_employee;

import lombok.Builder;
import lombok.Data;

import javax.xml.namespace.QName;

@Data
@Builder
public class Designer implements PartElement{

    String name;
    int performance;
    int salary;

    @Override
    public void accept(EmployeeVisitor visitor) {
        visitor.visit(this);
    }
}
