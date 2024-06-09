package bank;

clas Account{
    public String name;
    int age;
    protected String email;
    private String password;

    void setPassword(String password){
        this.password = password;
    }
}

public class Bank{
    public static void main(String[] args){
        Account a1 = new Account();
        a1.name = "Engineer Prabhakar";
        a1.email = "Prabhakarrajput86300@gmail.com";
        a1.setPassword("SkPrBoss@7586");
        System.out.println(a1.getPassword());
    }

}