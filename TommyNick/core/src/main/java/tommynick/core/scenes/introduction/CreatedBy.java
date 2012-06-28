package tommynick.core.scenes.introduction;

import playn.core.PlayN;
import tommynick.core.objects.logos.LebbyLogo;
import tommynick.core.objects.textrend.CreatedByText;
import tommynick.core.objects.textrend.GLSText;
import forscene.core.effects.FadeIn;
import forscene.core.entities.AbstractScene;
import forscene.core.events.system.EventManager;
import forscene.core.events.system.TimeAlarmEvent;
import forscene.core.util.GraphicFactory;
import forscene.exceptions.IDAlreadyPresentException;
import forscene.exceptions.NoNameException;


public class CreatedBy extends AbstractScene{
	private LebbyLogo ll;
	private GLSText gls;
	private CreatedByText cbt;
	
	@Override
	public void build() {
		GraphicFactory.addImage("images/bg.png",this);
		ll=new LebbyLogo();
		gls=new GLSText();
		cbt=new CreatedByText();
		
		TimeAlarmEvent time1,time2,time3;
		
		
		//Create timed event
		time1 = new TimeAlarmEvent(100) {
			private FadeIn fade;
			
			//this function will be called when timeouts elapse!
			@Override
			public void alarm() {
				fade = new FadeIn();
				fade.setTarget(cbt);
				fade.setUpdateRate(4);
				fade.start();	
			}
		};
		
		time2 = new TimeAlarmEvent(200) {
			private FadeIn fade;
			@Override
			public void alarm() {				
				fade = new FadeIn();
				fade.setTarget(gls);
				fade.setUpdateRate(4);
				fade.start();
			}
		};
		
		time3 = new TimeAlarmEvent(300) {
			private FadeIn fade;
			@Override
			public void alarm() {
				fade = new FadeIn();
				fade.setTarget(ll);
				fade.setUpdateRate(4);
				fade.start();
			}
		};
		
		EventManager.getInstance().push(time1);
		EventManager.getInstance().push(time2);
		EventManager.getInstance().push(time3);
		
		//settings relative start
		time1.start();
		time2.start();
		time3.start();

		try {
			
			addSceneObject(ll);			
			addSceneObject(gls);
			addSceneObject(cbt);
			ll.buildOnce();
			gls.buildOnce();
			cbt.buildOnce();

			//hide objects 
			ll.hide();
			gls.hide();
			cbt.hide();
			
			//position
			
			
			
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
