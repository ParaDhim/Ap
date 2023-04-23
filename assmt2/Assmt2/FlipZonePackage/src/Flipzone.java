//import java.util.*;
//
//class Admin {
//
//}
//
//class Customer {
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
