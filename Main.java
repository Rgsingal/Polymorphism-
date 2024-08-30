//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
          house hn = new house();
        //  hn.houseno();
          house child = new streets();
          streets st = new streets();
          child.houseno();
          st.street();
        }
}

class house{
    public void houseno(){
        System.out.println("all the houses are big");

    }
}
class streets extends house{
    public void houseno(){
        System.out.println("In ridge st all the houses are big");
    }
    public void street(){
        System.out.println("All the street numbers are in sequence");
    }

}