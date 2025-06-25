

public class Student {
   
        private final  String studentName ;
        private final  String studentAddress;
        private final  String studentFaculty;
        private final  String studentMobile;


        public Student( String studentName,String studentAddress, String studentFaculty,String studentMobile){
            this.studentName = studentName;
            this.studentFaculty = studentFaculty;
            this.studentMobile = studentMobile;
            this.studentAddress = studentAddress;
        }
        public void display()
        {
            System.out.println("Name: " + studentName + "\n" + "Address: " + studentAddress + "\n" + "Faculty: " + studentFaculty + "\n" + "Mobile: " + studentMobile + "\n");
        }
  
    
}
