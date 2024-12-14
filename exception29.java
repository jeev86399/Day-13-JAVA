public class exception29{
    public static void main(String args[]){
        //try catch throw block
        try{
            throw new Exception("Error");
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}