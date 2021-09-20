public class Light2 {
    public static void main(String args[]){
        int lightSpeed = 186000;
        long days = 1000;
        long second = days*24 * 60 * 60;
        long distance1 = lightSpeed * second;
        double distance2= distance1 * 1.609344;
        System.out.println("Kilometres: In "+days+" days light will travel about "+distance2+ " kilometres");
    }
}
