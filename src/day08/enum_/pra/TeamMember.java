package day08.enum_.pra;

import day08.enum_.PizzaStatus;

import static day08.enum_.pra.TeamRole.*;

public class TeamMember {
     String name;
    TeamRole role;

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        System.out.println(this.role.getDescription());
    }
}