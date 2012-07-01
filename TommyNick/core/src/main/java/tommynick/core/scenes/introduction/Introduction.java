package tommynick.core.scenes.introduction;

import java.util.ArrayList;

import forscene.core.entities.AbstractScene;
import forscene.core.entities.AbstractSceneGroup;


public class Introduction extends AbstractSceneGroup{

	@Override
	public ArrayList<AbstractScene> build() {
		AbstractScene scene[];
		scene = new AbstractScene[3];

		//instantiation
		scene[0] = new CreatedBy(); 
		scene[1] = new CreatedTool();
		scene[2] = new TNLogo();
		
		//setting timeout for each scene
		scene[0].setTimeout(15);
		scene[1].setTimeout(10);
		scene[2].setTimeout(5);
		
		//adding scenes
		addScene(scene[0]);		
		addScene(scene[1]);
		addScene(scene[2]);
		
		return getScenes();
	}

}
