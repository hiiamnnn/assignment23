/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package footballscorereport;
import java.util.ArrayList;
/**
 *
 * @author nkotchs
 */
public class Headquarter implements Source{
    private final ArrayList<MyObserver> list;
    private String score;
    
    public Headquarter(){
        this.list = new ArrayList<MyObserver>();
    }
    public void setScore(String data){
        score = data;
        notifyScore();
    }
    public String getScore(){
        return score;
    }
    @Override
    public void register(MyObserver observer){
        list.add(observer);
    }
    @Override
    public void notifyScore(){
        for(int j=0; j<list.size(); j++){
            list.get(j).update(this);
        }
    }
}
