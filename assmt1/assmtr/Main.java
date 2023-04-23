import jdk.jshell.execution.Util;

import java.sql.Array;
import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main{
    static Utilities ut;
    static PlacementCell cell;
    public static void main(String [] args){
        ut = new Utilities();
        cell = new PlacementCell();
        start();
    }
    static void start(){
        System.out.println("Welcome to FutureBuilder:\n" + "1) Enter the Application\n" + "2) Exit the Application\n");
        int ch = ut.scanInteger(1,2);
        if(ch==2){
            System.out.println("Thank you for using FutureBuilder!");
            System.exit(0);
        }else{
            modeMenu();
            start();return;
        }
    }
    static void modeMenu(){
        System.out.println("Choose The mode you want to Enter in:-\n" + "1) Enter as Student Mode\n" + "2) Enter as Company Mode\n" + "3) Enter as Placement Cell Mode\n" + "4) Return To Main Application\n");
        int ch2 = ut.scanInteger(1,4);
        if(ch2==1){
            cell.studentModeMenu();
            modeMenu();return;
        }else if(ch2 == 2){
            cell.companyModeMenu();
            modeMenu();return;
        }else if(ch2 == 3){
            cell.start();
            modeMenu();return;
        }
        else if(ch2==4){
            return;
        }
    }
}
class Utilities{
    HashMap<String,String> Mmap = new HashMap<>();
    HashMap<String,String> Mmapinv = new HashMap<>();
    SimpleDateFormat formatter;
    Scanner scanner;
    public Utilities(){
        Mmap.put("january","01");Mmap.put("february","02");Mmap.put("march","03");Mmap.put("april","04");Mmap.put("may","05");Mmap.put("june","06");Mmap.put("july","07");Mmap.put("august","08");Mmap.put("september","09");Mmap.put("october","10");Mmap.put("november","11");Mmap.put("december","12");
        for(Map.Entry<String, String> entry : Mmap.entrySet()){
            Mmapinv.put(entry.getValue(),entry.getKey());
        }
        formatter = new SimpleDateFormat("mm-HH-dd-MM-yyyy");
        scanner = new Scanner(System.in);
    }
    public Date parseDateFromString(String date){
        String[] args = date.split(" ");
        String finalArgs[] = new String[5];
        for(int i=0;i<5;i++){
            finalArgs[i] = "";
        }
        String day = "";
        for(int i=0;i<args[0].length();i++){
            if(!Character.isDigit(args[0].charAt(i))){
                break;
            }
            day+= args[0].charAt(i);
        }
        String month = Mmap.get(args[1].toLowerCase(Locale.ROOT));
        String year = "";
        for(int i=0;i<args[2].length()-1;i++){
            year+=args[2].charAt(i);
        }
        String hour =args[3].charAt(0)+""+args[3].charAt(1),minute = args[3].charAt(3)+""+args[3].charAt(4);
        String stringdate = (minute+"-"+hour+"-"+day+"-"+month+"-"+year);
        //System.out.println("StringDate = "+stringdate +",\toriginal input date = "+ date);
        Date date1 = new Date();
        try{
        date1 = formatter.parse(stringdate);
        //System.out.println("DONE");
        }
        catch (Exception e){
            System.out.println("THREW EXCEPTION: "+ "StringDate = "+stringdate +",\toriginal input date = "+ date);
        }
        return date1;
    }
    public String parseStringFromDate(Date date){
        String s = formatter.format(date);
        SimpleDateFormat ampm = new SimpleDateFormat("aa");

        String finalS = "";
        finalS+=s.charAt(6)+""+s.charAt(7)+"th " +Mmapinv.get(s.charAt(9)+""+s.charAt(10)).replaceFirst(Mmapinv.get(s.charAt(9)+""+s.charAt(10)).charAt(0)+"",(Mmapinv.get(s.charAt(9)+""+s.charAt(10)).charAt(0)+"").toUpperCase(Locale.ROOT))+" "+s.charAt(12)+""+s.charAt(13)+""+s.charAt(14)+""+s.charAt(15)+", "+s.charAt(3)+""+s.charAt(4)+":"+s.charAt(0)+s.charAt(1) + " "+ampm.format(date);
        return finalS;
    }
    public Integer scanInteger(){
        int temp = -1;
        try{
            String inp = scanner.nextLine();
        temp = Integer.parseInt(inp);
        }catch(Exception e){
            System.out.println("Enter a valid Integer!");
            return scanInteger();
        }
        return temp;
    }
    public double scanDouble(){
        double temp = -1;
        try{
            String inp = scanner.nextLine();
            temp = Double.parseDouble(inp);
        }catch(Exception e){
            System.out.println("Enter a valid numerical value!");
            return scanDouble();
        }
        return temp;
    }
    public Integer scanInteger(int lowerBound, int UpperBound){
        int temp = scanInteger();
        if(temp<lowerBound || temp> UpperBound){
            System.out.println("Invalid Integer! Please enter one between "+lowerBound + " and "+UpperBound);
            return scanInteger(lowerBound,UpperBound);
        }
        return temp;
    }
}
class PlacementCell{
    private ArrayList<Student> students;
    private Utilities ut;
    private Date CompanyRegistrations[],stuRegistrations[];
    private ArrayList<Student> StuList;
    private ArrayList<Student> AllStudentsList;
    private ArrayList<Company> ComList;
    private boolean CompOpened, stuOpened;
    private Scanner scanner;
    public PlacementCell(){
    this.ut = new Utilities();
    CompanyRegistrations = new Date[2];
    stuRegistrations = new Date[2];
    CompOpened = false;
    stuOpened = false;
    StuList = new ArrayList<>();
    ComList = new ArrayList<>();
    scanner = new Scanner(System.in);
    AllStudentsList = new ArrayList<>();
    students = new ArrayList<>();
    }
    void start(){
        System.out.println("Welcome to IIITD Placement Cell\n" + "1) Open Student Registrations\n" + "2) Open Company Registrations\n" + "3) Get Number of Student Registrations\n" + "4) Get Number of Company Registrations\n" + "5) Get Number of Offered/Unoffered/Blocked Students\n" + "6) Get Student Details\n" + "7) Get Company Details\n" + "8) Get Average Package\n" + "9) Get Company Process Results\n" + "10) Back\n");
        Scanner scanner = new Scanner(System.in);
        int ch = ut.scanInteger(1,10);
        if(ch==1){
            OpenStudentRegistrations();return;
        }else if(ch==2){
        openCompanyRegistrations();return;
        }else if(ch ==3){
            System.out.println("There are "+StuList.size()+" students registered for placement!\n Press Enter to continue!");scanner.nextLine();start();return;
        }
        else if(ch==4){
            System.out.println("There are "+ComList.size()+" companies registered for placement!\n Press Enter to continue!");scanner.nextLine();start();return;
        }
        else if(ch==5){
            System.out.println("Number of Students with an offer: "+ getNOfferedStudents() + "\nNumber of Students without an offer: "+ getNUnofferedStudents() + "\nNumber of students that have been blocked from placements: "+getNBlockedStudents()+"\nPress Enter to continue!");scanner.nextLine();start();return;
        }
        else if(ch==6){

        }else if(ch==7){

        }else if(ch==8){

        }
        else if(ch==9){

        }else{
            return;
        }
    }
    void companyModeMenu(){
        System.out.println("Choose the Company Query to perform-\n" + "1) Add Company and Details\n" + "2) Choose Company\n" + "3) Get Available Companies\n" + "4) Back");
        int ch = ut.scanInteger(1,4);
        if(ch==1){
            if(this.CompanyRegistrations[0].compareTo(new Date())>0){
                System.out.println("Company registrations haven't opened yet!\nThey open at +"+ut.parseStringFromDate(this.CompanyRegistrations[0])+"\nPress enter to continue!");scanner.nextLine();
            }else if(this.CompanyRegistrations[1].compareTo(new Date())<0){
                System.out.println("The Company registration deadline has passed!\nPress enter to continue!");scanner.nextLine();
            }
            Company c = new Company(this);
            this.ComList.add(c);
            companyModeMenu();return;
        }
        else if(ch==2){
            System.out.println("Choose to enter into the mode of the Available Companies:");
            System.out.println("0) Back");

            for(int i=0;i<this.ComList.size();i++){
                System.out.println((i+1)+") "+this.ComList.get(i).getName());
            }
            int choice = ut.scanInteger(0,this.ComList.size());
            if(choice ==0){companyModeMenu();return;}
            this.ComList.get(choice-1).OpenUpdateMenu();
            companyModeMenu();return;
        }
        else if(ch==3){
            System.out.println("Here is a list of available companies: ");
            for(int i=0;i<this.ComList.size();i++){
                System.out.println(" - "+this.ComList.get(i).getName()+":\n\tROLE: "+this.ComList.get(i).getRole()+"\n\tCTC: "+this.ComList.get(i).getCTC()+"\n\tMinimum CGPA: "+this.ComList.get(i).getmCGpa()+"\n\tRegistration Time: "+this.ComList.get(i).getRegistrationTime()+"\n");
            }
            System.out.println("Press Enter to Continue!");scanner.nextLine();companyModeMenu();return;

        }else if(ch==4){
            return;
        }
    }
    void studentModeMenu(){
        System.out.println("Choose the Student Query to perform-\n" + "1) Enter as a Student\n" + "2) Add students\n" +"3) View the list of all students\n" +"4) Back");
        int ch = ut.scanInteger(1,4);
        if(ch==1){
            System.out.println("Enter name: ");
            String name[] = scanner.nextLine().split(" ");
            System.out.println("Enter roll number: ");
            String roll = scanner.nextLine();
            int index = -1;
            for(int i=0;i<this.AllStudentsList.size();i++){
                if(this.AllStudentsList.get(i).getRollNo().equalsIgnoreCase(roll) && this.AllStudentsList.get(i).getName()[0].equalsIgnoreCase(name[0]) &&this.AllStudentsList.get(i).getName()[1].equalsIgnoreCase(name[1])){
                    index = i;
                }
            }
            if(index==-1){
                System.out.println("Student not found in the record!\n Press enter to continue!");scanner.nextLine();studentModeMenu();return;
            }
            this.AllStudentsList.get(index).openStudentMenu();this.studentModeMenu();return;
        }else if(ch==2){
            System.out.println("Enter number of students to be added: ");
            int count = ut.scanInteger(1,1000000);
            for(int i=0;i<count;i++){
                Student s11 = new Student(this);
                this.AllStudentsList.add(s11);
            }
        }else if(ch==3){
            System.out.println("Here is the list of all students:");
            for(int i=0;i<this.AllStudentsList.size();i++){
                System.out.println(" - "+(i+1)+this.AllStudentsList.get(i).getName()[0] + " "+this.AllStudentsList.get(i).getName()[1]+"\n\tRoll Number: "+this.AllStudentsList.get(i).getRollNo()+"\n\tCGPA: "+this.AllStudentsList.get(i).getCgpa()+"\n\tBranch:"+this.AllStudentsList.get(i).getBranch()+"\n");
            }
        }else if(ch==4){
            return;
        }
    }
    void OpenStudentRegistrations(){
        //System.out.println("Company registrations end time: "+ CompanyRegistrations[1]+ "\n Current time = "+new Date());
        if(!CompOpened){
            System.out.println("Company registrations are yet opened, please set the time for Company registrations first!\n Press Enter to continue!");scanner.nextLine();start();return;
        }
        if(stuOpened){
            System.out.println("Student registrations have already been started!\n Press Enter to continue!");scanner.nextLine();start();return;
        }
        System.out.println("Fill in the details:-\n 1)Set the Opening time for student Registrations \n 2)Set the Closing time for student Registrations");
        try{
            Date tempDate = ut.parseDateFromString(scanner.nextLine());
            this.stuRegistrations[0] = tempDate;
            tempDate = ut.parseDateFromString(scanner.nextLine());
            this.stuRegistrations[1] = tempDate;
            if(this.stuRegistrations[0].compareTo(this.stuRegistrations[1])>0){
                System.out.println("The registration deadline cannot be before it actually begins!!\n");
                throw new RuntimeException();
            }
            if(this.stuRegistrations[0].compareTo(this.CompanyRegistrations[1])<0){
                this.stuRegistrations = new Date[2];
                System.out.println("Student registrations cannot begin before the company registrations end!\n Try setting a time no earlier than "+ut.parseStringFromDate(this.CompanyRegistrations[1])+"\n\n Press Enter to Continue!");scanner.nextLine();start();return;
            }
        }catch(Exception e){
            System.out.println("Please Enter valid dates!\n Press Enter to continue!");scanner.nextLine();start();return;
        }
        this.stuOpened=true;
        System.out.println("Successfully Opened student Registrations!\n Press Enter to continue!");scanner.nextLine();start();return;

    }
    void openCompanyRegistrations(){
        if(CompOpened){
            if(stuOpened){
                System.out.println("Company registrations have already been started!\n Press Enter to continue!");scanner.nextLine();start();return;
            }
        }
        System.out.println("Fill in the details:-\n 1)Set the Opening time for company Registrations \n 2)Set the Closing time for company Registrations");
        try{
            Date tempDate = ut.parseDateFromString(scanner.nextLine());
            this.CompanyRegistrations[0] = tempDate;
            tempDate = ut.parseDateFromString(scanner.nextLine());
            this.CompanyRegistrations[1] = tempDate;
            if(this.CompanyRegistrations[0].compareTo(this.CompanyRegistrations[1])>0){
                System.out.println("The registration deadline cannot be before it actually begins!!\n");
                throw new RuntimeException();
            }
        }catch(Exception e){
            this.CompanyRegistrations = new Date[2];
            System.out.println("Please Enter valid dates!\n Press Enter to continue!");scanner.nextLine();start();return;
        }
        this.CompOpened=true;
        System.out.println("Successfully Opened company Registrations!\n Press Enter to continue!");scanner.nextLine();start();return;

    }
    Integer getNOfferedStudents(){
        int c =0;
        for(int i=0;i<this.StuList.size();i++){
            if(this.StuList.get(i).getOfferList().size()>0){
                c++;
            }
        }
        return c;
    }
    Integer getNUnofferedStudents(){
        int c =0;
        for(int i=0;i<this.StuList.size();i++){
            if(this.StuList.get(i).getOfferList().size()==0){
                c++;
            }
        }
        return c;
    }
    Integer getNBlockedStudents(){
        int c =0;
        for(int i=0;i<this.StuList.size();i++){
            if(this.StuList.get(i).getBlackListStatus()){
                c++;
            }
        }
        return c;
    }
    public ArrayList<Student> getStuList(){
        return this.StuList;
    }
    public Date[] getStudentDeadlines(){
        return this.stuRegistrations;
    }
    public ArrayList<Company> getComList(){
        return this.ComList;
    }
}
class Student{
    private String name[],RollNo,Branch;
    private double cgpa;
    private PlacementCell Cell;
    private Scanner scanner;
    private ArrayList<Company> offers;
    private ArrayList<Integer> acceptance;
    private Company placed;
    private Utilities ut;
    private boolean isRegistered,isPlaced,isBlacklisted;

