import java.util.Arrays;
import java.util.ArrayList;
public class Test{
    public static void main(String[] args){
        VoiceMessageUtil voiceMessage = new VoiceMessageUtil();
        System.out.println(voiceMessage.greeting());
        System.out.println(voiceMessage.greeting("Draven"));
        System.out.println(voiceMessage.greeting(10));
        System.out.println(voiceMessage.getCurrentDate());

        // fixed Array
        int[] messagesPerDay = new int[5];
        messagesPerDay[0] = 5;
        messagesPerDay[1] = 5;
        messagesPerDay[2] = 5;

        int[] messagesPerDay1 = {5,4,6};

        String[] messages = new String[5];
        messages[0] = "String1";
        messages[1] = "String2";
        messages[2] = "String3";


        System.out.println(voiceMessage.totalMessages(messagesPerDay1));
        voiceMessage.printMessages(messages);
        System.out.println(Arrays.toString(messages));


        ArrayList<String> todoList = new ArrayList<String>();
        todoList.add("Finish Alfred Bot");
        todoList.add("Finish Cafe bussiness logic");
        todoList.add("Read ahead for oop");

        voiceMessage.printMessages(todoList);


        // type casting
        int days = 1;
        double cost = 1000.99;

        double totalCost = days * cost; //day: => double (no loss of data so java will implicitly convert int to double)
        System.out.println(totalCost);

        int roundedTotalCost = days * cost ;

        System.out.println(roundedTotalCost);


    }
}