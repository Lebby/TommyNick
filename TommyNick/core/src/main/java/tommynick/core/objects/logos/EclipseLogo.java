package tommynick.core.objects.logos;

import forscene.core.entities.objects.AbstractSimpleSceneObject;
import forscene.core.util.GraphicFactory;

public class EclipseLogo extends AbstractSimpleSceneObject {

  @Override
  public void load() {
    super.load();
    GraphicFactory.addImage("images/logos/eclipseicon.png", this);
  }

  @Override
  public void build() {

  }

  @Override
  public void updateState() {
    // TODO Auto-generated method stub

  }

}
