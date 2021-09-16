package org.zhouhy.wicket.helloworld;

import org.apache.wicket.markup.html.basic.Label;
import org.zhouhy.wicket.common.layout.BootstrapBasePage;

public class HomePage extends BootstrapBasePage {
    
    public HomePage(){
        add(new Label("helloMessage","HelloWorld!"));
    }
    
}
