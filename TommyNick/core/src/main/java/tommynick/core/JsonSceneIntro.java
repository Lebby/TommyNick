package tommynick.core;

import java.util.ArrayList;

import playn.core.Json;
import playn.core.PlayN;
import playn.core.ResourceCallback;
import tommynick.core.scenes.introduction.Introduction;

public class JsonSceneIntro {
  private Json.Object       json;
  private ArrayList<String> text;
  private ArrayList<String> title;
  private ArrayList<String> image;

  public JsonSceneIntro(final Introduction intro) {
    PlayN.assets().getText("text/introduction.en.json",
        new ResourceCallback<String>() {
          @Override
          public void done(String resource) {
            json = PlayN.json().parse(resource);
            loadData();
          }

          @Override
          public void error(Throwable err) {
            PlayN.log().error(
                "JSonSceneIntro - Failed to load: " + err.getMessage());
          }

        });

  }

  private void loadData() {
    Json.Array tmp = json.getArray("page");

    text = new ArrayList<String>();
    image = new ArrayList<String>();
    title = new ArrayList<String>();

    PlayN.log().debug("LOAD DATA DEBUG:");
    PlayN.log().debug(" Lenght: " + tmp.length());

    for (int i = 0; i < tmp.length(); i++) {
      PlayN.log().debug("Text : " + tmp.getObject(i).getString("text"));
      PlayN.log().debug("Image : " + tmp.getObject(i).getString("image"));
      PlayN.log().debug("Title : " + tmp.getObject(i).getString("title"));

      text.add(tmp.getObject(i).getString("text"));
      image.add(tmp.getObject(i).getString("image"));
      title.add(tmp.getObject(i).getString("title"));
    }

  }

  /**
   * @return the text
   */
  public ArrayList<String> getText() {
    return text;
  }

  /**
   * @param text
   *          the text to set
   */
  public void setText(ArrayList<String> text) {
    this.text = text;
  }

  /**
   * @return the title
   */
  public ArrayList<String> getTitle() {
    return title;
  }

  /**
   * @param title
   *          the title to set
   */
  public void setTitle(ArrayList<String> title) {
    this.title = title;
  }

  /**
   * @return the image
   */
  public ArrayList<String> getImage() {
    return image;
  }

  /**
   * @param image
   *          the image to set
   */
  public void setImage(ArrayList<String> image) {
    this.image = image;
  }

}
