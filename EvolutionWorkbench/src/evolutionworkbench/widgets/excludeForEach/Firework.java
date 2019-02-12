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
public class Firework {
    
    private final boolean explode;
    private final String sparkle;
    
    public Firework(boolean boom, String color) {
        this.explode = boom;
        this.sparkle = color;
    }
    
    public void playWith() throws Exception {
        if(explode) {
            throw new Exception(sparkle);
        }
    }
    
    public String getSparkle() {
        return this.sparkle;
    }
    
}
