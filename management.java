
import java.util.*;
public class management {

	// opening of class
		public static void main(String args[]) {                                      // opening of main()
		try 
		(Scanner sc = new Scanner(System.in)) {
		{
				int
					vstr,                                                //veg starter
		            tvstr=0,                                             //total veg starter
		            tnvstr=0,                                            //total non veg starter
		            nvstr=0,                                             //non veg starter
		            vfd,                                                 //veg dishes
		            tvfd=0,                                              //total veg dishes
		            nvfd,                                                //non veg dishes
		            tnvfd=0,                                             //total non veg dishes
		           // fd,                                                //food*
		           // tfd=0,                                             //total food* 
		            amt=0,                                               //amount
		            tamt=0,                                              //total amount
		            totalamt=0,                                          //total amount
		            d,                                                   //dessert
		            totald=0,                                            //total dessert
		            damt=0,                                              //dessert amount
				    ch;
					
				double 
					vat = 0;
					
					String str = " ", ans, choice = "Y";                //(str=starter) (Y= yes)
					
					System.out.println();
					System.out.println("\t\t----------------------------------------------------------------------------------");
					System.out.println("\t\t** ** ** ** ** ** **  WELCOME TO THE MULTI CUISINE RESTAURANT ** ** ** ** ** ** **");
					System.out.println("\t\t----------------------------------------------------------------------------------");
					System.out.println();
					System.out.println("\t\t\t\t\t[      STARTER MENU        ] ");
					System.out.println("\t\t\t\t\t[       MAIN MENU          ] ");
					System.out.println("\t\t\t\t\t[ DESSERTS AND COLD DRINKS ] ");
					System.out.println();
					System.out.println("PRESS 1 FOR STARTER MENU !!");
					System.out.println("PRESS 2 FOR MAIN MENU    !!");
					System.out.println("PRESS 3 FOR DESSERTS AND COLD DRINKS !!");
					System.out.println();
					System.out.println("PLEASE ENTER YOUR CHOICE TO SELECT MENU :  ");
					System.out.println(); 
					ch = sc.nextInt();                                                                   //scan the next token of the input data as "int"
					
					
					switch (ch) {                                                                       // opening of switch case
					case 1:
						System.out.println("\t\t** ** ** ** ** ** WELCOME TO STARTER MENU ** ** ** ** ** ** ");
						System.out.println();
						System.out.println("Enter 'VS' for VEG STARTER MENU and 'NVS' for NON-VEG STARTER MENU :");
						str = sc.next();
						if (str.equalsIgnoreCase("VS")) {                                             // opening of 1st if
							System.out.println();
							System.out.println(" \t\t [VEGETERIAN STARTER]");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println("[VEG STARTER MENU] \t\t\t  [PRICE IN RS]");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println("1. Paneer Tikka\t\t\t\t\t110");
							System.out.println("2. Veg Seekh Kebab\t\t\t\t110 ");
							System.out.println("3. Hara Bhara Kebab\t\t\t\t110 ");
							System.out.println("4. Shanghai Spring Roll\t\t\t\t150 ");
							System.out.println("5. American Corn Ball\t\t\t\t150 ");
							System.out.println("6. Cripsy American Corn\t\t\t\t140 ");
							System.out.println("7. Cripsy Baby Corn\t\t\t\t140 ");
							System.out.println("8. Cripsy Mushroom\t\t\t\t120");
							System.out.println("9. Cripsy Chilly Potato\t\t\t\t120 ");
							System.out.println("10.Cripsy Chilly Chana\t\t\t\t150 ");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println();
							
							while 
							    (choice.equalsIgnoreCase("Y")) {                                     // opening of while loop
								System.out.println("PLEASE CHOOSE YOUR STARTER MENU :");
								vstr = sc.nextInt();                                                 //To scan the value for veg starter 
								System.out.println("PLEASE ENTER TOTAL NUMBER OF STARTER PLATES:");
								tvstr = sc.nextInt();                                               //to scan the value for non-veg starter
								if (vstr >= 1 && vstr <= 3)                                         //if condition used to veg starter 1st 3 starter only
									amt = tvstr * 110;                                              //amount=total veg starter *110 
								
								if (vstr == 4 || vstr == 5)                                        //if condition used to calculate veg starter of 4th and 5th number
									amt = tvstr * 150;                                             //amount=total veg starter *150
								
								if (vstr == 6 || vstr == 7)                                       //if condition used to calculate veg starter of 6th and 7th number
									amt = tvstr * 140;                                            //amount=total veg starter *140
								
								if (vstr == 8 || vstr == 9)                                       //if condition used to calculate veg starter of 8th and 9th number
									amt = tvstr * 120;                                            //amount=total veg starter *120
								
								if (vstr == 10)                                                  //if condition used to calculate veg starter of 10th number
									amt = tvstr * 150;                                           //amount=total veg starter *150
								
								tamt = tamt + amt;                                               //total amount= total amount + amount
								
								System.out.println("DO YOU WANT TO PLACE MORE OREDER FROM STARTER MENU ? \n ENTER (Y/N) :");
								choice = sc.next();                                             //to scan next order
								
							}                                                                    // end of while
						}                                                                        // end of 1st if
						
						
						if (str.equalsIgnoreCase("NVS")) {                                      // equalsIgnoreCase use to ignore lower and upper case and to compare two strings
							System.out.println(" \t\t [Non-VEGETERIAN STARTER]");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println("[NON-VEG STARTER MENU] \t\t   [PRICE IN RS]");
							System.out.println("----------------------------------------------------------------------------------");	
							System.out.println("1.Chicken Tikka\t\t\t\t170");
							System.out.println("2.Murg Reshmi Kebab\t\t\t170 ");
							System.out.println("3.Murg Chilli Kebab\t\t\t160 ");
							System.out.println("4.Chicken Seekh Kabab\t\t\t180 ");
							System.out.println("5.Tangdi Kebab\t\t\t\t180 ");
							System.out.println("6.Murg Tandoori\t\t\t\t190 ");
							System.out.println("7.Fish Ajwani Tikka\t\t\t190 ");
							System.out.println("8.Chilli Chicken\t\t\t160 ");
							System.out.println("9.Drums of Heaven\t\t\t180 ");
							System.out.println("10.Shanghai Chicken\t\t\t180 ");
							System.out.println("----------------------------------------------------------------------------------");	
							System.out.println();
							while 
							(choice.equalsIgnoreCase("Y")) {                                  //equalsIgnoreCase use to ignore lower and upper case and to compare two strings 

								System.out.println("PLEASE CHOOSE YOUR STARTER MENU :");
								nvstr = sc.nextInt();
								System.out.println("Enter the total number of starter you want:");
								tnvstr = sc.nextInt();
								
								if (nvstr == 1 || nvstr == 2)                                //if condition used to calculate non-veg starter of 1st and 2nd number
									amt = tnvstr * 170;                                      //amount=total non-veg starter *170
								if (nvstr == 3)                                              //if condition used to calculate non-veg starter of 3rd number
									amt = tnvstr * 160;                                      //amount=total non-veg starter *160
								if (nvstr == 4 || nvstr == 5)                                //if condition used to calculate non-veg starter of 4th and 5th number
									amt = tnvstr * 180;                                      //amount=total non-veg starter *180
								if (nvstr == 6 || nvstr == 7)                                //if condition used to calculate non-veg starter of 6th and 7th number
									amt = tnvstr * 190;                                      //amount=total non-veg starter *190
								if (nvstr == 8)                                              //if condition used to calculate non-veg starter of 8th number
									amt = tnvstr * 160;                                      //amount=total non-veg starter *160
								if (nvstr == 9 || nvstr == 10)                               //if condition used to calculate non-veg starter of 9th and 10th number
									amt = tnvstr * 180;                                      //amount=total non-veg starter *180
								
								tamt = tamt + amt;                                           //total amount= total amount + amount
								
								System.out.println("DO YOU WANT TO PLACE MORE OREDER FROM STARTER MENU ? \nENTER (Y/N) :");
								choice = sc.next();                                             //to scan next order
							}                    

						} 
						System.out.println();
						System.out.println("--------------------------------------");
						System.out.println(" [ Multi Cuisine Restaurant ] ");
						System.out.println(" [         BILL             ]");
						System.out.println("--------------------------------------");
						System.out.println("  TOTAL COST              = Rs." + tamt);
						vat = Math.round(14.5 / 100.0 * tamt);
						System.out.println("  VAT                     = 14.5 %");
						System.out.println("  Total VAT               = Rs." + vat);
						System.out.println("--------------------------------------");
						System.out.println("  TOTAL AMOUNT TO BE PAID = Rs." + (tamt + vat));
						System.out.println("--------------------------------------");
						
						System.out.println("  THANK YOU SO MUCH TO JOIN US !!");
						System.out.println("--------------------------------------");
						System.out.println();
				
						break;
				        case 2:
						
						System.out.println("\t\t** ** ** ** ** ** WELCOME TO MAIN MENU ** ** ** ** ** ** ");
						System.out.println();
						System.out.println("Enter 'V' for VEG MAIN MENU and 'NV' for NON-MAIN MENU :");
						str = sc.next();
						if (str.equalsIgnoreCase("V")) {                                             // opening of 1st if
							System.out.println();
							System.out.println(" \t\t [VEGETERIAN MENU]");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println("[VEG MENU] \t\t\t  [PRICE IN RS]");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println();
							System.out.println("1.Shahi Paneer\t\t\t\t\t180");
							System.out.println("2.Navratan Korma\t\t\t\t180");
							System.out.println("3.Kadahi Paneer\t\t\t\t\t150");
							System.out.println("4.Malai Kofta\t\t\t\t\t180");
							System.out.println("5.Kadahi Vegetable\t\t\t\t140");
							System.out.println("6.Vegetable Pikeeza\t\t\t\t140");
							System.out.println("7.Shabnam Curry\t\t\t\t\t150");
							System.out.println("8.Makai Corn Palak\t\t\t\t150");
							System.out.println("9.Veg.Pulao\t\t\t\t\t110");
							System.out.println("10.Kashmiri Pulao\t\t\t\t140");
							System.out.println("11.Butter Naan\t\t\t\t\t40");
							System.out.println("12.Stuffed kulcha\t\t\t\t60");
							System.out.println();
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println();
							
							while (choice.equalsIgnoreCase("Y")) {
								System.out.println("PLEASE CHOOSE YOUR MAIN MENU :");
								vfd = sc.nextInt();
								System.out.println("PLEASE ENTER TOTAL NUMBER OF DISHES :");
								tvfd = sc.nextInt();
								if (vfd == 1 || vfd == 2)
									amt = tvfd * 180;
								if (vfd == 3)
									amt = tvfd * 150;
								if (vfd == 4 || vfd == 5 || vfd == 6)
									amt = tvfd * 140;
								if (vfd == 7 || vfd == 8)
									amt = tvfd * 150;
								if (vfd == 9)
									amt = tvfd * 110;
								if (vfd == 10)
									amt = tvfd * 140;
								if (vfd == 11)
									amt = tvfd * 40;
								if (vfd == 12)
									amt = tvfd * 60;
								totalamt = totalamt + amt;
								System.out.println("DO YOU WANT TO PLACE MORE OREDER FROM STARTER MENU ? \nENTER (Y/N) :");
								choice = sc.next();                                             //to scan next order

							}
						}  
						
						if (str.equalsIgnoreCase("NV")) {
							System.out.println();
							System.out.println(" \t\t [NON-VEGETERIAN MENU]");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println("[NON-VEG MENU] \t\t\t  [PRICE IN RS]");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println("1.Chicken Tikka Masala\t\t\t180");
							System.out.println("2.Chicken Tikka Labadar\t\t\t180");
							System.out.println("3.Chicken Bharta\t\t\t150");
							System.out.println("4.Kadahi Chicken\t\t\t160");
							System.out.println("5.Mughlai Chicken\t\t\t160");
							System.out.println("6.Murg Navratan Korma\t\t\t160");
							System.out.println("7.Chicken Do Pyaza\t\t\t170");
							System.out.println("8.Murn Masallam\t\t\t\t170");
							System.out.println("9.Mutto Rogan Josh\t\t\t110");
							System.out.println("10.Prawn Malai Curry\t\t\t190");
							System.out.println("11.Fish Sarsowala\t\t\t40");
							System.out.println("12.Fish Dhaniawala\t\t\t60");
							System.out.println("----------------------------------------------------------------------------------");
							System.out.println();
							
							while 
								(choice.equalsIgnoreCase("Y")) {
								System.out.println("PLEASE CHOOSE YOUR NON-VEG MENU :");
								nvfd = sc.nextInt();
								System.out.println("PLEASE ENTER TOTAL NUMBER OF DISHES :");
								tnvfd = sc.nextInt();
								if (nvfd == 1 || nvfd == 2)
									amt = tnvfd * 180;
								if (nvfd == 3)
									amt = tnvfd * 150;
								if (nvfd == 4 || nvfd == 5 || nvfd == 6)
									amt = tnvfd * 160;
								if (nvfd == 7 || nvfd == 8)
									amt = tnvfd * 170;
								if (nvfd == 9 || nvfd == 10)
									amt = tnvfd * 190;
								if (nvfd == 11)
									amt = tnvfd * 140;
								if (nvfd == 12)
									amt = tnvfd * 160;
								
								totalamt = totalamt + amt;
								System.out.println("DO YOU WANT TO PLACE MORE OREDER FROM STARTER MENU ? \nENTER (Y/N) :");
								choice = sc.next();                                             //to scan next order

							}
						}
						
						System.out.println();
						System.out.println("--------------------------------------");
						System.out.println(" [ Multi Cuisine Restaurant ] ");
						System.out.println(" [         BILL             ]");
						System.out.println("--------------------------------------");
						System.out.println("  TOTAL COST              = Rs." + totalamt);
						vat = Math.round(14.5 / 100.0 * totalamt);
						System.out.println("  VAT                     = 14.5 %");
						System.out.println("  Total VAT               = Rs." + vat);
						System.out.println("--------------------------------------");
						System.out.println("  TOTAL AMOUNT TO BE PAID = Rs." + (totalamt + vat));
						System.out.println("--------------------------------------");
						
						System.out.println("  THANK YOU SO MUCH TO JOIN US !!");
						System.out.println("--------------------------------------");
						
		break;
						
		case 3:
			System.out.println("\t\t** ** ** ** ** ** WELCOME TO DESSERTS AND COLD DRINKS  ** ** ** ** ** ** ");
			System.out.println();
			System.out.println("Enter 'DS' for DESSERTS AND COLD DRINKS :");
			str = sc.next();
			if (str.equalsIgnoreCase("DS")) {     
			
			    System.out.println();
			    System.out.println("----------------------------------------------------------------------------------");
				System.out.println("[DESSERT MENU] \t\t\t   [PRICE IN RS]");
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println("1.Softy Pineapple\t\t\t\t110");
				System.out.println("2.Softy Crunchy Chocolate\t\t\t110");
				System.out.println("3.Chocolate Walnut Brownie\t\t\t90");
				System.out.println("4.Chocolate Doughnut\t\t\t\t90");
				System.out.println("5.Marble Cake\t\t\t\t\t70");
				System.out.println("6.Mocha Magic\t\t\t\t\t90");
				System.out.println("7.Black Forest Gateaux\t\t\t\t90");
				System.out.println("8.Mango Shake\t\t\t\t\t80");
				System.out.println("9.Pineapple Shake\t\t\t\t80");
				System.out.println("10.Tooty Fruity\t\t\t\t\t120");
				System.out.println("----------------------------------------------------------------------------------");
				System.out.println();
				
				while 
					(choice.equalsIgnoreCase("Y")) {
					System.out.println("PLEASE CHOOSE YOUR DESSERT MENU :");
					d = sc.nextInt();
					System.out.println("PLEASE ENTER TOTAL NUMBER OF DESSERT AND COLD DRINKS :");
					totald = sc.nextInt();
					if (d == 1 || d == 2)
						damt = totald * 110;
					if (d == 3 || d == 4)
						damt = totald * 90;
					if (d == 5)
						damt = totald * 70;
					if (d == 6 || d == 7)
						damt = totald * 90;
					if (d == 8 || d == 9)
						damt = totald * 80;
					if (d == 10)
						damt = totald * 120;
					totalamt = totalamt + damt;
					System.out.println("DO YOU WANT TO PLACE MORE OREDER FROM STARTER MENU ? \nENTER (Y/N) :");
					choice = sc.next();                                             //to scan next order

				}
				}
				System.out.println();
				System.out.println("--------------------------------------");
				System.out.println(" [ Multi Cuisine Restaurant ] ");
				System.out.println(" [         BILL             ]");
				System.out.println("--------------------------------------");
				System.out.println("  TOTAL COST              = Rs." + totalamt);
				vat = Math.round(14.5 / 100.0 * totalamt);
				System.out.println("  VAT                     = 14.5 %");
				System.out.println("  Total VAT               = Rs." + vat);
				System.out.println("--------------------------------------");
				System.out.println("  TOTAL AMOUNT TO BE PAID = Rs." + (totalamt + vat));
				System.out.println("--------------------------------------");
				
				System.out.println("  THANK YOU SO MUCH TO JOIN US !!");
				System.out.println("--------------------------------------");
				
			break;
			default:
				
			System.out.println("----------------------------------------------------------------------------------");	
			System.out.println("You have entered wrong choice!!!");
			System.out.println("You can enter in the Multi Cuisine Restaurant by executing the program again with the correct choice !!");
			System.out.println("----------------------------------------------------------------------------------");
		}
		    System.out.println();		
		    System.out.println("To exit Multi Cuisine Restaurant world, enter the word 'Quit'");
		    ans = sc.next();
		  
		if 
		    (ans.equals("quit") || ans.equals("QUIT") || ans.equals("Q")) {
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println("Thanks for joining to Multi cuisine Restaurant !!");
			System.out.println("your pleasure our comfort !!");
			System.out.println("Visit Again !!");
			System.out.println("----------------------------------------------------------------------------------");
			System.out.println();
		  }
	   }
    }
  }
}
		
