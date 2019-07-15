/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigator;

/**
 *
 * @author makst
 */
public class Navigator {
    
    private Navigable navigable;
    private Marshrut marshrut;

    public Navigator(Navigable navigable, Marshrut marshrut) {
        this.navigable = navigable;
        this.marshrut = marshrut;
    }

    public Marshrut getMarshrut() {
        return marshrut;
    }

    public void setMarshrut(Marshrut marshrut) {
        this.marshrut = marshrut;
    }

    public Navigable getNavigable() {
        return navigable;
    }

    public void setNavigable(Navigable navigable) {
        this.navigable = navigable;
    }
    
    public void navigate(){
        
        double[] commands = marshrut.getCommands();
        int counter = marshrut.getCounter();
        
        for(int i =0;i<counter;i++){
            
            switch((int)commands[i]){
                
                case Navigable.STOP:
                    navigable.stop();
                break;
                
                case Navigable.TURN_LEFT:
                    navigable.turnLeft();
                break;
                
                case Navigable.TURN_RIGTH:
                    navigable.turnRight();
                break;
                
                case Navigable.TURN_ROUND:
                    navigable.turnRound();
                    break;
                    
                case Navigable.FORWARD:
                    navigable.go(commands[i+1]);
                    i=i+1;
                    break;
                    
                default: throw new RuntimeException("Marshrut is currupted");
            }
            
        }
        
    }
    
}
