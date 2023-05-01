public class Test{
    public static void main(String[] args){
        VoiceMessageUtil voiceMessage = new VoiceMessageUtil();
        System.out.println(voiceMessage.greeting());
        System.out.println(voiceMessage.greeting("Draven"));
        System.out.println(voiceMessage.greeting(10));
        System.out.println(voiceMessage.getCurrentDate());
    }
}