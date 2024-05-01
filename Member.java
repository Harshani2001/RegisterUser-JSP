
public class Member {
     String uname,password,email,phone;
     public Member() {
    	 super();
     }
     

     public Member(String uname, String password, String email, String phone) {
         this.uname = uname;
         this.password = password;
         this.email = email;
         this.phone = phone;
     }

     public String getUname() {
         return uname;
     }

     public String getPassword() {
         return password;
     }

     public String getEmail() {
         return email;
     }

     public String getPhone() {
         return phone;
     }

     public void setUname(String uname) {
         this.uname = uname;
     }

     public void setPassword(String password) {
         this.password = password;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public void setPhone(String phone) {
         this.phone = phone;
     }

}
