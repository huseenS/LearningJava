// Chatbot program
//Updating your chatbot from the last lab shouldn't require too many changes. 
//You should add a while loop so that the bot can carry on a longer conversation than just a single response.

//How does the chatbot know when you're done talking and the while loop should end? 
//Add in a particular line that signals the chatbot to end the conversation.
// For example, you chat along with the bot endlessly until you type, "bye." The chatbot then exits its while loop and the program finishes.
import javax.swing.JOptionPane;
public class SuperChatbot {

	public static void main(String[] args) {


		String chatBotprompt = JOptionPane.showInputDialog("What up (Wo)Man say hello!?"); 

		if (chatBotprompt.indexOf("hello") != -1) {
		 	chatBotprompt = JOptionPane.showInputDialog("Damn Son how is your day? answer good, great, or awesome for a fun convo! if not...");

		 	while (!chatBotprompt.equals("goodbye")) {

				if (chatBotprompt.indexOf("hello") != -1) {
					JOptionPane.showMessageDialog(null, "hello again? Really? You made it awkward Try again!");
				}
				 if ((chatBotprompt.indexOf("good") != -1 ) 
						|| (chatBotprompt.indexOf("great") != -1 ) 
						||	(chatBotprompt.indexOf("awesome") != -1 )) {
						chatBotprompt = JOptionPane.showInputDialog("Wow look at you! Mine was awesome! What was the most fun aspect? Coding computers?");
						
					}

					else  {
						JOptionPane.showMessageDialog(null, "really? Poor Kid Try again I bet it had to be a good day!");
				}
				if ((chatBotprompt.indexOf("computer") != -1 ) 
				 	|| (chatBotprompt.indexOf("yes") != -1 )
				 	|| (chatBotprompt.indexOf(" ") != -1 )) {
								 
								chatBotprompt = JOptionPane.showInputDialog("Wow that sounds oh so interesting! I had the most fun being typed on.... Do you like being poked all day?");
								
							}
				
					 if ((chatBotprompt.indexOf("yes") != -1 )
					|| (chatBotprompt.indexOf("of course") != -1)
					|| (chatBotprompt.indexOf("maybe") != -1 )) {
						JOptionPane.showMessageDialog(null, "Me 2 man that sounds cool and all but im really tired...goodbye!");
					}
						else  {  chatBotprompt = JOptionPane.showInputDialog(null, "well you don't have to be a jerkface....Goodbye!");
						}

			}
		}
		else  {

			chatBotprompt = JOptionPane.showInputDialog("I Don't understand" + " " + chatBotprompt +  " " + "Don't you Want to have a conversation? Start over");
		}
	
	}
}

