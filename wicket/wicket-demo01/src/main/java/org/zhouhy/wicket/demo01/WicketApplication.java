package org.zhouhy.wicket.demo01;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class WicketApplication extends WebApplication {

    public WicketApplication(){

    }
    
    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }
    
    

    @Override
    public void init(){
        super.init();
    }
}
