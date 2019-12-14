# program-showcase
a short showcase of a few programs ive made
it is currently very primitive and is simply a repo of code that i made when i was first learning Java in 2019. 

Game2: (10 nov 2019)
A simple game where characters can be created and used to battle each other with Moves. 
Highlights: 
uses ByteStream to store Moves in a .dat file, specifically with the RandomAccessFile object. 
Moves indexed using an Index object, which has a fixed byte length, which then provides the offset of the corresponding actual Moves object
such that the Characters can choose which Moves to be added/'learned'. 


hotelgp program, 
imagine a hotel with x no. of rooms, and at the front desk counter, some guests would like to check in.
this program helps the counter in-charge find an empty room with a press of a button, allows input for the number of guests checked in, and updates the file accordingly. \n
the next program displays a simple GUI jframe for the counter in-charge to check the no. of guests in each room(input room no.) and displays(output), the no of guests in that room. 

Mincoincalc: collects input to calculate the min no. of coins req

Primitivewordprocessor: input which line to edit & input, changes the line according to the input.

wordprocessorv2(copies files): input file(with correct directory!) to read in 1st cmd line arg, file to write/create in 2nd cmd line arg. copies txt file and creates a brand new file. type -1 in a line of read file to terminate program copying till that line. 
used in conjuction with "jimmy.txt" file to showcase
