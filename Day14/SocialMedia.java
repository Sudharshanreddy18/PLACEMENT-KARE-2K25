import java.util.*;

class post{
    private String content;
    private Set<String> likedby = new HashSet<String>();
    public post(String content) {
        this.content = content;
    }
    public void likePost(String userId) {
        if (likedby.add(userId)) {
            System.out.println(userId + " liked the post: " +content+" ");
        } else {
            System.out.println(userId + " has already liked");
        }
    }
    public int getLikeCount() {
        return likedby.size();
    }
}
public class SocialMedia {
    public static void main(String[] args) {
        post post = new post("Birthday");
        post.likePost("sudharshan_18");
        post.likePost("pavithra_28");
        System.out.println("Total likes: " + post.getLikeCount());
    }
}
