public class TeamLeader extends Employee {
    private int numOfTeamMembers;
    private Employee[] teamMembers;

    public TeamLeader(String name, String surname, int maxNumOfTeamMembers) {
        super(name, surname, "já to tady řídím");
        teamMembers = new Employee[maxNumOfTeamMembers];
        numOfTeamMembers = 0;
    }

    @Override
    public String getJobDescription() {
        StringBuilder description = new StringBuilder(super.getJobDescription());
        description.append("\nVedu tyto lidi:");
        for (int i = 0; i < numOfTeamMembers; i++) {
            description.append("\n").append(teamMembers[i]);
        }
        return description.toString();
    }

    public boolean addTeamMember(Employee newMember) {
        if (numOfTeamMembers < teamMembers.length) {
            teamMembers[numOfTeamMembers++] = newMember;
            return true;
        }
        return false;
    }
}
