package playground;

public class Playground {

    public static void main(String[] args) {

        int base = 100;
        int bonus = 20;
        boolean[] isTeamLead = {true, false, false, false};

        System.out.println(solution(base, bonus, isTeamLead));

    }


    public static int solution(int baseSalary, int teamLeadBonus, boolean[] isTeamLead) {
        Developer[] dev = new Developer[isTeamLead.length];

        for (int i = 0; i < isTeamLead.length; i++) {
            if (!isTeamLead[i]) {
                dev[i] = new Developer(baseSalary);
            } else {
                dev[i] = new TeamLead(baseSalary, teamLeadBonus);
            }
        }

        int total = 0;
        for (int i = 0; i < dev.length; i++) {
            total += dev[i].getTotalSalary();
        }

        return total;
    }


}



class Developer {
    private int salary;

    public Developer(int salary) {
        this.salary = salary;
    }

    public int getTotalSalary() {
        return this.salary;
    }
}

class TeamLead extends Developer {
    private int teamLeadBonus;

    public TeamLead(int baseSalary, int teamLeadBonus) {
        super(baseSalary);
        this.teamLeadBonus = teamLeadBonus;
    }

    @Override
    public int getTotalSalary() {
        return super.getTotalSalary() + teamLeadBonus;
    }
}



