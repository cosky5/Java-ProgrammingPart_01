
import nhlstats.NHLStatistics;

public class Main {

   
public static void main(String[] args) {
System.out.println("Top ten players based on goals");    
NHLStatistics.sortByGoals();     
NHLStatistics.top(10);
        
System.out.println("\nTop 25 players based on penalty");
NHLStatistics.sortByPenalties();
NHLStatistics.top(25);
        
System.out.println("\nStatistics Sidney Crosby");
NHLStatistics.searchByPlayer("Sidney Crosby");
        
System.out.println("\nStatistics for PHI");
NHLStatistics.teamStatistics("PHI");
        
System.out.println("\nPlayers in ANA");
NHLStatistics.sortByPoints();    
NHLStatistics.teamStatistics("ANA");
        
    }
}
