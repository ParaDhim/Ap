import java.util.ArrayList;
import java.util.ListIterator;

public class arrlist {
    public static void main(String[] args) {

    ArrayList <ArrayList <String>> par = new ArrayList<ArrayList <String>>();
    ArrayList <String> paras = new ArrayList<String>();
    ArrayList <String> paras1 = new ArrayList<String>();
    ArrayList <String> paras2 = new ArrayList<String>();
//    par.add(["pras","sadsad"]);

        if (par.isEmpty()) {
            System.out.println("List is empty");
        }
    paras.add("ras");
    paras.add("sadas");
    paras.add("fedsafdas");
    paras1.add("rasdsaas");
    paras1.add("sadadsas");
    paras1.add("fedsafdasdasdas");
//    paras2.add(5,"rasdsasdaas");
    paras2.add("sadaasddsas");
    paras2.add("fedsafdasdasasddas");



    par.add(0,paras);
    par.add(paras1);
    par.add(paras2);


    //deletion----------------------------------------------------------
//        ListIterator<ArrayList<String>> lstInterate = par.listIterator();
//        for (int i = 0; i < 1; i++) {
//            lstInterate.next();
//        }
        for (ArrayList<String> element:par) {
            for (String element1:element) {
                System.out.println(element1);
            }

        }
        System.out.println(par);
        par.remove(1);
        System.out.println(par);
        if (par.isEmpty() == false) {
            System.out.println("List is not empty");
        }

    }
}
