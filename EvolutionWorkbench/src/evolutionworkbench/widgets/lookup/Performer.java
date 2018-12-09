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
public class Performer extends BaseComposible implements Singer {

    /**
     * This class "hides" the modules by
     * - self-injecting the module
     * - implementing the module's interface + delegating calls "under the hood"
     */
    public Performer() {
        super();
        injectModule(Singer.class, new SingerImpl());
    }
    
    @Override
    public String sing() {
        return lookupModule(Singer.class).sing();
    }
}
