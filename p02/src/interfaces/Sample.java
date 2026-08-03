package interfaces;


    interface Nsam{
        void cse_dept();
        void com_dept();
    }
    class Students implements Nsam{
        @Override
        public void cse_dept() {
            System.out.println("Students from cse dept");
        }

        @Override
        public void com_dept() {
            System.out.println("students from com dept");
        }

    }
public class Sample {

}
