package Notepad;

public interface INotepad {

    //add text on a specific page
    void addTextInAPage(String text,int pageNumber);

    // add text on a specific page but delete included there before
    default void removeThenAddText(String text,int pageNumber){
        deleteText(pageNumber);
        addTextInAPage(text,pageNumber);
    }
    //delete text on a specific page
    void deleteText (int pageNumber);
    // read only function ( the title and the text inside)
    void showPage();
    //search word
    void searchWord(String word);

    void printAllPagesWithDigits();

}
