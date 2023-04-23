import java.util.*;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDateTime;
import java.time.Instant;
import java.time.ZoneId;



class Student {
//    DateTimeFormatter df = DateTimeFormatter.ofPattern("ddth L")
    private static int numStudentsRegistered;
    private static int normalStu;
    private String [] studentsRegistered = new String[100];
    private static int numPlacedStudents;
    private String [] offeredCompanyToStudents = new String[100];
    private static String[] PlacedStudents = new String[100];
//    private static int numUnplacedStudents;
//    private static int numBlockedStudents;

    private int [] CTC = new int[100];
    private String [] currentStatus = new String[100];//about the status that whether placed or not
    private String [] name = new String[100];
    private String [] email = new String[100];
    private static int stu = 0;
    private int [] rollNo = new int[100];

    private float [] cgpa = new float[100];
    private String [] branch = new String[100];

    private String [] availableCompanies = new String[100];

    private String [][] compToStudent = new String[100][100];
    private int [] RejectOffer = new int[100];

    public void setCgpaSingly(int indx,float cgpa) {
        this.cgpa[indx] = cgpa;
    }

    private int [] normalRollNo = new int[100];
    private String [] normalName = new String[100];
    private String [] normalEmail = new String[100];
    private float [] normalCGPA = new float[100];
    private String [] normalBranch = new String[100];

    public void setNormalNameSingly(String normalName,int idx) {
        this.normalName[idx] = normalName;
    }

    public String getNormalNameSingly(int idx) {
        return this.normalName[idx];
    }

    public void setNormalEmailSingly(String email,int idx) {
        this.normalEmail[idx] = email;
    }

    public String getNormalEmailSingly(int idx) {
        return this.normalEmail[idx];
    }

    public void setNormalRollNoSingly(int roll,int idx) {
        this.normalRollNo[idx] = roll;
    }

    public int getNormalRollNoSingly(int idx) {
        return this.normalRollNo[idx];
    }

    public void setNormalCGPASingly(float cg,int idx) {
        this.normalCGPA[idx] = cg;
    }

    public float getNormalCGPASingly(int idx) {
        return this.normalCGPA[idx];
    }

    public void addStudent(String name, int rollNo, float cgpa, String branch,String email) {
        this.normalName [this.normalStu] = name;
        this.normalRollNo [this.normalStu]= rollNo;
        this.normalCGPA [this.normalStu]= cgpa;
        this.normalBranch [this.normalStu]= branch;
        this.normalEmail[this.normalStu] = email;
        this.studentsRegistered[this.normalStu] = name;
        this.normalStu += 1;
    }

    public int findIndexNormal(String name) {
        int i = 0;
        for (String element:this.normalName) {

            if (element == name) {
                break;
            }
            i++;
        }
        return i;
    }

    public void registerForPlacementDrive(String name, int rollNo, float cgpa, String branch,String email) {
        this.name [this.stu] = name;
        this.rollNo [this.stu]= rollNo;
        this.cgpa [this.stu]= cgpa;
        this.branch [this.stu]= branch;
        this.email[this.stu] = email;
        this.numStudentsRegistered += 1;
        this.studentsRegistered[this.stu] = name;
        stu += 1;
    }

    public String[] getStudentsRegistered() {
        return studentsRegistered;
    }

    public String getEmail(int idx) {
        return email[idx];
    }

    public void setOfferedCompanyToStudentsSingly(String choice, String stuName) {
        this.offeredCompanyToStudents [findIndex(stuName)] = choice;
    }

    // missing the eligibility
    public int findIndex(String name) {
        int i = 0;
        for (String element:this.name) {

            if (element == name) {
                break;
            }
            i++;
        }
        return i;
    }
    public String getName(int stu) {
        return name [stu];
    }

    public String[] getCompToStudentSinglyList(int idx) {
        return compToStudent[idx];
    }

    public int getRollNo(int stu) {
        return rollNo [stu];
    }

    public float getCgpaSingly(int idx) {
        return cgpa [idx];
    }

    public String getBranch(int stu) {
        return branch [stu];
    }

    public String getNormalBranch(int stu) {
        return normalBranch [stu];
    }

    public String getOfferedCompanySingly(int idx) {
        return offeredCompanyToStudents[idx];
    }

