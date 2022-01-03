package Notepad;

public class Page {

    private String title;
    private String text;
    private static int count = 1;

    public Page(String title, String text) {
        if(title != null && !title.isEmpty()){
        this.title = title;
        }
        else{
            this.title = "Page"+this.count;
            this.count++;

        }
        if (text.length() > 0){
            this.text = text;

        }

    }
    public void addText(String text){
        if (text.length()>0){
            if (this.text != null){ // ako ne e prazen stringa polzvai concatinaciq cuz + is slower
                this.text = this.text.concat(" "+ text);
            }else{
                this.text = text;
            }
        }
    }

    public void removeText (){
        this.text = "";
    }

    public boolean searchWord (String word){
        if (this.text.contains(word)){
            return true;
        }
        return false;
    }
    public boolean containsDigits(){
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Page{" +
                "" + title + '\n' +
                "" + text + '\n' +
                '}';
    }
}
