package single_inheritance.library_management_system;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author author = new Author(
                "OOPs",
                2000,
                "Lakhmit Singh",
                "Lakhmit singh is the best author."
        );

        // Display details
        author.displayInfo();
    }
}
