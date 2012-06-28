package tommynick.core;

import static playn.core.PlayN.*;
import tommynick.core.scenes.introduction.Introduction;

import forscene.core.LoopController.AbstractGame;
import forscene.core.entities.AbstractScene;
import forscene.core.util.GraphicFactory;

public class Main extends AbstractGame {

	@Override	
	  public int updateRate() {
	    return 25;
	  }

	  @Override
	  public void build() {
		  //AbstractScene scene = new SimpleScene();
		  //addScene(scene);
		  addSceneGroup(new Introduction());
	  }
	  
	  class SimpleScene extends AbstractScene{
      @Override
	    public void build() {
            // create and add background image layer
              GraphicFactory.addImage("images/bg.png",this);					
	    }

	    @Override
	    public void updateState() {
	    // TODO Auto-generated method stub
	    }
	  }
}
