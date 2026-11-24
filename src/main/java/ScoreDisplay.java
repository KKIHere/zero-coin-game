    /**
     * view() gives the calling class an Element.
     * setScore(int) displays the supplied score.
     * setCaption(String) changes the caption while retaining the displayed value.
     */
import zero.ui.Element;
import zero.ui.Label;

public class ScoreDisplay {
    private final Label label = new Label("Score: 0");
    private String caption = "Score";
    private int points;
    public void setScore(int points) {
        this.points = points;
        refresh();
    }
    private void refresh() {
        label.setText(caption + ": " + points);
    }
    public void setCaption(String caption) {
        if (caption == null) {
            throw new IllegalArgumentException("Score caption must not be null.");
        }
        this.caption = caption;
        refresh();
    }
    public Element view() {
        return label;
    }
}
