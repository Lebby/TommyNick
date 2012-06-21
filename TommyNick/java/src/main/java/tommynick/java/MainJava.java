package tommynick.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import tommynick.core.Main;

public class MainJava {

  public static void main(String[] args) {
    JavaPlatform platform = JavaPlatform.register();
    platform.assets().setPathPrefix("tommynick/resources");
    PlayN.run(new Main());
  }
}
