/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evolutionworkbench.widgets.excludeForEach;

/**
 *
 * @author dwin
 */
public class Accident {
    private final Firework cause;
    private final Exception outcome;
    
    public Accident(Firework firework, Exception explosion) {
        this.cause = firework;
        this.outcome = explosion;
    }

    public Firework getCause() {
        return cause;
    }

    public Exception getOutcome() {
        return outcome;
    }
    
    
}