    public Student(PlacementCell placementCell){
         this.name = new String[2];
//        this.name[0] = firstName;
//        this.name[1] = Surname;
//        this.RollNo = RollNo;
//        this.Branch = Branch;
         /*        this.isRegistered = false;
        this.isBlacklisted=false;
        this.isPlaced = false;
        this.ut = new Utilities();
        this.scanner = new Scanner(System.in);
        this.offers = new ArrayList<>();
        this.acceptance = new ArrayList<>();

        while(true){
        System.out.println("Enter name: ");this.name = scanner.nextLine().split(" ");
        if(this.name.length == 2){break;}else{System.out.println("Please Enter a valid name!");}
        }
        while(true){
        System.out.println("Enter Roll number: ");this.RollNo = scanner.nextLine();
        int flag = 0;
        for(int c=0; c<this.RollNo.length();c++){
            if(!Character.isDigit(this.RollNo.charAt(c))){flag=1;break;}
        }
        if(flag==0){break;}
        else{System.out.println("Please Enter a valid roll number!");}
        }
        System.out.println("Enter CGPA: ");this.cgpa = ut.scanDouble();
        System.out.println("Enter Branch: ");this.Branch = scanner.nextLine();
        this.Cell = placementCell;
    }*/
        this.isRegistered = false;
        this.isBlacklisted=false;
        this.isPlaced = false;
        this.ut = new Utilities();
        this.scanner = new Scanner(System.in);
        this.offers = new ArrayList<>();
        this.acceptance = new ArrayList<>();

        while(true){
        System.out.println("Enter name: ");this.name = scanner.nextLine().split(" ");
        if(this.name.length == 2){break;}else{System.out.println("Please Enter a valid name!");}
        }
        while(true){
        System.out.println("Enter Roll number: ");this.RollNo = scanner.nextLine();
        int flag = 0;
        for(int c=0; c<this.RollNo.length();c++){
            if(!Character.isDigit(this.RollNo.charAt(c))){flag=1;break;}
        }
        if(flag==0){break;}
        else{System.out.println("Please Enter a valid roll number!");}
        }
        System.out.println("Enter CGPA: ");this.cgpa = ut.scanDouble();
        System.out.println("Enter Branch: ");this.Branch = scanner.nextLine();
        this.Cell = placementCell;
    }
    public void openStudentMenu(){
        System.out.println("Welcome" +this.getName()+"!!\n" +
                "1) Register For Placement Drive\n" +
                "2) Register For Company\n" +
                "3) Get All available companies\n" +
                "4) Get Current Status\n" +
                "5) Update CGPA\n" +
                "6) Back");
        int ch = ut.scanInteger(1,6);
        if(ch==1){
            if(this.isRegistered){
                System.out.println("The student is already registered!\nPress Enter to continue!");scanner.nextLine();openStudentMenu();return;
            }
            if(this.getPlacementCell().getStudentDeadlines()[0].compareTo(new Date())>1){
                System.out.println("Student Registration is yet to begin! Begins at "+ut.parseStringFromDate(this.getPlacementCell().getStudentDeadlines()[0])+"!\nPress Enter to continue!");scanner.nextLine();openStudentMenu();return;
            }
            if(this.getPlacementCell().getStudentDeadlines()[0].compareTo(new Date())>1){
                System.out.println("Student registration deadlines are over!"+"\nPress Enter to continue!");scanner.nextLine();openStudentMenu();return;
            }
            this.isRegistered=true;
            this.getPlacementCell().getStuList().add(this);
            System.out.println("Successfully Registered!"+"\nPress Enter to continue!");scanner.nextLine();openStudentMenu();return;
        }else if(ch==2){
            System.out.println("Enter company name: ");
            String cname = scanner.nextLine();
            int flag = 0;
            for(int i=0;i<this.getPlacementCell().getComList().size();i++){
                if(this.getPlacementCell().getComList().get(i).getName().equalsIgnoreCase(cname)){
                    flag = 1;
                    if(this.getPlacementCell().getComList().get(i).getmCGpa()<=this.cgpa){
                        this.offers.add(this.getPlacementCell().getComList().get(i));
                        this.acceptance.add(0);
                        System.out.println("Registration Complete!\n Press Enter to continue: ");scanner.nextLine();openStudentMenu();return;
                    }else{
                        System.out.println("You donot meet the CGPA requirements of this company!\n Press Enter to continue: ");scanner.nextLine();openStudentMenu();return;
                    }
                }
            }
        }else if(ch==3){
            System.out.println("Here are the list of all available companies:");

            for(int i=0;i<this.getPlacementCell().getComList().size();i++){
                System.out.println((i+1)+") "+this.getPlacementCell().getComList().get(i).getName()+"\n\tMin CGPA: "+this.getPlacementCell().getComList().get(i).getmCGpa()+"\n\tRole offered: "+this.getPlacementCell().getComList().get(i).getRole()+"\n\tCTC: "+this.getPlacementCell().getComList().get(i).getCTC()+"\n");
            }
            System.out.println("Press enter to continue!");scanner.nextLine();openStudentMenu();return;
        }else if(ch==4){
            if(this.offers.size()==0){
                System.out.println("You have not received any offers yet!\nPress Enter to continue!");scanner.nextLine();openStudentMenu();return;
            }
            else{
                System.out.println("Here are all the offers you have received, choose which one to select");
                System.out.println("0) Back");
                for(int i=0;i<this.offers.size();i++){
                    System.out.println((i+1)+") "+offers.get(i).getName()+", CTC Offered: "+offers.get(i).getCTC()+" STATUS: "+(this.acceptance.get(i)==0?"Unread":(this.acceptance.get(i)==1?"Accepted":"Rejected")));
                }
                System.out.println("Enter choice: ");
                int choice = ut.scanInteger(0,this.offers.size());
                if(choice==0){return;}
                if(this.acceptance.get(choice-1)==0){
                    System.out.println("Would you like to:\n1)Accept\n2)Reject");
                    int fc = ut.scanInteger(1,2);
                    if(fc==2){
                        this.acceptance.set(choice-1,-1);
                    }else{
                        this.selectOffer(this.offers.get(choice-1));
                    }
                }else{
                    System.out.println("Already dealt with this company!\n Press Enter to continue!");scanner.nextLine();openStudentMenu();return;
                }
            }
        }else if(ch==5){
            System.out.println("Enter the new CGPA");
            double tcg = ut.scanDouble();
            this.setCGPA(tcg);
            for(int i=0;i<this.offers.size();i++){
                if(this.getCgpa()<offers.get(i).getmCGpa()){
                    System.out.println("As a result of your new CGPA, you have lost your job offer from "+offers.get(i).getName()+"!");
                    offers.remove(i);
                    i--;
                }
            }
            System.out.println("CGPA Updated Successfully!\nPress Enter to continue!");scanner.nextLine();openStudentMenu();return;
        }else if(ch==6){
            return;
        }
    }
    public String[] getName(){
        return name;
    }
    public String getRollNo(){
        return this.RollNo;
    }
    public String getBranch(){
        return this.Branch;
    }
    public double getCgpa(){
        return this.cgpa;
    }
    public void setCGPA(double cgpa){
        this.cgpa = cgpa;
    }
    public PlacementCell getPlacementCell(){
        return this.Cell;
    }

