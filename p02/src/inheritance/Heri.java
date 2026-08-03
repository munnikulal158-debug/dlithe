package inheritance;

class Nitte{
    void details(){
        System.out.println("from Nitte");
    }
}
class Nsam extends Nitte{
    void nsam_Details(){
        System.out.println("degree college");
    }
}
class Nmamit extends Nitte{
    void nmamit_Details(){
        System.out.println("Engineering college");
    }
}
class Jks extends Nitte{
    void jks_Details(){
        System.out.println("MBA");
    }
}
public class Heri {
    public static void main(String[] args) {
        Jks j=new Jks();
        j.details();
        j.jks_Details();
        Nsam n=new Nsam();
        n.details();
        n.nsam_Details();
    }
}
