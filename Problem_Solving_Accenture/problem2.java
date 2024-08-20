package Problem_Solving_Accenture;
import java.util.ArrayList;
import java.util.Collections;

public class problem2 {
    public static void main(String[] args){
        int[] entry={7,0,5,1,3};
        int[] exit={1,2,1,3,4};
        int T=5;
        ArrayList<Integer> arrr=new ArrayList<>();
        int guest=0;
        for(int i=0;i<entry.length;i++){
          int dif=(guest+entry[i])-exit[i];
          arrr.add(dif);
          guest=dif;
        }

        System.out.println("guest:"+ Collections.max(arrr));

    }
}


//## Problem Statement
//
//A party has been organized on a cruise. The party is organized for a limited time (T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array. The task is to find the maximum number of guests present on the cruise at any given instance within T hours.
//
//### Example 1:
//
//        #### Input:
//
//        - **5** → Value of T
//- **[7, 0, 5, 1, 3]** → E[], Elements of E to E[N-1], where each element is separated by a new line.
//- **[1, 2, 1, 3, 4]** → L[], Elements of L to L[N-1], where each element is separated by a new line.
//
//#### Output:
//
//        **8** → Maximum number of guests on the cruise at any instance.
//
//        #### Explanation:
//
//        **1st hour:**
//
//        - Entry: 7
//        - Exit: 1
//        - No. of guests on the ship: 7 - 1 = 6
//
//        **2nd hour:**
//
//        - Entry: 0
//        - Exit: 2
//        - No. of guests on the ship: 6 - 2 = 4
//
//        **3rd hour:**
//
//        - Entry: 5
//        - Exit: 1
//        - No. of guests on the ship: 4 + 5 - 1 = 8
//
//        **4th hour:**
//
//        - Entry: 1
//        - Exit: 3
//        - No. of guests on the ship: 8 + 1 - 3 = 6
//
//        **5th hour:**
//
//        - Entry: 3
//        - Exit: 4
//        - No. of guests on the ship: 6 + 3 - 4 = 5
//
//Hence, the maximum number of guests within 5 hours is **8**.
//
//        ---
//
//        ### Example 2:
//
//        #### Input:
//
//        - **4** → Value of T
//- **[3, 5, 2, 0]** → E[], Elements of E to E[N-1], where each element is separated by a new line.
//- **[0, 2, 4, 4]** → L[], Elements of L to L[N-1], where each element is separated by a new line.
//
//#### Output:
//
//        **6** → Maximum number of guests on the cruise at any instance.
//
//        #### Explanation:
//
//        **1st hour:**
//
//        - Entry: 3
//        - Exit: 0
//        - No. of guests on the ship: 3
//
//        **2nd hour:**
//
//        - Entry: 5
//        - Exit: 2
//        - No. of guests on the ship: 3 + 5 - 2 = 6
//
//        **3rd hour:**
//
//        - Entry: 2
//        - Exit: 4
//        - No. of guests on the ship: 6 + 2 - 4 = 4
//
//        **4th hour:**
//
//        - Entry: 0
//        - Exit: 4
//        - No. of guests on the ship: 4 + 0 - 4 = 0
//
//Hence, the maximum number of guests within 4 hours is **6**.
//
//        ---
//
//Feel free to ask if you need further assistance or modifications!