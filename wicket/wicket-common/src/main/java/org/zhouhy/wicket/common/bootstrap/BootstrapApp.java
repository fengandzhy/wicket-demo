package org.zhouhy.wicket.common.bootstrap;

import org.apache.wicket.protocol.http.WebApplication;

public abstract class BootstrapApp extends WebApplication {

    @Override
    protected void init() {
        BootstrapInitializer.init(this);
        getCspSettings().blocking().clear();
    }
}
