/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscorereport;
import java.util.Scanner;
/**
 *
 * @author nkotchs
 */
public class FootballScoreReport {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        People1 p1 = new People1();
        People2 p2 = new People2();
        Headquarter obj = new Headquarter();
        obj.register(p1);
        obj.register(p2);
        /*
        obj.setScore("Thai 1-0 UAE");
        obj.setScore("Thai 2-0 UAE");
        */
        Scanner scn = new Scanner(System.in);
        String score;
        do{
            System.out.print("Enter Score  ");
            score = scn.nextLine();
            if(!score.equals("")){ 
                obj.setScore(score);
            }
        }while(!score.equals("")); //press enter to exit
    }
    
}
