import java.util.*;
class Fashion_shop{

	
	public static void main(String args[]){
		homepage();	
	}
	
	public final static void clearConsole() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J");
				System.out.flush();
			}
		} catch (final Exception e) {
				e.printStackTrace();
			// Handle any exceptions.
		}
	}
	
	public static void homepage(){
		clearConsole(); 
			String str1 = "\r\n\t" +
		   " /$$$$$$$$          " +
		   "       /$$       /$$" +
		   "                    " +
		   "        /$$$$$$  /$$" +
		   "                    " +
		   "      \r\n\t" +
		   "| $$_____/          " +
		   "      | $$      |__/" +
		   "                    " +
		   "       /$$__  $$| $$" +
		   "                    " +
		   "      \r\n\t" +
		   "| $$    /$$$$$$   /$" +
		   "$$$$$$| $$$$$$$  /$$" +
		   "  /$$$$$$  /$$$$$$$ " +
		   "      | $$  \\__/| $" +
		   "$$$$$$   /$$$$$$   /" +
		   "$$$$$$ \r\n\t" +
		   "| $$$$$|____  $$ /$$" +
		   "_____/| $$__  $$| $$" +
		   " /$$__  $$| $$__  $$" +
		   "      |  $$$$$$ | $$" +
		   "__  $$ /$$__  $$ /$$" +
		   "__  $$\r\n\t" +
		   "| $$__/ /$$$$$$$|  $" +
		   "$$$$$ | $$  \\ $$| $" +
		   "$| $$  \\ $$| $$  \\" +
		   " $$       \\____  $$" +
		   "| $$  \\ $$| $$  \\ " +
		   "$$| $$  \\ $$\r\n\t" +
		   "| $$   /$$__  $$ \\_" +
		   "___  $$| $$  | $$| $" +
		   "$| $$  | $$| $$  | $" +
		   "$       /$$  \\ $$| " +
		   "$$  | $$| $$  | $$| " +
		   "$$  | $$\r\n\t" +
		   "| $$  |  $$$$$$$ /$$" +
		   "$$$$$/| $$  | $$| $$" +
		   "|  $$$$$$/| $$  | $$" +
		   "      |  $$$$$$/| $$" +
		   "  | $$|  $$$$$$/| $$" +
		   "$$$$$/\r\n\t" +
		   "|__/   \\_______/|__" +
		   "_____/ |__/  |__/|__" +
		   "/ \\______/ |__/  |_" +
		   "_/       \\______/ |" +
		   "__/  |__/ \\______/ " +
		   "| $$____/ \r\n\t" +
		   "                    " +
		   "                    " +
		   "                    " +
		   "                    " +
		   "                | $$" +
		   "      \r\n\t" +
		   "                    " +
		   "                    " +
		   "                    " +
		   "                    " +
		   "                | $$" +
		   "      \r\n\t" +
		   "                    " +
		   "                    " +
		   "                    " +
		   "                    " +
		   "                |__/" +
		   "      \r";		
		System.out.println(str1);
		System.out.println("\t______________________________________________________________________________________________________________");
		
		System.out.println("\n\n\t\t[1] Place Order							        [2] Search Customer");
		System.out.println("\n\t\t[3] Search Order							[4] View Report");
		System.out.println("\n\t\t[5] Set Order Status		             		        	[6] Delete Order");
		System.out.print("\n\n\t\tInput Option : ");
		int option = input.nextInt();
		
		switch(option){
			case 1:PlaceOrder();break;
			case 2:SearchCustomer();break;
			case 3:SearchOrder();break;
			//case 4:ViewReport();break;
			//case 5:SetOrderStatus();break;
			case 6:DeleteOrder();break;
			default:homepage();break;
			}
				homepage();
	}
	
		
/////////////////////////////////////////////////////////////////////
	public static Scanner input = new Scanner(System.in);
	public static Random r = new Random();
	
	public static String[] orderIdArray  = new String[0];
	public static String[] phoneNumberArray  = new String[0];
	public static String[] ShirtSizeArray  = new String[0];
	public static int[] qtyArray   = new int[0];
	public static double[] amountArray = new double[0];
	public static String[] Status = new String[0];

	
	public static int value=0;
	
	public static final String PROCESSING = "PROCESSING";
    public static final String DELIVERING = "DELIVERING";
    public static final String DELIVERED = "DELIVERED";
    
	public static String[] sizes = {"XS", "S", "M", "L", "XL", "XXL"};
	public static int[] sizeQuanty = new int[sizes.length];
    public static double[] sizeAmounts = new double[sizes.length];

