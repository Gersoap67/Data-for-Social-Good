import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    UserStory us = new UserStory("city.txt", "team.txt", "yearfounded.txt");

    System.out.println(us);

    System.out.println("Has duplicate founding years? " + us.checkForDuplicates());
    TeamInfo[] oldestTeams = us.findOldestTeams();
System.out.println("Oldest teams:");
for (TeamInfo t : oldestTeams) {
    System.out.println(t);
    }
  }
}