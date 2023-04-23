import java.util.ArrayList;
import java.util.Random;

class normal {
    private ArrayList<Float> arr;
    private int index;
    public normal(ArrayList<Float> arr) {
        this.arr = arr;
        this.index = arr.size();
    }

    public void checker(){
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            float temp = 0;
            for (int i = 1; i <= index - 2; i = i + 2) {
                if (arr.get(i) > arr.get(i + 1)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                    isSorted = false;
                }
            }

            for (int i = 0; i <= index - 2; i = i + 2) {
                if (arr.get(i) > arr.get(i + 1)) {
                    temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                    isSorted = false;
                }
            }
        }
    }


}

class oddThread extends Thread {
    ArrayList<Float> arr = new ArrayList<Float>();
    int n1 = arr.size();

    public oddThread(ArrayList<Float> arr) {
        this.arr = arr;
        this.n1 = arr.size();

    }
    @Override
    public void run() {
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            float temp1 = 0;
            for (int i = 1; i <= n1 - 2; i = i + 2) {
                if (arr.get(i) > arr.get(i + 1)) {
                    temp1 = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp1);
                    isSorted = false;
                }
            }
        }
    }
}

class evenThread extends Thread {
    ArrayList<Float> arr1 = new ArrayList<Float>();
    int n;

    public evenThread(ArrayList<Float> arr) {
        this.arr1 = arr;
        this.n = arr.size();

    }


    @Override
    public void run() {
        boolean isSorted1 = false;
        while (!isSorted1) {
            isSorted1 = true;
            float temp2 = 0;
            for (int i = 0; i <= n - 2; i = i + 2) {
                if (arr1.get(i) > arr1.get(i + 1)) {
                    temp2 = arr1.get(i);
                    arr1.set(i, arr1.get(i + 1));
                    arr1.set(i + 1, temp2);
                    isSorted1 = false;
                }
            }
        }
    }
}

public class q1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        arr.add(1);
        arr.add(10);
        arr.add(100);
        arr.add(1000);
        arr.add(10000);

        ArrayList<Float> arr1 = new ArrayList<Float>(arr.get(0));
        ArrayList<Float> arr2 = new ArrayList<Float>(arr.get(1));
        ArrayList<Float> arr3 = new ArrayList<Float>(arr.get(2));
        ArrayList<Float> arr4 = new ArrayList<Float>(arr.get(3));
        ArrayList<Float> arr5 = new ArrayList<Float>(arr.get(4));

        Random r = new Random();

        for (int i = 0; i < arr.get(0); i++) {
            arr1.add(r.nextFloat() * 10);
        }
        for (int i = 0; i < arr.get(1); i++) {
            arr2.add(r.nextFloat() * 10);
        }
        for (int i = 0; i < arr.get(2); i++) {
            arr3.add(r.nextFloat() * 10);
        }
        for (int i = 0; i < arr.get(3); i++) {
            arr4.add(r.nextFloat() * 10);
        }
        for (int i = 0; i < arr.get(4); i++) {
            arr5.add(r.nextFloat() * 10);
        }

        long start1 = System.nanoTime();
        oddThread o1 = new oddThread(arr1);
        evenThread e1 = new evenThread(arr1);
        o1.start();
        e1.start();
        o1.join();
        e1.join();
        long end1 = System.nanoTime();
        System.out.println("The timing for 1 element using parallelization is " + (end1 - start1));

//        for (float element : arr2) {
//            System.out.println(element);
//        }
        long start2 = System.nanoTime();
        oddThread o2 = new oddThread(arr2);
        evenThread e2 = new evenThread(arr2);
        o2.start();
        e2.start();
        o2.join();
        e2.join();
        long end2 = System.nanoTime();
        System.out.println("The timing for 10 element using parallelization is " + (end2 - start2));

        long start3 = System.nanoTime();
        oddThread o3 = new oddThread(arr3);
        evenThread e3 = new evenThread(arr3);
        o3.start();
        e3.start();
        o3.join();
        e3.join();
        long end3 = System.nanoTime();
        System.out.println("The timing for 100 element using parallelization is " + (end3 - start3));


        long start4 = System.nanoTime();
        oddThread o4 = new oddThread(arr4);
        evenThread e4 = new evenThread(arr4);
        o4.start();
        e4.start();
        o4.join();
        e4.join();
        long end4 = System.nanoTime();
        System.out.println("The timing for 1000 element using parallelization is " + (end4 - start4));


        long start5 = System.nanoTime();
        oddThread o5 = new oddThread(arr5);
        evenThread e5 = new evenThread(arr5);
        o5.start();
        e5.start();
        o5.join();
        e5.join();
        long end5 = System.nanoTime();
        System.out.println("The timing for 10000 element using parallelization is " + (end5 - start5));

        System.out.println("---------");

//        for (float element : arr2) {
//            System.out.println(element);
//        3
        long startn1 = System.nanoTime();
        normal nn1 = new normal(arr1);
        nn1.checker();
        long endn1 = System.nanoTime();
        System.out.println("The timing for 1 elements normally is " + (endn1 - startn1));


        long startn2 = System.nanoTime();
        normal nn2 = new normal(arr2);
        nn2.checker();
        long endn2 = System.nanoTime();
        System.out.println("The timing for 10 elements normally is " + (endn2 - startn2));

        long startn3 = System.nanoTime();
        normal nn3 = new normal(arr3);
        nn3.checker();
        long endn3 = System.nanoTime();
        System.out.println("The timing for 100 elements normally is " + (endn3 - startn3));


        long startn4 = System.nanoTime();
        normal nn4 = new normal(arr4);
        nn4.checker();
        long endn4 = System.nanoTime();
        System.out.println("The timing for 1000 elements normally is " + (endn4 - startn4));

        long startn5 = System.nanoTime();
        normal nn5 = new normal(arr5);
        nn5.checker();
        long endn5 = System.nanoTime();
        System.out.println("The timing for 10000 elements normally is " + (endn5 - startn5));



    }
}
