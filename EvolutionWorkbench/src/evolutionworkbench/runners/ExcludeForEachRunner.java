/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolutionworkbench.runners;

import evolutionworkbench.widgets.excludeForEach.Accident;
import evolutionworkbench.widgets.excludeForEach.ExcludeForEach;
import evolutionworkbench.widgets.excludeForEach.Firework;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author dwin
 * This all started when I needed some way for an injected class to provide
 * error feedback on the batch it was processing.
 * 
 * Using java pass-by-reference shenanigans, a reasonable solution seemed to be
 * to pass 2 lists, one representing the batch an the other the errors.
 * 
 * This was actually doubly convenient b/c variations of the injected class were
 * often called one after the other, so by having troublesome batch-elements
 * persistently drop off the processing list onto the error list we could minimize
 * the issues encountered by later variations.
 * 
 * The only stumbling blocks to this approach was that the standard forEach() 
 * does not allow you to modify the underlying list you are iterating over.
 * It took a bit of research, but if you use the Iterator you can get the 
 * desired result, and here it is.
 */


public class ExcludeForEachRunner {
    
    public static void main(String[] args) {
        ExcludeForEach forEach = new ExcludeForEach();
        
        List<Firework> fireworks = new ArrayList<>();
        List<Accident> accidents = new ArrayList<>();
        
        fireworks.add(new Firework(false, "Red stars"));
        fireworks.add(new Firework(false, "Green hearts"));
        fireworks.add(new Firework(true, "Purple baloons"));
        
        System.out.println("before fw:" + fireworks.size() + " ac:" + accidents.size());
        
        forEach.onEach(fireworks, accidents, (fw) -> { fw.playWith(); });
        
        System.out.println("after fw:" + fireworks.size() + " ac:" + accidents.size());
        System.out.println("fireworks:" + fireworks.stream().map(fw -> fw.getSparkle()).collect(Collectors.toList()));
        System.out.println("accidents:" + accidents.stream().map(ac -> ac.getCause().getSparkle()).collect(Collectors.toList()));        
    }
}
