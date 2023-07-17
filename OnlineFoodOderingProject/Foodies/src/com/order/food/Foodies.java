package com.order.food;
import java.util.Scanner ;
public class Foodies {
	Account a ;
	Restaurants r ;
	
	Scanner sc = new Scanner(System.in);
	
	public void login() {
		if(a==null) {
			System.out.println("Enter Name :");
			String name = sc.next();
			System.out.println("Enter Contact");
			long contact = sc.nextLong();
			System.out.println("Enter Address :");
			String address = sc.next();
			System.out.println("Enter Username :");
			String username = sc.next();
			System.out.println("Enter Password :");
			String password = sc.next();
			
			a = new Account(name,contact,address,username,password);
			
			System.out.println("You have been login Succesfully");
		}
		else {
			System.out.println("User has been already login");
		}
	}
	public void logout() {
		if(a == null) {
			System.out.println("No account has been login...");
		}
		else {
			a = null;
		}
	}
    public void SelectRestaurant() {
    	if(a==null) {
    		System.out.println("Please Login");
    	}
    	else {
    		if(r==null) {
    			System.out.println("1. Swati Restaurant "+"\n"+"2. Tasty Foods Restaurant"
    					+"\n"+"King~Kong Restaurant"+"\n"+"Dessi Dhabba Restaurant");
    			switch(sc.nextInt()) {
    			case 1 :{
    				r = new Swati_Resraurant();
    				System.out.println("You have choose Swati Restaurant");
    				break ;
    			}
    			case 2 :{
    	    		r = new TastyFoodRestaurant();
    	    		System.out.println("You have choose Tasty Food Restaurant");
    	    		break ;
    			}
    			case 3 :{
    	    		r = new KingKong_ChineseRestaurant();
    	    		System.out.println("You have choose King~Kong Restaurant");
    	    		break ;
    			}
    			case 4 :{
    	    		r = new DesiDhabbaRestaurant();
    	    		System.out.println("You have choose Desi Dhabba Restaurant");
    	    		break ;
    			}
    			}
    		}
    	}
		
	}
    public void RemoveResraurant() {
		if(r==null) {
			System.out.println("No restaurant has been added");
		}
		else {
			r = null;
			System.out.println("Restaurant has been added Succesfully...");
		}
	}
    public void OrderFood() {
		if(a==null) {
			System.out.println("Please make login");
		}
		else {
			if(r==null) {
				System.out.println("Please select Restaurant first...");
			}
			else {
				if(r instanceof Swati_Resraurant) {
					Swati_Resraurant order = (Swati_Resraurant)r ;
					for( ; ; ) {
						System.out.println("1."+order.Food1+"\t"+order.price1);
						System.out.println("2."+order.Food2+"\t"+order.price2);
						System.out.println("3."+order.Food3+"\t"+order.price3);
						System.out.println("4."+order.Food4+"\t"+order.price4);
						System.out.println("5."+order.Food5+"\t"+order.price5);
						System.out.println("6."+order.Food6+"\t"+order.price6);
						System.out.println("7."+order.Food7+"\t"+order.price7);
						System.out.println("8."+order.Food8+"\t"+order.price8);
						System.out.println("9."+order.Food9+"\t"+order.price9);
						System.out.println("10."+order.Food10+"\t"+order.price10);
						System.out.println("11."+order.Food11+"\t"+order.price11);
						System.out.println("12."+order.Food12+"\t"+order.price12);
						System.out.println("13."+order.Food13+"\t"+order.price13);
						System.out.println("14."+order.Food14+"\t"+order.price14);
						System.out.println("15."+order.Food15+"\t"+order.price15);
						System.out.println("16."+order.Food16+"\t"+order.price16);
						
                        switch(sc.nextInt()) {
						
						case 1 : {
							System.out.println("No of Quantity");
							order.qyn1 = sc.nextInt();
							break ;
						}
                        case 2 : {
                        	System.out.println("No of Quantity");
                        	order.qyn2 = sc.nextInt();
                        	break ;
						}
                        case 3 : {
                        	System.out.println("No of Quantity");
                        	order.qyn3 = sc.nextInt();
                        	break ;
                        }
                        case 4 : {
                        	System.out.println("No of Quantity");
                        	order.qyn4 = sc.nextInt();
                        	break ;
	
                        }
                        case 5 : {
                        	System.out.println("No of Quantity");
                        	order.qyn5 = sc.nextInt();
	
                        }
                        case 6 : {
                        	System.out.println("No of Quantity");
                        	order.qyn6 = sc.nextInt();
                        	break ;
	
                        }
                        case 7 : {
                        	System.out.println("No of Quantity");
                        	order.qyn7 = sc.nextInt();
                        	break ;
	
                        }
                        case 8 : {
                        	System.out.println("No of Quantity");
                        	order.qyn8 = sc.nextInt();
                        	break ;
	
                        }
                        case 9 : {
                        	System.out.println("No of Quantity");
                        	order.qyn9 = sc.nextInt();
                        	break ;
	
                        }
                        case 10 : {
                        	System.out.println("No of Quantity");
                        	order.qyn10 = sc.nextInt();
                        	break ;
	
                        }
                        case 11 : {
                        	System.out.println("No of Quantity");
                        	order.qyn11 = sc.nextInt();
                        	break ;
	
                        }
                        case 12 : {
                        	System.out.println("No of Quantity");
                        	order.qyn12 = sc.nextInt();
                        	break ;
                        	
                        }
                        case 13 : {
                        	System.out.println("No of Quantity");
                        	order.qyn13 = sc.nextInt();
                        	break ;
                        }
                        case 14 : {
                        	System.out.println("No of Quantity");
                        	order.qyn14 = sc.nextInt();
                        	break ;
                        }
                        case 15 : {
                        	System.out.println("No of Quantity");
                        	order.qyn15 = sc.nextInt();
                        	break ;
                        }
                        case 16 : {
                        	System.out.println("No of Quantity");
                        	order.qyn16 = sc.nextInt();
                        	break ;
                        }
						}
					}
				}
                if(r instanceof TastyFoodRestaurant) {
                	TastyFoodRestaurant order = (TastyFoodRestaurant)r ;
                	for( ; ; ) {
                		System.out.println("1."+order.Food1+"\t"+order.price1);
						System.out.println("2."+order.Food2+"\t"+order.price2);
						System.out.println("4."+order.Food3+"\t"+order.price3);
						System.out.println("5."+order.Food4+"\t"+order.price4);
						System.out.println("6."+order.Food5+"\t"+order.price5);
						System.out.println("3."+order.Food6+"\t"+order.price6);
						System.out.println("7."+order.Food7+"\t"+order.price7);
						System.out.println("8."+order.Food8+"\t"+order.price8);
						System.out.println("9."+order.Food9+"\t"+order.price9);
						System.out.println("10."+order.Food10+"\t"+order.price10);
						System.out.println("11."+order.Food11+"\t"+order.price11);
						System.out.println("12."+order.Food12+"\t"+order.price12);
						System.out.println("13."+order.Food13+"\t"+order.price13);
						System.out.println("14."+order.Food14+"\t"+order.price14);
						System.out.println("15."+order.Food15+"\t"+order.price15);
						System.out.println("16."+order.Food16+"\t"+order.price16);
						
                        switch(sc.nextInt()) {
						
						case 1 : {
							System.out.println("No of Quantity");
							order.qyn1 = sc.nextInt();
							break ;
						}
                        case 2 : {
                        	System.out.println("No of Quantity");
                        	order.qyn2 = sc.nextInt();
                        	break ;
						}
                        case 3 : {
                        	System.out.println("No of Quantity");
                        	order.qyn3 = sc.nextInt();
                        	break ;
                        }
                        case 4 : {
                        	System.out.println("No of Quantity");
                        	order.qyn4 = sc.nextInt();
                        	break ;
	
                        }
                        case 5 : {
                        	System.out.println("No of Quantity");
                        	order.qyn5 = sc.nextInt();
	
                        }
                        case 6 : {
                        	System.out.println("No of Quantity");
                        	order.qyn6 = sc.nextInt();
                        	break ;
	
                        }
                        case 7 : {
                        	System.out.println("No of Quantity");
                        	order.qyn7 = sc.nextInt();
                        	break ;
	
                        }
                        case 8 : {
                        	System.out.println("No of Quantity");
                        	order.qyn8 = sc.nextInt();
                        	break ;
	
                        }
                        case 9 : {
                        	System.out.println("No of Quantity");
                        	order.qyn9 = sc.nextInt();
                        	break ;
	
                        }
                        case 10 : {
                        	System.out.println("No of Quantity");
                        	order.qyn10 = sc.nextInt();
                        	break ;
	
                        }
                        case 11 : {
                        	System.out.println("No of Quantity");
                        	order.qyn11 = sc.nextInt();
                        	break ;
	
                        }
                        case 12 : {
                        	System.out.println("No of Quantity");
                        	order.qyn12 = sc.nextInt();
                        	break ;
                        	
                        }
                        case 13 : {
                        	System.out.println("No of Quantity");
                        	order.qyn13 = sc.nextInt();
                        	break ;
                        }
                        case 14 : {
                        	System.out.println("No of Quantity");
                        	order.qyn14 = sc.nextInt();
                        	break ;
                        }
                        case 15 : {
                        	System.out.println("No of Quantity");
                        	order.qyn15 = sc.nextInt();
                        	break ;
                        }
                        case 16 : {
                        	System.out.println("No of Quantity");
                        	order.qyn16 = sc.nextInt();
                        	break ;
                        }
						}
					}
				}
                if(r instanceof KingKong_ChineseRestaurant) {
                	KingKong_ChineseRestaurant order = (KingKong_ChineseRestaurant)r ;
                	for( ; ; ) {
                		System.out.println("1."+order.Food1+"\t"+order.price1);
						System.out.println("2."+order.Food2+"\t"+order.price2);
						System.out.println("3."+order.Food3+"\t"+order.price3);
						System.out.println("4."+order.Food4+"\t"+order.price4);
						System.out.println("5."+order.Food5+"\t"+order.price5);
						System.out.println("6."+order.Food6+"\t"+order.price6);
						System.out.println("7."+order.Food7+"\t"+order.price7);
						System.out.println("8."+order.Food8+"\t"+order.price8);
						System.out.println("9."+order.Food9+"\t"+order.price9);
						System.out.println("10."+order.Food10+"\t"+order.price10);
						System.out.println("11."+order.Food11+"\t"+order.price11);
						System.out.println("12."+order.Food12+"\t"+order.price12);
						System.out.println("13."+order.Food13+"\t"+order.price13);
						System.out.println("14."+order.Food14+"\t"+order.price14);
						System.out.println("15."+order.Food15+"\t"+order.price15);
						
						switch(sc.nextInt()) {
						
						case 1 : {
							System.out.println("No of Quantity");
							order.qyn1 = sc.nextInt();
							break ;
						}
                        case 2 : {
                        	System.out.println("No of Quantity");
                        	order.qyn2 = sc.nextInt();
                        	break ;
						}
                        case 3 : {
                        	System.out.println("No of Quantity");
                        	order.qyn3 = sc.nextInt();
                        	break ;
                        }
                        case 4 : {
                        	System.out.println("No of Quantity");
                        	order.qyn4 = sc.nextInt();
                        	break ;
	
                        }
                        case 5 : {
                        	System.out.println("No of Quantity");
                        	order.qyn5 = sc.nextInt();
	
                        }
                        case 6 : {
                        	System.out.println("No of Quantity");
                        	order.qyn6 = sc.nextInt();
                        	break ;
	
                        }
                        case 7 : {
                        	System.out.println("No of Quantity");
                        	order.qyn7 = sc.nextInt();
                        	break ;
	
                        }
                        case 8 : {
                        	System.out.println("No of Quantity");
                        	order.qyn8 = sc.nextInt();
                        	break ;
	
                        }
                        case 9 : {
                        	System.out.println("No of Quantity");
                        	order.qyn9 = sc.nextInt();
                        	break ;
	
                        }
                        case 10 : {
                        	System.out.println("No of Quantity");
                        	order.qyn10 = sc.nextInt();
                        	break ;
	
                        }
                        case 11 : {
                        	System.out.println("No of Quantity");
                        	order.qyn11 = sc.nextInt();
                        	break ;
	
                        }
                        case 12 : {
                        	System.out.println("No of Quantity");
                        	order.qyn12 = sc.nextInt();
                        	break ;
                        	
                        }
                        case 13 : {
                        	System.out.println("No of Quantity");
                        	order.qyn13 = sc.nextInt();
                        	break ;
                        }
                        case 14 : {
                        	System.out.println("No of Quantity");
                        	order.qyn14 = sc.nextInt();
                        	break ;
                        }
                        case 15 : {
                        	System.out.println("No of Quantity");
                        	order.qyn15 = sc.nextInt();
                        	break ;
                        }
						}

                   }
			  }
              if(r instanceof DesiDhabbaRestaurant) {
                DesiDhabbaRestaurant order = (DesiDhabbaRestaurant)r ;
                for( ; ; ) {
					System.out.println("1."+order.Food1+"\t"+order.price1);
					System.out.println("2."+order.Food2+"\t"+order.price2);
					System.out.println("3."+order.Food3+"\t"+order.price3);
					System.out.println("4."+order.Food4+"\t"+order.price4);
					System.out.println("5."+order.Food5+"\t"+order.price5);
					System.out.println("6."+order.Food6+"\t"+order.price6);
					System.out.println("7."+order.Food7+"\t"+order.price7);
					System.out.println("8."+order.Food8+"\t"+order.price8);
					System.out.println("9."+order.Food9+"\t"+order.price9);
					System.out.println("10."+order.Food10+"\t"+order.price10);
					System.out.println("11."+order.Food11+"\t"+order.price11);
					System.out.println("12."+order.Food12+"\t"+order.price12);
					System.out.println("13."+order.Food13+"\t"+order.price13);
					System.out.println("14."+order.Food14+"\t"+order.price14);
					System.out.println("15."+order.Food15+"\t"+order.price15);
					System.out.println("16."+order.Food16+"\t"+order.price16);
					
					switch(sc.nextInt()) {
					
					case 1 : {
						System.out.println("No of Quantity");
						order.qyn1 = sc.nextInt();
						break ;
					}
                    case 2 : {
                    	System.out.println("No of Quantity");
                    	order.qyn2 = sc.nextInt();
                    	break ;
					}
                    case 3 : {
                    	System.out.println("No of Quantity");
                    	order.qyn3 = sc.nextInt();
                    	break ;
                    }
                    case 4 : {
                    	System.out.println("No of Quantity");
                    	order.qyn4 = sc.nextInt();
                    	break ;

                    }
                    case 5 : {
                    	System.out.println("No of Quantity");
                    	order.qyn5 = sc.nextInt();

                    }
                    case 6 : {
                    	System.out.println("No of Quantity");
                    	order.qyn6 = sc.nextInt();
                    	break ;

                    }
                    case 7 : {
                    	System.out.println("No of Quantity");
                    	order.qyn7 = sc.nextInt();
                    	break ;

                    }
                    case 8 : {
                    	System.out.println("No of Quantity");
                    	order.qyn8 = sc.nextInt();
                    	break ;

                    }
                    case 9 : {
                    	System.out.println("No of Quantity");
                    	order.qyn9 = sc.nextInt();
                    	break ;

                    }
                    case 10 : {
                    	System.out.println("No of Quantity");
                    	order.qyn10 = sc.nextInt();
                    	break ;

                    }
                    case 11 : {
                    	System.out.println("No of Quantity");
                    	order.qyn11 = sc.nextInt();
                    	break ;

                    }
                    case 12 : {
                    	System.out.println("No of Quantity");
                    	order.qyn12 = sc.nextInt();
                    	break ;
                    	
                    }
                    case 13 : {
                    	System.out.println("No of Quantity");
                    	order.qyn13 = sc.nextInt();
                    	break ;
                    }
                    case 14 : {
                    	System.out.println("No of Quantity");
                    	order.qyn14 = sc.nextInt();
                    	break ;
                    }
                    case 15 : {
                    	System.out.println("No of Quantity");
                    	order.qyn15 = sc.nextInt();
                    	break ;
                    }
                    case 16 : {
                    	System.out.println("No of Quantity");
                    	order.qyn16 = sc.nextInt();
                    	break ;
                    }
					}
				}
             }
		  }
	   }
	}
    public void CancelOrder() {
		if(r==null) {
			System.err.println("No Food Hs been order yet...");
		}
		else {
			r = null ;
		}
	}
    public void Bill() {
	
    	if(a==null) {
    		System.out.println("Please make login...");
    	}
    	else {
    		if(r==null) {
    			System.out.println("Please select hotel and order food..");
    		}
    		else {
    			if(r instanceof Swati_Resraurant) {
    				Swati_Resraurant bill = (Swati_Resraurant)r ;
    				int sum = 0 ;
    				if(bill.qyn1 != 0) {
    					System.out.println(bill.Food1+"\t"+bill.qyn1+"------"+bill.qyn1*bill.price1);
    					sum = (int)(sum +( bill.qyn1*bill.price1));
    				}
    				if(bill.qyn2 != 0) {
    					System.out.println(bill.Food2+"\t"+bill.qyn2+"------"+bill.qyn2*bill.price2);
    					sum = (int)(sum +( bill.qyn2*bill.price2));
    				}
    				if(bill.qyn3 != 0) {
    					System.out.println(bill.Food3+"\t"+bill.qyn3+"------"+bill.qyn3*bill.price3);
    					sum = (int)(sum +( bill.qyn3*bill.price3));
    				}
    				if(bill.qyn4 != 0) {
    					System.out.println(bill.Food4+"\t"+bill.qyn4+"------"+bill.qyn4*bill.price4);
    					sum = (int)(sum +( bill.qyn4*bill.price4));
    				}
    				if(bill.qyn5 != 0) {
    					System.out.println(bill.Food5+"\t"+bill.qyn5+"------"+bill.qyn5*bill.price5);
    					sum = (int)(sum +( bill.qyn5*bill.price5));
    				}
    				if(bill.qyn6 != 0) {
    					System.out.println(bill.Food6+"\t"+bill.qyn6+"------"+bill.qyn6*bill.price6);
    					sum = (int)(sum +( bill.qyn6*bill.price6));
    				}
    				if(bill.qyn7 != 0) {
    					System.out.println(bill.Food7+"\t"+bill.qyn7+"------"+bill.qyn7*bill.price7);
    					sum = (int)(sum +( bill.qyn7*bill.price7));
    				}
    				if(bill.qyn8 != 0) {
    					System.out.println(bill.Food8+"\t"+bill.qyn8+"------"+bill.qyn8*bill.price8);
    					sum = (int)(sum +( bill.qyn8*bill.price8));
    				}
    				if(bill.qyn9 != 0) {
    					System.out.println(bill.Food9+"\t"+bill.qyn9+"------"+bill.qyn9*bill.price9);
    					sum = (int)(sum +( bill.qyn9*bill.price9));
    				}
    				if(bill.qyn10 != 0) {
    					System.out.println(bill.Food10+"\t"+bill.qyn10+"------"+bill.qyn10*bill.price10);
    					sum = (int)(sum +( bill.qyn10*bill.price10));
    				}
    				if(bill.qyn11 != 0) {
    					System.out.println(bill.Food11+"\t"+bill.qyn11+"------"+bill.qyn11*bill.price11);
    					sum = (int)(sum +( bill.qyn11*bill.price11));
    				}
    				if(bill.qyn12 != 0) {
    					System.out.println(bill.Food12+"\t"+bill.qyn12+"------"+bill.qyn12*bill.price12);
    					sum = (int)(sum +( bill.qyn12*bill.price12));
    				}
    				if(bill.qyn13 != 0) {
    					System.out.println(bill.Food13+"\t"+bill.qyn13+"------"+bill.qyn13*bill.price13);
    					sum = (int)(sum +( bill.qyn13*bill.price13));
    				}
    				if(bill.qyn14 != 0) {
    					System.out.println(bill.Food14+"\t"+bill.qyn14+"------"+bill.qyn14*bill.price14);
    					sum = (int)(sum +( bill.qyn14*bill.price14));
    				}
    				if(bill.qyn15 != 0) {
    					System.out.println(bill.Food15+"\t"+bill.qyn15+"------"+bill.qyn15*bill.price15);
    					sum = (int)(sum +( bill.qyn15*bill.price15));
    				}
    				if(bill.qyn16 != 0) {
    					System.out.println(bill.Food16+"\t"+bill.qyn16+"------"+bill.qyn16*bill.price16);
    					sum = (int)(sum +( bill.qyn16*bill.price16));
    				}
    				
    				System.out.println("Total Amount "+"\t"+sum);
    			}
    			
    			if(r instanceof TastyFoodRestaurant) {
    				TastyFoodRestaurant bill = (TastyFoodRestaurant)r ;
    				int sum = 0 ;
    				if(bill.qyn1 != 0) {
    					System.out.println(bill.Food1+"\t"+bill.qyn1+"------"+bill.qyn1*bill.price1);
    					sum = (int)(sum +( bill.qyn1*bill.price1));
    				}
    				if(bill.qyn2 != 0) {
    					System.out.println(bill.Food2+"\t"+bill.qyn2+"------"+bill.qyn2*bill.price2);
    					sum = (int)(sum +( bill.qyn2*bill.price2));
    				}
    				if(bill.qyn3 != 0) {
    					System.out.println(bill.Food3+"\t"+bill.qyn3+"------"+bill.qyn3*bill.price3);
    					sum = (int)(sum +( bill.qyn3*bill.price3));
    				}
    				if(bill.qyn4 != 0) {
    					System.out.println(bill.Food4+"\t"+bill.qyn4+"------"+bill.qyn4*bill.price4);
    					sum = (int)(sum +( bill.qyn4*bill.price4));
    				}
    				if(bill.qyn5 != 0) {
    					System.out.println(bill.Food5+"\t"+bill.qyn5+"------"+bill.qyn5*bill.price5);
    					sum = (int)(sum +( bill.qyn5*bill.price5));
    				}
    				if(bill.qyn6 != 0) {
    					System.out.println(bill.Food6+"\t"+bill.qyn6+"------"+bill.qyn6*bill.price6);
    					sum = (int)(sum +( bill.qyn6*bill.price6));
    				}
    				if(bill.qyn7 != 0) {
    					System.out.println(bill.Food7+"\t"+bill.qyn7+"------"+bill.qyn7*bill.price7);
    					sum = (int)(sum +( bill.qyn7*bill.price7));
    				}
    				if(bill.qyn8 != 0) {
    					System.out.println(bill.Food8+"\t"+bill.qyn8+"------"+bill.qyn8*bill.price8);
    					sum = (int)(sum +( bill.qyn8*bill.price8));
    				}
    				if(bill.qyn9 != 0) {
    					System.out.println(bill.Food9+"\t"+bill.qyn9+"------"+bill.qyn9*bill.price9);
    					sum = (int)(sum +( bill.qyn9*bill.price9));
    				}
    				if(bill.qyn10 != 0) {
    					System.out.println(bill.Food10+"\t"+bill.qyn10+"------"+bill.qyn10*bill.price10);
    					sum = (int)(sum +( bill.qyn10*bill.price10));
    				}
    				if(bill.qyn11 != 0) {
    					System.out.println(bill.Food11+"\t"+bill.qyn11+"------"+bill.qyn11*bill.price11);
    					sum = (int)(sum +( bill.qyn11*bill.price11));
    				}
    				if(bill.qyn12 != 0) {
    					System.out.println(bill.Food12+"\t"+bill.qyn12+"------"+bill.qyn12*bill.price12);
    					sum = (int)(sum +( bill.qyn12*bill.price12));
    				}
    				if(bill.qyn13 != 0) {
    					System.out.println(bill.Food13+"\t"+bill.qyn13+"------"+bill.qyn13*bill.price13);
    					sum = (int)(sum +( bill.qyn13*bill.price13));
    				}
    				if(bill.qyn14 != 0) {
    					System.out.println(bill.Food14+"\t"+bill.qyn14+"------"+bill.qyn14*bill.price14);
    					sum = (int)(sum +( bill.qyn14*bill.price14));
    				}
    				if(bill.qyn15 != 0) {
    					System.out.println(bill.Food15+"\t"+bill.qyn15+"------"+bill.qyn15*bill.price15);
    					sum = (int)(sum +( bill.qyn15*bill.price15));
    				}
    				if(bill.qyn16 != 0) {
    					System.out.println(bill.Food16+"\t"+bill.qyn16+"------"+bill.qyn16*bill.price16);
    					sum = (int)(sum +( bill.qyn16*bill.price16));
    				}
    				
    				System.out.println("Total Amount "+"\t"+sum);
    			}
    			
    			if(r instanceof KingKong_ChineseRestaurant) {
    				KingKong_ChineseRestaurant bill = (KingKong_ChineseRestaurant)r ;
    				int sum = 0 ;
    				if(bill.qyn1 != 0) {
    					System.out.println(bill.Food1+"\t"+bill.qyn1+"------"+bill.qyn1*bill.price1);
    					sum = (int)(sum +( bill.qyn1*bill.price1));
    				}
    				if(bill.qyn2 != 0) {
    					System.out.println(bill.Food2+"\t"+bill.qyn2+"------"+bill.qyn2*bill.price2);
    					sum = (int)(sum +( bill.qyn2*bill.price2));
    				}
    				if(bill.qyn3 != 0) {
    					System.out.println(bill.Food3+"\t"+bill.qyn3+"------"+bill.qyn3*bill.price3);
    					sum = (int)(sum +( bill.qyn3*bill.price3));
    				}
    				if(bill.qyn4 != 0) {
    					System.out.println(bill.Food4+"\t"+bill.qyn4+"------"+bill.qyn4*bill.price4);
    					sum = (int)(sum +( bill.qyn4*bill.price4));
    				}
    				if(bill.qyn5 != 0) {
    					System.out.println(bill.Food5+"\t"+bill.qyn5+"------"+bill.qyn5*bill.price5);
    					sum = (int)(sum +( bill.qyn5*bill.price5));
    				}
    				if(bill.qyn6 != 0) {
    					System.out.println(bill.Food6+"\t"+bill.qyn6+"------"+bill.qyn6*bill.price6);
    					sum = (int)(sum +( bill.qyn6*bill.price6));
    				}
    				if(bill.qyn7 != 0) {
    					System.out.println(bill.Food7+"\t"+bill.qyn7+"------"+bill.qyn7*bill.price7);
    					sum = (int)(sum +( bill.qyn7*bill.price7));
    				}
    				if(bill.qyn8 != 0) {
    					System.out.println(bill.Food8+"\t"+bill.qyn8+"------"+bill.qyn8*bill.price8);
    					sum = (int)(sum +( bill.qyn8*bill.price8));
    				}
    				if(bill.qyn9 != 0) {
    					System.out.println(bill.Food9+"\t"+bill.qyn9+"------"+bill.qyn9*bill.price9);
    					sum = (int)(sum +( bill.qyn9*bill.price9));
    				}
    				if(bill.qyn10 != 0) {
    					System.out.println(bill.Food10+"\t"+bill.qyn10+"------"+bill.qyn10*bill.price10);
    					sum = (int)(sum +( bill.qyn10*bill.price10));
    				}
    				if(bill.qyn11 != 0) {
    					System.out.println(bill.Food11+"\t"+bill.qyn11+"------"+bill.qyn11*bill.price11);
    					sum = (int)(sum +( bill.qyn11*bill.price11));
    				}
    				if(bill.qyn12 != 0) {
    					System.out.println(bill.Food12+"\t"+bill.qyn12+"------"+bill.qyn12*bill.price12);
    					sum = (int)(sum +( bill.qyn12*bill.price12));
    				}
    				if(bill.qyn13 != 0) {
    					System.out.println(bill.Food13+"\t"+bill.qyn13+"------"+bill.qyn13*bill.price13);
    					sum = (int)(sum +( bill.qyn13*bill.price13));
    				}
    				if(bill.qyn14 != 0) {
    					System.out.println(bill.Food14+"\t"+bill.qyn14+"------"+bill.qyn14*bill.price14);
    					sum = (int)(sum +( bill.qyn14*bill.price14));
    				}
    				if(bill.qyn15 != 0) {
    					System.out.println(bill.Food15+"\t"+bill.qyn15+"------"+bill.qyn15*bill.price15);
    					sum = (int)(sum +( bill.qyn15*bill.price15));
    				}
    				System.out.println("Total Amount "+"\t"+sum);
    			}
    			
    			if(r instanceof DesiDhabbaRestaurant) {
    				DesiDhabbaRestaurant bill = (DesiDhabbaRestaurant)r ;
    				int sum = 0 ;
    				if(bill.qyn1 != 0) {
    					System.out.println(bill.Food1+"\t"+bill.qyn1+"------"+bill.qyn1*bill.price1);
    					sum = (int)(sum +( bill.qyn1*bill.price1));
    				}
    				if(bill.qyn2 != 0) {
    					System.out.println(bill.Food2+"\t"+bill.qyn2+"------"+bill.qyn2*bill.price2);
    					sum = (int)(sum +( bill.qyn2*bill.price2));
    				}
    				if(bill.qyn3 != 0) {
    					System.out.println(bill.Food3+"\t"+bill.qyn3+"------"+bill.qyn3*bill.price3);
    					sum = (int)(sum +( bill.qyn3*bill.price3));
    				}
    				if(bill.qyn4 != 0) {
    					System.out.println(bill.Food4+"\t"+bill.qyn4+"------"+bill.qyn4*bill.price4);
    					sum = (int)(sum +( bill.qyn4*bill.price4));
    				}
    				if(bill.qyn5 != 0) {
    					System.out.println(bill.Food5+"\t"+bill.qyn5+"------"+bill.qyn5*bill.price5);
    					sum = (int)(sum +( bill.qyn5*bill.price5));
    				}
    				if(bill.qyn6 != 0) {
    					System.out.println(bill.Food6+"\t"+bill.qyn6+"------"+bill.qyn6*bill.price6);
    					sum = (int)(sum +( bill.qyn6*bill.price6));
    				}
    				if(bill.qyn7 != 0) {
    					System.out.println(bill.Food7+"\t"+bill.qyn7+"------"+bill.qyn7*bill.price7);
    					sum = (int)(sum +( bill.qyn7*bill.price7));
    				}
    				if(bill.qyn8 != 0) {
    					System.out.println(bill.Food8+"\t"+bill.qyn8+"------"+bill.qyn8*bill.price8);
    					sum = (int)(sum +( bill.qyn8*bill.price8));
    				}
    				if(bill.qyn9 != 0) {
    					System.out.println(bill.Food9+"\t"+bill.qyn9+"------"+bill.qyn9*bill.price9);
    					sum = (int)(sum +( bill.qyn9*bill.price9));
    				}
    				if(bill.qyn10 != 0) {
    					System.out.println(bill.Food10+"\t"+bill.qyn10+"------"+bill.qyn10*bill.price10);
    					sum = (int)(sum +( bill.qyn10*bill.price10));
    				}
    				if(bill.qyn11 != 0) {
    					System.out.println(bill.Food11+"\t"+bill.qyn11+"------"+bill.qyn11*bill.price11);
    					sum = (int)(sum +( bill.qyn11*bill.price11));
    				}
    				if(bill.qyn12 != 0) {
    					System.out.println(bill.Food12+"\t"+bill.qyn12+"------"+bill.qyn12*bill.price12);
    					sum = (int)(sum +( bill.qyn12*bill.price12));
    				}
    				if(bill.qyn13 != 0) {
    					System.out.println(bill.Food13+"\t"+bill.qyn13+"------"+bill.qyn13*bill.price13);
    					sum = (int)(sum +( bill.qyn13*bill.price13));
    				}
    				if(bill.qyn14 != 0) {
    					System.out.println(bill.Food14+"\t"+bill.qyn14+"------"+bill.qyn14*bill.price14);
    					sum = (int)(sum +( bill.qyn14*bill.price14));
    				}
    				if(bill.qyn15 != 0) {
    					System.out.println(bill.Food15+"\t"+bill.qyn15+"------"+bill.qyn15*bill.price15);
    					sum = (int)(sum +( bill.qyn15*bill.price15));
    				}
    				if(bill.qyn16 != 0) {
    					System.out.println(bill.Food16+"\t"+bill.qyn16+"------"+bill.qyn16*bill.price16);
    					sum = (int)(sum +( bill.qyn16*bill.price16));
    				}
    				
    				System.out.println("Total Amount "+"\t"+sum);
    			}
    			
    			
    		}
    	}
	}
    
