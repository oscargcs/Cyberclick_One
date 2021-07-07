package CyberclickOne;

import java.util.ArrayList;

public class CyberclickList {

    public static void printCyberclickList() {
        
        ArrayList<Object> numbers = new ArrayList<Object>();

        for(int i=0; i<100;i++) {
            int n=i+1; //current number
            if (isMultiple(n, 3) && !isMultiple(n, 5)) {
                numbers.add(i, "cyber");
            }
            if (!isMultiple(n, 3) && isMultiple(n, 5)) {
                numbers.add(i, "click");
            }
            if (isMultiple(n, 3) && isMultiple(n, 5)) {
                numbers.add(i, "cyberclick");
            }
            if (!isMultiple(n, 3) && !isMultiple(n, 5)) {
                numbers.add(n);
            }
        
        }

        System.out.println(numbers);

    }

    private static boolean isMultiple(int n1, int n2) {
        if (n1 <= 0) {
            return false;
        }
        if (n1 % n2 == 0) {
            return true;
        } else {
            return false;
        }

    }

}
