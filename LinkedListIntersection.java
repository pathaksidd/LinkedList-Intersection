import java.util.LinkedList;

/**
 *
 * @author Siddharth D. Pathak
 */

public class LinkedListIntersection {

    public static void main(String[] args) throws IOException {
            ListIntersection();

    }


    public static void ListIntersection() {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        int diff = 0;
        
        l1.add('A');
        l1.add('B');
        l1.add('C');
        l1.add('D');
        l1.add('E');
        l1.add('F');
        l1.add('K');
        l1.add('M');
        l1.add('N');

        l2.add('X');
        l2.add('Y');
        l2.add('K');
        l2.add('M');
        l2.add('N');

        if (l1.size() > l2.size()) {
            diff = l1.size() - l2.size();
            Intersect(diff, l1, l2);
        } else {
            diff = l2.size() - l1.size();
            Intersect(diff, l2, l1);
        }
    }

    public static void Intersect(int diff, LinkedList l1, LinkedList l2) {
        int it = diff;
        int flag = 0;

        for (int i = it; i < l1.size(); i++) {

            if (l1.get(i) != l2.get(i - diff)) {
                if (flag == 1) {
                    flag = 0;
                    break;
                }
                else {}
            } else {
                flag = 1;
            }
        }
        
        if(flag==1)
            System.out.println("intersecting");
        else
            System.out.println("not intersecting");

    }
