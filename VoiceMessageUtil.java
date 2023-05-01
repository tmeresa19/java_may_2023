import java.util.Date;
public class VoiceMessageUtil{

    public String greeting(){
        return "Hello you";
    }

    public String greeting(String name){
        return "Hello "+ name;
    }
    
    public String greeting(int count){
        return "hello " + count;
    }

    public String getCurrentDate(){
        return "hello todays date is: " + new Date();
    }

}