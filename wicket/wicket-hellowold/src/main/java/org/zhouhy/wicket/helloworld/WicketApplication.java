package org.zhouhy.wicket.helloworld;

import org.apache.wicket.Page;
import org.zhouhy.wicket.common.bootstrap.BootstrapApp;

public class WicketApplication extends BootstrapApp {
    @Override
    public Class<? extends Page> getHomePage() {
        return HomePage.class;
    }
}
