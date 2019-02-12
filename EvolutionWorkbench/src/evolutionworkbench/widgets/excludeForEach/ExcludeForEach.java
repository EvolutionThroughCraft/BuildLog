/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolutionworkbench.widgets.excludeForEach;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author dwin
 */
public class ExcludeForEach {
    
    public interface DangerousBusiness {
        public void handle(Firework firework) throws Exception;
    }
    
    public void onEach(List<Firework> fireworks, List<Accident> accidents, DangerousBusiness handler) {
        
        Iterator<Firework> iterator = fireworks.iterator();
        
        while (iterator.hasNext()) {
            Firework firework = iterator.next();
            
            try {
                handler.handle(firework);
            } catch (Exception e) {
                accidents.add(new Accident(firework, e));
                iterator.remove();
            }
        }
    }
}
