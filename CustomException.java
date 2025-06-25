public class CustomException {
   
    static  void ageException(int age) throws InvalidAgeException{
        if(age<18)
        {
            throw  new InvalidAgeException("age is invalid ");
        }
        else{
            System.out.println("Valid age to drive");
        }
    }
    public static void main(String[] args) {
        try{
            ageException(18);
            
        }
        catch (InvalidAgeException e)
        {
            System.out.println(e);
        }
    } 
}


