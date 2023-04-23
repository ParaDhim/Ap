//import java.sql.Array;
//import java.util.*;
//import java.util.concurrent.BrokenBarrierException;
//import java.util.concurrent.CyclicBarrier;
//class compareThread implements Runnable {
//    private ArrayList<Float> arr;
//    private int index;
//    private CyclicBarrier barrier1;
//
//    public compareThread(ArrayList<Float> arr, int index, CyclicBarrier barrier1) {
//        this.arr = arr;
//        this.index = index;
//        this.barrier1 = barrier1;
//    }
//
//    @Override
//
//    public void run() {
//        float temp = 0;
//        for (int i = 0; i < arr.size();  i++) {
//            if (arr.get(index - 1) > arr.get(index)) {
//                temp = arr.get(index - 1);
//                arr.set(index - 1, arr.get(index));
//                arr.set(index, temp);
//            }
//            try {
//                barrier1.await();
//            } catch (BrokenBarrierException e) {
//                throw new RuntimeException(e);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            if (index + 1 < arr.size() && arr.get(index) > arr.get(index + 1)) {
//                temp = arr.get(index);
//                arr.set(index, arr.get(index + 1));
//                arr.set(index + 1, temp);
//            }
//            try {
//                barrier1.await();
//            } catch (BrokenBarrierException e) {
//                throw new RuntimeException(e);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
//}
//
//public class qq1 {
//    public static void OddEvenSort(ArrayList<Float> arr) {
//        if (arr.size() > 1){
//            int threadCount2 = arr.size() / 2;
//            CyclicBarrier barrier2 = new CyclicBarrier(threadCount2);
//            Thread[] threadCt = new Thread[threadCount2];
//            for (int i = 0; i < threadCount2; i++) {
////            System.out.println(i);
//                threadCt[i] = new Thread(new compareThread(arr, 2 * i + 1, barrier2));
//
//                threadCt[i].start();
//            }
//            for (int i = 0; i < threadCount2; i++) {
//                try {
//                    threadCt[i].join();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//    public static void main(String[] args) throws InterruptedException {
//
//        ArrayList<Integer> arr = new ArrayList<Integer>(7);
//        arr.add(1);
//        arr.add(10);
//        arr.add(100);
//        arr.add(1000);
//        arr.add(10000);
////
////
//        ArrayList<Float> arr1 = new ArrayList<Float>(arr.get(0));
//        ArrayList<Float> arr2 = new ArrayList<Float>(arr.get(1));
//        ArrayList<Float> arr3 = new ArrayList<Float>(arr.get(2));
//        ArrayList<Float> arr4 = new ArrayList<Float>(arr.get(3));
//        ArrayList<Float> arr5 = new ArrayList<Float>(arr.get(4));
//        Random r = new Random();
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
//        int threadCount1 = arr.get(0) / 2;
//        int threadCount2 = arr.get(1) / 2;
//        int threadCount3 = arr.get(2) / 2;
//        int threadCount4 = arr.get(3) / 2;
//        int threadCount5 = arr.get(4) / 2;
////        for (float element:arr2) {
////            System.out.println(element);
////
////        }
//        long startTime1 = System.nanoTime();
////        OddEvenSort(arr1);
////        OddEvenSort(arr2);
////////        System.out.println("----");
////        OddEvenSort(arr3);
////        OddEvenSort(arr4);
////        OddEvenSort(arr5);
//        long endTime1 = System.nanoTime();
//        long totalTime1 = endTime1 - startTime1;
//        System.out.println(totalTime1);
////        for (float element:arr2) {
////            System.out.println(element);
////
////        }
////        System.out.println(threadCount1);
//
////        OddEvenSort(arr1);
//
////        int threadCount1 = arr1.size() / 2;
////        CyclicBarrier barrier2 = new CyclicBarrier(threadCount2);
////        Thread[] threadCt = new Thread[threadCount2];
////        for (int i = 0; i < threadCount2; i++) {
////            System.out.println(i);
////            threadCt[i] = new Thread(new compareThread(arr2, 2 * i + 1, barrier2));
////
////            threadCt[i].start();
////        }
////        for (int i = 0; i < threadCount2; i++) {
////            try {
////                threadCt[i].join();
////            } catch (InterruptedException e) {
////                e.printStackTrace();
////            }
////        }
//
////        for (float element:arr2) {
////            System.out.println(element);
////
////        }
//
////        compareThread th1 = new compareThread(arr1, arr.get(0));
////        compareThread th2 = new compareThread(arr2, arr.get(1));
////        compareThread th3 = new compareThread(arr3, arr.get(2));
////        compareThread th4 = new compareThread(arr4, arr.get(3));
////        compareThread th5 = new compareThread(arr5, arr.get(4));
////        long startTime1 = System.nanoTime();
////        System.out.println(startTime1);
////        th1.start();
////        th2.start();
////        th3.start();
////        th4.start();
////        th5.start();
////        th5.join();
////        th4.join();
////        th3.join();
////        th2.join();
////        th1.join();
////        long endTime1 = System.nanoTime();
////        System.out.println(endTime1);
////        long totalTime1 = endTime1 - startTime1;
////        System.out.println(totalTime1);
////
////        ArrayList<Float> arrSerial1 = new ArrayList<Float>(arr.get(0));
////        ArrayList<Float> arrSerial2 = new ArrayList<Float>(arr.get(1));
////        ArrayList<Float> arrSerial3 = new ArrayList<Float>(arr.get(2));
////        ArrayList<Float> arrSerial4 = new ArrayList<Float>(arr.get(3));
////        ArrayList<Float> arrSerial5 = new ArrayList<Float>(arr.get(4));
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
////
////        long startTime2 = System.nanoTime();
////        System.out.println(startTime2);
////        normal n1 = new normal(arrSerial1, arr.get(0));
////        normal n2 = new normal(arrSerial2, arr.get(1));
////        normal n3 = new normal(arrSerial3, arr.get(2));
////        normal n4 = new normal(arrSerial4, arr.get(3));
////        normal n5 = new normal(arrSerial5, arr.get(4));
////
////        n1.checker();
////        n2.checker();
////        n3.checker();
////        n4.checker();
////        n5.checker();
////        long endTime2 = System.nanoTime();
////        System.out.println(endTime2);
////        long totalTime2 = endTime2 - startTime2;
////        System.out.println(totalTime2);
//
//
//    }
//}
