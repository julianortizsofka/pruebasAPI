package user.wrongLogin;

import com.intuit.karate.junit5.Karate;

class WrongLoginRunner {
    
    @Karate.Test
    Karate testUsers() {
        
        return Karate.run("wrongLogin").relativeTo(getClass());
    }    

}