    private void selectOffer(Company company){
        if(this.isBlacklisted){
            System.out.println("You have been blocked from the placement cell due to rejecting all offers!\n Press Enter to continue");scanner.nextLine();return;
        }
        if(this.isPlaced){
            if(company.getCTC()<3*this.placed.getCTC()){
                System.out.println("You are already placed and cannot accept this offer as it is not >=3 times your current CTC!\nPress Enter to continue");scanner.nextLine();return;
            }
        }
        this.isPlaced=true;
        this.placed=company;
        System.out.println("You have successfully accepted the offer from "+this.placed.getName()+"!\nPress Enter to continue");scanner.nextLine();return;
    }
    public ArrayList<Company> getOfferList(){
        return this.offers;
    }
    public boolean getBlackListStatus(){
        return this.isBlacklisted;
    }
}
class Company{
    private String name,role;
    private double ctc,mCGpa;
    private Utilities ut;
    private PlacementCell Cell;
    private Scanner scanner;
    private Date Registrationtime;
    private ArrayList<Student> hiredStudents;
    public Company(PlacementCell cell){
        this.ut = new Utilities();
        this.scanner = new Scanner(System.in);
        this.Cell = cell;
        this.Registrationtime = new Date();
        this.hiredStudents = new ArrayList<>();
        System.out.print("Enter name: ");name =scanner.nextLine();
        System.out.print("\nEnter the name of role Offered: ");role = scanner.nextLine();
        System.out.print("\nEnter the CTC offered: ");ctc = ut.scanDouble();
        System.out.print("\nEnter the minimum CGPA required: ");mCGpa = ut.scanDouble();
        System.out.println("\n Successfully Registered Company!\nRegistration time: "+ut.parseStringFromDate(this.Registrationtime)+"\nPress enter to continue!");scanner.nextLine();
    }