    public void getAllAvailableCompanies(String stuName, Company companyIIIT, PlacementCell placementCellIIIT) {
        for (int i = 0; i < placementCellIIIT.getNumberOfCompanyRegistrations(companyIIIT) ; i++) {


            if (this.PlacedStudents[findIndex(stuName)] == "Placed") {
                if (3 * CTC[findIndex(stuName)] <= companyIIIT.getPackageOfferedSingly(i)) {
                    if (this.getCgpaSingly(findIndex(stuName)) >= companyIIIT.getCriteriaCGPASingly(i)) {

                        System.out.println(companyIIIT.getCompNameSingle(i) + "--> Available");
                        this.compToStudent[findIndex(stuName)][findIndex(companyIIIT.getCompNameSingle(i))] = companyIIIT.getCompNameSingle(i);


                    } else {
                        System.out.println(companyIIIT.getCompNameSingle(i) + "--> Unavailable");
                    }
                } else {
                    System.out.println(companyIIIT.getCompNameSingle(i) + "--> Unavailable");
                }

            } else {
                if (this.getCgpaSingly(findIndex(stuName)) >= companyIIIT.getCriteriaCGPASingly(i)) {
                    System.out.println(companyIIIT.getCompNameSingle(i) + "--> Available");
                    this.compToStudent[findIndex(stuName)][findIndex(companyIIIT.getCompNameSingle(i))] = companyIIIT.getCompNameSingle(i);

                } else {
                    System.out.println(companyIIIT.getCompNameSingle(i) + "--> Unavailable");
                }

            }

        }
    }

    public void setPlacedStudents(int idx,int place) {
        if (place == 0) {
            PlacedStudents[idx] = "Unplaced";
        } else if (place == 1) {
            PlacedStudents[idx] = "Placed";
        } else {
            PlacedStudents[idx] = "Blocked";
        }
        //decided after accepting and rejecting offer
    }

    public void getCurrentStatus(String stuName, PlacementCell placementCellIIIT,Company companyIIITD) {
        if (currentStatus[findIndex(stuName)] == "offered") {
            placementCellIIIT.getCompanyDetails(companyIIITD,companyIIITD.findCompIndex(getOfferedCompanySingly(findIndex(stuName))));

        }
    }

    public void acceptOffer(String stuName) {
//        PlacedStudents[findIndex(stuName)] = "Placed";
        setPlacedStudents(findIndex(stuName),1);

    }

    public void rejectOffer(String stuName) {
//        PlacedStudents[findIndex(stuName)] = "UnPlaced";
        setPlacedStudents(findIndex(stuName),0);
        RejectOffer [findIndex(stuName)] += 1;
        if (RejectOffer[findIndex(stuName)] == 3) {
            System.out.println("You are blocked from placements");
            setPlacedStudents(findIndex(stuName),3);
        }

    }

    public static int getNumStudentsRegistered() {
        return numStudentsRegistered;
    }

    public static int getNumPlacedStudents() {
        return numPlacedStudents;
    }

    public static int getNumBlockedStudents() {
        int numBlockedStudents = 0;
        for (String element :PlacedStudents) {
            if (element == "Blocked") {
                numBlockedStudents += 1;
            }
        }
        return numBlockedStudents;
    }

    public static int getNumUnplacedStudents() {
        int numUnplacedStudents = 0;
        for (String element :PlacedStudents) {
            if (element == "Unplaced") {
                numUnplacedStudents += 1;
            }
        }
        return numUnplacedStudents;
    }

    public void registerForCompany(Company companyIIIT,String stuName,String compName,Student stud) {
        //        if in eliginilty criteria then registered else not

        companyIIIT.setRegStudents(stuName,companyIIIT.findCompIndex(compName),this.findIndex(stuName),stud);
    }

}

class PlacementCell {

    Date compRegOpenDate;
    Date compRegCloseDate;
    Date stuRegOpenDate;
    Date stuRegCloseDate;

    public Date getCompRegCloseDate() {
        return compRegCloseDate;
    }

    public Date getCompRegOpenDate() {
        return compRegOpenDate;
    }

    public Date getStuRegCloseDate() {
        return stuRegCloseDate;
    }

    public Date getStuRegOpenDate() {
        return stuRegOpenDate;
    }

    public void openStudentRegistrations(String openDate, String closeDate) {
        try {
//          SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY");
            SimpleDateFormat dateForm = new SimpleDateFormat("dd'th' MMMM yyyy, kk:mm a");
            this.stuRegOpenDate = dateForm.parse(openDate);
            this.stuRegCloseDate = dateForm.parse(closeDate);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }

    }

