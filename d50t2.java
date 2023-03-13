//Josephus problem


class Solution
{
   static class Node{
       int data;
       Node next;
       Node(int d){
           data = d;
       }
   }
   public int josephus(int n, int k)
    {
        if ( k == 1 ) return n;
        Node head = new Node(1);
        Node temp = head;
        for ( int i = 2; i <= n; ++i ){
            temp.next = new Node(i);
            temp = temp.next;
        }
        temp.next = head;
        Node ptr1 = head, ptr2 = head;
        while ( ptr1.next != ptr1 ){
            int c = 1;
            while ( c != k ){
                ptr2 = ptr1;
                ptr1 = ptr1.next;
                c++;
            }
            ptr2.next = ptr1.next;
            ptr1 = ptr2.next;
        }
        return ptr1.data;
    }

}
/*
Time Complexity:  O(n) Linear time
Space Complexity: O(n) To store the value
*/