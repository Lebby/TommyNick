package tommynick.core.objects.textrend;

import forscene.core.entities.objects.AbstractSimpleSceneObject;
import forscene.core.util.GraphicFactory;

public class GLSText extends AbstractSimpleSceneObject {

  @Override
  public void build() {
    GraphicFactory.addImage("images/text_rendered/SGL.png", this);
  }

  @Override
  public void updateState() {
    // TODO Auto-generated method stub

  }

}
