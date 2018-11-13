package com.uequations.api.research.module;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.uequations.api.research.config.ConfigConstants;
import com.uequations.api.research.config.DataSourceConfig;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.assertThat;

public class DataSourceConfigModuleTest {

    @Test
    public void testConfiguration() {

        System.setProperty(ConfigConstants.PROP_DRIVERCLASSNAME, "org.h2.Driver");
        System.setProperty(ConfigConstants.PROP_PASSWORD, "");
        System.setProperty(ConfigConstants.PROP_URL, "jdbc:h2:mem:");
        System.setProperty(ConfigConstants.PROP_USERNAME, "sa");

        Injector injector = Guice.createInjector(new DataSourceConfigModule());
        DataSourceConfig dataSourceConfig = injector.getInstance(DataSourceConfig.class);

        assertThat(dataSourceConfig, CoreMatchers.any(DataSourceConfig.class));
        assertThat(dataSourceConfig.getUsername(), CoreMatchers.is("sa"));
    }
}