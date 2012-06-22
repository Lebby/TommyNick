package tommynick.core.objects.logos;

import forscene.core.entities.AbstractSceneObject;
import forscene.core.util.GraphicFactory;

public class LebbyLogo extends AbstractSceneObject {

	@Override
	public void build() {
		GraphicFactory.addImage("images/logos/Lebby.png",this);
	}

	@Override
	public void updateState() {
		// TODO Auto-generated method stub

	}

}
