package org.zhouhy.wicket.common.bootstrap;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.settings.BootstrapSettings;
import de.agilecoders.wicket.core.settings.IBootstrapSettings;
import de.agilecoders.wicket.core.settings.ThemeProvider;
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchTheme;
import de.agilecoders.wicket.themes.markup.html.bootswatch.BootswatchThemeProvider;
import org.apache.wicket.Application;
import org.apache.wicket.resource.JQueryResourceReference;

public class BootstrapInitializer {
    
    public static void init(Application application){
        final IBootstrapSettings settings = new BootstrapSettings();
        final ThemeProvider themeProvider = new BootswatchThemeProvider(BootswatchTheme.United);
        
        settings.setThemeProvider(themeProvider);
        settings.setDeferJavascript(true);
        
        application.getJavaScriptLibrarySettings().setJQueryReference(JQueryResourceReference.INSTANCE_2);
        Bootstrap.install(application, settings);        
    }
    
}