    public void openCompanyRegistrations(String openDate, String closeDate) {
        try {
//            SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY");
            SimpleDateFormat dateForm = new SimpleDateFormat("dd'th' MMMM yyyy, kk:mm a");
            this.compRegOpenDate = dateForm.parse(openDate);
            this.compRegCloseDate = dateForm.parse(closeDate);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
        //also need to set deadline for the companies
        //and the deaadline of their forms
    }

    public void getNumberOfStudentRegistrations(Student stu) {
        int numb = stu.getNumStudentsRegistered();
        System.out.println("The Number Of Students registered are " + numb);
    }

    public int getNumberOfCompanyRegistrations(Company companyIIIT) {
        int count = 0;
        for (String element: companyIIIT.getCompName()) {
            count += 1;
        }
        return count;
        //print the number of companies registed
        //an unplaced student who rejects all available offers at any instant is blockedfrom placement cycle
    }

    public void setCGPAStudent(String stuName, float newCGPA, float oldCGPA, Student studentIIIT) {
        if (studentIIIT.getCgpaSingly(studentIIIT.findIndex(stuName)) == oldCGPA) {
            studentIIIT.setCgpaSingly(studentIIIT.findIndex(stuName),newCGPA);
        }

    }

    public void getNumberPlacedUnplacedBlocked(Student stu,Company companyIIIT) {
        System.out.println("Total Placed Students are:" + stu.getNumPlacedStudents());
        //print the name of the placed students
        //
        System.out.println("Total Placed Students are:" + stu.getNumUnplacedStudents());
        System.out.println("Total Placed Students are:" + stu.getNumBlockedStudents());

        for (String element:companyIIIT.getStudentOfferedComp()) {
            int i = 0;
            if (element == "Offered") {
                getStudentDetailsSingly(stu,stu.getName(i));
            }
            i++;

        }

    }

    public void getStudentDetails(Student stud, int rollno, String name,Company companyIIIT) {
        for (String element:stud.getStudentsRegistered()) {
            if (element == name) {
                System.out.println("Participating In Placment Drive");
            }
        }
        System.out.println("Companies applied for:-");
        int i = 0;
        for (String element : stud.getCompToStudentSinglyList(stud.findIndex(name))) {
            if (element != null) {
                System.out.println("Applied in " + element + "And was Offered");
            } else {
                System.out.println("Not Applied in " + companyIIIT.getCompNameSingle(i));
            }
            i++;
        }

    }

    public void getCompanyDetailsOfferETC(Company companyIIIT, String compName,Student stud) {
        getCompanyDetails(companyIIIT,companyIIIT.findCompIndex(compName));
        for (String element : companyIIIT.getStudentRegCompSinglyList(companyIIIT.findCompIndex(compName))) {
            System.out.println("Name:-" + stud.getName(stud.findIndex(element)));
            System.out.println("Roll No.:-" + stud.getRollNo(stud.findIndex(element)));
        }
    }

    public void getAveragePackage(Company companyIIIT) {
        int total = 0;
        int coun = 0;
        for (String element : companyIIIT.getCompName()) {
            total = companyIIIT.getEachCompStudentNumSingly(companyIIIT.findCompIndex(element)) * companyIIIT.getPackageOfferedSingly(companyIIIT.findCompIndex(element));
            coun += companyIIIT.getEachCompStudentNumSingly(companyIIIT.findCompIndex(element));
        }
        int avg = total/coun;
        System.out.println("The Average package is " + avg);
    }
//    try {
////            SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY");
//        String date = "18th September 2022, 17:05 PM";
//        SimpleDateFormat dateForm = new SimpleDateFormat("dd'th' MMMM yyyy, kk:mm a");
//        Date prtDate = dateForm.parse(date);
//    } catch (ParseException exception) {
//        exception.printStackTrace();
//    }

    public void getStudentDetailsSingly(Student stud,String name) {
        System.out.println(stud.getName(stud.findIndex(name)));
        System.out.println(stud.getRollNo(stud.findIndex(name)));
        System.out.println(stud.getCgpaSingly(stud.findIndex(name)));
        System.out.println(stud.getBranch(stud.findIndex(name)));
    }

    public void getCompanyDetails(Company companyIIIT,int idx) {
        System.out.println(companyIIIT.getCompNameSingle(idx));
        System.out.println(companyIIIT.getPackageOfferedSingly(idx));
        System.out.println(companyIIIT.getRoleSingly(idx));
        System.out.println(companyIIIT.getCriteriaCGPASingly(idx));
        //enter the details or print them as int the above function
    }

//    public getAverage() {
//        //print the average packages of the students
//    }

    public void getCompanyProcessResults(Company companyIIIT, String compName,Student stud) {
        int i = 0;
        for (String element : companyIIIT.getStudentSelectedInRegComp(companyIIIT.findCompIndex(compName))) {
            if (element == "Offered") {
                System.out.println("The company has selected: " + stud.getName(i));
            }
            i++;
        }
        //the company should send in a list of all the students they have selected to the cell. Take the company name as input in this case.
    }

}

class Company {

