
// student_firstname_surname :Arjun Thapa STUDENT_ID:21524045 Programming Coursework
// Task 4

import java.util.*;

public class Election {

    public static void main(String[] args) {

        System.out.println("#######################################");
        System.out.println("# Enter the votes, one vote per line. #");
        System.out.println("# End with either -1 or an empty line.#");
        System.out.println("#######################################");
        System.out.println();

        ArrayList<String> names = new ArrayList<String>();

        ArrayList<Integer> count = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);

        String candidate = s.nextLine();


         while(candidate.length() != 0){
             if (names.contains(candidate)) {
                 int i = names.indexOf(candidate);
                 Integer j = count.get(i);
                 count.set(i,j+1);

             }
             if (candidate.equals("-1")){
                break;
             }
             else {
                 names.add(candidate);
                 count.add(1);
             }
             candidate = s.nextLine();
         }

        ArrayList<String> Candidate = new ArrayList<String>();
        for (String name : names) {
            if (!Candidate.contains(name)) {
                Candidate.add(name);
            }
        }
        for (int t = 0; t < Candidate.size(); t++) {
            System.out.println(Candidate.get(t) + " recieved " + (count.get(t) + " vote. "));
        }

        System.out.println("----------------------------------------------------");
        String s1 = "The Winner is " + Collections.max(names) + " with " + Collections.max(count) + " votes";
        System.out.print(s1);

    }
  
}

