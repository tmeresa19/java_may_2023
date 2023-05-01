import java.util.Date;
import java.util.ArrayList;
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

    public int totalMessages(int[] intArr){
        int output = 0;
        for(int i = 0; i< intArr.length ; i++){
            output += intArr[i];
        }
        return output;
    }

    public void printMessages(String[] msgArr){
        for(String message : msgArr){
            System.out.println(message);
        }
    }

    public void printMessages(ArrayList<String> msgArr){
        // for(int i = 0; i< msgArr.size() ; i++){
        //     System.out.println(msgArr.get(i)) ;
        // }

        for(String message : msgArr){
            System.out.println(message);
        }
    }

}