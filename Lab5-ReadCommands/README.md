#ZORK ... Well the starting of it
Zork is a text-based video game, a genre also known as “interactive fiction,” whose defining feature is the absence of typical video game graphics. Instead, the game’s environments and the actions you take are described for you. Popularized in the late 70s and early 80s Zork allowed users to choose there own adventure by being described a scene and then provide commands back to the game to navigate the world.

We won't finish Zork today but we certainly can start!

1. Provide the user with a starting scene. 
1. Inform the user they should move & Prompt a User for a command.
1. You will need to parse the command and respond accordingly.
1. The valid command is move followed by a direction (north, south, east, west)
1. If the user issues a valid command continue the story in some meaningful way 
1. If they do not provide a command that makes sense inform them the story has ended due to their lack of a valid command


# Parsing the Command
The command will come back as a string. The String object has an abundance of methods that can be used to inspect the string.
Once the user has issued a command it would probably be prudent to make sure the issued command starts with move. If it doesn't
then the user clearly did not issue a valid command. 