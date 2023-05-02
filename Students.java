package homeWork15;

public class Students {
    /*Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students*/
    String name;
    int ID;
    int numbOfStudents;

    public static void main(String[] args) {
        Students stud = new Students();
        stud.name = "Veronica";
        stud.ID = 123456;
        stud.numbOfStudents = 5;

        Students stud1 = new Students();
        stud1.name = "Alessio";
        stud1.ID = 123458;
        stud1.numbOfStudents = 2;

        Students stud2 = new Students();
        stud2.name = "Candida";
        stud2.ID = 87654;
        stud2.numbOfStudents = 76;

        System.out.println(stud.name);
        System.out.println(stud2.name);
        System.out.println(stud1.name);
    }

}