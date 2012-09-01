package tommynick.core;

import playn.core.GroupLayer;
import playn.core.ImageLayer;
import forscene.core.entities.SimpleScene;
import forscene.core.entities.objects.SimpleTextObject;
import forscene.core.util.GraphicFactory;
import forscene.exceptions.IDAlreadyPresentException;
import forscene.exceptions.NoNameException;

public class IntroScene extends SimpleScene {
  private String           title;
  private String           text;
  private SimpleTextObject titleText;
  private SimpleTextObject textText;
  private GroupLayer       background;

  public IntroScene() {
    super();
    background = GraphicFactory.createGroupLayer();
    titleText = new SimpleTextObject();
    textText = new SimpleTextObject();
  }

  /**
   * @return the title
   */
  public String getTitle() {
    return title;
  }

  /**
   * @param title
   *          the title to set
   */
  public void setTitle(String title) {
    this.title = title;
    titleText.setText(title);
  }

  /**
   * @return the text
   */
  public String getText() {
    return text;
  }

  /**
   * @param text
   *          the text to set
   */
  public void setText(String text) {
    this.text = text;
    textText.setText(text);
  }

  /**
   * @return the titleText
   */
  public SimpleTextObject getTitleText() {
    return titleText;
  }

  /**
   * @param titleText
   *          the titleText to set
   */
  public void setTitleText(SimpleTextObject titleText) {
    this.titleText = titleText;
  }

  /**
   * @return the textText
   */
  public SimpleTextObject getTextText() {
    return textText;
  }

  /**
   * @param textText
   *          the textText to set
   */
  public void setTextText(SimpleTextObject textText) {
    this.textText = textText;
  }

  /**
   * @return the background
   */
  public ImageLayer getBackground() {
    return (ImageLayer) background.get(0);
  }

  /**
   * @param background
   *          the background to set
   */
  public void setBackground(ImageLayer background) {
    this.background.clear();
    this.background.add(background);
  }

  @Override
  public void build() {
    super.build();
    // background.clear();

    try {
      addSceneObject(textText);
      addSceneObject(titleText);
    } catch (NoNameException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IDAlreadyPresentException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    getRoot().add(background);
    toBackground(background);
  }

}
