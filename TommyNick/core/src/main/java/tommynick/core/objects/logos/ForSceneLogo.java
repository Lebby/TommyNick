package tommynick.core.objects.logos;

import forscene.core.entities.AbstractSceneObject;
import forscene.core.util.GraphicFactory;

public class ForSceneLogo extends AbstractSceneObject{

	@Override
	public void build() {
		GraphicFactory.addImage("images/logos/forscene.png",this);
		
	}

	@Override
	public void updateState() {
		// TODO Auto-generated method stub
		
	}

}
