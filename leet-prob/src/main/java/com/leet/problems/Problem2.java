package com.leet.problems;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Problem2 {
    public static ListNode getList(int[] arr) {
        ListNode last = null;
        for(int i=arr.length-1;i>=0;i--) {
            ListNode cur = null;
            if(last == null) {
                cur = new ListNode(arr[i]);
            } else
                cur = new ListNode(arr[i], last);
            last = cur;
        }
        return last;
    }

    public static void main(String[] args) {
//        ListNode res = new Test().addTwoNumbers(getList(new int[]{2, 4, 3}), getList(new int[]{5, 6, 4}));
//        ListNode res = new Test().addTwoNumbers(getList(new int[]{9,9,9,9,9,9,9}), getList(new int[]{9,9,9,9}));
        ListNode res = new Problem2().addTwoNumbersSelf(getList(new int[]{9,9,9,9,9,9,9}), getList(new int[]{9,9,9,9}));
        System.out.println();
        while(res != null) {
            System.out.print(res.val+" ");
            res = res.next;
        }
        System.out.println("\n8,9,9,9,0,0,0,1");
    }

    public ListNode addTwoNumbersSelf(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode currentPos = result;
        boolean isStart = true;
        while (l1 != null || l2 != null) {
            if(!isStart) {
                if(null == currentPos.next)
                    currentPos.next = new ListNode();
                currentPos = currentPos.next;
            } else
                isStart=false;
            if (l1 != null && l2 != null) {
                int carry = (currentPos.val + l1.val + l2.val) / 10;
                currentPos.val = (currentPos.val + l1.val + l2.val) % 10;
                if (carry > 0) {
                    currentPos.next = new ListNode();
                    currentPos.next.val = carry;
                }
            } else if (l1 == null & l2 != null) {
                int carry = ((currentPos.val + l2.val) / 10);
                currentPos.val = (currentPos.val + l2.val) % 10;
                if (carry > 0) {
                    currentPos.next = new ListNode();
                    currentPos.next.val = carry;
                }
            } else if (l1 != null & l2 == null) {
                int carry = ((currentPos.val + l1.val) / 10);
                currentPos.val = (currentPos.val + l1.val) % 10;
                if (carry > 0) {
                    currentPos.next = new ListNode();
                    currentPos.next.val = carry;
                }
            }

            l1 = l1!=null && l1.next!=null?l1.next:null;
            l2 = l2!=null && l2.next!=null?l2.next:null;
        }
        return result;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

}
