package branching;

public class SwitchChar {
    public static void main(String[] args) {
        char score='D';
        switch(score){
            case 'A':
                System.out.println("Student : \"Thank you, all of my hardwork was worth it\"");
                System.out.println("Teacher : \"Congrats,fam\"");
                break;
            case 'B':
                System.out.println("Student : \"WHY I DON'T GET A,SIR?!\"");
                System.out.println("Teacher : \"Chill, i just like that letter\"");
                break;
            case 'C':
                System.out.println("Student : \"Sir, why my score is C!?\"");
                System.out.println("Teacher : \"That's because i don't C you in classroom\"");
                break;
            default:
                System.out.println("Student : \"Sir, i want to protest... i was never absence from class & always do your assignment\"");
                System.out.println("Teacher : \"*Checking files\"");
                System.out.println("Student : \"*Running~\"");
                System.out.println("Teacher : \"WHY ARE YOU RUNNING? *draws axe \"");
                break;
        }
    }
}
