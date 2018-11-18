public class SimpleTextProvider implements TextProvider {
    private String text;

    public SimpleTextProvider(String text) { //Конструктор
        this.text = text;
    }

    //@Override
    public String getText() {
        return text;
    }

}