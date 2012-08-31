package tommynick.core.objects.logos;

import forscene.core.entities.objects.AbstractSceneObject;
import forscene.core.util.GraphicFactory;

public class JavaLogo extends AbstractSceneObject{

	@Override
	public void build() {
		GraphicFactory.addImage("images/logos/java68.png",this);
		
	}

	@Override
	public void updateState() {
		// TODO Auto-generated method stub
		
	}

}
