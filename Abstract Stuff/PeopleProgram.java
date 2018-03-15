
/**
 * Write a description of class PeopleProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PeopleProgram
{
    // instance variables - replace the example below with your own
    public static void main(){
        //System.out.println("PeopleSimulator");
        Person a = new Teacher("Charon");
        a.setName("Janice");
        Person b = new ConstructionWorker("Mickey");

        System.out.println(a);
        System.out.println(b);
    }

}
