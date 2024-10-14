public class Main {
    public static void main(String[] args) {
        // Creating some employees
        Employee emp1 = new Employee("Jan", "Novák", "software engineer");
        Employee emp2 = new Employee("Eva", "Dvořáková", "UX designer");
        Employee emp3 = new Employee("Tomáš", "Svoboda", "product manager");

        // Creating a team leader
        TeamLeader teamLeader = new TeamLeader("Anna", "Kovářová", 3);
        teamLeader.addTeamMember(emp1);
        teamLeader.addTeamMember(emp2);
        teamLeader.addTeamMember(emp3);

        // Print details about the team leader and their team
        System.out.println(teamLeader.getJobDescription());
        System.out.println();

        // Creating a second team leader using composition
        TeamLeader2 teamLeader2 = new TeamLeader2("Martin", "Veselý", 3);
        teamLeader2.addTeamMember(emp1);  // Reusing the same employees for simplicity
        teamLeader2.addTeamMember(emp2);

        // Print details about the second team leader and their team
        System.out.println("TeamLeader2 details:");
        System.out.println("Name: " + teamLeader2.getName());
        System.out.println("Surname: " + teamLeader2.getSurname());
        System.out.println(teamLeader2.getJobDescription());
    }
}
