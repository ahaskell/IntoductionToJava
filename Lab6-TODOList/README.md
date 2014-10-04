#TODO List
We all want a to do list. Well here's a start. We're going to build a simple task list. 

#Part 1
Let's start out assuming the user isn't going to ever make a list of 5 items. 
Prompt the user to input an item, with a friendly reminder they can exit by entering exit
Get up to 5 inputs from the user. After 5 tasks re-display the tasks to the user and exit. 
Also allow the user to enter exit and allow the user to exit early. 

#Part 2 
Now lets modify our program to grow the array on demand. Since the array is a fixed size though you'll need to create
a new array and copy over the values for each new task entered by the user. The program should only exit when the user 
enters exit.