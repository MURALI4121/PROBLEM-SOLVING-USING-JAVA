package R_OBJECT_ORIENTED_PROGRAMMING;


//Consider an E-commerce application where we have different roles such as Admin,Customer,and Guest.
//we can define these roles using different accesses and non accesses modifiers.


import org.w3c.dom.ls.LSOutput;

//Class Representing a User in the application
class User {
    //Fields
    private String name;
    private String email;

    //Constructor
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Method to Display user details

    public void displayDetails() {
        System.out.println("Name : " + name + "Email : " + email);
    }
}

class Admin extends User{
    // Field
    private String AdminId;

    //Constructor
    public Admin(String name, String email, String AdminId) {
        super(name, email);
        this.AdminId = AdminId;
    }

    //Method to Display Admin details
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Admin Id : " + AdminId);
    }

    //Final Method to perform administrative action
    public final void performAdminAction(){
        System.out.println("Performing admin action");
    }
}

//Main method to demonstrate usage
class EcommerceApplication{
    public static void main(String[] args) {
        User user = new User("Murali" , "murali@example.com");
        user.displayDetails();

        Admin admin = new Admin("K S MURALI" , "ksmurali@gmail.com","KSM4121");
        admin.displayDetails();
        admin.performAdminAction();
    }
}


