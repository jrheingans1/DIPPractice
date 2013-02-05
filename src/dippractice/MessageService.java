package dippractice;

public class MessageService {
    private InputStrategy in;
    private OutputStrategy out;
    
    public MessageService(OutputStrategy out, InputStrategy in){
        this.out = out;
        this.in = in;
    }
    
    public void outputMessage(){
        String input = in.getMessage();
        out.outputMessage(input);
    }
    
}
