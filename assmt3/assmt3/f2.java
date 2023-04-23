//import java.util.ArrayList;
//import java.util.Scanner.*;
//
//// need to contruct three classes 2 of which will be thread and the rest ones would be insertion and making it in inorder
//
//class Node extends Thread {
//    long data;
//    int rcount;
//    int lcount;
//    ArrayList<Long> arrayInt;
//
//    Node ldata;
//    Node rdata;
//
//    Node(long data) {
//        this.data = data;
//        this.ldata = this.rdata = null;
//    }
//
//    static void inorder(Node root) {
//        if (root != null) {
//            inorder(root.ldata);
//            System.out.println(root.data + " ");
//            inorder(root.rdata);
//        }
//    }
//
//    static boolean isPBT(int count) {
//        count += 1;
//        while (count % 2 == 0) {
//            count = count / 2;
//        }
//        if (count == 1) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
////    public Node insert(Node root, Long data) {
////        if (root == null) {
////            Node n = new Node(data);
////            return n;
////        }
////
////        if (root.rcount == root.lcount) {
////            root.ldata = insert(root.ldata, data);
////            root.lcount += 1;
////        } else if (root.rcount < root.lcount) {
////            if (isPBT(root.lcount)) {
////                root.rdata = insert(root.rdata, data);
////                root.rcount += 1;
////            }
////            else {
////                root.ldata = insert(root.ldata, data);
////                root.lcount += 1;
////            }
////        }
////        return root;
////    }
//
////    public void insert() {
////    }
//
//
//    public Node insert(Node root, Long data) {
//
//        if (root == null) {
//            return new Node(data);
//        }
//
//        if (data < root.data) {
//            root.ldata = insert(root.ldata, data);
//        } else if (data > root.data) {
//            root.rdata = insert(root.rdata, data);
//        } else {
//            // value already exists
//            return root;
//        }
//
//        return root;
//    }
//}
//
//
//class threadInsert1 extends Thread {
//    Node n;
//    ArrayList<Long> arr;
//    long size;
//
//    threadInsert1(Node n1,ArrayList<Long> arr,long size) {
//        this.arr = arr;
//        this.n = n1;
//        this.size = size;
//
//    }
//    @Override
//
//    public void run() {
//        for (int i = 0; i <size; i++) {
//            Node n1 = n.insert(n,arr.get(i));
//            n = n1;
//        }
//    }
//}
//
//class threadInsert2 extends Thread {
//    Node n;
//    ArrayList<Long> arr;
//    long size;
//
//    threadInsert2(Node n1,ArrayList<Long> arr,long size) {
//        this.arr = arr;
//        this.n = n1;
//        this.size = size;
//
//    }
//    @Override
//
//    public void run() {
//        for (int i = 0; i <size; i++) {
//            Node n1 = n.insert(n,arr.get(i));
//            n = n1;
//        }
//    }
//}
//
//public class f2 {
//    public static void main(String[] args) {
//        ArrayList<Long> arrInputNode= new ArrayList<Long>();
//        arrInputNode.add(10L);
//        arrInputNode.add(1000L);
//        arrInputNode.add(1000000L);
//        long leftLimit = -1000000000L;
//        long rightLimit = 1000000000L;
//
//        ArrayList<Long> a1 = new ArrayList<Long>();
//        ArrayList<Long> a2 = new ArrayList<Long>();
//        ArrayList<Long> a3 = new ArrayList<Long>();
//
//        for (int i = 0; i < arrInputNode.get(0); i++) {
//            long generatedLong1 = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
//            a1.add(generatedLong1);
//        }
//
//        for (int i = 0; i < arrInputNode.get(1); i++) {
//            long generatedLong2 = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
//            a2.add(generatedLong2);
//        }
//
//        for (int i = 0; i < arrInputNode.get(2); i++) {
//            long generatedLong3 = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
//            a3.add(generatedLong3);
//        }
//
////        Math.floor(Math.random()*(max-min+1)+min);
//        int size = 7;
//        Node root = null;
//
//    }
//}
