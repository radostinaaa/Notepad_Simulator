package Notepad;


import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
    private String password;

    public SecuredNotepad(String name, int numberPages,String password) throws Exception{
        super(name, numberPages);
        if (password.length()>= 6){
            int uppers = 0;
            int lowers = 0;
            int digits = 0;
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if(Character.isDigit(c)){
                    digits ++;
                    continue;
                }
                if (Character.isLowerCase(c)){
                    lowers ++;
                    continue;
                }
                if (Character.isUpperCase(c)){
                    uppers ++;
                }
            }
            if (lowers >=1 && uppers >= 1 && digits >= 1){
                this.password = password;
            }
            else{
                throw new Exception("Weak password,try again!"); // public class Exception (cause );
            }
        }else{
            throw new Exception("Weak password, try again!");
        }
    }
    public boolean passwordChecker (){
        boolean truePassword = false;
        int numberOfTries = 3;
        while (numberOfTries >0){
            System.out.println("Enter password :");
            Scanner sc = new Scanner (System.in);
            String password_check = sc.nextLine();
            if (password_check.equals(this.password)){
                truePassword = true;
                break;
            }else{
                System.out.println("Wrong password ,  try again :");
            }
            numberOfTries--;
        }
        return truePassword;
    }
    @Override
    public void addPage(Page page) {
        if (passwordChecker()){
        super.addPage(page);
        }
    }

    @Override
    public void addTextInAPage(String text, int pageNumber) {
        if (passwordChecker()) {
            super.addTextInAPage(text, pageNumber);
        }
    }

    @Override
    public void deleteText(int pageNumber) {
        if (passwordChecker()) {
            super.deleteText(pageNumber);
        }
    }

    @Override
    public void showPage() {
        if (passwordChecker()) {
            super.showPage();
        }
    }
}
