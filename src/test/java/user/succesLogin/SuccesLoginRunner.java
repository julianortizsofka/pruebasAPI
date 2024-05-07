package user.succesLogin;

import com.intuit.karate.junit5.Karate;

class SuccesLoginRunner {
    
    @Karate.Test
    Karate testUsers() {
        
        return Karate.run("succesLogin").relativeTo(getClass());
    }    

}
