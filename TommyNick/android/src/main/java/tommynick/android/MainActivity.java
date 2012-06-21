package tommynick.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import tommynick.core.Main;

public class MainActivity extends GameActivity {

  @Override
  public void main(){
    platform().assets().setPathPrefix("tommynick/resources");
    PlayN.run(new Main());
  }
}
