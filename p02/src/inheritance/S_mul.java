package inheritance;

interface cse_dept{
    void cse_details();
}
interface com_dept{
    void com_details();
}

class Nsam1 implements cse_dept,com_dept{

    @Override
    public void com_details() {
        System.out.println("from com interface");
    }

    @Override
    public void cse_details() {
        System.out.println("from cse interface");
    }
}
public class S_mul {
    public static void main(String[] args) {
        Nsam1 n=new Nsam1();
        n.com_details();
        n.cse_details();
    }
}
