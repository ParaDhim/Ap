//import org.w3c.dom.ls.LSOutput;
//import java.util.Random;
//
//import java.util.*;
//
//class Admin {
//    //    private String [] usrname;
//    private ArrayList<String> usrname = new ArrayList<String>();
//
//    private ArrayList<Integer> rollNo = new ArrayList<Integer>();
//    //    String [] category;
//    private ArrayList<String> category = new ArrayList<String>();
//    //    int[] categoryID;
//    private ArrayList<Integer> categoryID = new ArrayList<Integer>();
//
//    //    String[][] categoryProductsName;
//    private ArrayList<ArrayList<String>> categoryProductsName = new ArrayList<ArrayList<String>>();
//
//    //    double[][] categoryProductsID;
//    private ArrayList<ArrayList<Double>> categoryProductsID = new ArrayList<ArrayList<Double>>();
//    private ArrayList<ArrayList<Integer>> quantityOfProduct = new ArrayList<ArrayList<Integer>>();
//    private ArrayList<ArrayList<Integer>> priceOfProduct = new ArrayList<ArrayList<Integer>>();
//
//    //    String[][][] categoryProductsDetails;
//    private ArrayList<ArrayList<ArrayList<String>>> categoryProductsDetails = new ArrayList<ArrayList<ArrayList<String>>>();
//    private ArrayList<Double> discountProductID = new ArrayList<Double>();
//    private ArrayList<Double> eliteDiscount = new ArrayList<Double>();
//    private ArrayList<Double> primeDiscount = new ArrayList<Double>();
//    private ArrayList<Double> normalDiscount = new ArrayList<Double>();
//
//    private ArrayList<ArrayList<Double>> giveAwayDealID = new ArrayList<ArrayList<Double>>();
//    private ArrayList<Integer> giveAwayDealPricing = new ArrayList<Integer>();
//
//    public ArrayList<Integer> getGiveAwayDealPricing() {
//        return giveAwayDealPricing;
//    }
//
//    public int getGiveAwayDealPricingSingly(int idx) {
//        return this.giveAwayDealPricing.get(idx);
//    }
//
//    public ArrayList<ArrayList<Double>> getGiveAwayDealID() {
//        return giveAwayDealID;
//    }
//
//    public ArrayList<Double> getGiveAwayDealIDSingly(int idx) {
//        return giveAwayDealID.get(idx);
//    }
//
//    public int getpriceOfProductSinglyByIdx(int productIdx, int catIndex) {
//        return this.priceOfProduct.get(catIndex).get(productIdx);
//    }
//
//    public boolean checkProductIDExistance(double proID) {
//        boolean flag = false;
//        for (ArrayList<Double> element : this.categoryProductsID) {
//            for (double element1 : element) {
//                if (element1 == proID) {
//                    flag = true;
//                    break;
//                }
//            }
//        }
//        return flag;
//    }
//
//    public int getDiscountProductIDIndex(double disProID) {
//        int i = 0;
//        for (double element : this.discountProductID) {
//            if (element == disProID) {
//                break;
//            }
//            i++;
//        }
//        return i;
//    }
//    private static int catIndex = 0;
////    private static int productIndex = 0;
//
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
//    public boolean checkCatNameID(String catName, int catIndex) {
//        int i = 0;
//        boolean flag = false;
//        for (String element : this.category) {
//            if (element == catName) {
//                if (this.categoryID.get(i) == catIndex) {
//                    flag = true;
//                    return flag;
//                }
//            }
//            i++;
//        }
//        return flag;
//    }
//
//    public boolean checkCatName(String catName) {
//        int i = 0;
//        boolean flag = false;
//        for (String element : this.category) {
//            if (element == catName) {
//                flag = true;
//                return flag;
//            }
//            i++;
//        }
//        return flag;
//    }
//
//    public int getProductIndex(String productName, String catName) {
//        int i = 0;
//        for (String element : this.categoryProductsName.get(getCatIndex(catName))) {
//
//            if (element == productName) {
//                break;
//            }
//            i += 1;
//        }
//        return i;
//    }
////    getca
//
//    public int getCategoryIndex(double productID) {
//        int i = 0;
//        for (ArrayList<Double> element : this.getCategoryProductsID()) {
//            for (double element1:element) {
//                if (element1 == productID) {
//                    break;
//                }
//
//            }
//            i += 1;
//        }
//        return i;
//    }
//
//
//    public int getProductIndexFromID(double productID, String catName) {
//        int i = 0;
//        for (double element : this.categoryProductsID.get(getCatIndex(catName))) {
//
//            if (element == productID) {
//                break;
//            }
//            i += 1;
//        }
//        return i;
//    }
//
//
//    public boolean checkAdmin(String usrname, int rollNo) {
//        if (checkRollNo(rollNo) && checkUsrname(usrname)) {
//            return true;
//        }
//        return false;
//    }
//
//    public void addProduct(int categoryIndex, double productID, ArrayList<String> Details, String productName,int quantity,int priceOfProduct) {
////        this.categoryProductsName[categoryIndex][productIndex] = productName;
//        this.categoryProductsName.get(categoryIndex).add(productName);
//        this.categoryProductsID.get(categoryIndex).add(productID);
//        this.categoryProductsDetails.get(categoryIndex).add(Details);
//        this.priceOfProduct.get(categoryIndex).add(priceOfProduct);
//        this.quantityOfProduct.get(categoryIndex).add(quantity);
//
////        this.categoryProductsID[categoryIndex][productIndex] = productID;
////        this.categoryProductsDetails[categoryIndex][productIndex] = Details;
//
//
//    }
//
//    public ArrayList<String> getCategoryProductsNameSingly(int catIdx) {
//        return categoryProductsName.get(catIdx);
//    }
//
//    public void addCategory(int catID, String catName, String productName, double productID, ArrayList<String> Details, int quanProduct, int priceOfProduct) {
//        this.categoryID.set(catIndex,catID);
////        this.categoryID[catIndex] = catID;
////        this.category[catIndex] = catName;
//        this.category.set(catIndex,catName);
//
//        addProduct(getCatIndex(catName), productID, Details, productName,quanProduct,priceOfProduct);
//        catIndex += 1;
//    }
//
//    public void deleteProduct(String catName, double productID) {
//        int proidx = getProductIndexFromID(productID,catName);
//
//        this.categoryProductsName.get(getCatIndex(catName)).remove(proidx);
//        this.categoryProductsID.get(getCatIndex(catName)).remove(proidx);
//        this.categoryProductsDetails.get(getCatIndex(catName)).remove(proidx);
//        this.quantityOfProduct.get(getCatIndex(catName)).remove(proidx);
//        this.priceOfProduct.get(getCatIndex(catName)).remove(proidx);
//    }
//
//    public void deleteCategory(String catName, int categoryID) {
//        this.categoryID.remove(getCatIndex(catName));
//        this.category.remove(getCatIndex(catName));
//
//        categoryProductsName.remove(getCatIndex(catName));
//        categoryProductsID.remove(getCatIndex(catName));
//        categoryProductsDetails.remove(getCatIndex(catName));
//        this.quantityOfProduct.remove(getCatIndex(catName));
//        this.priceOfProduct.remove(getCatIndex(catName));
//    }
//
//    public void setDiscountOnProduct(double productID, double eliteDiscount, double primeDiscount, double normalDiscount) {
//        this.discountProductID.add(productID);
//        this.eliteDiscount.add(eliteDiscount);
//        this.normalDiscount.add(normalDiscount);
//        this.primeDiscount.add(primeDiscount);
//    }
//
//    public void addGiveawayDeal(double proID1, double proID2, int GiveawayPricing) {
//        ArrayList<Double> i = new ArrayList<Double>();
//        i.add(proID1);
//        i.add(proID2);
//        giveAwayDealID.add(i);
//        giveAwayDealPricing.add(GiveawayPricing);
//    }
//
//    public ArrayList<String> getCategory() {
//        return category;
//    }
//
//    public ArrayList<ArrayList<ArrayList<String>>> getCategoryProductsDetails() {
//        return categoryProductsDetails;
//    }
//
//    public ArrayList<ArrayList<String>> getCategoryProductsDetailsSingly(int idx) {
//        return categoryProductsDetails.get(idx);
//    }
//
//
//    public ArrayList<ArrayList<Integer>> getPriceOfProduct() {
//        return priceOfProduct;
//    }
//
//    public ArrayList<ArrayList<Integer>> getQuantityOfProduct() {
//        return quantityOfProduct;
//    }
//
//    public ArrayList<ArrayList<Double>> getCategoryProductsID() {
//        return categoryProductsID;
//    }
//
////    public void showCategories() {
////        int i = 1;
////        for (String element : this.category) {
////            System.out.println(i + ".) " + element);
////            i++;
////        }
////    }
////
////    public void seeProducts(int catIndex) {
//////        int i = 0;
////        for (String element : this.categoryProductsName.get(catIndex - 1)) {
////            System.out.println(element);
////        }
////    }
//
//    public String getCatofProductFromProID(double proID) {
//        int i = 0;
//        for (ArrayList<Double> element : this.categoryProductsID) {
//            for (double element1 : element) {
//                if (element1 == proID) {
//                    return this.category.get(i);
//                }
//            }
//            i++;
//        }
//        return null;
//    }
//
//    public String getProductNameFromProductID(double productID) {
//        int i = 0;
//        for (ArrayList<Double> element : this.categoryProductsID) {
//            int j = 0;
//            for (double element1:element) {
//                if (element1 == productID) {
//                    return this.categoryProductsName.get(i).get(j);
//                }
//                j++;
//
//            }
//            i++;
//        }
//        return null;
//    }
//
//    public int getPriceFromProductID(double productID) {
//        int i = 0;
//        for (ArrayList<Double> element : this.categoryProductsID) {
//            int j = 0;
//            for (double element1 : element) {
//                if (element1 == productID) {
//                    return this.priceOfProduct.get(i).get(j);
//                }
//                j++;
//            }
//            i++;
//        }
//        return 0;
//    }
//
//    public String getNameFromProductID(double productID) {
//        int i = 0;
//        for (ArrayList<Double> element : this.categoryProductsID) {
//            int j = 0;
//            for (double element1 : element) {
//                if (element1 == productID) {
//                    return this.categoryProductsName.get(i).get(j);
//                }
//                j++;
//            }
//            i++;
//        }
//        return null;
//    }
//
//
//
//}
//
//interface ProductCatalog {
//    public void showCategories(Admin adminIIIT);
//
//    public void seeProducts(int catIndex,Admin adminIIIT);
//}
//
//class Customer implements ProductCatalog{
//    //    private ArrayList<String> eliteCus = new ArrayList<String>();
////    private ArrayList<String> primeCus = new ArrayList<String>();
////    private ArrayList<String> normalCus = new ArrayList<String>();
//    private ArrayList<String> productsToSell = new ArrayList<String>();
//    private ArrayList<String> normalCusName = new ArrayList<String>();
//    private ArrayList<Integer> normalCusAge = new ArrayList<Integer>();
//    private ArrayList<Integer> normalCusPhNo = new ArrayList<Integer>();
//    private ArrayList<String> normalCusEmailID = new ArrayList<String>();
//    private ArrayList<String> normalCusPasswd = new ArrayList<String>();
//    private ArrayList<Integer> normalCusWallet = new ArrayList<Integer>();
//
//    private ArrayList<String> lstCusName = new ArrayList<String>();
//    private ArrayList<Integer> lstCusAge = new ArrayList<Integer>();
//    private ArrayList<Integer> lstCusPhNo = new ArrayList<Integer>();
//    private ArrayList<String> lstCusEmailID = new ArrayList<String>();
//    private ArrayList<String> lstCusPasswd = new ArrayList<String>();
//    private ArrayList<Integer> lstCusWallet = new ArrayList<Integer>();
//
//    private ArrayList<String> eliteCusName = new ArrayList<String>();
//    private ArrayList<Integer> eliteCusAge = new ArrayList<Integer>();
//    private ArrayList<Integer> eliteCusPhNo = new ArrayList<Integer>();
//    private ArrayList<String> eliteCusEmailID = new ArrayList<String>();
//    private ArrayList<String> eliteCusPasswd = new ArrayList<String>();
//    private ArrayList<Integer> eliteCusWallet = new ArrayList<Integer>();
//
//    private ArrayList<String> primeCusName = new ArrayList<String>();
//    private ArrayList<Integer> primeCusAge = new ArrayList<Integer>();
//    private ArrayList<Integer> primeCusPhNo = new ArrayList<Integer>();
//    private ArrayList<String> primeCusEmailID = new ArrayList<String>();
//    private ArrayList<String> primeCusPasswd = new ArrayList<String>();
//    private ArrayList<Integer> primeCusWallet = new ArrayList<Integer>();
//    //    private ArrayList<String> primeCusPasswd = new ArrayList<String>()
//    private ArrayList<Double> cusCartProductID = new ArrayList<Double>();
//    private ArrayList<ArrayList<Double>> cusCartProductDeals = new ArrayList<ArrayList<Double>>();
//    private ArrayList<ArrayList<String>> cusCartProductCoupons= new ArrayList<ArrayList<String>>();
//    private ArrayList<Integer> cusQuantityCartOfProducts = new ArrayList<Integer>();
//    private ArrayList<Integer> cusCartOfProductsPriceSingle = new ArrayList<Integer>();
//    private ArrayList<Integer> cusCartOfProductsDealPriceSingle = new ArrayList<Integer>();
//    private ArrayList<Integer> eliteCoupon = new ArrayList<Integer>();
//    private ArrayList<Integer> primeCoupon = new ArrayList<Integer>();
//    private static int cartPricing = 0;
//
//
//
//    public void showCategories(Admin adminIIIT){
//        int i = 1;
//        for (String element : adminIIIT.getCategory()) {
//            System.out.println(i + ".) " + element);
//            i++;
//        }
//    }
//
//    public void seeProducts(int catIndex,Admin adminIIIT) {
////        int i = 0;
//        for (String element : adminIIIT.getCategoryProductsNameSingly(catIndex-1)) {
//            System.out.println(element);
//        }
//    }
//
//    //    private ArrayList<String> primeCusDetails = new ArrayList<String>();
////    private ArrayList<String> eliteCusDetails = new ArrayList<String>();
////    //Sequence name,age,phNo,EmailID,passwd
//    public void signUp(String name, int age, int PhNo, String emailID, String passwd) {
//        this.normalCusName.add(name);
//        this.normalCusAge.add(age);
//        this.normalCusEmailID.add(emailID);
//        this.normalCusPhNo.add(PhNo);
//        this.normalCusPasswd.add(passwd);
//        this.normalCusWallet.add(1000);
//
//        this.lstCusName.add(name);
//        this.lstCusAge.add(age);
//        this.lstCusEmailID.add(emailID);
//        this.lstCusPhNo.add(PhNo);
//        this.lstCusPasswd.add(passwd);
//        this.lstCusWallet.add(1000);
//    }
//
//    public boolean logIn(String regName,String emailID,String regPassword) {
//        boolean flag = false;
//        boolean flag1 = false;
//        boolean flag2 = false;
//        boolean flag3 = false;
//
//        int i = 0;
//        int i1 = 0;
//        int i2 = 0;
//        for (String element : this.normalCusName) {
//            if (element == regName) {
//                if (this.normalCusPasswd.get(i) == regPassword) {
//                    if (this.normalCusEmailID.get(i) == emailID) {
//                        flag = true;
//                        return flag;
//                    }
//                }
//            }
//            i += 1;
//
//        }
//        i = 0;
//        for (String element : this.eliteCusName) {
//            if (element == regName) {
//                if (this.eliteCusPasswd.get(i) == regPassword) {
//                    if (this.eliteCusEmailID.get(i) == emailID) {
//                        flag = true;
//                        return flag;
//                    }
//                }
//            }
//            i += 1;
//
//        }
//        i = 0;
//        for (String element : this.primeCusName) {
//            if (element == regName) {
//                if (this.primeCusPasswd.get(i) == regPassword) {
//                    if (this.primeCusEmailID.get(i) == emailID) {
//                        flag = true;
//                        return flag;
//                    }
//                }
//            }
//            i += 1;
//
//        }
//
//        return flag;
//    }
//
//
//    public int getindexRegUserLogIn(String regName, String emailID, String regPassword) {
//
//
//        int i = 0;
//        for (String element : this.primeCusName) {
//            if (element == regName) {
//                if (this.primeCusPasswd.get(i) == regPassword) {
//                    if (this.primeCusEmailID.get(i) == emailID) {
//                        return i;
//                    }
//                }
//            }
//            i += 1;
//        }
//
//        i = 0;
//        for (String element : this.normalCusName) {
//            if (element == regName) {
//                if (this.normalCusPasswd.get(i) == regPassword) {
//                    if (this.normalCusEmailID.get(i) == emailID) {
//                        return i;
//                    }
//                }
//            }
//            i += 1;
//        }
//
//        i = 0;
//        for (String element : this.eliteCusName) {
//            if (element == regName) {
//                if (this.eliteCusPasswd.get(i) == regPassword) {
//                    if (this.eliteCusEmailID.get(i) == emailID) {
//                        return i;
//                    }
//                }
//            }
//            i += 1;
//        }
//        return i;
//    }
////    private ArrayList<Integer> productID = new ArrayList<Integer>();
//
//    public void currentStatus(String regName, String emailID, String regPassword) {
//        int i = 0;
//        for (String element : this.primeCusName) {
//            if (element == regName) {
//                if (this.primeCusPasswd.get(i) == regPassword) {
//                    if (this.primeCusEmailID.get(i) == emailID) {
//                        System.out.println("Current Status: PRIME");
//                    }
//                }
//            }
//            i += 1;
//        }
//
//        i = 0;
//        for (String element : this.normalCusName) {
//            if (element == regName) {
//                if (this.normalCusPasswd.get(i) == regPassword) {
//                    if (this.normalCusEmailID.get(i) == emailID) {
//                        System.out.println("Current Status: NORMAL");
//                    }
//                }
//            }
//            i += 1;
//        }
//
//        i = 0;
//        for (String element : this.eliteCusName) {
//            if (element == regName) {
//                if (this.eliteCusPasswd.get(i) == regPassword) {
//                    if (this.eliteCusEmailID.get(i) == emailID) {
//                        System.out.println("Current Status: ELITE");
//                    }
//                }
//            }
//            i += 1;
//        }
//
//    }
//
//
//    public String getCurrentStatusString(String regName, String emailID, String regPassword) {
//        int i = 0;
//        for (String element : this.primeCusName) {
//            if (element == regName) {
//                if (this.primeCusPasswd.get(i) == regPassword) {
//                    if (this.primeCusEmailID.get(i) == emailID) {
//                        return "PRIME";
//                    }
//                }
//            }
//            i += 1;
//        }
//
//        i = 0;
//        for (String element : this.normalCusName) {
//            if (element == regName) {
//                if (this.normalCusPasswd.get(i) == regPassword) {
//                    if (this.normalCusEmailID.get(i) == emailID) {
//                        return "NORMAL";
//                    }
//                }
//            }
//            i += 1;
//        }
//
//        i = 0;
//        for (String element : this.eliteCusName) {
//            if (element == regName) {
//                if (this.eliteCusPasswd.get(i) == regPassword) {
//                    if (this.eliteCusEmailID.get(i) == emailID) {
//                        return "ELITE";
//                    }
//                }
//            }
//            i += 1;
//        }
//        return null;
//    }
//    public void upgradeStatus(String regName, String emailID, String regPassword,String newStatus,String oldStatus) {
//        if (newStatus == "ELITE" && oldStatus == "NORMAL") {
//            int normIdx = getindexRegUserLogIn(regName, emailID, regPassword);
//            this.eliteCusAge.add(this.normalCusAge.get(normIdx));
//            normalCusAge.remove(normIdx);
//            this.eliteCusName.add(this.normalCusName.get(normIdx));
//            normalCusName.remove(normIdx);
//            this.eliteCusEmailID.add(this.normalCusEmailID.get(normIdx));
//            normalCusEmailID.remove(normIdx);
//            this.eliteCusPhNo.add(this.normalCusPhNo.get(normIdx));
//            normalCusPhNo.remove(normIdx);
//            this.eliteCusPasswd.add(this.normalCusPasswd.get(normIdx));
//            normalCusPasswd.remove(normIdx);
//            this.eliteCusWallet.add(this.normalCusWallet.get(normIdx) +1000 - 500);
//            normalCusWallet.remove(normIdx);
//        } else if (newStatus == "ELITE" && oldStatus == "PRIME") {
//            int primeIdx = getindexRegUserLogIn(regName, emailID, regPassword);
//            this.eliteCusAge.add(this.primeCusAge.get(primeIdx));
//            primeCusAge.remove(primeIdx);
//            this.eliteCusName.add(this.primeCusName.get(primeIdx));
//            primeCusName.remove(primeIdx);
//            this.eliteCusEmailID.add(this.primeCusEmailID.get(primeIdx));
//            primeCusEmailID.remove(primeIdx);
//            this.eliteCusPhNo.add(this.primeCusPhNo.get(primeIdx));
//            primeCusPhNo.remove(primeIdx);
//            this.eliteCusPasswd.add(this.primeCusPasswd.get(primeIdx));
//            primeCusPasswd.remove(primeIdx);
//            this.eliteCusWallet.add(this.primeCusWallet.get(primeIdx) + 1000 - 200);
//            primeCusWallet.remove(primeIdx);
//        } else if (newStatus == "PRIME" && oldStatus == "NORMAL") {
//            int normIdx = getindexRegUserLogIn(regName, emailID, regPassword);
//            this.primeCusAge.add(this.normalCusAge.get(normIdx));
//            normalCusAge.remove(normIdx);
//            this.primeCusName.add(this.normalCusName.get(normIdx));
//            normalCusName.remove(normIdx);
//            this.primeCusEmailID.add(this.normalCusEmailID.get(normIdx));
//            normalCusEmailID.remove(normIdx);
//            this.primeCusPhNo.add(this.normalCusPhNo.get(normIdx));
//            normalCusPhNo.remove(normIdx);
//            this.primeCusPasswd.add(this.normalCusPasswd.get(normIdx));
//            normalCusPasswd.remove(normIdx);
//            this.primeCusWallet.add(this.normalCusWallet.get(normIdx) + 1000 - 200);
//            normalCusWallet.remove(normIdx);
//        }
//    }
//
//
//    public int makePayment() {
//        return this.cartPricing;
//    }
//
//    public void addToWallet(String cusUsrname, String cusEmail, String cusPasswd, String stat,int amount) {
//        if (stat == "ELITE") {
//            int i = 0;
//            for (String element : this.eliteCusName) {
//                if (element == cusUsrname) {
//                    this.eliteCusWallet.set(i,this.eliteCusWallet.get(i) + amount);
//                    break;
//                }
//                i++;
//            }
//            i = 0;
//            for (String element : this.lstCusName) {
//                if (element == cusUsrname) {
//                    this.lstCusWallet.set(i,this.lstCusWallet.get(i) + amount);
//                    break;
//                }
//            }
//        } else if (stat == "PRIME") {
//            int i = 0;
//            for (String element : this.primeCusName) {
//                if (element == cusUsrname) {
//                    this.primeCusWallet.set(i,this.primeCusWallet.get(i) + amount);
//                    break;
//                }
//                i++;
//            }
//            i = 0;
//            for (String element : this.lstCusName) {
//                if (element == cusUsrname) {
//                    this.lstCusWallet.set(i,this.lstCusWallet.get(i) + amount);
//                    break;
//                }
//            }
//        } else {
//            int i = 0;
//            for (String element : this.normalCusName) {
//                if (element == cusUsrname) {
//                    this.normalCusWallet.set(i,this.normalCusWallet.get(i) + amount);
//                    break;
//                }
//                i++;
//            }
//            i = 0;
//            for (String element : this.lstCusName) {
//                if (element == cusUsrname) {
//                    this.lstCusWallet.set(i,this.lstCusWallet.get(i) + amount);
//                    break;
//                }
//            }
//        }
//    }
//
//
////    public void addProductToCart(double productID, int quantityproduct, Admin adminIIIT) {
////        int idx = adminIIIT.getProductIndexFromID(productID, adminIIIT.getCatofProductFromProID(productID));
////        this.cusQuantityCartOfProducts.add(quantityproduct);
////        this.cartPricing += adminIIIT.getpriceOfProductSinglyByIdx(adminIIIT.getProductIndexFromID(productID, adminIIIT.getCatofProductFromProID(productID)),adminIIIT.getCatIndex(adminIIIT.getCatofProductFromProID(productID)));
////
////    }
//
//    public void addProductToCart(double productID, int quantity, Admin adminIIIT) {
//        int idx = adminIIIT.getProductIndexFromID(productID, adminIIIT.getCatofProductFromProID(productID));
//        this.cusCartProductID.add(productID);
//        this.cusQuantityCartOfProducts.add(quantity);
//        this.cusCartOfProductsPriceSingle.add(adminIIIT.getPriceFromProductID(productID));
////        this.cartPricing += adminIIIT.getpriceOfProductSinglyByIdx(adminIIIT.getProductIndexFromID(productID, adminIIIT.getCatofProductFromProID(productID)), adminIIIT.getCatIndex(adminIIIT.getCatofProductFromProID(productID)));
//    }
//
//    public void addDealToCart(int dealIdx, int quantity, Admin adminIIIT) {
//        this.cusCartProductDeals.add(adminIIIT.getGiveAwayDealIDSingly(dealIdx));
//        this.cusCartOfProductsDealPriceSingle.add(adminIIIT.getGiveAwayDealPricingSingly(dealIdx));
//    }
//
//    public void checkAccountBalance(String cusUsrname, String cusEmail, String cusPasswd, String stat) {
//        if (stat == "ELITE") {
//            int i = 0;
//            for (String element : this.eliteCusName) {
//                if (element == cusUsrname) {
//                    System.out.println(this.eliteCusWallet.get(i));
//                    break;
//                }
//                i++;
//            }
//
//        }
//        if (stat == "PRIME") {
//            int i = 0;
//            for (String element : this.primeCusName) {
//                if (element == cusUsrname) {
//                    System.out.println(this.primeCusWallet.get(i));
//                    break;
//                }
//                i++;
//            }
//        }
//        if (stat == "NORMAL") {
//            int i = 0;
//            for (String element : this.normalCusName) {
//                if (element == cusUsrname) {
//                    System.out.println(this.normalCusWallet.get(i));
//                    break;
//                }
//                i++;
//            }
//        }
//
//    }
//
//    public void viewCart(Admin adminIIIT) {
//        System.out.println("The Deals in the cart are");
//        System.out.println(this.cusCartProductDeals);
//        for (ArrayList<Double> element : this.cusCartProductDeals) {
//            System.out.println("The Deal is Of" + adminIIIT.getNameFromProductID(element.get(0)) + adminIIIT.getNameFromProductID(element.get(1)));
////            System.out.println(adminIIIT.getNameFromProductID(element));
//        }
//
//        System.out.println("The products in the cart are:");
////        System.out.println(this.cusCartProductID);
//        for (double element:this.cusCartProductID) {
//            System.out.println(adminIIIT.getNameFromProductID(element));
//        }
//    }
//
//    public void emptyCart() {
//        this.cusCartProductID.clear();
//        this.cusCartProductDeals.clear();
//        this.cusCartOfProductsDealPriceSingle.clear();
//        this.cusQuantityCartOfProducts.clear();
//        this.cusCartOfProductsPriceSingle.clear();
//    }
//
//    public int generateRandomInteger() {
//        return (int) (Math.random() * (10 - 5 + 1)) + 5;
//    }
//
//    public void checkOut(Admin adminIIITD,String stat,String cusUsrname, String cusEmail, String cusPasswd) {
//        for (double element : this.cusCartProductID) {
//            int idx = adminIIITD.getProductIndexFromID(element, adminIIITD.getCatofProductFromProID(element));
//            String proName = adminIIITD.getProductNameFromProductID(element);
//            System.out.println("Product Name: " + proName);
//            ArrayList<ArrayList<String>> Details = adminIIITD.getCategoryProductsDetailsSingly(adminIIITD.getCategoryIndex(element));
//            System.out.println(Details);
//
//        }
//        int totalProPrice = 0;
//        int totalProPriceDeals = 0;
//        int i = 0;
//        for (int element:this.cusCartOfProductsPriceSingle) {
//            totalProPrice += (element * this.cusQuantityCartOfProducts.get(i));
//            i++;
//        }
//        System.out.println("Total Price Of Product come Out To be Equal To : ");
//        System.out.println(totalProPrice);
//        for (ArrayList<Double> element : this.cusCartProductDeals) {
//            String proName1 = adminIIITD.getProductNameFromProductID(element.get(0));
//            String proName2 = adminIIITD.getProductNameFromProductID(element.get(1));
//            System.out.println("The deal of " + proName1 + " and " + proName2);
//        }
//        int j = 0;
//        for (int element:this.cusCartOfProductsDealPriceSingle) {
//            totalProPriceDeals += element;
//            j++;
//        }
////        System.out.println("Total Price Of Product come Out To be Equal To : ");
//        System.out.println("Total Price Of Deals come Out To be Equal To : ");
//        System.out.println(totalProPriceDeals);
//        int finalTotal = totalProPrice + totalProPriceDeals;
//        System.out.println("final Pricing after adding them");
//        System.out.println(finalTotal);
//
//        if (stat == "ELITE") {
//            System.out.println("Discount Of 10%");
//            System.out.println("Delivery Charges = 100");
//            System.out.println("The Amount is: " + finalTotal);
//            finalTotal = (int) (finalTotal - (0.1 * finalTotal));
//            if (eliteCoupon.isEmpty() == false) {
//                int highest = 0;
//                for (int element : eliteCoupon) {
//                    if (element > highest) {
//                        highest = element;
//
//                    }
//                }
//                eliteCoupon.remove(highest);
//                System.out.println("Putting On The coupon discount");
//                finalTotal = finalTotal - (finalTotal * ((highest/100)));
//            }
//            System.out.println("Effective Amount to be paid after discount is : " + finalTotal);
//            System.out.println("deliveries will be made within 3-6 days");
//            int couponNum = generateRandomInteger();
//            System.out.println("coupon of " + couponNum + "is added");
//            eliteCoupon.add(couponNum);
//            System.out.println("Effective Amount to be paid after Discount is : " + finalTotal + 100);
//            System.out.println("deliveries will be made within 2 days");
//
//            int wallMoney = this.eliteCusWallet.get(this.getindexRegUserLogIn(cusUsrname, cusEmail, cusPasswd)) - finalTotal;
//            this.eliteCusWallet.set(this.getindexRegUserLogIn(cusUsrname, cusEmail, cusPasswd),wallMoney);
//            //Wallet is also needed to modified
//        } else if (stat == "PRIME") {
//
//            System.out.println("Discount Of 5%");
//            System.out.println("Delivery Charges = 100 + 2%");
//            double a = finalTotal;
//            finalTotal = (int) (finalTotal - (0.05*a) + (100 + a*0.02));
//            if (primeCoupon.isEmpty() == false) {
//                int highest = 0;
//                for (int element : primeCoupon) {
//                    if (element > highest) {
//                        highest = element;
//                    }
//                }
//                primeCoupon.remove(highest);
//                System.out.println("Putting On The coupon discount");
//                finalTotal = finalTotal - (finalTotal * ((highest/100)));
//            }
//            System.out.println("Effective Amount to be paid after discount is : " + finalTotal);
//            System.out.println("deliveries will be made within 7-10 days");
//            int couponNum = generateRandomInteger();
//            System.out.println("coupon of " + couponNum + "is added");
//            primeCoupon.add(couponNum);
//            int wallMoney = this.primeCusWallet.get(this.getindexRegUserLogIn(cusUsrname, cusEmail, cusPasswd)) - finalTotal;
//            this.primeCusWallet.set(this.getindexRegUserLogIn(cusUsrname, cusEmail, cusPasswd),wallMoney);
//
//
//        } else {
//            System.out.println("No Discount");
//            System.out.println("Delivery Charges = 100 + 5%");
//            double a = finalTotal;
//            finalTotal = (int) (finalTotal + (100 + a*0.05));
//            System.out.println("Effective Amount to be paid is : " + finalTotal);
//            int wallMoney = this.normalCusWallet.get(this.getindexRegUserLogIn(cusUsrname, cusEmail, cusPasswd)) - finalTotal;
//            this.normalCusWallet.set(this.getindexRegUserLogIn(cusUsrname, cusEmail, cusPasswd),wallMoney);
//        }
//
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//public class copyFlip {
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
//                int rollNo = sc.nextInt();
//                if (adminIIIT.checkAdmin(usrname, rollNo) == true) {
//                    int lop1 = 1;
//                    while (lop1 == 1) {
//                        System.out.println("Welcome " + usrname + "!!!!\n" +
//                                "Please choose any one of the following actions:\n" +
//                                "1) Add category\n" +
//                                "2) Delete category\n" +
//                                "3) Add Product\n" +
//                                "4) Delete Product\n" +
//                                "5) Set Discount on Product\n" +
//                                "6) Add giveaway deal\n" +
//                                "7) Back");
//                        int operate1 = sc.nextInt();
//                        if (operate1 == 1) {
//                            System.out.println("Category Name : ");
//                            String catName = sc.nextLine();
//                            System.out.println("Category ID : ");
//                            int catID = sc.nextInt();
//                            System.out.println("Product Name : ");
//                            String proName = sc.nextLine();
//                            System.out.println("Product ID : ");
//                            double proID = sc.nextDouble();
//                            System.out.println("Quantity Of Product : ");
//                            int quanOfProduct = sc.nextInt();
//                            System.out.println("Price Of Product : ");
//                            int priceOfProduct = sc.nextInt();
//                            System.out.println("Enter Details");
//                            ArrayList<String> details = new ArrayList<String>();
//                            while (true) {
//                                String det = sc.nextLine();
//                                if ((det == "\n") && (details.isEmpty() == true)) {
//                                    System.out.println("please enter input correctly");
//                                    System.out.println("To terminate press 0 else any key");
//                                } else if ((det == "\n") && details.isEmpty() == false) {
//                                    break;
//                                } else {
//                                    details.add(det);
//                                }
//                            }
//                            if (details.isEmpty() == false) {
//                                adminIIIT.addCategory(catID,catName,proName,proID,details,quanOfProduct,priceOfProduct);
//                                System.out.println("Category Added");
//                            }
//
//                        } else if (operate1 == 2) {
//                            System.out.println("Category Name : ");
//                            String catName = sc.nextLine();
//                            System.out.println("Category ID : ");
//                            int catID = sc.nextInt();
//                            if (adminIIIT.checkCatNameID(catName, catID)) {
//                                adminIIIT.deleteCategory(catName, catID);
//                            } else {
//                                System.out.println("Check Input does not exist");
//                            }
//                        } else if (operate1 == 3) {
//                            System.out.println("Category Name : ");
//                            String catName = sc.nextLine();
//                            System.out.println("Product Name : ");
//                            String proName = sc.nextLine();
//                            System.out.println("Product ID : ");
//                            double proID = sc.nextDouble();
//                            System.out.println("Quantity Of Product : ");
//                            int quanOfProduct = sc.nextInt();
//                            System.out.println("Price Of Product : ");
//                            int priceOfProduct = sc.nextInt();
//                            System.out.println("Enter Details");
//                            ArrayList<String> details = new ArrayList<String>();
//                            while (true) {
//                                String det = sc.nextLine();
//                                if ((det == "\n") && (details.isEmpty() == true)) {
//                                    System.out.println("please enter input correctly");
//                                    System.out.println("To terminate press 0 else any key");
//                                } else if ((det == "\n") && details.isEmpty() == false) {
//                                    break;
//                                } else {
//                                    details.add(det);
//                                }
//                            }
//                            adminIIIT.addProduct(adminIIIT.getCatIndex(catName),proID,details,proName,quanOfProduct,priceOfProduct);
//                        } else if (operate1 == 4) {
//                            System.out.println("Category Name : ");
//                            String catName = sc.nextLine();
//                            System.out.println("Product ID : ");
//                            double proID = sc.nextDouble();
//                            if (adminIIIT.checkCatName(catName)){
//                                adminIIIT.deleteProduct(catName, proID);
//                            }
//                        } else if (operate1 == 5) {
//                            System.out.println("Product ID : ");
//                            double proID = sc.nextDouble();
//                            System.out.println("Enter discount for Elite, Prime and Normal customers respectively (in % terms)");
//                            int []arr = new int[3];
//                            for (int i = 0; i < 3; i++) {
//                                arr[i] = sc.nextInt();
//                            }
//                            adminIIIT.setDiscountOnProduct(proID, arr[0], arr[1], arr[2]);
//                        } else if (operate1 == 6) {
//                            System.out.println("Product ID1 : ");
//                            double proID1 = sc.nextDouble();
//                            System.out.println("Product ID2 : ");
//                            double proID2 = sc.nextDouble();
//                            System.out.println("Give Away Pricing : ");
//                            int givePrice = sc.nextInt();
//                            if ((adminIIIT.checkProductIDExistance(proID1) == true) && (adminIIIT.checkProductIDExistance(proID2) == true)) {
//                                adminIIIT.addGiveawayDeal(proID1,proID2,givePrice);
//                            } else {
//                                System.out.println("Check the product IDs");
//                            }
//
//                        } else {
//                            System.out.println("Exiting ---- chosen to exit or entered wrong Input");
//                        }
//                    }
//
//                } else {
//                    System.out.println("Entered Wrong USERNAME or PASSWORD");
//                }
//
//
//                //------------------username and password needs to be checked------------------//
//
//            } else if (operate == 2) {
//                boolean operate2lop = true;
//                while (operate2lop = true) {
//                    System.out.println("1 --> start/again\n"+
//                            "2 --> stop");
//                    int a = sc.nextInt();
//                    if (a == 1) {
//                        customerIIIT.showCategories(adminIIIT);
//                        int idex = sc.nextInt();
//                        customerIIIT.seeProducts(idex,adminIIIT);
//                    } else if (a == 2) {
//                        System.out.println("Exited");
//                        operate2lop = false;
//                    } else {
//                        System.out.println("Exiting Wrong input Chosen");
//                        operate2lop = false;
//                    }
//                }
//            } else if (operate == 3) {
//                if (adminIIIT.getGiveAwayDealPricing().isEmpty() == false) {
//                    int i = 0;
//                    for (ArrayList<Double> element : adminIIIT.getGiveAwayDealID()) {
//                        System.out.println("The Deal is Of " + element.get(0) + " And " + element.get(1) + " At the Pricing Of " + adminIIIT.getGiveAwayDealPricingSingly(i));
//                        i++;
//                    }
//                } else {
//                    System.out.println("Dear User, there are no deals for now!!! Please check regularly for exciting deals.");
//                }
//
//            } else if (operate == 4) {
//                int lop4 = 1;
//                while (lop4 == 1) {
//                    System.out.println("1) Sign up\n" +
//                            "2) Log in\n" +
//                            "3) Back");
//                    int operate4 = 1;
//                    if (operate4 == 1) {
//                        System.out.println("Enter Name");
//                        String cusName = sc.nextLine();
//                        System.out.println("Enter Age");
//                        int cusAge = sc.nextInt();
//                        System.out.println("Enter Email-ID");
//                        String cusEmailID = sc.nextLine();
//                        System.out.println("Enter Password");
//                        String cusPassword = sc.nextLine();
//                        System.out.println("Enter Ph No.");
//                        int cusPhNo = sc.nextInt();
//                        customerIIIT.signUp(cusName,cusAge,cusPhNo,cusEmailID,cusPassword);
//
//                    } else if (operate4 == 2) {
//                        System.out.println("Enter Name");
//                        String cusUsrname = sc.nextLine();
//                        System.out.println("Enter Password");
//                        String cusPasswd = sc.nextLine();
//                        System.out.println("Enter Email");
//                        String cusEmail = sc.nextLine();
//                        if (customerIIIT.logIn(cusUsrname, cusEmail, cusPasswd) == true){
//
//                            int operate42lop = 1;
//                            while (operate42lop == 1) {
//                                System.out.println("Welcome" + cusUsrname + "!!\n" +
//                                        "1) browse products\n" +
//                                        "2) browse deals\n" +
//                                        "3) add a product to cart\n" +
//                                        "4) add products in deal to cart\n" +
//                                        "5) view coupons\n" +
//                                        "6) check account balance\n" +
//                                        "7) view cart\n" +
//                                        "8) empty cart\n" +
//                                        "9) checkout cart\n" +
//                                        "10) upgrade customer status\n" +
//                                        "11) Add amount to wallet\n" +
//                                        "12) back");
//                                int operate42 = sc.nextInt();
//                                if (operate42 == 1) {
//                                    boolean operate42lop2 = true;
//                                    while (operate42lop2 = true) {
//                                        System.out.println("1 --> start/again\n"+
//                                                "2 --> stop");
//                                        int a = sc.nextInt();
//                                        if (a == 1) {
//                                            customerIIIT.showCategories(adminIIIT);
//                                            System.out.println("Enter the number of category you would like to Browse");
//                                            int idex = sc.nextInt();
//                                            customerIIIT.seeProducts(idex,adminIIIT);
//                                        } else if (a == 2) {
//                                            System.out.println("Exited");
//                                            operate42lop2 = false;
//                                        } else {
//                                            System.out.println("Exiting Wrong input Chosen");
//                                            operate42lop2 = false;
//                                        }
//                                    }
//                                } else if (operate42 == 2) {
//                                    if (adminIIIT.getGiveAwayDealPricing().isEmpty() == false) {
//                                        int i = 0;
//                                        for (ArrayList<Double> element : adminIIIT.getGiveAwayDealID()) {
//                                            System.out.println("The Deal is Of " + element.get(0) + " And " + element.get(1) + " At the Pricing Of " + adminIIIT.getGiveAwayDealPricingSingly(i));
//                                            i++;
//                                        }
//                                    } else {
//                                        System.out.println("Dear User, there are no deals for now!!! Please check regularly for exciting deals.");
//                                    }
//
//                                } else if (operate42 == 3) {
//                                    System.out.println("Enter product ID and quantity: ");
//                                    int [] lstProQuan = new int[2];
//                                    for (int i = 0; i < 2; i++) {
//                                        lstProQuan[i] = sc.nextInt();
//                                    }
//                                    customerIIIT.addProductToCart(lstProQuan[0],lstProQuan[1],adminIIIT);
//                                } else if (operate42 == 4) {
//                                    if (adminIIIT.getGiveAwayDealPricing().isEmpty() == false) {
//                                        int i = 0;
//                                        for (ArrayList<Double> element : adminIIIT.getGiveAwayDealID()) {
//                                            System.out.println(i + ".) " + "The Deal is Of " + element.get(0) + " And " + element.get(1) + " At the Pricing Of " + adminIIIT.getGiveAwayDealPricingSingly(i));
//                                            i++;
//                                        }
//                                    } else {
//                                        System.out.println("Dear User, there are no deals for now!!! Please check regularly for exciting deals.");
//                                    }
//                                    System.out.println("Enter the Number of the deal you Want to add");
//                                    int dealIdx = sc.nextInt();
//                                    int quantity = 1;
//                                    customerIIIT.addDealToCart(dealIdx,quantity,adminIIIT);
//                                } else if (operate42 == 5) {
//                                    System.out.println("To view coupon for elite press 1" +
//                                            "To view coupon for prime press 2" +
//                                            "To view coupon for normal press 3");
//                                    int viewCou = sc.nextInt();
//                                    if (viewCou == 1) {
//                                        System.out.println("The four Coupons Available are: ");
//                                        System.out.println("10 % discount on each product they buy\n" +
//                                                "free surprise from FLIPZONE\n" +
//                                                "deliveries will be made within 2 days for 'ELITE' customers\n" +
//                                                "Will receive 3-4 coupons for every order above the limit of Rs 5000");
//                                    } else if (viewCou == 2) {
//                                        // have to pay delivery charges equal to flat Rs 100 + 2%
//                                        System.out.println("The three Coupons Available are: ");
//                                        System.out.println("5 % discount on each product they buy\n" +
//                                                "deliveries will be made within 3-6 days for 'PRIME' customers\n" +
//                                                "Will receive 1-2 coupons for every order above the limit of Rs 5000");
//
//                                    } else if (viewCou == 3) {
//                                        System.out.println("Sorry!! No Coupons Available");
//                                    } else {
//                                        System.out.println("Not selected the correct Input");
//                                    }
//                                } else if (operate42 == 6) {
//                                    String stat = customerIIIT.getCurrentStatusString(cusUsrname, cusEmail, cusPasswd);
//                                    customerIIIT.checkAccountBalance(cusUsrname,cusEmail,cusPasswd,stat);
//                                }
//                                else if (operate42 == 7) {
//                                    customerIIIT.viewCart(adminIIIT);
//                                } else if (operate42 == 8) {
//                                    customerIIIT.emptyCart();
//                                    System.out.println("Cart Emptied!");
//                                } else if (operate42 == 9) {
//                                    System.out.println("Your order is placed successfully. Details:");
//                                    String stat = customerIIIT.getCurrentStatusString(cusUsrname, cusEmail, cusPasswd);
//                                    customerIIIT.checkOut(adminIIIT,stat,cusUsrname,cusEmail,cusPasswd);
//                                } else if (operate42 == 10) {
//                                    customerIIIT.currentStatus(cusUsrname,cusEmail,cusPasswd);
//                                    System.out.println("Choose new status:");
//                                    String newStat = sc.next();
//                                    System.out.println();
//                                    customerIIIT.upgradeStatus(cusUsrname,cusEmail,cusPasswd,newStat,customerIIIT.getCurrentStatusString(cusUsrname,cusEmail,cusPasswd));
//                                    System.out.println("Status updated to " + newStat);
//                                } else if (operate42 == 11) {
//                                    String stat = customerIIIT.getCurrentStatusString(cusUsrname, cusEmail, cusPasswd);
//                                    System.out.println("Enter the Amount To Add ");
//                                    int amount = sc.nextInt();
//                                    customerIIIT.addToWallet(cusUsrname,cusEmail,cusPasswd,stat,amount);
//                                } else if (operate42 == 12) {
//                                    operate42lop = 0;
//                                    System.out.println("Bye" + cusUsrname + "!!!!");
//                                } else {
//                                    operate42lop = 0;
//                                    System.out.println("Exiting ---- entered wrong Input");
//                                }
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