    public static void main(String[]args) {
    	Foodies f = new Foodies();
    	
    	System.err.println("Welcome to Foodies");
		System.out.println("Foodies will provide you a best servies by delivering your favourite food from your "
				+ "favourite restaurant");
		System.out.println(); 
		
    	for(;;) {
    		System.out.println("1.Logging"+"\n"+"2.Select Hotel"+"\n"+"3.Order Food"+"\n"+"4.Display Bill"+"\n"+"5.Cancle Order"+
    	                       "\n"+"6.Delete Hotel"+"\n"+"7.Logout"+"\n"+"8.Exit");
    		System.out.println("Enter your request here");
    		
    		switch(f.sc.nextInt()) {
    		case 1 :{
    			f.login();
    			break ;
    		}
    		case 2 :{
    			f.SelectRestaurant();
    			break ;
    		}
    		case 3 :{
    			f.OrderFood();
    			break ;
    		}
    		case 4 :{
    			f.Bill();
    			break ;
    		}
    		case 5 :{
    			f.CancelOrder();
    			break ;
    		}
    		case 6 :{
    			f.RemoveResraurant();
    			break ;
    		}
    		case 7 :{
    			f.logout();
    			break ;
    		}
    		case 8 :{
    			System.err.println("....Application is closed....");
    			return;
    		}
    		}
    	}
    		
    }
}
