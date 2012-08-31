package tommynick.core.scenes.introduction;

import java.util.ArrayList;

import tommynick.core.IntroScene;
import tommynick.core.JsonSceneIntro;
import tommynick.core.objects.logos.TNLogo;
import forscene.core.entities.AbstractSceneGroup;

public class Introduction extends AbstractSceneGroup {
  ArrayList<IntroScene> scenes;

  @Override
  public void build() {

    CreatedBy scene1 = new CreatedBy();
    CreatedTool scene2 = new CreatedTool();
    TNLogo scene7 = new TNLogo(); // TommyNickLogo

    // setting timeout for each scene
    scene1.setTimeout(20);
    scene2.setTimeout(40);
    scene7.setTimeout(10);

    buildSceneFromJson(); // divide et impera!

    // adding scenes
    addScene(scene1);
    addScene(scene2);
    addScene(scene7);

  }

  void buildSceneFromJson() {
    JsonSceneIntro textIntro = new JsonSceneIntro();
    int size = textIntro.getText().size();
    scenes = new ArrayList<IntroScene>();
    for (int i = 0; i < size; i++) {
      scenes.add(new IntroScene());
    }
  }

}