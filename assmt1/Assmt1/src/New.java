//import java.util.*;
//
//class Student {
//    private static int numStudentsRegistered;
//    private static int numPlacedStudents;
//    private static String[] PlacedStudents;
//    private static int numUnplacedStudents;
//    private static int numBlockedStudents;
//    private String status;//about the status that whether placed or not
//    private String [] name;
//    private static int stu;
//    private int [] rollNo;
//    private int [] cgpa;
//    private String [] branch;
//
//    private String [] availableCompanies;
//
//    public void registerForPlacementDrive(String name, int rollNo, int cgpa, String branch) {
//        this.name [this.stu] = name;
//        this.rollNo [this.stu]= rollNo;
//        this.cgpa [this.stu]= cgpa;
//        this.branch [this.stu]= branch;
//        this.numStudentsRegistered += 1;
//        stu += 1;
//    }
//
//    // missing the eligibility
//    public int findIndex(String name) {
//        int i = 0;
//        for (String element:this.name) {
//
//            if (element == name) {
//                break;
//            }
//            i++;
//        }
//        return i;
//    }
//    public String getName(int stu) {
//        return name [stu];
//    }
//
//    public int getRollNo(int stu) {
//        return rollNo [stu];
//    }
//
//    public int getCgpa(int stu) {
//        return cgpa [stu];
//    }
//
//    public String getBranch(int stu) {
//        return branch [stu];
//    }
//
//    public void registerForCompany() {
////        if in eliginilty riteria then registered else not
//
//    }
//
//    public void getAllAvailableCompanies(String [] availCom) {
//        for (String element:availCom) {
//            System.out.println(element);
//        }
//    }
//
//    public String getCurrentStatus() {
//        return status;
//    }
//
//    public void updateCGPA(int cgpa) {
//        this.cgpa = cgpa;
//    }
//
//    public void offer() {
//        //whether the offer was accepted or not
//    }
//
//    public static int getNumStudentsRegistered() {
//        return numStudentsRegistered;
//    }
//
//    public static int getNumPlacedStudents() {
//        return numPlacedStudents;
//    }
//
//    public static int getNumBlockedStudents() {
//        return numBlockedStudents;
//    }
//
//    public static int getNumUnplacedStudents() {
//        return numUnplacedStudents;
//    }
//
//    public void registerForCompany
//}
//
//public class PlacementCell {
//    public void openStudentRegistrations() {
//        System.out.println("Registrations would commence from 15-05-2022");
//        System.out.println("Registrations deadline till 18-05-2022");
//    }
//
//    public void openCompanyRegistrations() {
//
//        //also need to set deadline for the companies
//        //and the deaadline of their forms
//    }
//
//    public void getNumberOfStudentRegistrations(Student stu) {
//        int numb = stu.getNumStudentsRegistered();
//        System.out.println("The Number Of Students registered are " + numb);
//    }
//
//    public void getNumberOfCompanyRegistrations(Student stu) {
//        //print the number of companies registed
//        //an unplaced student who rejects all available offers at any instant is blockedfrom placement cycle
//    }
//
//    public void getNumberPlacedUnplacedBlocked(Student stu) {
//        System.out.println("Total Placed Students are:" + stu.getNumPlacedStudents());
//        //print the name of the placed students
//        //
//        System.out.println("Total Placed Students are:" + stu.getNumUnplacedStudents());
//        System.out.println("Total Placed Students are:" + stu.getNumBlockedStudents());
//
//    }
//
//    public getStudentDetails(Student stud) {
//        System.out.println(stud.getName());
//        System.out.println(stud.getRollNo());
//        System.out.println(stud.getCgpa());
//        System.out.println(stud.getBranch());
//    }
//
//    public void getCompantDetails() {
//        //enter the details or print them as int the above function
//    }
//
//    public getAverage() {
//        //print the avrage packages of the students
//    }
//
//    public getCompanyProcessResults() {
//        //the company should send in a list of all the students they have selected to the cell. Take the company name as input in this case.
//    }
//
//}
//
//class Company {
//    private String compName;
//    private String role;
//    private int packageOffered;
//    private int criteriaCGPA;
//    private String registrationDateTime;
//
//    private String [][] AppStu;
//
//    public void registerToInstituteDrive(String compName,String role,int packageOffered,int criteriaCGPA,String registrationDateTime) {
//        this.compName = compName;
//        this.role = role;
//        this.packageOffered = packageOffered;
//        this.criteriaCGPA = criteriaCGPA;
//        this.registrationDateTime = registrationDateTime;
//
//    }
//
//    public void getSelectedStudents(Student [] offered) {
//
//    }
//
//    public void updateRole(String role) {
//        this.role = role;
//    }
//
//    public void updatePackageOffered(int packageOffered) {
//        this.packageOffered = packageOffered;
//    }
//
//    public void updateCriteriaCGPA(int criteriaCGPA) {
//        this.criteriaCGPA = criteriaCGPA;
//    }
//}
//
//public class Portal {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Student studentIIIT = new Student();
//        Company companyIIIT = new Company();
//        PlacementCell placementCellIIIT = new PlacementCell();
//        int lp = 1;
//        int applicationOp;
//
//        while (lp == 1) {
//            System.out.println("Welcome to FutureBuilder:\n" +
//                    "1) Enter the Application\n" +
//                    "2) Exit the Application");
//            applicationOp = sc.nextInt();
//            if (applicationOp == 1){
//                int entExi = sc.nextInt();
//                int operate;
//                while (entExi == 1) {
//                    System.out.println("Choose The mode you want to Enter in:-\n" +
//                            "1) Enter as Student Mode\n" +
//                            "2) Enter as Company Mode\n" +
//                            "3) Enter as Placement Cell Mode\n" +
//                            "4) Return To Main Application");
//                    operate = sc.nextInt();
//                    if (operate == 1) {
//                        int operate1back = 1;
//                        int operate1;
//                        while (operate1back == 1) {
//
//                            System.out.println("Choose the Student Query to perform-\n" +
//                                    "1) Enter as a Student(Give Student Name, and Roll No.)\n" +
//                                    "2) Add students\n" +
//                                    "3) Back");
//                            operate1 = sc.nextInt();
//                            if (operate1 == 1) {
////                                studentIIIT.
//                            } else if (operate1 == 2) {
//
//                            }else if (operate1 == 3) {
//                                operate1back = 0;
//                            } else {
//                                System.out.println("Exiting chosen to exit or entered wrong Input");
//                                operate1 = 0;
//                            }
//                        }
//                    } else if (operate == 2) {
//                        int operate2back = 1;
//                        int operate2;
//                        while (operate2back == 1) {
//
//                            System.out.println("Choose the Company Query to perform-\n" +
//                                    "1) Add Company and Details\n" +
//                                    "2) Choose Company\n" +
//                                    "3) Get Available Companies\n" +
//                                    "4) Back");
//                            operate2 = sc.nextInt();
//                            if (operate2 == 1) {
//
//                            } else if (operate2 == 2) {
//
//                            } else if (operate2 == 3) {
//
//                            }else {
//                                System.out.println("Exiting chosen to exit or entered wrong Input");
//                                operate2 = 0;-
//                            }
//                        }
//                    }else if (operate == 3) {
//                        int operate3back = 1;
//                        int operate3;
//                        while (operate3back == 1) {
//
//                            System.out.println("Welcome to IIITD Placement Cell\n" +
//                                    "1) Open Student Registrations\n" +
//                                    "2) Open Company Registrations\n" +
//                                    "3) Get Number of Student Registrations\n" +
//                                    "4) Get Number of Company Registrations\n" +
//                                    "5) Get Number of Offered/Unoffered/Blocked Students\n" +
//                                    "6) Get Student Details\n" +
//                                    "7) Get Company Details\n" +
//                                    "8) Get Average Package\n" +
//                                    "9) Get Company Process Results\n" +
//                                    "10) Back");
//                            operate3 = sc.nextInt();
//                            if (operate3 == 1) {
//                                System.out.println("Fill in the details:-\n" +
//                                        "1) Set the Opening time for Student registrations\n" +
//                                        "2) Set the Ending time for Student registrations.");
//
//                            } else if (operate3 == 2) {
//
//                            } else if (operate3 == 3) {
//
//                            }else if (operate3 == 4) {
//
//                            }else if (operate3 == 5) {
//
//                            }else if (operate3 == 6) {
//
//                            }else if (operate3 == 7) {
//
//                            }else if (operate3 == 8) {
//
//                            }else if (operate3 == 9) {
//
//                            }else {
//                                System.out.println("Exiting chosen to exit or entered wrong Input");
//                                operate3 = 0;
//                            }
//                        }
//                    }else if (operate == 4) {
//                        System.out.println("Exited");
//                        entExi = 0;
//                    }
//                }
//
//            } else {
//                System.out.println("Default Exit choosen Wrong Input");
//                lp = 0;
//            }
//
//        }
//    }
//
//}


public class New {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
