public class book 
{
    
    private String title;
    private String authorname;
    private string category ;
    private double price;
    private int availableQuantity;
    static double discountRate;
    public double discountAmount;

    
    public storyBook()
    {
       
    }

    
    public Book(String t, String a, string c, double p, int q ,double d)
    {
        title = t;
        author = a;
        category = c;
        price = p;
        availableQuantity = q;
        discountRate=d;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public string getcategory() {
        return category;
    }

    public void setcategory(string category) {
        this.category=category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int availableQuantity() {
        return availableQuantity;
    }

    public void setavailable availableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;


    }
    static void setdiscountrate(double rate) 
    {
        this.discountRate=discountRate;
    }
    public static double getdiscountrate()
    {
        return discountRate;
    }
    public double discountAmount()
    {
        discountAmount= price*10/100;
        price=discountAmount;
    }

    
    public void showDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("available Quantity: " + availableQuantity);
        system.out.println("discount rate"+discountRate);
    }

    
}public class Start {
    public static void main(String[] args) 
    {
        
        Book book1 = new Book("Java Programming", "John Doe", 320, english, 50);
        Book book2 = new Book("Learn Python", "Jane Smith", 250, english, 30);

        
        System.out.printl("Book 1 Details:");
        book1.showDetails();
        

        System.out.printl("Book 2 Details:");
        book2.showDetails();
        system.out.println("show total price");
        book1.discountAmount();
        book2.discountAmount();
        
    }
}