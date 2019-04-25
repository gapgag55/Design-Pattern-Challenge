public class Application {
  public static void main(String[] args) {

    Database database = Database.getInstance();
    database.query();
    System.out.println(database);

    Database alterDatabase = Database.getInstance();
    database.query();
    System.out.println(alterDatabase);
  }
}