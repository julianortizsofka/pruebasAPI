package user.createNewUser;

import com.intuit.karate.junit5.Karate;

class CreateNewUserRunner {
    
    @Karate.Test
    Karate testUsers() {
        
        return Karate.run("createNewUser").relativeTo(getClass());
    }    

}
