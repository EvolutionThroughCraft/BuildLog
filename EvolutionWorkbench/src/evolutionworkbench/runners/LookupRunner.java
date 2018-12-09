/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolutionworkbench.runners;

import evolutionworkbench.widgets.lookup.Adder;
import evolutionworkbench.widgets.lookup.AdderImpl;
import evolutionworkbench.widgets.lookup.Performer;
import evolutionworkbench.widgets.lookup.Singer;
import evolutionworkbench.widgets.lookup.Worker;

/**
 *
 * @author dwin
 */
public class LookupRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Performer performer = new Performer();
        
        System.out.println("performer:" + performer.sing());
        
        //// doesn't work b/c module access is protected
//        performer.lookupModule(Singer.class);
        
        Worker worker = new Worker();
        worker.addJob(Adder.class, new AdderImpl());
        Adder job = worker.getJob(Adder.class);
        int a = 3;
        int b = 8;
        int c = job.add(a, b);
        System.out.println("add ( "+a+ " + " + b + " ) = " + c);

        //// doesn't work b/c the worker is basically a repo for jobs w/out
        //// deep knowledge of what goes-in / comes-out of the job
//        worker.addJob(3, 4);        
    }
    
}
