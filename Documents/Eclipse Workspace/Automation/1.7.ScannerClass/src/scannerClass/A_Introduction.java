/*
 * Java Scanner
 * 		Scanner class in Java is found in the java.util package. 
 * 		Java provides various ways to read input from the keyboard, the java.util.Scanner class is one of them.
 * 		The Java Scanner class breaks the input into tokens using a delimiter which is whitespace by default. 
 * 		It provides many methods to read and parse various primitive values.
 * 		The Java Scanner class is widely used to parse text for strings and primitive types using a regular expression. 
 * 		It is the simplest way to get input in Java. 
 * 		By the help of Scanner in Java, we can get input from the user in primitive types such as int, long, double, byte, float, short, etc.
 */

/*
 * Java Scanner Class Declaration
 * 		public final class Scanner  
          	extends Object  
          	implements Iterator<String>
 * How to get Java Scanner
 * To get the instance of Java Scanner which reads input from the user, we need to pass the input stream (System.in) in the constructor of Scanner class. For Example:
 		Scanner in = new Scanner(System.in);  
 * To get the instance of Java Scanner which parses the strings, we need to pass the strings in the constructor of Scanner class. For Example:
 		Scanner in = new Scanner("Hello Javatpoint");  
 */
/*

Java Scanner Class Constructors

SN	Constructor												Description
1)	Scanner(File source)									It constructs a new Scanner that produces values scanned from the specified file.
2)	Scanner(File source, String charsetName)				It constructs a new Scanner that produces values scanned from the specified file.
3)	Scanner(InputStream source)								It constructs a new Scanner that produces values scanned from the specified input stream.
4)	Scanner(InputStream source, String charsetName)			It constructs a new Scanner that produces values scanned from the specified input stream.
5)	Scanner(Readable source)								It constructs a new Scanner that produces values scanned from the specified source.
6)	Scanner(String source)									It constructs a new Scanner that produces values scanned from the specified string.
7)	Scanner(ReadableByteChannel source)						It constructs a new Scanner that produces values scanned from the specified channel.
8)	Scanner(ReadableByteChannel source, String charsetName)	It constructs a new Scanner that produces values scanned from the specified channel.
9)	Scanner(Path source)									It constructs a new Scanner that produces values scanned from the specified file.
10)	Scanner(Path source, String charsetName)				It constructs a new Scanner that produces values scanned from the specified file.

Java Scanner Class Methods

The following are the list of Scanner methods:

SN	Modifier & Type			Method					Description
1)	void					close()					It is used to close this scanner.
2)	pattern					delimiter()				It is used to get the Pattern which the Scanner class is currently using to match delimiters.
3)	Stream<MatchResult>		findAll()				It is used to find a stream of match results that match the provided pattern string.
4)	String					findInLine()			It is used to find the next occurrence of a pattern constructed from the specified string, ignoring delimiters.
5)	string					findWithinHorizon()		It is used to find the next occurrence of a pattern constructed from the specified string, ignoring delimiters.
6)	boolean					hasNext()				It returns true if this scanner has another token in its input.
7)	boolean					hasNextBigDecimal()		It is used to check if the next token in this scanner's input can be interpreted as a BigDecimal using the nextBigDecimal() method or not.
8)	boolean					hasNextBigInteger()		It is used to check if the next token in this scanner's input can be interpreted as a BigDecimal using the nextBigDecimal() method or not.
9)	boolean					hasNextBoolean()		It is used to check if the next token in this scanner's input can be interpreted as a Boolean using the nextBoolean() method or not.
10)	boolean					hasNextByte()			It is used to check if the next token in this scanner's input can be interpreted as a Byte using the nextBigDecimal() method or not.
11)	boolean					hasNextDouble()			It is used to check if the next token in this scanner's input can be interpreted as a BigDecimal using the nextByte() method or not.
12)	boolean					hasNextFloat()			It is used to check if the next token in this scanner's input can be interpreted as a Float using the nextFloat() method or not.
13)	boolean					hasNextInt()			It is used to check if the next token in this scanner's input can be interpreted as an int using the nextInt() method or not.
14)	boolean					hasNextLine()			It is used to check if there is another line in the input of this scanner or not.
15)	boolean					hasNextLong()			It is used to check if the next token in this scanner's input can be interpreted as a Long using the nextLong() method or not.
16)	boolean					hasNextShort()			It is used to check if the next token in this scanner's input can be interpreted as a Short using the nextShort() method or not.
17)	IOException				ioException()			It is used to get the IOException last thrown by this Scanner's readable.
18)	Locale					locale()				It is used to get a Locale of the Scanner class.
19)	MatchResult				match()					It is used to get the match result of the last scanning operation performed by this scanner.
20)	String					next()					It is used to get the next complete token from the scanner which is in use.
21)	BigDecimal				nextBigDecimal()		It scans the next token of the input as a BigDecimal.
22)	BigInteger				nextBigInteger()		It scans the next token of the input as a BigInteger.
23)	boolean					nextBoolean()			It scans the next token of the input into a boolean value and returns that value.
24)	byte					nextByte()				It scans the next token of the input as a byte.
25)	double					nextDouble()			It scans the next token of the input as a double.
26)	float					nextFloat()				It scans the next token of the input as a float.
27)	int						nextInt()				It scans the next token of the input as an Int.
28)	String					nextLine()				It is used to get the input string that was skipped of the Scanner object.
29)	long					nextLong()				It scans the next token of the input as a long.
30)	short					nextShort()				It scans the next token of the input as a short.
31)	int						radix()					It is used to get the default radix of the Scanner use.
32)	void					remove()				It is used when remove operation is not supported by this implementation of Iterator.
33)	Scanner					reset()					It is used to reset the Scanner which is in use.
34)	Scanner					skip()					It skips input that matches the specified pattern, ignoring delimiters
35)	Stream<String>			tokens()				It is used to get a stream of delimiter-separated tokens from the Scanner object which is in use.
36)	String					toString()				It is used to get the string representation of Scanner using.
37)	Scanner					useDelimiter()			It is used to set the delimiting pattern of the Scanner which is in use to the specified pattern.
38)	Scanner					useLocale()				It is used to sets this scanner's locale object to the specified locale.
39)	Scanner					useRadix()				It is used to set the default radix of the Scanner which is in use to the specified radix.
 */