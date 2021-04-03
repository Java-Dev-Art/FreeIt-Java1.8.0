package HomeWork4.Classes;

public class Genre {
    private String epic;
    private String novel;
    private String poetry;
    private String fantasy;
    private String nonFiction;
    private String detectiveStory;

    public void setEpic() {
        this.epic = "Epic";
    }

    public void setNovel() {
        this.novel = "Novel";
    }

    public void setPoetry() {
        this.poetry = "Poetry";
    }

    public void setFantasy() {
        this.fantasy = "Fantasy";
    }

    public void setNonFiction() {
        this.nonFiction = "Non - Fiction";
    }

    public void setDetectiveStory() {
        this.detectiveStory = "Detective Story";
    }

    public String getEpic() {
        return epic;
    }

    public String getNovel() {
        return novel;
    }

    public String getPoetry() {
        return poetry;
    }

    public String getFantasy() {
        return fantasy;
    }

    public String getNonFiction() {
        return nonFiction;
    }

    public String getDetectiveStory() {
        return detectiveStory;
    }

    public String genreToString() {
        return "Genre :" + getDetectiveStory() + " " + getEpic() + " " + getFantasy() + " " + getNonFiction() + " " +
                getNovel() + " " + getPoetry();
    }
}
