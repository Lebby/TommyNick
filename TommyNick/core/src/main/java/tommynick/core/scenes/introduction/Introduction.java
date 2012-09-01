package tommynick.core.scenes.introduction;

import java.util.ArrayList;

import playn.core.PlayN;
import tommynick.core.IntroScene;
import tommynick.core.JsonSceneIntro;
import tommynick.core.objects.logos.TNLogo;
import forscene.core.entities.AbstractSceneGroup;
import forscene.system.managers.ResourceManager;

public class Introduction extends AbstractSceneGroup {
  ArrayList<IntroScene> scenes;
  JsonSceneIntro        textIntro;

  @Override
  public void build() {

    CreatedBy scene1 = new CreatedBy();
    CreatedTool scene2 = new CreatedTool();
    TNLogo scene7 = new TNLogo(); // TommyNickLogo

    // setting timeout for each scene
    scene1.setTimeout(20);
    scene2.setTimeout(40);
    scene7.setTimeout(10);

    // adding scenes
    // addScene(scene1);
    // addScene(scene2);

    textIntro = new JsonSceneIntro(this);
    // addScene(scene7);
    buildSceneFromJson();

  }

  public void buildSceneFromJson() { // divide et impera! .... is called on json
                                     // load

    int size = textIntro.getText().size();
    scenes = new ArrayList<IntroScene>();

    for (int i = 0; i < size; i++) {
      scenes.add(new IntroScene());
    }

    for (int i = 0; i < size; i++) {
      scenes.get(i).setTimeout(10);
      scenes.get(i).setBackground(
          ResourceManager.loadImageLayer(textIntro.getImage().get(i)));
      scenes.get(i).setText(textIntro.getText().get(i));
      scenes.get(i).setTitle(textIntro.getTitle().get(i));
      addScene(scenes.get(i));
    }
    PlayN.log().debug("BUILDSCENEFROMJSON");
  }

  public void setTextIntro(JsonSceneIntro textIntro) {
    this.textIntro = textIntro;
  }

}