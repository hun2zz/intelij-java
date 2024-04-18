package day08.enum_.pra;

public enum TeamRole {
        LEADER("Manages the team and coordinates."),
        DEVELOPER("Develops the software."),
        DESIGNER("Designs the user interface."),
        TESTER("Tests the software for bugs.");

        String description;

        TeamRole(String description){
            this.description = description;
        }

    public String getDescription() {
        return description;
    }
}
