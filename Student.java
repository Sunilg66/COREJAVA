class Student{
String name;
String place;
String studies;
int age;
void details(){
System.out.println("Student details is"+name+" "+place+" "+age+" "+studies+"...!!");
}
public static void main(String args[]){
Student sunil=new Student();
sunil.name="Sunil";
sunil.place="from Mysore";
sunil.age=24;
sunil.studies="with qualification BE";
sunil.details();
Student vinay=new Student();
vinay.name="Vinay";
vinay.place="from bangalore";
vinay.age=26;
vinay.studies="with qualification BE";
vinay.details();
Student mahesh=new Student();
mahesh.name="Mahesh";
mahesh.place="from hubli";
mahesh.age=23;
mahesh.studies="with qualification MCA";
mahesh.details();
Student asha=new Student();
asha.name="ASHA";
asha.place="from hassan";
asha.age=28;
asha.studies="trainee in xworkz odc";
asha.details();
Student aishwarya=new Student();
aishwarya.name="Aishwarya";
aishwarya.place="from tumkur";
aishwarya.age=22;
aishwarya.studies="with qualification Mtech";
aishwarya.details();

}
}