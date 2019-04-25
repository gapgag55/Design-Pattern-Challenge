public class Database {

  private static Database instance;

  public static Database getInstance() {
    if (instance == null) {
      instance = new Database();
    }

    return instance;
  }

  public void query() {
    System.out.println("Query...");
  }
}