//import java.util.*;
//
//class Admin {
//        private String [] usrname;
////    private ArrayList<String> usrname = new ArrayList<String>();
//        private int [] rollNo;
////    private ArrayList<Integer> rollNo = new ArrayList<Integer>();
//        String [] category;
////    private ArrayList<String> category = new ArrayList<String>();
//        int[] categoryID;
////    private ArrayList<Integer> categoryID = new ArrayList<Integer>();
//
//        String[][] categoryProductsName;
////    private ArrayList<String> categoryProductsName = new ArrayList<String>();
//
//        double[][] categoryProductsID;
////    private ArrayList<Double> categoryProductsID = new ArrayList<ouble>();
//
//    String[][][] categoryProductsDetails;
//    private static int catIndex = 0;
//    private static int productIndex = 0;
//
//    public double[][] getCategoryProductsID() {
//        return categoryProductsID;
//    }
//
//    public static int getCatIndex() {
//        return catIndex;
//    }
//
//    public static int getProductIndex() {
//        return productIndex;
//    }
//
//    public int[] getCategoryID() {
//        return categoryID;
//    }
//
//    public int[] getRollNo() {
//        return rollNo;
//    }
//
//    public String[] getCategory() {
//        return category;
//    }
//
//    public String[] getUsrname() {
//        return usrname;
//    }
//
//    public String[][] getCategoryProductsName() {
//        return categoryProductsName;
//    }
//
//    public String[][][] getCategoryProductsDetails() {
//        return categoryProductsDetails;
//    }
//
//    public boolean checkUsrname(String usrname) {
//        for (String element : this.usrname) {
//            if (usrname == element) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean checkRollNo(int rollNo) {
//        for (int element : this.rollNo) {
//            if (rollNo == element) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public int getCatIndex(String catName) {
//        int i = 0;
//        for (String element : this.category) {
//
//            if (element == catName) {
//                break;
//            }
//            i += 1;
//        }
//        return i;
//    }
//
//    public int getProductIndex(String productName, String catName) {
//        int i = 0;
//        for (String element : this.categoryProductsName[getCatIndex(catName)]) {
//
//            if (element == productName) {
//                break;
//            }
//            i += 1;
//        }
//        return i;
//    }
//
//    public boolean checkAdmin(String usrname, int rollNo) {
//        if (checkRollNo(rollNo) && checkUsrname(usrname)) {
//            return true;
//        }
//        return false;
//    }
//
//    public void addProduct(int categoryIndex, double productID, String[] Details, String productName) {
//        this.categoryProductsName[categoryIndex][productIndex] = productName;
//        this.categoryProductsID[categoryIndex][productIndex] = productID;
//        this.categoryProductsDetails[categoryIndex][productIndex] = Details;
//
//
//    }
//
//    public void addCategory(int catID, String catName, String productName, double productID, String[] Details) {
//        this.categoryID[catIndex] = catID;
//        this.category[catIndex] = catName;
//        addProduct(getCatIndex(catName), productID, Details, productName);
//
//    }
//
//    public void deleteFromListInt(int idx,int []arr) {
//        int p = idx;
//        int k = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (i != j) {
//                arr[k] =
//            }
//        }
//    }
//
//    public void deleteCategory() {
//
//    }
//
//
//}
//
//class Customer {
//    private String [] eliteCus;
//    private String [] primeCus;
//    private String [] normalCus;
//    private String [] productsToSell;
//    int [] productID;
//
//}
//
//public class Flipzone {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Admin adminIIIT = new Admin();
//        Customer customerIIIT = new Customer();
//        int lop = 1;
//        while (lop == 1) {
//            System.out.println("WELCOME TO FLIPZON\n" +
//                    "1) Enter as Admin\n" +
//                    "2) Explore the Product Catalog\n" +
//                    "3) Show Available Deals\n" +
//                    "4) Enter as Customer\n" +
//                    "5) Exit the Application");
//            int operate;
//            operate = sc.nextInt();
//            if (operate == 1) {
//                System.out.println("Dear Admin,\n" +
//                        "Please enter your username and password\n");
//                String usrname = sc.nextLine();
//                String passwd = sc.nextLine();
//                int lop1 = 1;
//                while (lop1 == 1) {
//                    System.out.println("Welcome " + usrname + "!!!!\n" +
//                            "Please choose any one of the following actions:\n" +
//                            "1) Add category\n" +
//                            "2) Delete category\n" +
//                            "3) Add Product\n" +
//                            "4) Delete Product\n" +
//                            "5) Set Discount on Product\n" +
//                            "6) Add giveaway deal\n" +
//                            "7) Back");
//                    int operate1 = sc.nextInt();
//                    if (operate1 == 1) {
//
//                    } else if (operate1 == 2) {
//
//                    }else if (operate1 == 3) {
//
//                    }else if (operate1 == 4) {
//
//                    }else if (operate1 == 5) {
//
//                    }else if (operate1 == 6) {
//
//                    }else {
//                        System.out.println("Exiting ---- chosen to exit or entered wrong Input");
//                    }
//                }
//                //------------------username and password needs to be checked------------------//
//
//            } else if (operate == 2) {
//
//            } else if (operate == 3) {
//
//            } else if (operate == 4) {
//                int lop4 = 1;
//                while (lop4 == 1) {
//                    System.out.println("1) Sign up\n" +
//                            "2) Log in\n" +
//                            "3) Back");
//                    int operate4 = 1;
//                    if (operate4 == 1) {
//
//                    } else if (operate4 == 2) {
//                        System.out.println("Enter Name");
//                        String cusUsrname = sc.nextLine();
//                        String cuspasswd = sc.nextLine();
//                        int operate42lop = 1;
//                        while (operate42lop == 1) {
//                            System.out.println("Welcome Roy Mustang!!\n" +
//                                    "1) browse products\n" +
//                                    "2) browse deals\n" +
//                                    "3) add a product to cart\n" +
//                                    "4) add products in deal to cart\n" +
//                                    "5) view coupons\n" +
//                                    "6) check account balance\n" +
//                                    "7) view cart\n" +
//                                    "8) empty cart\n" +
//                                    "9) checkout cart\n" +
//                                    "10) upgrade customer status\n" +
//                                    "11) Add amount to wallet\n" +
//                                    "12) back");
//                            int operate42 = sc.nextInt();
//                            if (operate42 == 1) {
//
//                            } else if (operate42 == 2) {
//
//                            } else if (operate42 == 3) {
//
//                            } else if (operate42 == 4) {
//
//                            } else if (operate42 == 5) {
//
//                            } else if (operate42 == 6) {
//
//                            } else if (operate42 == 7) {
//
//                            } else if (operate42 == 8) {
//
//                            } else if (operate42 == 9) {
//
//                            } else if (operate42 == 10) {
//
//                            } else if (operate42 == 11) {
//
//                            } else if (operate42 == 12) {
//                                operate42lop = 0;
//                                System.out.println("Bye" + cusUsrname + "!!!!");
//                            } else {
//                                operate42lop = 0;
//                                System.out.println("Exiting ---- entered wrong Input");
//                            }
//                        }
//                    } else {
//                        System.out.println("Exiting ---- chosen to exit or entered wrong Input");
//                    }
//                }
//            } else {
//                lop = 0;
//                System.out.println("Exiting ---- chosen to exit or entered wrong Input");
//            }
//        }
//    }
//}
