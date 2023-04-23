//import java.util.*;
//
//class normal {
//    private ArrayList<Float> arr;
//    private int index;
//    public normal(ArrayList<Float> arr,int index) {
//        this.arr = arr;
//        this.index = index;
//    }
//
//    public void checker(){
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
//            float temp = 0;
//            for (int i = 1; i <= index - 2; i = i + 2) {
//                if (arr.get(i) > arr.get(i + 1)) {
//                    temp = arr.get(i);
//                    arr.set(i, arr.get(i + 1));
//                    arr.set(i + 1, temp);
//                    isSorted = false;
////                    System.out.println(i);
////                    System.out.println("Hii");
//                }
//            }
//
//            for (int i = 0; i <= index - 2; i = i + 2) {
//                if (arr.get(i) > arr.get(i + 1)) {
//                    temp = arr.get(i);
//                    arr.set(i, arr.get(i + 1));
//                    arr.set(i + 1, temp);
//                    isSorted = false;
////                    System.out.println(i);
////                    System.out.println("Hii2");
//                }
//            }
//        }
////        System.out.println("yeh1");
//    }
//
//
//}
//class compareThread extends Thread {
//    private ArrayList<Float> arr;
//    private int index;
//
//    public compareThread(ArrayList<Float> arr,int index) {
//        this.arr = arr;
//        this.index = index;
//    }
//    @Override
//
//    public void run() {
//        //Checking the index  of the element
//
//        boolean isSorted = false;
//        while (!isSorted) {
//            isSorted = true;
//            float temp = 0;
//            for (int i = 1; i <= index - 2; i = i + 2) {
//                if (arr.get(i) > arr.get(i + 1)) {
//                    temp = arr.get(i);
//                    arr.set(i, arr.get(i + 1));
//                    arr.set(i + 1, temp);
//                    isSorted = false;
////                    System.out.println(i);
////                    System.out.println("Hii");
//                }
//            }
//
//            for (int i = 0; i <= index - 2; i = i + 2) {
//                if (arr.get(i) > arr.get(i + 1)) {
//                    temp = arr.get(i);
//                    arr.set(i, arr.get(i + 1));
//                    arr.set(i + 1, temp);
//                    isSorted = false;
////                    System.out.println(i);
////                    System.out.println("Hii2");
//                }
//            }
//        }
////        System.out.println("yeh");
//    }
//}
//
//public class q1 {
////    public int compare(ArrayList arr) {
////
////    }
//    //max number of threads n beingthe elements need to insert
////    public static int max_threads = (n+1)/2;
//    public static void main(String[] args) throws InterruptedException {
//        ArrayList<Integer> arr = new ArrayList<Integer>(7);
//        arr.add(1);
//        arr.add(10);
//        arr.add(100);
//        arr.add(1000);
//        arr.add(10000);
////        arr.add(100000);
////        arr.add(1000000);
//
//
//        ArrayList<Float> arr1 = new ArrayList<Float>(arr.get(0));
//        ArrayList<Float> arr2 = new ArrayList<Float>(arr.get(1));
//        ArrayList<Float> arr3 = new ArrayList<Float>(arr.get(2));
//        ArrayList<Float> arr4 = new ArrayList<Float>(arr.get(3));
//        ArrayList<Float> arr5 = new ArrayList<Float>(arr.get(4));
////        ArrayList<Float> arr6 = new ArrayList<Float>(arr.get(5));
////        ArrayList<Float> arr7 = new ArrayList<Float>(arr.get(6));
//
//        Random r = new Random();
//
//        for (int i = 0; i < arr.get(0); i++) {
//            arr1.add(r.nextFloat() * 10);
//        }
//        for (int i = 0; i < arr.get(1); i++) {
//            arr2.add(r.nextFloat() * 10);
//        }
//        for (int i = 0; i < arr.get(2); i++) {
//            arr3.add(r.nextFloat() * 10);
//        }
//        for (int i = 0; i < arr.get(3); i++) {
//            arr4.add(r.nextFloat() * 10);
//        }
//        for (int i = 0; i < arr.get(4); i++) {
//            arr5.add(r.nextFloat() * 10);
//        }
////        for (int i = 0; i < arr.get(5); i++) {
////            arr6.add(r.nextFloat() * 10);
////        }
////        for (int i = 0; i < arr.get(6); i++) {
////            arr7.add(r.nextFloat() * 10);
////        }
//
//
//        compareThread th1 = new compareThread(arr1,arr.get(0));
//        compareThread th2 = new compareThread(arr2,arr.get(1));
//        compareThread th3 = new compareThread(arr3,arr.get(2));
//        compareThread th4 = new compareThread(arr4,arr.get(3));
//        compareThread th5 = new compareThread(arr5,arr.get(4));
////        compareThread th6 = new compareThread(arr6,arr.get(5));
////        compareThread th7 = new compareThread(arr7, arr.get(6));
//        long startTime1 = System.nanoTime();
//        System.out.println(startTime1);
//        th1.start();
////        System.out.println("done1");
//
//        th2.start();
////        System.out.println("done2");
//
//        th3.start();
//        th4.start();
//        th5.start();
////        System.out.println("done");
//
//        th5.join();
//        th4.join();
//        th3.join();
//        th2.join();
//        th1.join();
//        long endTime1   = System.nanoTime();
//        System.out.println(endTime1);
//        long totalTime1 = endTime1 - startTime1;
//        System.out.println(totalTime1);
////        for (float element : arr2) {
////            System.out.println(element);
////        }
//
//
////        arr.add(100000);
////        arr.add(1000000);
//
//    //continue from the thread part
////        ArrayList<Float> arrSerial1 = new ArrayList<Float>(arr.get(0));
////        ArrayList<Float> arrSerial2 = new ArrayList<Float>(arr.get(1));
////        ArrayList<Float> arrSerial3 = new ArrayList<Float>(arr.get(2));
////        ArrayList<Float> arrSerial4 = new ArrayList<Float>(arr.get(3));
////        ArrayList<Float> arrSerial5 = new ArrayList<Float>(arr.get(4));
//////        ArrayList<Float> arr6 = new ArrayList<Float>(arr.get(5));
//////        ArrayList<Float> arr7 = new ArrayList<Float>(arr.get(6));
////
//////        Random r = new Random();
////
////        for (int i = 0; i < arr.get(0); i++) {
////            arrSerial1.add(r.nextFloat() * 10);
////        }
////        for (int i = 0; i < arr.get(1); i++) {
////            arrSerial2.add(r.nextFloat() * 10);
////        }
////        for (int i = 0; i < arr.get(2); i++) {
////            arrSerial3.add(r.nextFloat() * 10);
////        }
////        for (int i = 0; i < arr.get(3); i++) {
////            arrSerial4.add(r.nextFloat() * 10);
////        }
////        for (int i = 0; i < arr.get(4); i++) {
////            arrSerial5.add(r.nextFloat() * 10);
////        }
//////        for (int i = 0; i < arr.get(5); i++) {
//////            arr6.add(r.nextFloat() * 10);
//////        }
//////        for (int i = 0; i < arr.get(6); i++) {
//////            arr7.add(r.nextFloat() * 10);
//////        }
////
////        long startTime2 = System.nanoTime();
////        compareThread thSerial1 = new compareThread(arr1,arr.get(0));
////        compareThread thSerial2 = new compareThread(arr2,arr.get(1));
////        compareThread thSerial3 = new compareThread(arr3,arr.get(2));
////        compareThread thSerial4 = new compareThread(arr4,arr.get(3));
////        compareThread thSerial5 = new compareThread(arr5,arr.get(4));
////
////        thSerial1.start();
////        thSerial1.join();
////        thSerial2.start();
////        thSerial2.join();
////        thSerial3.start();
////        thSerial3.join();
////        thSerial4.start();
////        thSerial4.join();
////        thSerial5.start();
////        thSerial5.join();
////        long endTime2   = System.nanoTime();
////        long totalTime2 = endTime2 - startTime2;
////        System.out.println(totalTime2);
//
////        //without threading part
//
//
//        ArrayList<Float> arrSerial1 = new ArrayList<Float>(arr.get(0));
//        ArrayList<Float> arrSerial2 = new ArrayList<Float>(arr.get(1));
//        ArrayList<Float> arrSerial3 = new ArrayList<Float>(arr.get(2));
//        ArrayList<Float> arrSerial4 = new ArrayList<Float>(arr.get(3));
//        ArrayList<Float> arrSerial5 = new ArrayList<Float>(arr.get(4));
//
//        for (int i = 0; i < arr.get(0); i++) {
//            arrSerial1.add(r.nextFloat() * 10);
//        }
//        for (int i = 0; i < arr.get(1); i++) {
//            arrSerial2.add(r.nextFloat() * 10);
//        }
//        for (int i = 0; i < arr.get(2); i++) {
//            arrSerial3.add(r.nextFloat() * 10);
//        }
//        for (int i = 0; i < arr.get(3); i++) {
//            arrSerial4.add(r.nextFloat() * 10);
//        }
//        for (int i = 0; i < arr.get(4); i++) {
//            arrSerial5.add(r.nextFloat() * 10);
//        }
//
//        long startTime2 = System.nanoTime();
//        System.out.println(startTime2);
//        normal n1 = new normal(arrSerial1, arr.get(0));
//        normal n2 = new normal(arrSerial2, arr.get(1));
//        normal n3 = new normal(arrSerial3, arr.get(2));
//        normal n4 = new normal(arrSerial4, arr.get(3));
//        normal n5 = new normal(arrSerial5, arr.get(4));
//
//        n1.checker();
//        n2.checker();
//        n3.checker();
//        n4.checker();
//        n5.checker();
//        long endTime2   = System.nanoTime();
//        System.out.println(endTime2);
//        long totalTime2 = endTime2 - startTime2;
//        System.out.println(totalTime2);
////        for (float element : arrSerial2) {
////            System.out.println(element);
////        }
////        th6.start();
////        th7.start();
//////        System.out.println("End");
////        //Now the Odd Even sorting
////
//
//
//
//    }
//}
