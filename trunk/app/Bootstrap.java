import play.*;
import play.jobs.*;
import play.test.*;

import models.*;

@OnApplicationStart
public class Bootstrap extends Job {

    public void doJob() {

        if(Category.count() == 0) {
            Fixtures.load("initial-data.yml");
        }

    }

}