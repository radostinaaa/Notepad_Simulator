package Notepad;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{
    private boolean isStarted;
    public ElectronicSecuredNotepad(String name, int numberPages, String password) throws Exception {
        super(name, numberPages, password);
        this.isStarted = false;
    }

    @Override
    public void start() {
        this.isStarted = true;
    }

    @Override
    public void stop() {
        this.isStarted = false;

    }

    @Override
    public boolean isStarted() {
        return this.isStarted;
    }

    @Override
    public void addPage(Page page) {
        if(this.isStarted){
        super.addPage(page);
        }else {
            System.out.println("Not started!");
        }
    }

    @Override
    public void deleteText(int pageNumber) {
        if(this.isStarted){
            super.deleteText(pageNumber);
        }else {
            System.out.println("Not started!");
        }
    }

    @Override
    public void showPage() {
        if(this.isStarted){
            super.showPage();
        }else {
            System.out.println("Not started!");
        }
    }

    @Override
    public void printAllPagesWithDigits() {
        if(this.isStarted){
            super.printAllPagesWithDigits();
        }
        else {
        System.out.println("Not started!");
        }
    }
}
