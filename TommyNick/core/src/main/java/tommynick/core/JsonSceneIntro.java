package tommynick.core;

import java.util.ArrayList;

import playn.core.Json;
import playn.core.PlayN;
import playn.core.ResourceCallback;

public class JsonSceneIntro {
  private Json.Object       json;
  private ArrayList<String> text;
  private ArrayList<String> title;
  private ArrayList<String> image;

  public JsonSceneIntro() {
    PlayN.assets().getText("text/introduction.en.json",
        new ResourceCallback<String>() {
          @Override
          public void done(String resource) {
            json = PlayN.json().parse(resource);
            loadData();
          }

          @Override
          public void error(Throwable err) {
            PlayN.log().error("Failed to load: " + err.getMessage());
          }

        });

  }

  private void loadData() {
    Json.Array tmp = json.getArray("page");
    PlayN.log().debug(tmp.toString());
    text = new ArrayList<String>();
    image = new ArrayList<String>();
    title = new ArrayList<String>();

    for (int i = 0; i < tmp.length(); i++) {
      text.add(tmp.getObject(i).getString("text"));
      image.add(tmp.getObject(i).getString("title"));
      title.add(tmp.getObject(i).getString("image"));
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
}
