package tommynick.core.scenes.introduction;

import tommynick.core.objects.logos.LebbyLogo;
import tommynick.core.objects.textrend.CreatedByText;
import tommynick.core.objects.textrend.GLSText;
import forscene.core.entities.AbstractScene;
import forscene.exceptions.IDAlreadyPresentException;
import forscene.exceptions.NoNameException;


public class CreatedBy extends AbstractScene{
	private LebbyLogo ll;
	private GLSText gls;
	private CreatedByText cbt;
	
	@Override
	public void build() {
		ll=new LebbyLogo();
		gls=new GLSText();
		cbt=new CreatedByText();
		try {
			addSceneObject(ll);
			addSceneObject(gls);
			addSceneObject(cbt);
		} catch (NoNameException e) {
			e.printStackTrace();
		} catch (IDAlreadyPresentException e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void updateState() {
		// TODO Auto-generated method stub
		
	}

}
