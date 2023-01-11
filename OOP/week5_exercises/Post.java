public class Post {
    
    String message;
    String sourceAdress;
    String targetAdress;

    Post(String message, String sourceAdress, String targetAdress){
        this.message = message;
        this.sourceAdress = sourceAdress;
        this.targetAdress = targetAdress;
    }
}

class PostOffice{
    String name;

    PostOffice(String name){
        this.name = name;
    }

    void send(Post post){
        String info = String.format("Message: %s send by %s to receiver adress %s ",post.message,post.sourceAdress,post.targetAdress);
        System.out.println(info);
    }

    void receive(Post post){
        String info = String.format("Message: %s received by %s from adress %s ",post.message,post.targetAdress,post.sourceAdress); 
        System.out.println(info);
    }
}

class PostOfficeTest{
    public static void main(String[] args) {
        Post post = new Post("Hello!", "ISTANBUL", "KARABUK");
        
        PostOffice postOffice1 = new PostOffice("Istanbul");
        postOffice1.send(post);
        
        PostOffice postOffice2 = new PostOffice("Karabuk");
        postOffice2.receive(post);
        
    }
}