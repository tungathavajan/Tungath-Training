Feature: Assignment Feature

Scenario Outline: Customer Register sucessfully and verify customer is able to send the email 
	Given customer loads the URL in browser 
	When customer clicks on signup button 
	And enters "<firstname>", "<lastname>", "<email>", "<username>" and "<pass>" 
	And clicks on register button 
	Then validate the message
	"""Dear <firstname> <lastname>,
     Your personal settings have been registered.
      """
	Then clicks on Home 
	And Validate "<email>" email from profile section 
	And create email and send to "naveen" 
	And Validate the message "The message has been sent to naveen naveen (naveen)" 
    
    Examples:
    |firstname|lastname|email|username|pass|
    |sankara|mahadeva|sankara.maha@gmail.com|sankara.maha|passw0rd|