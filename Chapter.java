
public class Chapter{
    //instance variables
    private int chNum;
    private String link;
    private String[] keypoints;
    private String title;

    //constructor
    public Chapter(String title,int chNum, String link,String[] keypoints){
        this.chNum=chNum;
        this.link=link;
        this.keypoints=keypoints;
        this.title=title;
    }
    //getters
    public int getChNum(){
        return chNum;
    }
    public String getLink(){
        return link;
    }
    public String[] getKeypoints(){
        return keypoints;
    }
    //setters
    public void setLink(String link){
        this.link=link;
    }
    public void setKeypoints(String[] keypoints){
        this.keypoints=keypoints;
    }
    @Override
    public String toString(){
        return String.format("Chapter %d: %s\nRead this: %s\nKeypoints from Chapter:\n1. %s\n2. %s\n3. %s\n",chNum,title,link,keypoints[0],keypoints[1],keypoints[2]);
    }
}