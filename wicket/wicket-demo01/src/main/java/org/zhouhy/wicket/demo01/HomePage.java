package org.zhouhy.wicket.demo01;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class HomePage extends WebPage {
    public HomePage() {
        super();
        add(new Label("helloMessage", "Hello WicketWorld!"));
    }
}