    private String [] compName = new String [100];
    private static int compNum = 0;
    private String [] role = new String [100];;
    private int [] packageOffered = new int [100];;
    private float [] criteriaCGPA = new float [100];

    private String [] normalCompName = new String [100];
    private static int normalCompNum = 0;
    private String [] normalRole = new String [100];;
    private int [] normalPackageOffered = new int [100];
    private float [] normalCriteriaCGPA = new float [100];;
    private Date [] registrationOpenDateTime = new Date[100];
    private Date [] registrationCloseDateTime = new Date[100];

    private String [][] appStu = new String[100][100];
    private String [][] nameAppStu = new String[100][100];
    private String [][] regStudents = new String[100][100];
    private String [][] studentRegComp = new String[100][100];
    private String [][] studentSelectedInRegComp = new String[100][100];

    private String [] studentOfferedComp = new String[100];

    private int [] eachCompStudentNum = new int[100];

    public Date getRegistrationCloseDateTime(int idx) {
        return registrationCloseDateTime[idx];
    }

    public Date getRegistrationOpenDateTime(int idx) {
        return registrationOpenDateTime[idx];
    }

    public void setEachCompStudentNum(Company companyIIIT) {
        for (String element : companyIIIT.getCompName()) {
            int count = 0;
            for (String element1 : companyIIIT.getRegStudents(companyIIIT.findCompIndex(element))) {
                if (element1 != null) {
                    count += 1;
                }
            }
            this.eachCompStudentNum[companyIIIT.findCompIndex(element)] = count;
        }
    }

    public int getEachCompStudentNumSingly(int idx) {
        return eachCompStudentNum[idx];
    }

    public String getRoleSingly(int idx) {
        return role[idx];
    }

    public String[] getRegStudents(int idx) {
        return regStudents[idx];
    }

    public int[] getPackageOffered() {
        return packageOffered;
    }

    public int getPackageOfferedSingly(int idx) {
        return packageOffered[idx];
    }


    //    public int getCriteriaCGPA(int index) {
//        return criteriaCGPA[index];
//    }


    public float getCriteriaCGPASingly(int idx) {
        return criteriaCGPA[idx];
    }

    public String getCompNameSingle(int idx) {
        return compName[idx];
    }
    public String getNormalCompNameSingle(int idx) {
        return normalCompName[idx];
    }

    public String[] getCompName() {
        return compName;
    }

    public String[] getStudentOfferedComp() {
        return studentOfferedComp;
    }

    public String[] getStudentRegCompSinglyList(int idx) {
        return studentRegComp[idx];
    }

    public String[] getStudentSelectedInRegComp(int idx) {
        return studentSelectedInRegComp[idx];
    }

    public void setRegStudents(String name, int idx1, int idx2, Student stu) {
        this.regStudents[idx1][idx2] = name;
        this.studentRegComp[stu.findIndex(name)][idx1] = "Offered";
        this.studentSelectedInRegComp[idx1][stu.findIndex(name)] = "Offered";
        this.studentOfferedComp[stu.findIndex(name)] = "Offered";
    }

    public int findCompIndex(String name) {
        int i = 0;
        for (String element: this.compName) {

            if (element == name) {
                break;
            }
            i++;
        }
        return i;
    }

    public int findNormalCompIndex(String name) {
        int i = 0;
        for (String element: this.normalCompName) {

            if (element == name) {
                break;
            }
            i++;
        }
        return i;
    }


    public void NormalCompanyEnter(String compName,String role,int packageOffered,float criteriaCGPA) {
        this.normalCompName [normalCompNum] = compName;
        this.normalRole [normalCompNum]= role;
        this.normalPackageOffered [normalCompNum]= packageOffered;
        this.normalCriteriaCGPA [normalCompNum] = criteriaCGPA;

//        this.registrationOpenDateTime [compNum] = registrationOpenDateTime;
//        this.registrationCloseDateTime [compNum] = registrationCloseDateTime;


    }
    public void registerToInstituteDrive(String compName,String role,int packageOffered,float criteriaCGPA,String registrationOpenDateTime,String registrationCloseDateTime) {
        this.compName [compNum] = compName;
        this.role [compNum]= role;
        this.packageOffered [compNum]= packageOffered;
        this.criteriaCGPA [compNum] = criteriaCGPA;
        try {
//          SimpleDateFormat dateForm = new SimpleDateFormat("MM/dd/YY");
            SimpleDateFormat dateForm = new SimpleDateFormat("dd'th' MMMM yyyy, kk:mm a");
            this.registrationOpenDateTime [compNum] = dateForm.parse(registrationOpenDateTime);
            this.registrationCloseDateTime [compNum] = dateForm.parse(registrationCloseDateTime);
        } catch (ParseException exception) {
            exception.printStackTrace();
        }
//        this.registrationOpenDateTime [compNum] = registrationOpenDateTime;
//        this.registrationCloseDateTime [compNum] = registrationCloseDateTime;
        compNum += 1;

    }

