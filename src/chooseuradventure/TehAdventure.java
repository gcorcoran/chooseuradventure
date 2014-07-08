/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chooseuradventure;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Greg
 */
public class TehAdventure {
    
    private String mainText;
    private String buttonOne;
    private String buttonTwo;
    private String buttonThree;
    private String[] values = new String[3];
    private ArrayList<Map<Object, String>> intermediate=new ArrayList<>();

    
    public TehAdventure(){
        this.mainText="This is the start of a great and epic adventure.";
        this.buttonOne="Yes. You are right!";
        this.buttonTwo="We will see.";
        this.buttonThree="Whatever. Go fuck yourself.";
        this.values[0]="0";
        this.values[1]="1";
        this.values[2]="2";
    }
    
    public TehAdventure(ArrayList<Map<Object, String>> intermediate){
        this.intermediate = intermediate;
        this.enterAndUpdate(0);
    }
    
    public void enterAndUpdate(int SceneNumber){
        
        this.mainText = this.intermediate.get(SceneNumber).get("mainText");
        this.buttonOne = this.intermediate.get(SceneNumber).get("optionOne");
        this.buttonTwo= this.intermediate.get(SceneNumber).get("optionTwo");
        this.buttonThree=this.intermediate.get(SceneNumber).get("optionThree");
        this.values[0] = this.intermediate.get(SceneNumber).get("optionOneScene");
        this.values[1] = this.intermediate.get(SceneNumber).get("optionTwoScene");
        this.values[2] = this.intermediate.get(SceneNumber).get("optionThreeScene");
        
    }
    
    public void originalEnterAndUpdate(String choice){
        switch(choice){
            case "0":
                this.mainText="I am glad you are so eager!";
                this.buttonOne="Of course I am!";
                this.buttonTwo="I am for now.";
                this.buttonThree="Whatever. Go fuck yourself.";
                this.values[0]="3";
                this.values[1]="4";
                this.values[2]="5";
                break;
            case "1":
                this.mainText="Hmm. You seem a little reserved";
                this.buttonOne="I sure am!";
                this.buttonTwo="Maybe.";
                this.buttonThree="Whatever. Go fuck yourself.";
                this.values[0]="6";
                this.values[1]="7";
                this.values[2]="8";
                break;
            case "2":
                this.mainText="Wow. Where did you graduate from, dick school?";
                this.buttonOne="Yes. You are right!";
                this.buttonTwo="We will see.";
                this.buttonThree="Whatever. Go fuck yourself.";
                this.values[0]="9";
                this.values[1]="10";
                this.values[2]="11";
                break;
            default:
                this.mainText="Default switch condition.";
                this.buttonOne="Yes. You are right!";
                this.buttonTwo="We will see.";
                this.buttonThree="Whatever. Go fuck yourself.";
                this.values[0]="12";
                this.values[1]="13";
                this.values[2]="14";
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

    public String[] getValues() {
        return values;
    }
    
    public String getSingleValue(int buttonNumber) {
        return values[buttonNumber];
    }
    

    public void setValues(String[] values) {
        this.values = values;
    }
    
    
    
    
}
