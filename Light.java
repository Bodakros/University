public class Light{
    public static void main(String args[]){
       int lightSpeed = 186000;
       long days = 1000;
       long second = days*24 * 60 * 60;
       long distance = lightSpeed * second;
       System.out.println("Miles: In "+days+" days light will travel about "+distance+ " miles" );
    }
}