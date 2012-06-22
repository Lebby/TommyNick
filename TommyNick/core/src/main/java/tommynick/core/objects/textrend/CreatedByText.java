package tommynick.core.objects.textrend;

import forscene.core.entities.AbstractSceneObject;
import forscene.core.util.GraphicFactory;


public class CreatedByText extends AbstractSceneObject {
	
	@Override
	public void build() {
		GraphicFactory.addImage("images/text_rendered/createdby.png",this);		
	}

	@Override
	public void updateState() {
		// TODO Auto-generated method stub
		
	}

}
