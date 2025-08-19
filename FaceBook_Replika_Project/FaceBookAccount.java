
/*
 * Project name: FaceBook Replika
 * Date of Start: 20-08-24;
 * Author: Parmeshwar Gurlewad
 * System requirement: java 8 or higer
 * OS: Platform Independent
 * 
 * Decription:
 * this is a project to replicate basic functionlities of facebook's accont managment.
 * the class FaceBookAccount handels user account creation, validatioin and varification.
 * addtional feature including uploading posts, liking posts, commenting on posts.
 * adding/ removing friend, and manageing profile setting.
 * 
 * ===Method name and usege===
 * checkMobileNumber(long mobileNumber): vaditates the mobile number length.
 * sendvarificationcode(String mail): simulates sending a verification code to the emial.
 * createAccount(String name, String mail, int age, char grnder, long mobileNumber):Create a user account after validation.
 * login(String Uid,string pwd): Simulates user login based on uid and password.
 * uploadPost(String content)Allow the user to upload post.
 * likePost(int postId):Allow the user to like the post.
 * commentOnPost(int postId, String comment): allow user to comment on post.
 * addFriend(FaceBookAccount friend):allow user to add friend.
 * removeFriend(FaceBookAccount friend): allow user to remove Friend.
 * viewProfile(): display the user's profile information.
 * UpdateProfile(String name,String email, int age, char gender): update the users profile.
 * viewSetting(): display the user setting
 * UpdateSetting(String uid, String pwd): Update the users login credentials.
 * 
 * ====Variable names and usage===
 * -uid: strore the username.
 * -pwd: store the users password.
 * -name: store the users full name.
 * email: store the users email addr.
 * age: store the users age.
 * mobileNo: store the users mobile nummbber.
 * gender: store the users gender(m for male, f for female).
 * verifyMail: boolean flag for varification.
 * posts: list to store the users post.
 * friend: list to store the users friend.
 * settings: map to store users setting like uid and password.  
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;

class FaceBookAccount{
    String uid;
    String pwd;
    String name;
    String email;
    int age;
    long mobileNo;
    char gender;
    boolean verifyEmail;

    List<String> posts = new ArrayList<>();
    List<FaceBookAccount> friends= new ArrayList<>();
    Map<String, String> settings = new HashMap<>();
    Map<Integer,List<String>> commnets = new HashMap<>();
    Map<Integer, Integer> likes = new HashMap<>();

    //methd to check the if the mobile number is valid or not (10 digit)
    public void checkMobileNumber(long mobileNo) {
        int count=0;
        long temp=mobileNo;
        long digit=0;
        
        do{
            digit=temp%10;
            count++;
            temp=temp/10;
        } while(temp!=10);

        if(count==10) System.out.println("Valid Mobile Number");
        else System.out.println("Invalid mobile number");
    }

    //method to simulate sending a verification code to email
    public void sendVarificationCode(String email) {
        System.out.println("Verification code to sent "+email);
        verifyEmail=true;
    }

    //Method to create a user account after validation
    public void createAccount(String name, String email, int age, char gender, long mobileNo) {
        this.name=name;
        this.email=email;
        this.age=age;
        this.gender=gender;
        this.mobileNo=mobileNo;
        //Validate mobile number
        checkMobileNumber(mobileNo);

        //validate age
        if(age>18) System.out.println("Valid age");
        else System.out.println("Invalid age. age must be 18+");
        
        //Validate email
        if(email.endsWith("@gmail.com")) {
            System.out.println("Valid email id");
            sendVarificationCode(email);
            if(verifyEmail) {
                System.out.println("Mail id verified");
            }
        }
        else {
            System.out.println("Invalid email id");
        }

        //Initialize settings
        settings.put("Uid",uid);
        settings.put("pwd",pwd);
    }

        //Method to simulate login
        public boolean login(String uid, String pwd) {
            boolean result=false;
            if(this.uid.equals(uid)&& this.pwd.equals(pwd)) {
                System.out.println("Login Successfull");
                result = true;
            }
            else {
                System.out.println("Login Failed");
                result= false;
            }
            return result;
        }

        //Method to set credentials
        public void setCredentials(String uid, String pwd) {
            this.uid=uid;
            this.pwd=pwd;
        }
        public void likePost(int postId) {
            if(postId>=0 && postId<posts.size()) {
                int likeCount=likes.get(postId);
                likes.put(postId,likeCount+1);
                System.out.println("Post Liked: "+ posts.get(postId));
                
            }
            else System.out.println("Invalid post Id");
        }

        //method to comment on a post
        public void commentOnPost(int postId, String comment) {
            if(postId>=0 && postId<posts.size()) {
                commnets.get(postId).add(comment);
                System.out.println("Comment Added: "+comment);
            }
            else System.out.println("Invalid Post Id");
        }

        //method to add friend
        public void addFriend(FaceBookAccount friend) {
            if(!friends.contains(friend)) {
                friends.add(friend);
                System.out.println("Friend added: "+friend.name);
            }
            else System.out.println("Friend allready Added");
        }

        //method to remove friend
        public void removeFriend(FaceBookAccount friend) {
            if(friends.contains(friend)) {
                friends.remove(friend);
                System.out.println("Friend removed: "+friend.name);

            }
            else System.out.println("Friend not found");
        }

        //method to view profile
        public void viewProfile() {
            System.out.println("Profile Information");
            System.out.println("Name: "+name);
            System.out.println("Email"+email);
            System.out.println("Age:"+age);
            System.out.println("Gender: "+gender);
            System.out.println("Mobile Number"+mobileNo);
            System.out.println("Posts: "+posts.size());
            System.out.println("Friends"+friends.size());
        }

        //method to update profile
        public void UpdateProfile(String name, String email, int age, char gender) {
            this.name=name;
            this.email=email;
            this.age=age;
            this.gender=gender;
            System.out.println("Profile Updated");
        }

        //method to view settings
        public void viewSetting() {
            System.out.println("Settings");
            System.out.println("UID"+settings.get("uid"));
            System.out.println("Password: "+settings.get("pwd"));
        }

        //method to update settings
        public void UpdateSetting(String uid, String pwd) {
            settings.put("uid",uid);
            settings.put("pwd",pwd);
            System.out.println("Settings updated");
        }

        //main method
        public static void main(String[]args) {
            //creating two user accounts
            FaceBookAccount user1 = new FaceBookAccount();
            user1.setCredentials("user1", "Password1");
            user1.createAccount("alice", "alice@gmail.com", 22, 'F',7666845301L );

            FaceBookAccount user2=new FaceBookAccount();
            user2.setCredentials("user2", "password2");
            user2.createAccount("bob","bob@gmail.com",24,'M',7666845302L);

           // user1.uploadPost("Hello, this is my first post");
            user2.likePost(0);
            user2.commentOnPost(0, "Nice post!");

            user1.viewProfile();
            user1.UpdateProfile("Alice Wonderland", "alice.wonderland@gmail.com", 23, 'F');
            user1.viewSetting();
            user1.UpdateSetting("newUser1", "newPassword1");
        }
    }
