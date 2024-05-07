package user.createUserAlreadyExist;

import com.intuit.karate.junit5.Karate;

class CreateUserAlreadyExistRunner {
    
    @Karate.Test
    Karate testUsers() {
        
        return Karate.run("createUserAlreadyExist").relativeTo(getClass());
    }    

}
