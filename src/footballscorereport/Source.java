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
public interface Source {
    public void notifyScore();
    public void register (MyObserver observer);
}
