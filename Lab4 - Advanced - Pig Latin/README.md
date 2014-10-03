#Pig Latin
This lab will take you through quite a few tasts and result in a small windows app that turns something you type in, into pig latin. This is a simple java app written in Java Swing. Java Swing is one of the common frameworks used to 
create GUIs (Graphical User Interface) for the end user. Swing applications are a whole different subject but we can still 
use them even if we don't understand all the code just yet. 

#Steps to complete lab

1. We've taken the complexity of creating an input box and responding to user actions and hidden it in a method.
The method is obviously named find the first TODO and follow the directions
1. The app is written in such a way a history of translations are shown to the user. Since the output will span multiple
lines we opted to use a text area as the output. The problem is a user could edit a text area by default and we don't 
want that. Luckily the text area object has a method on it to toggle if editing is enabled. Use that method to turn off editing.
1. We're almost done. The last step is to throw it all out on the screen! In swing the UI is represented by containers. We've
provided you with the container needed and configured it for you. All you need to do is add the appropriate UI elements to the container and BAM pig latin translation! 