    public void OpenUpdateMenu(){
        System.out.println("Welcome "+this.name);
        System.out.println("1) Update Role\n" + "2) Update Package\n" + "3) Update CGPA criteria\n" + "4) Back");
        int ch = ut.scanInteger(1,4);
        if(ch==1){
            System.out.print("Enter name of the new role: ");
            String temp = scanner.nextLine();
            this.setRole(temp);
        }
        else if(ch==2){
            System.out.print("Enter updated package offered: ");
            double ctc = ut.scanDouble();
            this.setCTC(ctc);

        }
        else if(ch==3){
            System.out.print("Enter new minimum CGPA criteria: ");
            double cgpa = ut.scanDouble();
            this.setmCGpa(cgpa);
        }else if(ch==4){
            return;
        }
        System.out.println("Update Complete!\n Press Enter to Continue");scanner.nextLine();OpenUpdateMenu();return;
    }
    public String getName(){return this.name;}
    public String getRole(){return this.role;}
    public double getCTC(){return this.ctc;}
    public double getmCGpa(){return this.mCGpa;}
    public void setRole(String role){this.role= role;}
    public void setCTC(double ctc){this.ctc = ctc;}
    public void setmCGpa(double mcgpa){this.mCGpa = mcgpa;}
    public PlacementCell getPlacementCell(){return this.Cell;}
    public String getRegistrationTime(){
        return ut.parseStringFromDate(this.Registrationtime);
    }
}