/////////////////////////////////////////////////////////////////////////
	public static void extendArray(){
		String[] TemporderIdArray  = new String[ orderIdArray.length+1];
		String[] TempphoneNumberArray  = new String[phoneNumberArray.length+1];
		String[] TempShirtSizeArray  = new String[ShirtSizeArray.length+1];
		int[] Tempqty  = new int[ qtyArray .length+1];
		String[] TempStatus = new String[Status.length+1];
		double[] TempamountArray = new double[amountArray.length+1];
		
			for(int i=0;i <orderIdArray.length;i++ ){
				TemporderIdArray [i] = orderIdArray[i];
				TempphoneNumberArray[i]  = phoneNumberArray[i];
				TempShirtSizeArray[i]  = ShirtSizeArray[i];
				Tempqty[i]  = qtyArray[i];
				TempamountArray[i] = amountArray[i];
				TempStatus[i]=Status[i];
			
			}
			orderIdArray = TemporderIdArray;
			phoneNumberArray = TempphoneNumberArray;
			ShirtSizeArray =	TempShirtSizeArray;
			qtyArray =	Tempqty;
			amountArray =	TempamountArray; 
			Status=TempStatus;
			
	}
//////////////////////////////////Place Order///////////////////////////////////////////

	public static void PlaceOrder(){
		boolean exitplace=true; 
		clearConsole();
		  String str2 = "\r\n\r\n" +
                    "\t  _____  _                   ____          _           \r\n" +
                    "\t |  __ \\| |                 / __ \\        | |          \r\n" +
                    "\t | |__) | | __ _ ___  ___  | |  | |_ __ __| | ___ _ __ \r\n" +
                    "\t |  ___/| |/ _` / __|/ _ \\ | |  | | '__/ _` |/ _ \\ '__|\r\n" +
                    "\t | |    | | (_| \\__ \\  __/ | |__| | | | (_| |  __/ |   \r\n" +
                    "\t |_|    |_|\\__,_|___/\\___|  \\____/|_|  \\__,_|\\___|_|   \r\n" +
                    "\t                                                       \r\n" +
                    "\r";
            System.out.print(str2);
            System.out.println("\t--------------------------------------------------------");

		
		
			extendArray();
			value++;
			String orderId = String.format("ODR#%05d",value);
			System.out.print("\n\tEnter Order ID : "+orderId);
			orderIdArray [orderIdArray.length-1]  =  orderId;
			
			getphoneNumber();
			getShirtSize();
			getQty();
			
			double amount=getamount();
			System.out.print("\n\tAmount : "+getamount());
			amountArray[amountArray.length-1] = amount;
			 
			 //Opction
			
			System.out.print("\n\n\tDo you went to place this order? (Y/N) : ");
			char yn = input.next().charAt(0);
			if(yn=='Y'|| yn=='y'){
				System.out.print("\n\t\tOrder Placed..!");
				Status[Status.length - 1] = PROCESSING;
			}else{
				 orderIdArray[orderIdArray.length-1]  =null;
				 phoneNumberArray[phoneNumberArray.length-1]  = null;
				 ShirtSizeArray[ShirtSizeArray.length-1] =null; 
				 qtyArray [qtyArray.length-1] = 0;
				 amountArray[amountArray.length-1] =0.0;
				 Status[Status.length - 1] = null;
			}
			
            System.out.print("\n\n\tDo You Want to Place another Order   (Y/N)      : ");
            char yn2 = input.next().charAt(0);
             clearConsole();
            if (yn2=='Y' || yn2=='y') {
				clearConsole();
                PlaceOrder();
               
            }
				clearConsole();
                homepage();
                
		
		
	
	}
	public static void getphoneNumber(){
		boolean y= true;
		
			System.out.print("\n\n\tEnter Customer Phone Number : ");
			String phoneNumber = input.next();
		
			phoneNumberArray [phoneNumberArray.length-1] = phoneNumber;
			
			if(phoneNumber.charAt(0)!='0' || phoneNumber.length()!=10){
				System.out.println("\n\t\tInvalid Phone Number..Try Again\n");
				System.out.print("\n\tDo you want to enter Phone Number again (Y/N) -> ");
				char option = input.next().charAt(0);
				y=false;
				if(option=='y'||option=='y'){
					getphoneNumber();
				}else{
					clearConsole();
					homepage();
				}
			}
				
	} 
	public static void getShirtSize(){
		boolean exit = true;
		while(exit){
			System.out.print("\n\tEnter T-Shirt Size (XS/S/M/L/XL/XXL) : ");
			String ShirtSize = input.next();	
				if (ShirtSize.equalsIgnoreCase("xs") ||
                    ShirtSize.equalsIgnoreCase("s") ||
                    ShirtSize.equalsIgnoreCase("m") ||
                    ShirtSize.equalsIgnoreCase("l") ||
                    ShirtSize.equalsIgnoreCase("xl") ||
                    ShirtSize.equalsIgnoreCase("xxl")) {
                    exit = false;
                    ShirtSizeArray[ShirtSizeArray.length - 1] = ShirtSize;
                }
		}
	}
	
	public static void getQty(){
		boolean exit=true;
		while(exit){
			System.out.print("\n\tEnter QTY : ");
			int qty = input.nextInt();
			if(qty>0){
				qtyArray[qtyArray.length-1]  = qty;
				exit=false;
			}	
		}
	}
	public static double getamount() {
		double tot = 0;
		int qty = qtyArray[qtyArray.length - 1]; 
		String ShirtSize = ShirtSizeArray[ShirtSizeArray.length - 1]; 
		switch (ShirtSize.toLowerCase()) {
			case "xs":
				tot = 600.00 * qty;
				break;
			case "s":
				tot = 800.00 * qty;
				break;
			case "m":
				tot = 900.00 * qty;
				break;
			case "l":
				tot = 1000.00 * qty;
				break;
			case "xl":
				tot = 1100.00 * qty;
				break;
			case "xxl":
				tot = 1200.00 * qty;
				break;
			default:
				System.out.println("Invalid T-Shirt size.");
				break;
		}
		return tot; 
	}
	
	//////////////////////////////Search Customer//////////////////////////////////////
	
	public static void SearchCustomer(){
		clearConsole();
		        String str3 = "\r\n" +
                "\t   _____                     _        _____          _                             \r\n" +
                "\t  / ____|                   | |      / ____|        | |                            \r\n" +
                "\t | (___   ___  __ _ _ __ ___| |__   | |    _   _ ___| |_ ___  _ __ ___   ___ _ __ \r\n" +
                "\t  \\___ \\ / _ \\/ _` | '__/ __| '_ \\  | |   | | | / __| __/ _ \\| '_ ` _ \\ / _ \\ '__|\r\n" +
                "\t  ____) |  __/ (_| | | | (__| | | | | |___| |_| \\__ \\ || (_) | | | | | |  __/ |   \r\n" +
                "\t |_____/ \\___|\\__,_|_|  \\___|_| |_|  \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|   \r\n" +
                "\t                                                                                   \r\n";
        System.out.print(str3);
        System.out.println("\t----------------------------------------------------------------------------------");

		System.out.print("\n\n\n\t\tEnter Customer Phone Number : ");
		String searchNum = input.next();
		
		
        boolean exit = false;
        double totalAmount = 0;
		if(searchNum.charAt(0)=='0'){
			System.out.println("\n\n\t\t--------------------------------------");
            System.out.printf("\t\t| %-9s | %-9s | %-12s \b\b|\n", "Size", "QTY", "Amount");
            System.out.println("\t\t--------------------------------------");
			
			
			
			for(int i=0;i < phoneNumberArray.length;i++){
				if(phoneNumberArray[i].equals(searchNum)){
					for (int j = 0; j < sizes.length; j++) {
                       if (ShirtSizeArray[i].equalsIgnoreCase(sizes[j])){
                            sizeQuanty[j] += qtyArray[i];
                            sizeAmounts[j] += amountArray[i];
                       }
					}
					exit=true;
				}
			}
		}
			for (int j = 0; j < sizes.length; j++) {
                totalAmount += sizeAmounts[j];
                System.out.printf("\t\t| %-9s | %-9d | %-12.2f \b\b|\n", sizes[j], sizeQuanty[j], sizeAmounts[j]);
                System.out.println("\t\t|           |           |            |");
            }

            System.out.println("\t\t--------------------------------------");
            System.out.printf("\t\t| %-21s | %-1s  %-8.2f \b|\n", "Total Amount", "", totalAmount);

            System.out.println("\t\t--------------------------------------");
        

        if (!exit) {
            System.out.println("\n\n\t\tInvalid input.......");
        }

       	System.out.print("\n\n\tDo You Want to Search another Customer report (Y/N)  : ");
       	char yn2 = input.next().charAt(0);
       	input.nextLine();
             clearConsole();
            if (yn2=='Y' || yn2=='y') {
				clearConsole();
                SearchCustomer();
               
            }else{
				clearConsole();
                homepage();
            }   
			
	} 
	/////////////////////////////////////Search Order//////////////////////////////////////////////
	public static void SearchOrder(){
		input.nextLine();
			clearConsole();
		  String str = "\r\n" +
                "\t  _____                     _         ____          _           \r\n" +
                "\t / ____|                   | |       / __ \\        | |          \r\n" +
                "\t| (___   ___  __ _ _ __ ___| |__    | |  | |_ __ __| | ___ _ __ \r\n" +
                "\t \\___ \\ / _ \\/ _` | '__/ __| '_ \\   | |  | | '__/ _` |/ _ \\ '__|\r\n" +
                "\t ____) |  __/ (_| | | | (__| | | |  | |__| | | | (_| |  __/ |   \r\n" +
                "\t|_____/ \\___|\\__,_|_|  \\___|_| |_|   \\____/|_|  \\__,_|\\___|_|   \r\n" +
                "\t                                                               \r\n";
        System.out.print(str);
        System.out.println("\t--------------------------------------------------------------");
        
        System.out.print("\n\n\n\tEnter Order ID: ");
        String searchNum = input.nextLine();
	
		int index = searchCustomerNumOne(searchNum); 
		if(index==-1){
			System.out.println("\n\t\tInvalid ID....!");
		}else{	
			showCustomerDetails(index);
		}	
		
		
		System.out.print("\n\tDo You Want to Search another Search Order (Y/N)  : ");
       	char yn2 = input.next().charAt(0);
             clearConsole();
            if (yn2=='Y' || yn2=='y') {
				clearConsole();
                SearchOrder();
               
            }else{
				clearConsole();
                homepage();
            }   
	}
	public static int searchCustomerNumOne(String searchNum){
		for(int i=0;i<phoneNumberArray.length;i++){
			if(orderIdArray[i].equals(searchNum)){
				return i;
			}
		}
		return -1;
	}
	
	public static int searchCustomerNum(String searchNum){
		for(int i=0;i<phoneNumberArray.length;i++){
			if(phoneNumberArray[i].equals(searchNum)){
				return i;
			}
		}
		return -1;
	}
    public static void showCustomerDetails(int index){
		System.out.println("\n\tEnter Order ID :"+orderIdArray[index]);
		System.out.println("\tPhone Number  : "+phoneNumberArray[index]);
		System.out.println("\tSize          : "+ShirtSizeArray[index]);
		System.out.println("\tQTY           : "+qtyArray[index]);
		System.out.println("\tAmount        : "+amountArray[index]);
		System.out.println("\tStatus        : "+Status[index]);
	
	}  
	public static void DeleteOrder(){
		
		 String str4 = "\r\n" +
                "\t  _____       _      _          ____          _           \r\n" +
                "\t |  __ \\     | |    | |        / __ \\        | |          \r\n" +
                "\t | |  | | ___| | ___| |_ ___  | |  | |_ __ __| | ___ _ __ \r\n" +
                "\t | |  | |/ _ \\ |/ _ \\ __/ _ \\ | |  | | '__/ _` |/ _ \\ '__|\r\n" +
                "\t | |__| |  __/ |  __/ ||  __/ | |__| | | | (_| |  __/ |   \r\n" +
                "\t |_____/ \\___|_|\\___|\\__\\___|  \\____/|_|  \\__,_|\\___|_|   \r\n" +
                "\t                                                           \r\n";

        System.out.print(str4);
        System.out.println("\t--------------------------------------------------------------");

		System.out.print("\n\n\n\tEnter Order ID: ");
        String deletNum = input.next();
	    
		int index = searchCustomerNumOne(deletNum); 
		if(index==-1){
			System.out.println("\n\t\tInvalid ID....!");
		}else{	
			showCustomerDetails(index);
			System.out.println("\n\tDo you Delete this order (Y/N)  :");
			char yn3 = input.next().charAt(0);
			input.nextLine();
			 if (yn3=='Y' || yn3=='y') {
			  System.out.println("\n\t\t\tOrder Deleted..!");
					orderIdArray[index] = null;
					phoneNumberArray[index] = null;
					ShirtSizeArray[index] = null;
					qtyArray[index] = 0;
					amountArray[index] = 0.0;
					Status[index] = null;					
            }
            else{
				clearConsole();
				homepage();
			}
		}	
		
		
		System.out.print("\n\tDo You Want to Delete another Order? (Y/N)  : ");
       	char yn2 = input.next().charAt(0);
             clearConsole();
            if (yn2=='Y' || yn2=='y') {
				clearConsole();
                DeleteOrder();
               
            }else{
				clearConsole();
                homepage();
            }   
	
    
    
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
