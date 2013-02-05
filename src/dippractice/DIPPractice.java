package dippractice;

public class DIPPractice {

    public static void main(String[] args) {
        InputStrategy in = new GuiInputStrategy();
        OutputStrategy out = new GuiOutputStrategy();
        MessageService service = new MessageService(out, in);
        service.outputMessage();
    }
}
