/******************************************************************************
 *  This is a BMI medical database java program design to store data for their patients
 *  You can add new data, visualize a patients data, modify data, and order on screen 
 *  all data according to an atribute of your choice
 *  American College of Thessaloniki, all rights reserved.
 *  Last modified: Biorni Prifti 20170263@student.act.edu 20/3/2018
 ******************************************************************************/
//Importing the needed libraries for the program to work
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class mainBMI{
   public static void main(String[] args) throws IOException {
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   String inData=null;
   
     //Declaring and initializing the needed varibales to be later used
     int IDnumb =0;
     String firstName=null;
     String lastName=null;
     String lastVisit=null;
     char sex=' ';
     int age=0;
     double height=0;
     double weight=0;
     String comments=null;
     double BMI=0;
     String characterize=null; 
     int option=0;
     int choice=0;
   
     //Creating an array list for the patient objects
     List<Patient> patientList = new ArrayList<>();
         
   
   //Using do loop in order to make sure that the main menu keeps appearing untill the exit button (5) is pressed
   do
   {
   System.out.println("Please select one of the following options:");
   System.out.println("1. Insert new patient data");
   System.out.println("2. Retrieve existing patient data");
   System.out.println("3. Modify existing patient data");
   System.out.println("4. Sort existing data and display on screen");
   System.out.println("5. Exit");
   System.out.println();
   inData = br.readLine (); //reads the user's input and stores it in variable inData
   option = Integer.parseInt( inData ); //converting from line1 to integer
     
   switch(option)//Using the switch as our menu which will have 5 options
   {
    case 1: //Option 1 new user data
    
    try{
    System.out.println(" Please enter the patient's National Health ID number");
    inData = br.readLine (); //reads the user's input and stores it in variable inData
    IDnumb = Integer.parseInt( inData ); //converting from line1 to integer
   }
   catch ( Exception ex)
   {
       System.out.println("Must be a 9 digit integer");
   }
    try{//Using try catch system of error trapping on all following lines where user input is needed
    System.out.println(" Please enter the patient's First Name");
    inData = br.readLine (); //reads the user's input and stores it in variable inData
    firstName =  inData ; //converting from line1 to integer
   }
   catch ( Exception ex)
   {
       System.out.println("Must be a String");
   }
   try{
    System.out.println(" Please enter the patient's Last Name");
    inData = br.readLine (); //reads the user's input and stores it in variable inData
    lastName =  inData ; //converting from line1 to integer
   } 
   catch ( Exception ex)
   {
       System.out.println("Must be a String");
   }
   try{
    System.out.println(" Please enter the patient's last medical visit");
    inData = br.readLine (); //reads the user's input and stores it in variable inData
    lastName =  inData ; //converting from line1 to integer
   }
   catch ( Exception ex)
   {
       System.out.println("Must be a String");
   }
   try{
    System.out.println(" Please enter the patient's sex");
    inData = br.readLine();//reads the user's input and stores it in variable inData
    sex = inData.charAt(0);
   } 
   catch ( Exception ex)
   {
       System.out.println("Must be eith M or F");
   }
   try{
    System.out.println(" Please enter the patient's age");
    inData = br.readLine (); //reads the user's input and stores it in variable inData
    age = Integer.parseInt( inData ); //converting from line1 to integer
   }
   catch ( Exception ex)
   {
       System.out.println("Must be a integer");
   }
   try{
    System.out.println(" Please enter the patient's height");
    inData = br.readLine();
    height = Double.parseDouble(inData);
   }
   catch ( Exception ex)
   {
       System.out.println("Must be a double");
   }
   try{
    System.out.println(" Please enter the patient's weight");
    inData = br.readLine();
    weight = Double.parseDouble(inData);
   }
   catch ( Exception ex)
   {
       System.out.println("Must be a double");
   }
   try{
    System.out.println(" Please enter the patient's comments");
    inData = br.readLine (); //reads the user's input and stores it in variable inData
    comments =  inData ; //converting from line1 to integer
   }
   catch ( Exception ex)
   {
       System.out.println("Must be a String");
   }
    System.out.println();
    System.out.println();
    
    //Creating new patient object and adding it to the list
     patientList.add(new Patient( IDnumb,firstName, lastName, lastVisit,
              sex, age, height, weight, comments));
    
    break;//Needed to make sure only case 1 gets executed
   
    case 2://Second option find user data
    //Declaring and initializing needed variable
    int searchIDnumb=0;
    //Again using try catch error trapping everywhere, just to be safe
    try{
     System.out.println("Enter the id number: ");
     inData = br.readLine (); 
     searchIDnumb=Integer.parseInt(inData);
    }
    catch ( Exception ex)
   {
       System.out.println("Must be a integer");
   }

    //Using for loop to compare all ID in the array with the one we want
    for(int i=0; i<patientList.size(); i++)
    {
        if(patientList.get(i).getIDnumb() == searchIDnumb)
        {
      System.out.println("Patient number "+ i  +" has National Health ID :"+patientList.get(i).getIDnumb());
      System.out.println("Patient number "+ i +" has First Name :" + patientList.get(i).getFirstName());
      System.out.println("Patient number "+ i +" has Last Name :"+patientList.get(i).getLastName());
      System.out.println("Patient's number "+ i +" last visit was on :"+patientList.get(i).getLastVisit());
      System.out.println("Patient number "+ i +" sex is :"+patientList.get(i).getSex());
      System.out.println("Patient number "+ i +" age is :"+patientList.get(i).getAge());
      System.out.println("Patient number "+i  +" has the height of :"+patientList.get(i).getHeight()+" CM.");
      System.out.println("Patient number "+i  +" has a weight of :"+patientList.get(i).getWeight()+" KG");
      System.out.println("Patient number "+i  +" additional comments are :"+patientList.get(i).getComments());
      System.out.println("Patient number "+i  +" BMI is :"+ patientList.get(i).getBMI());
      System.out.println("Patient number "+i  +" is characterized as :"+patientList.get(i).getCharacterize());
      System.out.println();
      System.out.println();
      }
    }
    break;
      case 3://Option 3 modifying patients data
          //Declaring and initializing variables
     int nrpatient=0;
     int atribute=0;
     try{
     System.out.println("Select the patient you would like to modify data");
     inData = br.readLine (); //reads the user's input and stores it in variable inData
     nrpatient = Integer.parseInt( inData ); //converting from line1 to integer
      }
    catch ( Exception ex)
   {
       System.out.println("Must be a integer");
   }
     for(int i=0; i<patientList.size(); i++)
    {
     
       if(patientList.get(i).getIDnumb() == nrpatient)
    {
      //Showing selected patients data
      System.out.println();
      System.out.println("Visualising patient data ");
      System.out.println("Patient  has National Health ID :"+patientList.get(i).getIDnumb());
      System.out.println("Patient  has First Name :" + patientList.get(i).getFirstName());
      System.out.println("Patient  has Last Name :"+patientList.get(i).getLastName());
      System.out.println("Patient's  last visit was on :"+patientList.get(i).getLastVisit());
      System.out.println("Patient  sex is :"+patientList.get(i).getSex());
      System.out.println("Patient  age is :"+patientList.get(i).getAge());
      System.out.println("Patient  has the height of :"+patientList.get(i).getHeight()+" CM.");
      System.out.println("Patient  has a weight of :"+patientList.get(i).getWeight()+" KG");
      System.out.println("Patient  additional comments are :"+patientList.get(i).getComments());
      System.out.println("Patient  BMI is :"+ patientList.get(i).getBMI());
      System.out.println("Patient  is characterized as :"+patientList.get(i).getCharacterize());
      System.out.println();
      System.out.println();
      //Select the data you would like to modify
      System.out.println("Which atribute would you like to modify? ");
      System.out.println("1.National ID Number ");
      System.out.println("2.First Name ");
      System.out.println("3.Last Name");
      System.out.println("4.Last Visit");
      System.out.println("5.Sex");
      System.out.println("6.Age");
      System.out.println("7.Height");
      System.out.println("8.Weight");
      System.out.println("9.Comments");
      try{
      inData = br.readLine (); //reads the user's input and stores it in variable inData
      atribute = Integer.parseInt( inData ); //converting from line1 to integer
      }
      catch ( Exception ex)
     {
       System.out.println("Must be a number from 1 to 9");
     }
     //Creating an IF menu and using our set methods to chance patients data
      if(atribute==1)
      {
        int newID=0;
        try{
        System.out.println("Enter new National ID number");
        inData = br.readLine (); //reads the user's input and stores it in variable inData
        newID = Integer.parseInt( inData ); //converting from line1 to integer
        patientList.get(nrpatient).setID(newID);
        System.out.println("ID changed");}
        catch ( Exception ex)
       {
       System.out.println("Must be a integer");
        }
      }
      else if(atribute==2)
      {
          try{
        String newFirstName=null;
        System.out.println("Enter new First Name");
        inData = br.readLine (); //reads the user's input and stores it in variable inData
        newFirstName =  inData ;
        patientList.get(nrpatient).setFirstName(newFirstName);
        System.out.println("First Name changed");
        }
        catch ( Exception ex)
        {
       System.out.println("Must be a String");
        }
      }
      else if(atribute==3)
      { 
          try{
        String newLastName=null;
        System.out.println("Enter new Last Name");
        inData = br.readLine (); //reads the user's input and stores it in variable inData
        newLastName =  inData ;
        patientList.get(nrpatient).setLastName(newLastName);
        System.out.println("Last Name changed ");
        }
        catch ( Exception ex)
         {
         System.out.println("Must be a String");
         }
      }
      else if(atribute==4)
      {
        try{
        String newLastVisit=null;
        System.out.println("Enter new Last Visit");
        inData = br.readLine (); //reads the user's input and stores it in variable inData
        newLastVisit =  inData ;
        patientList.get(nrpatient).setLastVisit(newLastVisit);
        System.out.println("Last Visit changed");
       }
       catch ( Exception ex)
      {
       System.out.println("Must be a String");
       }
      }
      else if(atribute==5)
      {
          try{
        char newSex=' '; 
        System.out.println("Enter new sex");
        inData = br.readLine();//reads the user's input and stores it in variable inData
        newSex = inData.charAt(0);
        patientList.get(nrpatient).setSex(newSex);
        System.out.println("Sex Changed");
        }
        catch ( Exception ex)
        {
       System.out.println("Must be  M or F");
        }
      }
      else if(atribute==6)
      {
        try{
        int newAge=0; 
        System.out.println("Enter new age");
        inData = br.readLine (); //reads the user's input and stores it in variable inData
        newAge = Integer.parseInt( inData ); //converting from line1 to integer
        patientList.get(nrpatient).setAge(newAge);
        System.out.println("Age changed");
       }
       catch ( Exception ex)
        {
       System.out.println("Must be a integer");
        }
      }
      else if(atribute==7)
      { 
          try{
        double newHeight=0; 
        System.out.println("Enter new height");
        inData = br.readLine();
        newHeight = Double.parseDouble(inData);
        patientList.get(nrpatient).setHeight(newHeight);
        System.out.println("Height changed");
        }
        catch ( Exception ex)
        {
       System.out.println("Must be a double");
        }
      }
      else if(atribute==8)
      {
          try{
        double newWeight=0; 
        System.out.println("Enter new weight");
        inData = br.readLine();
        newWeight = Double.parseDouble(inData);
        patientList.get(nrpatient).setWeight(newWeight);
        System.out.println("Weight changed");
        }
        catch ( Exception ex)
       {
       System.out.println("Must be a double");
        }
      }
      else if(atribute==9)
      {
        try{
        String newComments=null;
        System.out.println("Enter new comments");
        inData = br.readLine (); //reads the user's input and stores it in variable inData
        newComments =  inData ;
        patientList.get(nrpatient).setComments(newComments);
        System.out.println("Comments changed");
       }
       catch ( Exception ex)
       {
       System.out.println("Must be a String");
       }
      }
      else
      {
        System.out.println("Wrong Input! Select a number from 1-9 ! ");
      }
      
     }
    }
      break;
      
      case 4://Option 4 sorting all data in regard to an atribute
           do
{
   System.out.println("Enter the value you would like to modify");
   System.out.println("Enter 1 if you want them sorted by their id...");
   System.out.println("Enter 2 if you want them sorted by their first name...");
   System.out.println("Enter 3 if you want them sorted by their last name...");
   System.out.println("Enter 4 if you want them sorted by their last visit...");
   System.out.println("Enter 5 if you want them sorted by their age...");
   System.out.println("Enter 6 if you want them sorted by their height...");
   System.out.println("Enter 7 if you want them sorted by their weight...");
   System.out.println("Enter 8 to exit"); 
    try{
    inData = br.readLine (); //reads the user's input and stores it in variable inData
     choice = Integer.parseInt( inData ); //converting from line1 to integer
    }
    catch ( Exception ex)
   {
       System.out.println("Must be a number from 1 - 7");
   }
      for(int i=0; i<patientList.size(); i++)
      {
//Creating an if menu 
if(choice==1)
{
         class PatientCompare implements Comparator<Patient> //Creating a new comparator class in order to compare Patients object by the atribute we choose
         {
         
             
             public int compare(Patient p1, Patient p2) { //Comparing atribute
          
              return Integer.compare(p1.getIDnumb(), p2.getIDnumb());//Returning results
         }
       }
       Collections.sort(patientList ,new PatientCompare());//Sorting 
     }
//The comments of the preceding if aplly to all the remaing if menus, same logic different atribute being compared
if(choice==2)
{
     class PatientCompare implements Comparator<Patient> 
         {
         
             
             public int compare(Patient p1, Patient p2) {
          // write comparison logic here like below , it's just a sample
          return p1.getFirstName().compareTo(p2.getFirstName());
         }
       }
       Collections.sort(patientList ,new PatientCompare());
}
 if(choice==3)
{
     class PatientCompare implements Comparator<Patient> 
         {
         
             
             public int compare(Patient p1, Patient p2) {
          // write comparison logic here like below , it's just a sample
          return p1.getLastName().compareTo(p2.getLastName());
         }
       }
       Collections.sort(patientList ,new PatientCompare());
}   
if(choice==4)
{
     class PatientCompare implements Comparator<Patient> 
         {
         
             
             public int compare(Patient p1, Patient p2) {
          // write comparison logic here like below , it's just a sample
          return p1.getLastVisit().compareTo(p2.getLastVisit());
         }
       }
       Collections.sort(patientList ,new PatientCompare());
} 
if(choice==5)
{
         class PatientCompare implements Comparator<Patient> 
         {
         
             
             public int compare(Patient p1, Patient p2) {
          
              return Integer.compare(p1.getAge(), p2.getAge());
         }
       }
       Collections.sort(patientList ,new PatientCompare());
     }
 if(choice==6)
{
         class PatientCompare implements Comparator<Patient> 
         {
         
             
             public int compare(Patient p1, Patient p2) {
          
              return Double.compare(p1.getHeight(), p2.getHeight());
         }
       }
       Collections.sort(patientList ,new PatientCompare());
     }
      if(choice==7)
{
         class PatientCompare implements Comparator<Patient> 
         {
         
             
             public int compare(Patient p1, Patient p2) {
          
              return Double.compare(p1.getWeight(), p2.getWeight());
         }
       }
       Collections.sort(patientList ,new PatientCompare());
     }
       System.out.println("Patient number "+ i  +" has National Health ID :"+patientList.get(i).getIDnumb());
       System.out.println("Patient number "+ i +" has First Name :" + patientList.get(i).getFirstName());
       System.out.println("Patient number "+ i +" has Last Name :"+patientList.get(i).getLastName());
       System.out.println("Patient's number "+ i +" last visit was on :"+patientList.get(i).getLastVisit());
       System.out.println("Patient number "+ i +" sex is :"+patientList.get(i).getSex());
       System.out.println("Patient number "+ i +" age is :"+patientList.get(i).getAge());
       System.out.println("Patient number "+i  +" has the height of :"+patientList.get(i).getHeight()+" CM.");
       System.out.println("Patient number "+i  +" has a weight of :"+patientList.get(i).getWeight()+" KG");
       System.out.println("Patient number "+i  +" additional comments are :"+patientList.get(i).getComments());
       System.out.println("Patient number "+i  +" BMI is :"+ patientList.get(i).getBMI());
       System.out.println("Patient number "+i  +" is characterized as :"+patientList.get(i).getCharacterize());
       System.out.println();
       System.out.println(); 
    
       }
   }while(choice!=8);
   break;

case 5://Exit menu
System.exit(0);
  break; 
default : System.out.println("Wrong Option Choose from 1-5"); //Error catching default case in case one of the options is not selected
    
      break;
   }
   }while(option!=5);
   
   
   
       
       
       
       
       
       
       
       
       
         
    }
}  