/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscorereport;

/**
 *
 * @author nkotchs
 */
public class People2 implements MyObserver{
    @Override
    public void update(Source o){
        System.out.println("(people2)    live result: " + ( (Headquarter)o).getScore() );
    }
}