    public void getSelectedStudents(Student stud) {
        int i = 0;
        for (String element:studentOfferedComp) {

            if (element == "Offered") {
                System.out.println("Name; " + stud.getName(i) + "||" + "Email: " + stud.getEmail(i) + "||" + "Roll no.: " + stud.getRollNo(i));
            }
            i++;
        }
    }

    public void updateRole(String role,String compName) {
        this.role [findCompIndex(compName)] = role;
    }

    public void updatePackage(int pkg,String compName) {
        this.packageOffered [findCompIndex(compName)] = pkg;
    }

    public void updateCGPA(float cgpa,String compName) {
        this.criteriaCGPA [findCompIndex(compName)] = cgpa;

    }

    public void getAvailableCompanies() {
        int i = 1;
        for (String element : compName) {
            System.out.println(i + ")" + element);
        }
    }

    public void getAvailableCompaniesNormal() {
        int i = 1;
        for (String element : normalCompName) {
            System.out.println(i + ")" + element);
        }
    }

    public String getAvailableCompaniesNormalSingly(int idx) {
        return normalCompName[idx];
    }

    public float getNormalCriteriaCGPA(int idx) {
        return normalCriteriaCGPA[idx];
    }

    public String getNormalRole(int idx) {
        return normalRole[idx];
    }

    public int getNormalPackageOffered(int idx) {
        return normalPackageOffered[idx];
    }

    public void updateRoleSingly(String role, int idx) {
        this.role[idx] = role;
    }

    public void updatePackageOfferedSingly(int packageOffered,int idx) {
        this.packageOffered[idx] = packageOffered;
    }

    public void updateCriteriaCGPASingly(float criteriaCGPA,int idx) {
        this.criteriaCGPA[idx] = criteriaCGPA;
    }

    public void updateNormalRoleSingly(String role, int idx) {
        this.normalRole[idx] = role;
    }

    public void updateNormalPackageOfferedSingly(int packageOffered,int idx) {
        this.normalPackageOffered[idx] = packageOffered;
    }

    public void updateNormalCriteriaCGPASingly(float criteriaCGPA,int idx) {
        this.normalCriteriaCGPA[idx] = criteriaCGPA;
    }
}


//-------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------//
//-------------------------------------------------------------------------------------------//
public class FutureBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student studentIIIT = new Student();
        Company companyIIIT = new Company();
        PlacementCell placementCellIIIT = new PlacementCell();
        System.out.println("The Application would start when you type in 'Enter FutureBuilder' ");
        String applicationName = sc.nextLine();
//        System.out.println(applicationName);
        int lp = 0;
        if (Objects.equals(applicationName, "Enter FutureBuilder")) {
//        if (applicationName == "Enter FutureBuilder") {
            lp = 1;
        }
        int applicationOp;

