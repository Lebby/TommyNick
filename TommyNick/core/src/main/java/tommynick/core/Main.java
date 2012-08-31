package tommynick.core;

import tommynick.core.scenes.introduction.Introduction;
import forscene.system.entities.AbstractGame;

public class Main extends AbstractGame {

  @Override
  public int updateRate() {
    return 25;
  }

  @Override
  public void build() {
    try {
      addSceneGroup(new Introduction());
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
