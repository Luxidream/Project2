The primary goal of this project was to return two quantities that were representative of an input four-character String that corresponds to a station name. 
The first method, getAvg, returns the �ASCII Ceiling�, �ASCII Floor� and �ASCII Average� of the input String. The ASCII floor is the average ASCII value of the String calculated by taking the average ASCII values for each of the characters that make up the String and rounding down. Similarly, the ASCII ceiling is calculated using the same process, but the value is always rounded up instead. Finally, the ASCII average value is the average value that is rounded correctly. If the true average is 19.6, for example, the ASCII average value would be 20. More specifically, if the decimal portion of the value for the average is 0.5 or greater, then the ASCII average would be rounded up, and vice versa. These three values are then added to an integer array, where index 0 corresponds with the ASCII ceiling, index 1 with the ASCII floor, and index 2 with the ASCII average.
The second method, getLetter, simply returns a single ASCII character that represents the same ASCII character as the ASCII average calculated by the previous method. For example, if the ASCII average happened to be 73, getLetter would return �I�.
The implementation for these methods is straightforward, fortunately. The project requirements state that an abstract class MesoAbstract must be defined and that MesoInherit must inherit from it. To achieve this, MesoAbstract was created with two abstract methods, getAvg and getLetter, both not implemented. The constructor for MesoAbstract is implemented however, and adds the station name from MesoStation to a protected String. MesoAbstract also concretely defines the length of the String that it will take into consideration, in this case, 4.
From here, MesoInherit uses the super() keyword to use the constructor from MesoAbstract. It then implements the abstract getAvg and getLetter classes. The getAvg array is calculated by first using converting the station String to a char array, then summing these values and calculating the average as a double. Following this, two different rounding methods are used to determine the floor and ceiling. The floor will always be equal to the value of the double truncated. To calculate the ceiling value, we use the Math.round function. If Math.round(average)  is equal to the truncated value, we know that the ASCII average is equal to the floor, and the ceiling will be the floor+1. If the ASCII average is greater than the floor, that means the double was rounded up, so the ASCII average will be equal to the ceiling, and both values will stay as is. The values are then added to an int array in the correct order then returned.
The second implemented method in MesoInherit, getLetter, calls getAvg to get the int array for the station. getLetter then typecasts the final value of the int array to a char, then returns it. The driver then prints the correct data by calling the methods.
The project was straightforward, and no unexpected issues were encountered on implementing these methods. This project clearly demonstrates the importance of using abstract classes as a �promise� that other child classes can implement.