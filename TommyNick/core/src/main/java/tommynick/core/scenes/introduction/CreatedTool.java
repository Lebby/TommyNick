package tommynick.core.scenes.introduction;

import tommynick.core.objects.logos.EclipseLogo;
import tommynick.core.objects.logos.ForSceneLogo;
import tommynick.core.objects.logos.GimpLogo;
import tommynick.core.objects.logos.InkscapeLogo;
import tommynick.core.objects.logos.JavaLogo;
import tommynick.core.objects.logos.PlayNLogo;
import tommynick.core.objects.textrend.UsingText;
import forscene.core.effects.FadeIn;
import forscene.core.effects.Scroll;
import forscene.core.effects.Scroll.ScrollType;
import forscene.core.entities.AbstractScene;
import forscene.core.util.GraphicFactory;
import forscene.exceptions.IDAlreadyPresentException;
import forscene.exceptions.NoNameException;
import forscene.system.events.TimeAlarmEvent;
import forscene.system.managers.AbstractGameLoopManager;
import forscene.system.managers.EventManager;

public class CreatedTool extends AbstractScene {
  private EclipseLogo  eclipseLogo;
  private ForSceneLogo forsceneLogo;
  private GimpLogo     gimpLogo;
  private InkscapeLogo inkscapeLogo;
  private JavaLogo     javaLogo;
  private PlayNLogo    playnLogo;
  private UsingText    usingText;

  @Override
  public void load() {
    super.load();
    eclipseLogo = new EclipseLogo();
    forsceneLogo = new ForSceneLogo();
    gimpLogo = new GimpLogo();
    inkscapeLogo = new InkscapeLogo();
    javaLogo = new JavaLogo();
    playnLogo = new PlayNLogo();
    usingText = new UsingText();
  }

  @Override
  public void build() {
    // adding Background
    GraphicFactory.addImage("images/backgrounds/paper.jpg", this);
    // TODO Auto-generated method stub
    try {

      addSceneObject(gimpLogo);
      addSceneObject(inkscapeLogo);
      addSceneObject(javaLogo);
      addSceneObject(eclipseLogo);
      addSceneObject(playnLogo);
      addSceneObject(forsceneLogo);
      addSceneObject(usingText);

      buildChilds();

      gimpLogo.hide();
      inkscapeLogo.hide();
      javaLogo.hide();
      eclipseLogo.hide();
      playnLogo.hide();
      forsceneLogo.hide();
      usingText.hide();

    } catch (NoNameException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IDAlreadyPresentException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    TimeAlarmEvent time1, time2, time3, time4, time5, time6, time7;

    // Create timed event
    time1 = new TimeAlarmEvent(100) {
      private FadeIn fade;
      private Scroll scroll;

      // this function will be called when timeouts elapse!
      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setTarget(gimpLogo);
        fade.setStep(0.005f);

        scroll = new Scroll();
        scroll.setTarget(gimpLogo);
        scroll
            .setStartX(AbstractGameLoopManager.getInstance().getWidth() - 100);
        scroll.setStartY(0);
        scroll.setEndX(0);

        scroll.setScrollType(ScrollType.LEFT);

        fade.start();
        scroll.start();
      }
    };

    time2 = new TimeAlarmEvent(200) {
      private FadeIn fade;
      private Scroll scroll;

      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setTarget(inkscapeLogo);
        fade.setStep(0.005f);

        scroll = new Scroll();
        scroll.setTarget(inkscapeLogo);
        scroll
            .setStartX(AbstractGameLoopManager.getInstance().getWidth() - 100);
        scroll.setStartY(100);
        scroll.setEndX(0);
        scroll.setScrollType(ScrollType.LEFT);

        fade.start();
        scroll.start();
      }
    };

    time3 = new TimeAlarmEvent(300) {
      private FadeIn fade;
      private Scroll scroll;

      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setTarget(javaLogo);
        fade.setStep(0.005f);

        scroll = new Scroll();
        scroll.setTarget(javaLogo);
        scroll
            .setStartX(AbstractGameLoopManager.getInstance().getWidth() - 100);
        scroll.setStartY(200);
        scroll.setEndX(0);
        scroll.setScrollType(ScrollType.LEFT);

        fade.start();
        scroll.start();
      }
    };

    time4 = new TimeAlarmEvent(400) {
      private FadeIn fade;
      private Scroll scroll;

      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setTarget(eclipseLogo);
        fade.setStep(0.005f);

        scroll = new Scroll();
        scroll.setTarget(eclipseLogo);
        scroll
            .setStartX(AbstractGameLoopManager.getInstance().getWidth() - 100);
        scroll.setStartY(300);
        scroll.setEndX(0);
        scroll.setScrollType(ScrollType.LEFT);

        fade.start();
        scroll.start();
      }
    };

    time5 = new TimeAlarmEvent(500) {
      private FadeIn fade;
      private Scroll scroll;

      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setTarget(playnLogo);
        fade.setStep(0.005f);

        scroll = new Scroll();
        scroll.setTarget(playnLogo);
        scroll.setStartY(-100);
        scroll.setStartX(400);
        scroll.setEndY(0);
        scroll.setScrollType(ScrollType.DOWN);

        fade.start();
        scroll.start();
      }
    };

    time6 = new TimeAlarmEvent(700) {
      private FadeIn fade;
      private Scroll scroll;

      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setTarget(forsceneLogo);
        fade.setStep(0.005f);

        scroll = new Scroll();
        scroll.setTarget(forsceneLogo);
        scroll.setStartX(200);
        scroll.setStartY(500);
        scroll.setEndY(300);
        scroll.setScrollType(ScrollType.UP);

        fade.start();
        scroll.start();
      }
    };

    time7 = new TimeAlarmEvent(900) {
      private FadeIn fade;
      private Scroll scroll;

      @Override
      public void alarm() {
        fade = new FadeIn();
        fade.setTarget(usingText);
        fade.setStep(0.005f);

        scroll = new Scroll();
        scroll.setTarget(usingText);
        scroll.setStartX(100);
        scroll.setStartY(400);
        scroll.setEndY(200);
        scroll.setScrollType(ScrollType.UP);

        fade.start();
        scroll.start();
      }
    };

    EventManager.getInstance().push(time1);
    EventManager.getInstance().push(time2);
    EventManager.getInstance().push(time3);
    EventManager.getInstance().push(time4);
    EventManager.getInstance().push(time5);
    EventManager.getInstance().push(time6);
    EventManager.getInstance().push(time7);

    // settings relative start
    time1.start();
    time2.start();
    time3.start();
    time4.start();
    time5.start();
    time6.start();
    time7.start();

  }

  @Override
  public void updateState() {
    // TODO Auto-generated method stub

  }

}
