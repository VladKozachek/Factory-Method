public class Main {
    public static void main(String[] args) {
        Factory factory=new Factory();
        IMobilePhone phone1=factory.create("Nokia");
        phone1.getName();
        IMobilePhone phone2=factory.create("Samsung");
        phone2.getName();
    }
}
