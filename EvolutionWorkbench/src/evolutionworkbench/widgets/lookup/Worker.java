/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolutionworkbench.widgets.lookup;

/**
 *
 * @author dwin
 */
public class Worker extends BaseComposible {
    
    /**
     * This class exposes its module getter + setter
     * This is filtering to only "jobs types", 
     * but could be a straight pass through
     */
    public Worker() {
        super();
    }
    
    public <J extends Job> void addJob(Class<J> klass, J obj) {
        injectModule(klass, obj);
    }
    
    public <J extends Job> J getJob(Class<J> klass) {
        return lookupModule(klass);
    }
}
