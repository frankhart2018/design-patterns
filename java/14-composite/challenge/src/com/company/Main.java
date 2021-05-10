package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Supervisor technologyDean = new Supervisor("Dr. Mike", "Dean of Technology");
        Supervisor chairOfMathDepartment = new Supervisor("Dr. John", "Chair of Math Department");
        Supervisor chairofComputerScienceDepartment = new Supervisor("Dr. Ian", "Chair of CS Department");

        Professor mathProf1 = new Professor("Math Professor1", "Adjunct", 302);
        Professor mathProf2 = new Professor("Math Professor2", "Associate", 303);

        Professor cseProf1 = new Professor("CSE Professor1", "Adjunct", 507);
        Professor cseProf2 = new Professor("CSE Professor2", "Professor", 508);
        Professor cseProf3 = new Professor("CSE Professor3", "Professor", 509);

        technologyDean.add(chairOfMathDepartment);
        technologyDean.add(chairofComputerScienceDepartment);

        // Professors of Mathematics directly reports to the chair of math
        chairOfMathDepartment.add(mathProf1);
        chairOfMathDepartment.add(mathProf2);

        // Professors of CS directly report to chair of CS
        chairofComputerScienceDepartment.add(cseProf1);
        chairofComputerScienceDepartment.add(cseProf2);
        chairofComputerScienceDepartment.add(cseProf3);

        System.out.println(technologyDean.getDetails());
        List<Faculty> chairs = technologyDean.getMyFaculty();
        for(Faculty chair: chairs) {
            System.out.println("\t" + chair.getDetails());;
        }

        List<Faculty> mathProfessors = chairOfMathDepartment.getMyFaculty();
        for(Faculty mathProfessor: mathProfessors) {
            System.out.println("\t\t" + mathProfessor.getDetails());
        }

        List<Faculty> cseProfessors = chairofComputerScienceDepartment.getMyFaculty();
        for(Faculty cseProfessor: cseProfessors) {
            System.out.println("\t\t" + cseProfessor.getDetails());
        }

        chairofComputerScienceDepartment.remove(cseProf2);
        List<Faculty> cseProfessors1 = chairofComputerScienceDepartment.getMyFaculty();
        for(Faculty cseProfessor: cseProfessors1) {
            System.out.println("\t\t" + cseProfessor.getDetails());
        }
    }
}
