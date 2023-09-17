public class trmpo {
    public static int getDecimalValue(ListNode head) {
        String str = "";
        while (head.next != null) {
            str = str + head.val;
            head = head.next;
        }

        return Integer.parseInt(str, 2);
    }

    public static void main(String[] args) {
        String temp = "";
        temp = temp+2;
        temp = temp+3;
        System.out.println(temp);
        System.out.println(Integer.parseInt(temp,2));
    }
}
