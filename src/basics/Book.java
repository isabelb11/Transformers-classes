package basics;

public class Book {
	//create variables
	// title, genre,author,issue date, print date, version,price,publisher
	
	 // declare variables
    String title;
    String genre;
    String author;
    String issueDate;
    double version;
    String iSBN;
    double price;
    String publisher;
    int pageQty;



   // the job of a constructor is to initialize all of the variables of a class
    // create constructors
    // default constructor
    public Book() {
        title = "";
        genre = "";
        author = "";
        issueDate = "";
        version = 0;
        iSBN = "";
        price = 0;
        publisher = "";
        pageQty = 0;
    }



   public Book(String newTitle, double newPrice) {
        title = newTitle;
        genre = "";
        author = "";
        issueDate = "";
        version = 0;
        iSBN = "";
        price = newPrice;
        publisher = "";
        pageQty = 0;
    }



   public Book(String newTitle, String newGenre, String newAuthor, String newIssueDate, double newVersion,
            String newISBN, double newPrice, String newPublisher, int newPageQTY) {
        title = newTitle;
        genre = newGenre;
        author = newAuthor;
        issueDate = newIssueDate;
        version = newVersion;
        iSBN = newISBN;
        price = newPrice;
        publisher = newPublisher;
        pageQty = newPageQTY;
		}
	
   // PRINTING SOMETHING IN THE CONSOLE IS NOT SAME AS RETURN 
    
   public int sum(int a, int b, int c) {
	   int temp = a + b + c;
	   System.out.println("result of sum()" + temp);
	   return a + b +c;
   }
   
   public void printTittle() {
	   System.out.println("title: "+title);
   }
public void printBookInfo() {

	String line1 = "title: " + title + " by:" + author;
	String line2 = "genre: " + genre + ", issue: " +issueDate + ", version: " + version;
	String line3 = "publisher: " + publisher + ", Number of pages: " + pageQty;
	System.out.println("--------------");
	System.out.println(line1);
	System.out.println(line2);
	System.out.println(line3);
	System.out.println("--------------");
	
}

//Interview Questions 
// return n number of -
// given 5 result:-----
public String generateDashes(int n) {
    String res = "";
    for (int i = 0; i < n; i++) {
        res += "-";
    }
    return res;
}

//find the longest length among 3 given Strings   
public int findLongestLength(String s1, String s2, String s3) {
int res = s1.length();
if (s2.length() > s1.length()) {
    res = s2.length();
}
if (s3.length() > res) {
    res = s3.length();
}
return res;
}





	
}
	
	
	
	

		
