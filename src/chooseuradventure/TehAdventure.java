/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chooseuradventure;

/**
 *
 * @author Greg
 */
public class TehAdventure {
    
    private String mainText;
    private String buttonOne;
    private String buttonTwo;
    private String buttonThree;
    private int[] values = new int[4];
    

    public TehAdventure(){
        this.mainText="This is the start of a great and epic adventure.";
        this.buttonOne="Yes. You are right!";
        this.buttonTwo="We will see.";
        this.buttonThree="Whatever. Go fuck yourself.";
        this.values[0]=0;
        this.values[1]=1;
        this.values[2]=2;
    }
    
    public void enterAndUpdate(int choice){
        switch(choice){
            case 0:
                this.mainText="I am glad you are so eager!";
                this.buttonOne="Of course I am!";
                this.buttonTwo="I am for now.";
                this.buttonThree="Whatever. Go fuck yourself.";
                this.values[0]=3;
                this.values[1]=4;
                this.values[2]=5;
                break;
            case 1:
                this.mainText="Hmm. You seem a little reserved";
                this.buttonOne="I sure am!";
                this.buttonTwo="Maybe.";
                this.buttonThree="Whatever. Go fuck yourself.";
                this.values[0]=6;
                this.values[1]=7;
                this.values[2]=8;
                break;
            case 2:
                this.mainText="Wow. Where did you graduate from, dick school?";
                this.buttonOne="Yes. You are right!";
                this.buttonTwo="We will see.";
                this.buttonThree="Whatever. Go fuck yourself.";
                this.values[0]=9;
                this.values[1]=10;
                this.values[2]=11;
                break;
            default:
                this.mainText="Default switch condition.";
                this.buttonOne="Yes. You are right!";
                this.buttonTwo="We will see.";
                this.buttonThree="Whatever. Go fuck yourself.";
                this.values[0]=12;
                this.values[1]=13;
                this.values[2]=14;
                break;
        }
    }
    
    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getButtonOne() {
        return buttonOne;
    }

    public void setButtonOne(String buttonOne) {
        this.buttonOne = buttonOne;
    }

    public String getButtonTwo() {
        return buttonTwo;
    }

    public void setButtonTwo(String buttonTwo) {
        this.buttonTwo = buttonTwo;
    }

    public String getButtonThree() {
        return buttonThree;
    }

    public void setButtonThree(String buttonThree) {
        this.buttonThree = buttonThree;
    }

    public int[] getValues() {
        return values;
    }
    
    public int getSingleValue(int buttonNumber) {
        return values[buttonNumber];
    }

    public void setValues(int[] values) {
        this.values = values;
    }
    
    
    
    
}
