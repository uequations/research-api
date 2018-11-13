package com.uequations.api.research.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import com.google.inject.util.Providers;
import com.uequations.api.research.config.ConfigConstants;

/**
 * @author Mensah Alkebu-Lan
 */
public class DataSourceConfigModule extends AbstractModule {

    @Override
    protected void configure() {
        binder().bind(String.class)
                .annotatedWith(Names.named(ConfigConstants.PROP_CONNECTIONPROPERTIES))
                .toProvider(Providers.of(System.getProperty(ConfigConstants.PROP_CONNECTIONPROPERTIES)));
        binder().bind(String.class)
                .annotatedWith(Names.named(ConfigConstants.PROP_DRIVERCLASSNAME))
                .toProvider(Providers.of(System.getProperty(ConfigConstants.PROP_DRIVERCLASSNAME)));
        binder().bind(String.class)
                .annotatedWith(Names.named(ConfigConstants.PROP_PASSWORD))
                .toProvider(Providers.of(System.getProperty(ConfigConstants.PROP_PASSWORD)));
        binder().bind(String.class)
                .annotatedWith(Names.named(ConfigConstants.PROP_URL))
                .toProvider(Providers.of(System.getProperty(ConfigConstants.PROP_URL)));
        binder().bind(String.class)
                .annotatedWith(Names.named(ConfigConstants.PROP_USERNAME))
                .toProvider(Providers.of(System.getProperty(ConfigConstants.PROP_USERNAME)));
    }
}
