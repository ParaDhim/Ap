//package com.concretepage;
//import java.util.TreeSet.*;
//import java.util.TreeSet;
//import java.util.*;
//import java.util.concurrent.ConcurrentSkipListSet;
//
//class thread1 extends Thread {
//    TreeSet<Long> csls1;
//    ArrayList<Long> arr1;
//    int start1;
//    int stop1;
//
//    public thread1(TreeSet<Long> csls1, ArrayList<Long>arr1, int start1, int stop1) {
//        this.arr1 = arr1;
//        this.csls1 = csls1;
//        this.start1 =start1;
//        this.stop1 =stop1;
//    }
//    @Override
//    public void run() {
//        for (int i = start1; i < stop1; i++) {
//            csls1.add(arr1.get(i));
//        }
//    }
//}
//class thread2 extends Thread {
//    TreeSet<Long> csls2;
//    ArrayList<Long> arr2;
//    int start2;
//    int stop2;
//
//    public thread2(TreeSet<Long> csls2, ArrayList<Long>arr2, int start2, int stop2) {
//        this.arr2 = arr2;
//        this.csls2 = csls2;
//        this.start2 =start2;
//        this.stop2 =stop2;
//    }
//    @Override
//    public void run() {
//        for (int i = start2; i < stop2; i++) {
//            csls2.add(arr2.get(i));
//        }
//        //adds specified element in the set
////            Iterator<Integer> it = csls.iterator();
//    }
//}
//
//class thread3 extends Thread {
//    TreeSet<Long> csls3;
//    ArrayList<Long> arr3;
//    int start3;
//    int stop3;
//
//    public thread3(TreeSet<Long> csls3, ArrayList<Long>arr3, int start3, int stop3) {
//        this.arr3 = arr3;
//        this.csls3 = csls3;
//        this.start3 =start3;
//        this.stop3 =stop3;
//    }
//    @Override
//    public void run() {
//        for (int i = start3; i < stop3; i++) {
//            csls3.add(arr3.get(i));
//        }
//        //adds specified element in the set
////            Iterator<Integer> it = csls.iterator();
//    }
//}
//
////    class thread3 implements Runnable {
////        @Override
////        public void run() {
////
////        }
////    }
//
//class thread4 extends Thread {
//    TreeSet<Long> csls4;
//    ArrayList<Long> arr4;
//    int start4;
//    int stop4;
//
//    public thread4(TreeSet<Long> csls4, ArrayList<Long>arr4, int start4, int stop4) {
//        this.arr4 = arr4;
//        this.csls4 = csls4;
//        this.start4 =start4;
//        this.stop4 =stop4;
//    }
//    @Override
//    public void run() {
//        for (int i = start4; i < stop4; i++) {
//            csls4.add(arr4.get(i));
//        }
//        //adds specified element in the set
////            Iterator<Integer> it = csls.iterator();
//    }
//}
//public class ConcurrentSkipListSetTest {
//    //    ConcurrentSkipListSet<Integer> csls= new ConcurrentSkipListSet<Integer>();
//
////    TreeSet<Integer> csls = new TreeSet<Integer>();
////    csls.
//
//
//    public void main(String[] args) throws InterruptedException {
//        ConcurrentSkipListSetTest ob = new ConcurrentSkipListSetTest();
//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        arr.add(10);
//        arr.add(1000);
//        arr.add(1000000);
//
//        ArrayList<Long> arr1 = new ArrayList<Long>();
//        ArrayList<Long> arr2 = new ArrayList<Long>();
//        ArrayList<Long> arr3 = new ArrayList<Long>();
//        Random random = new Random();
//
//        for (int i = 0; i < arr.get(0); i++) {
//            long number = random.nextLong(1000000000 + 1000000000) - 1000000000;
////            arr1.add((long) ((Math.random() * (1000000000 + 1000000000)) - 1000000000));
//        }
//        for (int i = 0; i < arr.get(1); i++) {
//            long number = random.nextLong(1000000000 + 1000000000) - 1000000000;
////            arr1.add((long) ((Math.random() * (1000000000 + 1000000000)) - 1000000000));
//        }
//        for (int i = 0; i < arr.get(2); i++) {
//            long number = random.nextLong(1000000000 + 1000000000) - 1000000000;
////            arr1.add((long) ((Math.random() * (1000000000 + 1000000000)) - 1000000000));
//        }
//
//        System.out.println("Using 2 threads:-");
//        TreeSet<Long> csls11 = new TreeSet<Long>();
//        thread1 t11 = new thread1(csls11,arr1,0,(arr1.size()/2));
//        thread2 t12 = new thread2(csls11,arr1,(arr1.size()/2),arr1.size());
//        t11.start();
//        t12.start();
//        t11.join();
//        t12.join();
//
//        TreeSet<Long> csls21 = new TreeSet<Long>();
//        thread1 t21 = new thread1(csls21,arr2,0,(arr2.size()/2));
//        thread2 t22 = new thread2(csls21,arr2,(arr2.size()/2),arr2.size());
//        t21.start();
//        t22.start();
//        t21.join();
//        t22.join();
//
//        TreeSet<Long> csls31 = new TreeSet<Long>();
//        thread1 t31 = new thread1(csls31,arr3,0,(arr3.size()/2));
//        thread2 t32 = new thread2(csls31,arr3,(arr3.size()/2),arr3.size());
//        t31.start();
//        t32.start();
//        t31.join();
//        t32.join();
//
//
//        Iterator it = csls11.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
////        System.out.println("Using 4 threads:-");
////        TreeSet<Long> csls14 = new TreeSet<Long>();
////        TreeSet<Long> csls24 = new TreeSet<Long>();
////        TreeSet<Long> csls34 = new TreeSet<Long>();
//
////        new Thread(ob.new thread1()).start();
////        new Thread(ob.new thread2()).start();
//    }
//}