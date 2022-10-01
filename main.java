import java.util.*;
/**
 *
 * calc class
 *
 * Takes input from a string and calculates its value
 *
 */
public class main{
	public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner input = new Scanner(System.in);
        System.out.println("Program Started");
        Boolean quit = false;
        String response;
        while(!quit){
            System.out.println("Please enter a calculation or type quit");
            response = input.nextLine();
            if(response.equalsIgnoreCase("quit")){
                quit = true;
                System.out.println("Quitting...");
            }
            else{
                calc.equate(response);  // Send String response to logic function - return numerical answer as string
            }
        }
        input.close();
    }
}
