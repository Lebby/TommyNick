package tommynick.core.scenes.introduction;

import tommynick.core.objects.logos.LebbyLogo;
import tommynick.core.objects.textrend.CreatedByText;
import tommynick.core.objects.textrend.GLSText;
import forscene.core.effects.FadeIn;
import forscene.core.entities.AbstractScene;
import forscene.core.util.GraphicFactory;
import forscene.exceptions.IDAlreadyPresentException;
import forscene.exceptions.NoNameException;
import forscene.system.events.TimeAlarmEvent;
import forscene.system.managers.EventManager;

public class CreatedBy extends AbstractScene {
  private LebbyLogo     ll;
  private GLSText       gls;
  private CreatedByText cbt;

  @Override
  public void load() {
    ll = new LebbyLogo();
    gls = new GLSText();
    cbt = new CreatedByText();

  }

  @Override
  public void build() {
    try {
      // adding Background
      GraphicFactory.addImage("images/backgrounds/paper.jpg", this);

      addSceneObject(ll);
      addSceneObject(gls);
      addSceneObject(cbt);

      // Needed because we must act on objects
      buildChilds();

      // hide objects
      ll.hide();
      gls.hide();
      cbt.hide();

      cbt.getRoot().setTranslation(180, 20);
      gls.getRoot().setTranslation(80, 180);
      ll.getRoot().setTranslation(220, 280);

    } catch (NoNameException e) {
      e.printStackTrace();
    } catch (IDAlreadyPresentException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }

    TimeAlarmEvent time1, time2, time3;

    // Create timed event
    time1 = new TimeAlarmEvent(100) {
      private FadeIn fade;

      // this function will be called when timeouts elapse!
      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setStep(0.005f);
        fade.setTarget(cbt);
        fade.start();
      }
    };

    time2 = new TimeAlarmEvent(200) {
      private FadeIn fade;

      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setTarget(gls);
        fade.setStep(0.005f);
        fade.start();
      }
    };

    time3 = new TimeAlarmEvent(300) {
      private FadeIn fade;

      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setTarget(ll);
        fade.setStep(0.005f);
        fade.start();
      }
    };

    EventManager.getInstance().push(time1);
    EventManager.getInstance().push(time2);
    EventManager.getInstance().push(time3);

    // settings relative start
    time1.start();
    time2.start();
    time3.start();

  }

  @Override
  public void updateState() {

  }
}
