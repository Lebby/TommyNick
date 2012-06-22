package tommynick.core.objects.logos;

import forscene.core.entities.AbstractSceneObject;
import forscene.core.util.GraphicFactory;

public class GimpLogo extends AbstractSceneObject{

	@Override
	public void build() {
		GraphicFactory.addImage("images/logos/wilber_the_gimp2.png",this);
		
	}

	@Override
	public void updateState() {
		// TODO Auto-generated method stub
		
	}

}
