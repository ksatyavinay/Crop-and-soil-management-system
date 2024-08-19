import java.util.*;
public class Main
{
    public static  void recommendCrop(String soilType, double phLevel) {
        
        if (soilType.equals("loamy") && phLevel >= 6.0 && phLevel <= 7.0) {
            System.out.println("Recommended Crop: Wheat");
        } else if (soilType.equals("sandy") && phLevel >= 5.5 && phLevel <= 6.5) {
            System.out.println("Recommended Crop: Groundnuts");
        } else {
            System.out.println("Recommended Crop: Rice");
        }
        
    }
    public static void manageSoil(String soilType) {
        
        switch (soilType.toLowerCase()) {
            case "clay":
                System.out.println("Recommendation: Add organic matter to improve drainage.");
                break;
            case "loamy":
                System.out.println("Recommendation: Soil is well-balanced, maintain pH between 6.0 and 7.0.");
                break;
            case "sandy":
                System.out.println("Recommendation: Increase water retention by adding compost.");
                break;
            default:
                System.out.println("Recommendation: Unknown soil type, please consult an expert.");
                
        }
        
    }
	public static void main(String[] args) {
	    
	    Scanner obj=new Scanner(System.in);
	    double ph=obj.nextDouble();
	    String soiltype=obj.next();
	    recommendCrop(soiltype,ph);
	    manageSoil(soiltype);
	    
	}
}
