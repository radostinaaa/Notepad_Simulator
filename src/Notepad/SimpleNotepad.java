package Notepad;

public class SimpleNotepad implements INotepad {
    private String name;
    private int numberPages;
    private Page[] pages;
    private int currentIndex = 0;

    public SimpleNotepad(String name, int numberPages) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        }else {
            this.name = "Notepad";
        }
        setNumberPages(numberPages);
        this.pages = new Page [numberPages];

    }

    public void setNumberPages(int numberPages) {
        if(numberPages > 0) {
            this.numberPages = numberPages;
        }
    }

    public void addPage (Page page){
        if (this.currentIndex < this.numberPages){
            this.pages[this.currentIndex++] = page;
        }
    }

    @Override
    public void addTextInAPage(String text, int pageNumber) {
        if (pageNumber <this.pages.length){
            if (pages[pageNumber]!= null){
                pages[pageNumber].addText(text);
            }
        }
    }

    @Override
    public void deleteText(int pageNumber) {
        if (pageNumber < pages.length){
            if (pages[pageNumber]!= null){
                pages[pageNumber].removeText();
            }
        }
    }

    @Override
    public void showPage() {
        for (int i = 0; i < pages.length; i++) {
            if (pages[i] != null) {
                System.out.println(pages[i].toString());

            }
        }
    }

    @Override
    public void searchWord(String word) {
        for (int i = 0; i < pages.length; i++) {
            if (pages[i] != null){
                if (pages[i].searchWord(word)){
                    System.out.println("The word"+ word + "is contained on "+ i);
                }
            }
        }
    }

    @Override
    public void printAllPagesWithDigits() {
        for (int i = 0; i < pages.length; i++) {
            if (pages[i]!=null){
                if(pages[i].containsDigits()){
                    System.out.println(pages[i].toString());
                }
            }

        }
    }
}