        while (lp == 1) {
            System.out.println("Welcome to FutureBuilder:\n" +
                    "1) Enter the Application\n" +
                    "2) Exit the Application");
            applicationOp = sc.nextInt();
            if (applicationOp == 1){
                int entExi = 1;
                int operate;
                while (entExi == 1) {
                    System.out.println("Choose The mode you want to Enter in:-\n" +
                            "1) Enter as Student Mode\n" +
                            "2) Enter as Placement Cell Mode\n" +
                            "3) Enter as Company Mode\n" +
                            "4) Return To Main Application");
                    operate = sc.nextInt();
                    if (operate == 1) {
                        int operate1back = 1;
                        int operate1;
                        while (operate1back == 1) {

                            System.out.println("Choose the Student Query to perform-\n" +
                                    "1) Enter as a Student(Give Student Name, and Roll No.)\n" +
                                    "2) Add students\n" +
                                    "3) Back");
                            operate1 = sc.nextInt();
                            if (operate1 == 1) {
                                sc.nextLine();
                                String operate1Name = sc.nextLine();
                                int operate1RollNo = sc.nextInt();
                                int operate11back = 1;
                                while (operate11back == 1) {
                                    System.out.println("Welcome " + operate1Name + "\n" +
                                            "1) Register For Placement Drive\n" +
                                            "2) Register For Company\n" +
                                            "3) Get All available companies\n" +
                                            "4) Get Current Status\n" +
                                            "5) Update CGPA\n" +
                                            "6) Accept offer\n" +
                                            "7) Reject offer\n" +
                                            "8) Back");
                                    int operate11 = sc.nextInt();
                                    if (operate11 == 1) {
                                        ZoneId defaultZoneId = ZoneId.systemDefault();
                                        DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("dd'th' MMMM yyyy, kk:mm a");
                                        LocalDateTime localDate = LocalDateTime.now();
//                                        System.out.println(dateForm.format(localDate));
//                                        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
                                        Instant instant = localDate.atZone(ZoneId.systemDefault()).toInstant();
                                        Date date = Date.from(instant);
//                                        Date date = Date.from(date.atStartOfDay()
//                                                .atZone(ZoneId.systemDefault())
//                                                .toInstant());
//                                        Date date = java.sql.Date.valueOf(localDate);
                                        if ((placementCellIIIT.getStuRegCloseDate().compareTo(date) >= 0) && (placementCellIIIT.getStuRegOpenDate().compareTo(date) < 0)) {
                                            float operate11cgpa = sc.nextInt();
                                            String operate11branch = sc.nextLine();
                                            String operate11email = sc.nextLine();
                                            studentIIIT.registerForPlacementDrive(operate1Name, operate1RollNo, studentIIIT.getNormalCGPASingly(studentIIIT.findIndexNormal(operate1Name)), studentIIIT.getNormalBranch(studentIIIT.findIndexNormal(operate1Name)), studentIIIT.getNormalEmailSingly(studentIIIT.findIndexNormal(operate1Name)));
                                            System.out.println(operate1Name + "Registered for the Placement Drive at IIITD!!!!");
                                        } else {
                                            System.out.println("Check the dates please!!!!");
                                        }
                                    } else if (operate11 == 2) {
                                        System.out.println("Enter the company Name: ");
                                        sc.nextLine();
                                        String operate11CompName = sc.nextLine();
                                        ZoneId defaultZoneId = ZoneId.systemDefault();
                                        DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("dd'th' MMMM yyyy, kk:mm a");
                                        LocalDateTime localDate = LocalDateTime.now();
//                                        System.out.println(dateForm.format(localDate));
//                                        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
                                        Instant instant = localDate.atZone(ZoneId.systemDefault()).toInstant();
                                        Date date = Date.from(instant);
                                        if ((companyIIIT.getRegistrationOpenDateTime(companyIIIT.findCompIndex(operate11CompName)).compareTo(date) >= 0) && (companyIIIT.getRegistrationCloseDateTime(companyIIIT.findCompIndex(operate11CompName)).compareTo(date) < 0)) {
                                            studentIIIT.registerForCompany(companyIIIT, operate1Name, operate11CompName, studentIIIT);
                                            System.out.println(operate1Name + "Registered for the company " + operate11CompName);
                                        } else {
                                            System.out.println("Please Check the registration Dates!!!!");
                                        }

                                    } else if (operate11 == 3) {
                                        System.out.println("The available companies are:-");
                                        studentIIIT.getAllAvailableCompanies(operate1Name, companyIIIT, placementCellIIIT);

                                    } else if (operate11 == 4) {
                                        studentIIIT.getCurrentStatus(operate1Name, placementCellIIIT, companyIIIT);

                                    } else if (operate11 == 5) {
                                        System.out.println("Enter the old cgpa: ");
                                        float operate11Oldcgpa = sc.nextFloat();
                                        System.out.println("Enter the new cgpa: ");
                                        float operate11Newcgpa = sc.nextFloat();
                                        placementCellIIIT.setCGPAStudent(operate1Name, operate11Oldcgpa, operate11Newcgpa, studentIIIT);
                                        System.out.println("CGPA UPDATED!!");
                                    } else if (operate11 == 6) {
                                        studentIIIT.acceptOffer(operate1Name);

                                    } else if (operate11 == 7) {
                                        studentIIIT.rejectOffer(operate1Name);
                                    } else if (operate11 == 8) {
                                        operate11back = 0;
                                    } else {
                                        System.out.println("Exiting chosen to exit or entered wrong Input");
                                        operate11back = 0;
                                    }

                                }
//                                studentIIIT.
                            } else if (operate1 == 2) {
                                System.out.println("Enter Number of students to add: ");
                                int numberAdd = sc.nextInt();
                                for (int i = 0; i < numberAdd; i++) {
                                    System.out.println("Please add students Name, Roll No, CGPA, Branch, Email(in order)");
                                    sc.nextLine();
                                    String operate11name = sc.nextLine();
                                    System.out.println(operate11name);
                                    int operate11RollNo = sc.nextInt();
                                    float operate11cgpa = sc.nextFloat();
                                    System.out.println("add branch");
                                    sc.nextLine();
                                    String operate11branch = sc.nextLine();
//                                    sc.nextLine();
                                    System.out.println("add email");
                                    String operate11email = sc.nextLine();
                                    studentIIIT.addStudent(operate11name,operate11RollNo,operate11cgpa,operate11branch,operate11email);
//                                    studentIIIT.registerForPlacementDrive(operate11name,operate11RollNo,operate11cgpa,operate11branch,operate11email);
                                }
                                System.out.println("Students have been added!!");
                            }else if (operate1 == 3) {
                                operate1back = 0;
                            } else {
                                System.out.println("Exiting chosen to exit or entered wrong Input");
                                operate1 = 0;
                            }
                        }
                    } else if (operate == 3) {
                        int operate3back = 1;
                        int operate3;
                        while (operate3back == 1) {

                            System.out.println("Choose the Company Query to perform-\n" +
                                    "1) Add Company and Details\n" +
                                    "2) Choose Company\n" +
                                    "3) Get Available Companies\n" +
                                    "4) Back");
                            operate3 = sc.nextInt();
                            if (operate3 == 1) {
                                String operate31CompName = sc.nextLine();
                                String operate31CompRole = sc.nextLine();
                                int operate31CompPkgOffered = sc.nextInt();
                                float operate31criteriaCGPA = sc.nextFloat();
//                                System.out.println("Enter Company Opening Registration date");
//                                String operate31CompOpenDate = sc.nextLine();
//                                System.out.println("Enter Company Closing Registration date");
//                                String operate31CompCloseDate = sc.nextLine();
//                                companyIIIT.registerToInstituteDrive(operate31CompName,operate31CompRole,operate31CompPkgOffered,operate31criteriaCGPA,operate31CompOpenDate,operate31CompCloseDate);
                                companyIIIT.NormalCompanyEnter(operate31CompName,operate31CompRole,operate31CompPkgOffered,operate31criteriaCGPA);
                            } else if (operate3 == 2) {
                                System.out.println("Choose To enter into mode of Available Companies:-");
                                companyIIIT.getAvailableCompanies();
                                int operate32ModeNum = sc.nextInt();
                                int operate32ModeNumBack = 1;

                                while (operate32ModeNumBack == 1) {
                                    System.out.println("Welcome "+  companyIIIT.getNormalCompNameSingle(operate32ModeNum - 1) + "\n" +
                                            "1) Update Role\n" +
                                            "2) Update Package\n" +
                                            "3) Update CGPA criteria\n" +
                                            "4) Register To Institute Drive\n" +
                                            "5) Back");
                                    int operatePerformation = sc.nextInt();
                                    if (operatePerformation == 1) {
                                        System.out.println("Enter the Role for updation");
                                        String operate321CompRole = sc.nextLine();
                                        companyIIIT.updateNormalRoleSingly(operate321CompRole,operate32ModeNum - 1);

                                    } else if (operatePerformation == 2) {
                                        System.out.println("Enter the Package for updation");
                                        int operate322CompPkg = sc.nextInt();
                                        companyIIIT.updateNormalPackageOfferedSingly(operate322CompPkg,operate32ModeNum - 1);

                                    } else if (operatePerformation == 3) {
                                        System.out.println("Enter the CGPA for updation");
                                        float operate323CGPA = sc.nextFloat();
                                        companyIIIT.updateNormalCriteriaCGPASingly(operate323CGPA,operate32ModeNum - 1);
                                    } else if (operatePerformation == 4) {
                                        ZoneId defaultZoneId = ZoneId.systemDefault();
                                        DateTimeFormatter dateForm = DateTimeFormatter.ofPattern("dd'th' MMMM yyyy, kk:mm a");
                                        LocalDateTime localDate = LocalDateTime.now();
                                        System.out.println(dateForm.format(localDate));
//                                        Date date = Date.from(localDate.atStartOfDay(defaultZoneId).toInstant());
                                        Instant instant = localDate.atZone(ZoneId.systemDefault()).toInstant();
                                        Date date = Date.from(instant);
                                        if ((placementCellIIIT.getCompRegCloseDate().compareTo(date) >= 0) && (placementCellIIIT.getCompRegOpenDate().compareTo(date) < 0)) {
                                            System.out.println("Enter Company Opening Registration date");
                                            sc.nextLine();
                                            String operate33CompOpenDate = sc.nextLine();
                                            System.out.println("Enter Company Closing Registration date");
                                            sc.nextLine();
                                            String operate33CompCloseDate = sc.nextLine();
                                            companyIIIT.registerToInstituteDrive(companyIIIT.getNormalCompNameSingle(operate32ModeNum - 1), companyIIIT.getNormalRole(operate32ModeNum - 1), companyIIIT.getNormalPackageOffered(operate32ModeNum - 1), companyIIIT.getNormalCriteriaCGPA(operate32ModeNum - 1), operate33CompOpenDate, operate33CompCloseDate);
                                        } else {
                                            System.out.println("Please Check The dates!!!!");
                                        }
                                    } else {
                                        System.out.println("Exiting chosen to exit or entered wrong Input");
                                        operate32ModeNumBack = 0;
                                    }
                                }
                            } else if (operate3 == 3) {
                                System.out.println("The Available Companies are: ");
                                companyIIIT.getAvailableCompaniesNormal();
                            } else {
                                System.out.println("Exiting chosen to exit or entered wrong Input");
                                operate3back = 0;
                            }
                        }
                    }else if (operate == 2) {
                        int operate2back = 1;
                        int operate2;
                        while (operate2back == 1) {

                            System.out.println("Welcome to IIITD Placement Cell\n" +
                                    "1) Open Student Registrations\n" +
                                    "2) Open Company Registrations\n" +
                                    "3) Get Number of Student Registrations\n" +
                                    "4) Get Number of Company Registrations\n" +
                                    "5) Get Number of Offered/Unoffered/Blocked Students\n" +
                                    "6) Get Student Details\n" +
                                    "7) Get Company Details\n" +
                                    "8) Get Average Package\n" +
                                    "9) Get Company Process Results\n" +
                                    "10) Back");
                            operate2 = sc.nextInt();
                            if (operate2 == 1) {
                                System.out.println("Fill in the details:-\n" +
                                        "1) Set the Opening time for Student registrations\n" +
                                        "2) Set the Ending time for Student registrations.");
                                sc.nextLine();
                                String openStuRegDate = sc.nextLine();
                                String closeStuRegDate = sc.nextLine();
                                placementCellIIIT.openStudentRegistrations(openStuRegDate,closeStuRegDate);
                                System.out.println("Successfully Entered");

                            } else if (operate2 == 2) {
                                System.out.println("Fill in the details:-\n" +
                                        "1) Set the Opening time for Company registrations\n" +
                                        "2) Set the Ending time for Company registrations.");
                                sc.nextLine();
                                String openCompRegDate = sc.nextLine();
                                String closeCompRegDate = sc.nextLine();
                                placementCellIIIT.openCompanyRegistrations(openCompRegDate,closeCompRegDate);

                                System.out.println("Successfully Entered");
                            } else if (operate2 == 3) {
                                System.out.println("The Details are as follows: ");
                                placementCellIIIT.getNumberOfStudentRegistrations(studentIIIT);
                            }else if (operate2 == 4) {
                                System.out.println("The Details are as follows: ");
                                placementCellIIIT.getNumberOfCompanyRegistrations(companyIIIT);
                            }else if (operate2 == 5) {
                                placementCellIIIT.getNumberPlacedUnplacedBlocked(studentIIIT,companyIIIT);

                            }else if (operate2 == 6) {
                                System.out.println("Enter The name of the student to fetch details: ");
                                String operate26Name = sc.nextLine();
                                placementCellIIIT.getStudentDetailsSingly(studentIIIT,operate26Name);

                            }else if (operate2 == 7) {
                                System.out.println("Enter The name of the company to fetch details: ");
                                String operate26CompName = sc.nextLine();
                                placementCellIIIT.getCompanyDetails(companyIIIT,companyIIIT.findCompIndex(operate26CompName));

                            }else if (operate2 == 8) {
                                placementCellIIIT.getAveragePackage(companyIIIT);

                            }else if (operate2 == 9) {
                                System.out.println("Enter The name of the company to get the results: ");
                                String operate26CompName = sc.nextLine();
                                placementCellIIIT.getCompanyProcessResults(companyIIIT,operate26CompName,studentIIIT);

                            }else {
                                System.out.println("Exiting chosen to exit or entered wrong Input");
                                operate2back = 0;
                            }
                        }
                    }else if (operate == 4) {
                        System.out.println("Exited");
                        entExi = 0;
                    }
                }

            } else {
                System.out.println("Default Exit choosen Wrong Input");
                lp = 0;
            }

        }

    }

}
