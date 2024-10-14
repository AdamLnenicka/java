public class TeamLeader2 {
    private Employee leader;
    private int numOfTeamMembers;
    private Employee[] teamMembers;

    public TeamLeader2(String name, String surname, int maxNumOfTeamMembers) {
        this.leader = new Employee(name, surname, "já to tady řídím");
        this.teamMembers = new Employee[maxNumOfTeamMembers];
        this.numOfTeamMembers = 0;
    }

    public boolean addTeamMember(Employee newMember) {
        if (numOfTeamMembers < teamMembers.length) {
            teamMembers[numOfTeamMembers++] = newMember;
            return true;
        }
        return false;
    }

    public String getJobDescription() {
        StringBuilder description = new StringBuilder(leader.getJobDescription());
        description.append("\nVedu tyto lidi:");
        for (int i = 0; i < numOfTeamMembers; i++) {
            description.append("\n").append(teamMembers[i].toString());
        }
        return description.toString();
    }

    public String getName() {
        return leader.getName();
    }

    public String getSurname() {
        return leader.getSurname();
    }
}
