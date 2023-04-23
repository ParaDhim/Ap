import java.util.TreeSet.*;
import java.util.TreeSet;
import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

class NormalImplementation {
    TreeSet<Long> csls;
    ArrayList<Long> arr;

    public NormalImplementation(TreeSet<Long> csls, ArrayList<Long> arr) {
        this.arr = arr;
        this.csls = csls;
    }

    public void insert() {
        for (int i = 0; i < arr.size(); i++) {
            csls.add(arr.get(i));
        }
    }
}
class thread1 extends Thread {
    TreeSet<Long> csls1;
    ArrayList<Long> arr1;
    int start1;
    int stop1;

    public thread1(TreeSet<Long> csls1, ArrayList<Long>arr1, int start1, int stop1) {
        this.arr1 = arr1;
        this.csls1 = csls1;
        this.start1 =start1;
        this.stop1 =stop1;
    }
    @Override
    public void run() {
        for (int i = start1; i < stop1; i++) {
            csls1.add(arr1.get(i));
//            System.out.println(arr1.get(i));
        }
    }
}

public class q2 {
//    public static void main(String[] args) {
//
//    }

    public static void main(String[] args) throws InterruptedException {
//        ConcurrentSkipListSetTest ob = new ConcurrentSkipListSetTest();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(1000);
        arr.add(1000000);

        ArrayList<Long> arr1 = new ArrayList<Long>();
        ArrayList<Long> arr2 = new ArrayList<Long>();
        ArrayList<Long> arr3 = new ArrayList<Long>();
        Random random = new Random();

        for (int i = 0; i < arr.get(0); i++) {
            long number = random.nextLong(1000000000 + 1000000000) - 1000000000;
            arr1.add(number);
        }
        for (int i = 0; i < arr.get(1); i++) {
            long number = random.nextLong(1000000000 + 1000000000) - 1000000000;

            arr2.add(number);
////            arr1.add((long) ((Math.random() * (1000000000 + 1000000000)) - 1000000000));
        }
        for (int i = 0; i < arr.get(2); i++) {
            long number = random.nextLong(1000000000 + 1000000000) - 1000000000;
            arr3.add(number);
//            arr1.add((long) ((Math.random() * (1000000000 + 1000000000)) - 1000000000));
        }

        System.out.println("Using 2 threads:-");
        long startth1 = System.nanoTime();
        TreeSet<Long> csls11 = new TreeSet<Long>();
        thread1 t11 = new thread1(csls11,arr1,0,(arr1.size()/2));
        thread1 t12 = new thread1(csls11,arr1,(arr1.size()/2),arr1.size());
        t11.start();
        t12.start();
        t12.join();
        t11.join();
//        System.out.println("1");
        long endth1 = System.nanoTime();
        System.out.println("The timing for 10 elements parallelization using 2 threads is " + (endth1 - startth1));

        long startth2 = System.nanoTime();
        TreeSet<Long> csls21 = new TreeSet<Long>();
        thread1 t21 = new thread1(csls21,arr2,0,(arr2.size()/2));
        thread1 t22 = new thread1(csls21,arr2,(arr2.size()/2),arr2.size());
        t21.start();
        t22.start();
        t22.join();
        t21.join();
//        System.out.println("2");
        long endth2 = System.nanoTime();
        System.out.println("The timing for 1000 elements parallelization using 2 threads is " + (endth2 - startth2));

        long startth3 = System.nanoTime();
        TreeSet<Long> csls31 = new TreeSet<Long>();
        thread1 t31 = new thread1(csls31,arr3,0,(arr3.size()/2));
        thread1 t32 = new thread1(csls31,arr3,(arr3.size()/2),arr3.size());
        t31.start();
        t32.start();
        t32.join();
        t31.join();
//        System.out.println("3");
        long endth3 = System.nanoTime();
        System.out.println("The timing for 1000000 elements parallelization using 2 threads is " + (endth3 - startth3));


//        Iterator<Long> it = csls11.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }

        System.out.println("Using 4 threads:-");
        long startt1 = System.nanoTime();
        TreeSet<Long> csls14 = new TreeSet<Long>();
        thread1 tt11 = new thread1(csls14,arr1,0,(arr1.size()/4));
        thread1 tt12 = new thread1(csls14,arr1,(arr1.size()/4),arr1.size()/2);
        thread1 tt13 = new thread1(csls14,arr1,(arr1.size()/2),(arr1.size()*3)/4);
        thread1 tt14 = new thread1(csls14,arr1,(arr1.size()*3)/4,arr1.size());
        tt11.start();
        tt12.start();
        tt13.start();
        tt14.start();
        tt14.join();
        tt13.join();
        tt12.join();
        tt11.join();
//        System.out.println("1");
        long endt1 = System.nanoTime();
        System.out.println("The timing for 10 elements parallelization using 4 threads is " + (endt1 - startt1));

        long startt2 = System.nanoTime();
        TreeSet<Long> csls24 = new TreeSet<Long>();
        thread1 tt21 = new thread1(csls24,arr2,0,(arr2.size()/4));
        thread1 tt22 = new thread1(csls24,arr2,(arr2.size()/4),arr2.size()/2);
        thread1 tt23 = new thread1(csls24,arr2,(arr2.size()/2),(arr2.size()*3)/4);
        thread1 tt24 = new thread1(csls24,arr2,(arr2.size()*3)/4,arr2.size());
        tt21.start();
        tt22.start();
        tt23.start();
        tt24.start();
        tt24.join();
        tt23.join();
        tt22.join();
        tt21.join();
//        System.out.println("2");
        long endt2 = System.nanoTime();
        System.out.println("The timing for 1000 elements parallelization using 4 threads is " + (endt2 - startt2));

        long startt3 = System.nanoTime();
        TreeSet<Long> csls34 = new TreeSet<Long>();
        thread1 tt31 = new thread1(csls34,arr3,0,(arr3.size()/4));
        thread1 tt32 = new thread1(csls34,arr3,(arr3.size()/4),arr3.size()/2);
        thread1 tt33 = new thread1(csls34,arr3,(arr3.size()/2),(arr3.size()*3)/4);
        thread1 tt34 = new thread1(csls34,arr3,(arr3.size()*3)/4,arr3.size());
        tt31.start();
        tt32.start();
        tt33.start();
        tt34.start();
        tt34.join();
        tt33.join();
        tt32.join();
        tt31.join();
//        System.out.println("3");

        long endt3 = System.nanoTime();
        System.out.println("The timing for 1000000 elements parallelization using 4 threads is " + (endt3 - startt3));

        System.out.println("normal Implementation:-");
        long startn1 = System.nanoTime();
        TreeSet<Long> csl1 = new TreeSet<Long>();
        NormalImplementation n1 = new NormalImplementation(csl1, arr1);
        n1.insert();
        long endn1 = System.nanoTime();
        System.out.println("The timing for 10 elements is " + (endn1 - startn1));
        long startn2 = System.nanoTime();
        TreeSet<Long> csl2 = new TreeSet<Long>();
        NormalImplementation n2 = new NormalImplementation(csl2, arr2);
        n2.insert();
        long endn2 = System.nanoTime();
        System.out.println("The timing for 1000 elements is " + (endn2 - startn2));
        long startn3 = System.nanoTime();
        TreeSet<Long> csl3 = new TreeSet<Long>();
        NormalImplementation n3 = new NormalImplementation(csl3, arr3);
        n3.insert();
        long endn3 = System.nanoTime();
        System.out.println("The timing for 1000000 elements is " + (endn3 - startn3));

//        new Thread(ob.new thread1()).start();
//        new Thread(ob.new thread2()).start();
    }
}