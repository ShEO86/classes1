public class Main {
    public static void main(String[] args) {
        Book warAndPeace = new Book();
        warAndPeace.bookName = "Война и мир";
        warAndPeace.autorName = "Л.Н.Толстой";
        warAndPeace.publicationYear = 1867;
        System.out.println("Автор " + warAndPeace.autorName + "\nНазвание “" + warAndPeace.bookName + "“\nГод публикации " + warAndPeace.publicationYear+"\n");


    }
}