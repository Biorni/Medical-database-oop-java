/******************************************************************************
 *  This is the Patients class I created in order to instantiate Patients objects in our main 
 *  BMI menu 
 *  American College of Thessaloniki, all rights reserved.
 *  Last modified: Biorni Prifti 20170263@student.act.edu 20/3/2018
 ******************************************************************************/

import java.util.ArrayList;
class Patient
 {
    //Declaring and initializing variables
    private int IDnumb =0;
    private String firstName=null;
    private String lastName=null;
    private String lastVisit=null;
    private char sex=' ';
    private int age=0;
    private double height=0;
    private double weight=0;
    private String comments=null;
    private double BMI=0;
    public String characterize=null;
    
    //Creating constructor
    Patient (int IDnumb,String firstName,String lastName,String lastVisit,
             char sex,int age,double height,double weight,String comments)
    {
        this.IDnumb=IDnumb;
        this.firstName=firstName;
        this.lastName=lastName;
        this.lastVisit=lastVisit;
        this.sex=sex;
        this.age=age;
        this.height=height;
        this.weight=weight;
        this.comments=comments;
        BMI();
        Characterize();
    }
    //Creating get methods
    public int getIDnumb()
    {
        return IDnumb;
    }
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public String getLastVisit()
    {
        return lastVisit;
    }
    public char getSex()
    {
        return sex;
    }
    public int getAge()
    {
        return age;
    }
    public double getHeight()
    {
        return height;
    }
    public double getWeight()
    {
        return weight;
    }
    public String getComments()
    {
        return comments;
    }
    public double getBMI()
    {
        return BMI();
    }
    public String getCharacterize()
    {
        return characterize;
    }
    
    //Creating set methods
    public void setID(int newIDnumb)
    {
        IDnumb=newIDnumb;
    }
    public void setFirstName(String newFirstName)
    {
        firstName=newFirstName;
    }
    public void setLastName(String newLastName)
    {
        lastName=newLastName;
    }
    public void setLastVisit(String newLastVisit)
    {
        lastVisit=newLastVisit;
    }
    public void setSex(char newSex)
    {
        sex=newSex;
    }
    public void setAge(int newAge)
    {
        age=newAge;
    }
    public void setHeight(double newHeight)
    {
        if(height > 0)
        {
            newHeight = height;

            if(newHeight > 0 && weight > 0)
            {
                BMI();
                Characterize();
            }
        }
    }
    public void setWeight(double newWeight)
    {
        if(weight > 0)
        {
            newWeight = weight;

            if(height > 0 && newWeight > 0)
            {
                BMI();
                Characterize();
            }
        }
    }
    public void setComments(String newComments)
    {
        comments=newComments;
    }
    
    //Calculate BMI method
    public double BMI()
    {
     return weight/(height*height);
    }
    //Calculate Characterizoation method
    public void Characterize()
    {
     if(BMI<18)
     {
          characterize = "Under-weight";
     }
     else if (BMI>18 && BMI<28)
     {
        characterize = "Normal";
     }
     else if (BMI>28 && BMI<30)
     {
        characterize = "Over-weight";
     }
     else if (BMI>30)
     {
        characterize = "Obesse";
     }
    }
    
 }