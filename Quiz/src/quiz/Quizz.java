package quiz;


	import java.util.Scanner;
	public class Quizz{
		public static void main(String[] args) {
			

			 
			        Scanner sc = new Scanner(System.in);
			        int score = 0;
			        boolean audienceUsed = false;
			        boolean friendUsed = false;
	                int life=0;
			        // Question 1
			        System.out.println("Question 1: What is the capital of India?");
			        System.out.println("A) Mumbai");
			        System.out.println("B) Delhi");
			        System.out.println("C) Chennai");
			        System.out.println("D) Kolkata");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer1 = sc.next().charAt(0);
			         

			        if (answer1 == 'L' || answer1 == 'l') {
			        	if(life>=4) {
				        	System.out.println("lifeline is completed choose an option");
				        }else {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options C and D.");
			                System.out.println("A) Mumbai");
			                System.out.println("B) Delhi");
			                System.out.print("Enter your answer (A/B): ");
			                answer1 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 10%, B) 80%, C) 5%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer1 = sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: B) Delhi");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer1 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }
			        if (answer1 == 'B' || answer1 == 'b') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is B) Delhi.");
			            System.out.println("Your final score is: " + score);
			            return;
			        }

			        // Question 2
			        System.out.println("Question 2: Who is the founder of Microsoft?");
			        System.out.println("A) Bill Gates");
			        System.out.println("B) Steve Jobs");
			        System.out.println("C) Mark Zuckerberg");
			        System.out.println("D) Elon Musk");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer2 = sc.next().charAt(0);

			        if (answer2 == 'L' || answer2 == 'l') {
			        	if(life>=4) {
				        	System.out.println("lifeline is completed choose an option");
				        }else {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options C and D.");
			                System.out.println("A) Bill Gates");
			                System.out.println("B) Steve Jobs");
			                System.out.print("Enter your answer (A/B): ");
			                answer2 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 70%, B) 20%, C) 5%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer2 = sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: A) Bill Gates");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer2 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }
			        if (answer2 == 'A' || answer2 == 'a') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is A) Bill Gates.");
			            System.out.println("Your final score is: " + score);
			            return;
			        }
	      //3rd question
			        // Add more questions similarly
			        // ...

			        // Final score
			        System.out.println("Question 3: Which is the largest planet in our solar system?");
			        System.out.println("A) Jupiter");
			        System.out.println("B) Mars");
			        System.out.println("C) Satrun");
			        System.out.println("D) Uranus");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer3 = sc.next().charAt(0);

			        if (answer3 == 'L' || answer3 == 'l') {
			        	if(life>=4) {
				        	System.out.println("lifeline is completed choose an option");
				        }else {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options C and D.");
			                System.out.println("A) Jupiter");
			                System.out.println("B) Mars");
			                System.out.print("Enter your answer (A/B): ");
			                answer3 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 70%, B) 20%, C) 5%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer3 = sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: A) Mars");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer3 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }
			        if (answer3 == 'A' || answer3 == 'a') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is A) Mars.");
			            System.out.println("Your final score is: " + score);
			            return;
			        }
			        //4th question
			        System.out.println("Question 4: What is the default value of a boolean variable in Java?");
			        System.out.println("A)  true");
			        System.out.println("B)  false");
			        System.out.println("C)  null");
			        System.out.println("D)  0");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer4 = sc.next().charAt(0);
			        if(life>=4) {
			        	System.out.println("lifeline is completed choose an option");
			        }else {

			        if (answer4 == 'L' || answer4 == 'l') {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options C and D.");
			                System.out.println("A) true");
			                System.out.println("B) false");
			                System.out.print("Enter your answer (A/B): ");
			                answer4 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 70%, B) 50%, C) 5%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer4= sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: B) false");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer4 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }
			        if (answer4 == 'B' || answer4 == 'b') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is B) false.");
			            System.out.println("Your final score is: " + score);
			            return;
			        }
			        
			        //5th question
			        System.out.println("Question 5: Which operation is used for object comparison in java?");
			        System.out.println("A) equals()");
			        System.out.println("B) ==");
			        System.out.println("C) compareTo()");
			        System.out.println("D) compare");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer5 = sc.next().charAt(0);

			        if (answer5 == 'L' || answer5 == 'l') {
			        	if(life>=4) {
				        	System.out.println("lifeline is completed choose an option");
				        }else {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options C and D.");
			                System.out.println("A) equals()");
			                System.out.println("B) ==");
			                System.out.print("Enter your answer (A/B): ");
			                answer5 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 70%, B) 20%, C) 5%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer5 = sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: A) equlas()");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer5 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }
			        if (answer5 == 'A' || answer5 == 'a') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is A) equals().");
			            System.out.println("Your final score is: " + score);
			            return;
			        }
			        
			        //6th question
			        System.out.println("Question 6: Which of the following is NOT a valid java Identifier?");
			        System.out.println("A) myVariable");
			        System.out.println("B) _variableName");
			        System.out.println("C) 2variable");
			        System.out.println("D) variable_name");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer6 = sc.next().charAt(0);

			        if (answer6 == 'L' || answer6 == 'l') {
			        	if(life>=4) {
				        	System.out.println("lifeline is completed choose an option");
				        }else {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options B and D.");
			                System.out.println("A)  myVariable ");
			                System.out.println("C)  2variable");
			                System.out.print("Enter your answer (A/C): ");
			                answer6 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 70%, B) 20%, C) 50%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer6 = sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: C) 2Variable");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer6 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }
			        if (answer6 == 'C' || answer6 == 'c') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is C) 2Variable.");
			            System.out.println("Your final score is: " + score);
			            return;
			        }
			        
			        
			        //7th question
			        System.out.println("Question 7: To Which of the following does the class String belongs to?");
			        System.out.println("A) java.lang");
			        System.out.println("B) java.awt");
			        System.out.println("C) java.applet");
			        System.out.println("D) java.string");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer7 = sc.next().charAt(0);

			        if (answer7 == 'L' || answer7 == 'l') {
			        	if(life>=4) {
				        	System.out.println("lifeline is completed choose an option");
				        }else {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options C and D.");
			                System.out.println("A)java.lang  ");
			                System.out.println("B)  java.awt");
			                System.out.print("Enter your answer (A/B): ");
			                answer7 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 70%, B) 20%, C) 5%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer7 = sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: D) java.string");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer7 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }
			        if (answer7 == 'A' || answer7 == 'a') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is A) java.lang.");
			            System.out.println("Your final score is: " + score);
			            return;
			        }
			        
			        //8th
			        System.out.println("Question 8: Where does the System stores parameters & local variables?");
			        System.out.println("A)  Heap");
			        System.out.println("B)  Stack");
			        System.out.println("C)  Array");
			        System.out.println("D)  Tree");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer8 = sc.next().charAt(0);

			        if (answer8 == 'L' || answer8 == 'l') {
			        	if(life>=4) {
				        	System.out.println("lifeline is completed choose an option");
				        }else {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options C and D.");
			                System.out.println("A) Heap");
			                System.out.println("B) Stack");
			                System.out.print("Enter your answer (A/B): ");
			                answer8 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 70%, B) 75%, C) 5%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer8 = sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: A) Heap");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer8 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }

			        if (answer8 == 'B' || answer8 == 'b') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is B) Stack.");
			            System.out.println("Your final score is: " + score);
			            return;
			        }
			        //9th question
			        System.out.println("Question 9: The variable declared in a class for the use of all  methods of class?");
			        System.out.println("A) local variable");
			        System.out.println("B) object");
			        System.out.println("C) instance variable");
			        System.out.println("D) None of these");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer9 = sc.next().charAt(0);
			        if(life>=4) {
			        	System.out.println("lifeline is completed choose an option");
			        }else {
			        if (answer9 == 'L' || answer9 == 'l') {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options B and D.");
			                System.out.println("A)  local variable ");
			                System.out.println("C)  instance variable");
			                System.out.print("Enter your answer (A/C): ");
			                answer9 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 70%, B) 80%, C) 90%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer9 = sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: C) instance variable");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer9 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }
			        if (answer9 == 'C' || answer9 == 'c') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is C) Instance variable.");
			            System.out.println("Your final score is: " + score);
			            return;
			        }
			        //10th question
			        System.out.println("Question 10: Identify the return type of a method that does not return any value?");
			        System.out.println("A)  int");
			        System.out.println("B)  void");
			        System.out.println("C)  double");
			        System.out.println("D)  None");
			        System.out.print("Enter your answer (A/B/C/D) or 'L' for lifeline: ");
			        char answer10 = sc.next().charAt(0);

			        if (answer10 == 'L' || answer10 == 'l') {
			        	if(life>=4) {
				        	System.out.println("lifeline is completed choose an option");
				        }else {
			            System.out.print("Enter '1' for 50-50, '2' for Ask the Audience, or '3' for Phone a Friend: ");
			            int lifelineChoice = sc.nextInt();
			            life++;
			            if (lifelineChoice == 1) {
			                // 50-50 lifeline
			                System.out.println("Removing options C and D.");
			                System.out.println("A) int");
			                System.out.println("B) void");
			                System.out.print("Enter your answer (A/B): ");
			                answer10 = sc.next().charAt(0);
			            } else if (lifelineChoice == 2) {
			                if (!audienceUsed) {
			                    // Ask the Audience lifeline
			                    audienceUsed = true;
			                    System.out.println("Audience says: A) 70%, B) 75%, C) 5%, D) 5%");
			                } else {
			                    System.out.println("Audience lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer10 = sc.next().charAt(0);
			            } else if (lifelineChoice == 3) {
			                if (!friendUsed) {
			                    // Phone a Friend lifeline
			                    friendUsed = true;
			                    System.out.println("Friend says: B) void");
			                } else {
			                    System.out.println("Phone a Friend lifeline already used.");
			                }
			                System.out.print("Enter your answer (A/B/C/D): ");
			                answer10 = sc.next().charAt(0);
			            } else {
			                System.out.println("Invalid lifeline choice. Exiting game.");
			                return;
			            }
			        }
			        }
			        if (answer10 == 'B' || answer10 == 'b') {
			            score += 1000;
			            System.out.println("Correct!");
			        } else {
			            System.out.println("Incorrect. The correct answer is B) void.");
			            System.out.println("Your final score is: " + score);
			            return;
			        }
			         

			        
			        System.out.println("Your final score is: " + score);

			        sc.close();
			        
			        
			        
			        
			    }
			}
			    
			
		



