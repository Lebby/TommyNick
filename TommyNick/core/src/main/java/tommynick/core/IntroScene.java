package tommynick.core;

import playn.core.ImageLayer;
import forscene.core.entities.SimpleScene;
import forscene.core.entities.objects.SimpleTextObject;

public class IntroScene extends SimpleScene {
  private String           title;
  private String           text;
  private SimpleTextObject titleText;
  private SimpleTextObject textText;
  private ImageLayer       background;

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
    return background;
  }

  /**
   * @param background the background to set
   */
  public void setBackground(ImageLayer background) {
    this.background = background;
  }

}
