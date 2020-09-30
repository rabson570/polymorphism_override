class football_players {
    public void activity() {
        System.out.println("run");
    }
}
class ramos extends football_players{
    @Override
    public void activity() {
        System.out.println("ramos defending");
    }
}
class cr7 extends football_players{
    @Override
    public void activity() {
        System.out.println("cr7 striking");
    }
}
public class main {
    public static void main(String[] args) {
        ramos B = new ramos();
        B.activity();
        cr7 C = new cr7();
        C.activity();
    }
}
