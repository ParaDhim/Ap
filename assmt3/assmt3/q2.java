//import java.util.ArrayList;
//import java.util.Scanner.*;
//
//// need to contruct three classes 2 of which will be thread and the rest ones would be insertion and making it in inorder
//
//class Node extends Thread{
//    int data;
//    int rcount;
//    int lcount;
//    ArrayList<Integer> arrayInt;
//
//    Node ldata;
//    Node rdata;
////    Node root;
//
////    Node(ArrayList<Integer> arr) {
//////        this.data = Integer.parseInt(null);
//////        this.arrayInt = arr;
////        this.ldata = this.rdata = null;
////    }
//
//    Node(int data) {
//        this.data = data;
//        this.ldata = this.rdata = null;
//    }
//
////    Node() {
////        this.data = null;
////        this.ldata = this.rdata = null;
////    }
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
//        }else {
//            return false;
//        }
//    }
//
//    static Node insert(Node root, int data) {
//        if (root == null) {
//            Node n = new Node(data);
//            return n;
//        }
//
//        if (root.rcount == root.lcount) {
//            root.ldata = insert(root.ldata, data);
//            root.lcount += 1;
//        } else if (root.rcount < root.lcount) {
//            if (isPBT(root.lcount)) {
//                root.rdata = insert(root.rdata, data);
//                root.rcount += 1;
//            }
//            else {
//                root.ldata = insert(root.ldata, data);
//                root.lcount += 1;
//            }
//        }
//        return root;
//    }
////
////    @Override
////    public void run() {
////        this.data = arrayInt.get(0);
////        for (int i = 1; i < arrayInt.size(); i++) {
////            insert(this,arrayInt.get(i));
////        }
////    }
//}
//
//
//class threadInsert extends Thread {
//    Node n;
//    ArrayList<Integer> arr = new ArrayList<Integer>();
//    @Override
//    public void run(){
//
//    }
//}
//
//public class q2 {
//    public static void main(String[] args) {
//        ArrayList<Integer> arrInputNode= new ArrayList<Integer>();
//        arrInputNode.add(10);
//        arrInputNode.add(1000);
//        arrInputNode.add(1000000);
////        {10,1000,1000000}
//        long leftLimit = -1000000000;
//        long rightLimit = 1000000000;
////        Node n1 = new Node();
////        Node n2 = new Node();
////        Node n3 = new Node();
//
//        for (int i = 0; i < arrInputNode.get(0); i++) {
//            long generatedLong = leftLimit + (long) (Math.random() * (rightLimit - leftLimit));
//
//        }
//
////        Math.floor(Math.random()*(max-min+1)+min);
//        int size = 7;
//        Node root = null;
//
//        for (int i = 0; i < size; i++) {
//            int[] arr = new int[0];
//            root = root.insert(root,arr[i]);
//        }
//        root.inorder(root);
//    }
//}
