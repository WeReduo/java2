package smg.com;

public interface JDK8interface {
  /*默认的时候就是为public,abstrac*/
    void add();
    /**jdk8提供默认的方法**/

    default void defaultget() {
      System.out.println("得到");
    }

  static void staticDel() {
    System.out.println("删除");
  }
}
