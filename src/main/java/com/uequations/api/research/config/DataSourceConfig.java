package com.uequations.api.research.config;

import lombok.Getter;

import javax.annotation.Nullable;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Mensah Alkebu-Lan
 */
@Getter
public class DataSourceConfig {

    @Nullable
    @Inject
    @Named(ConfigConstants.PROP_CONNECTIONPROPERTIES)
    private String connectionPropeties;

    @Nullable
    @Inject
    @Named(ConfigConstants.PROP_DRIVERCLASSNAME)
    private String driverClassName;

    @Nullable
    @Inject
    @Named(ConfigConstants.PROP_PASSWORD)
    private String password;

    @Nullable
    @Inject
    @Named(ConfigConstants.PROP_URL)
    private String url;

    @Nullable
    @Inject
    @Named(ConfigConstants.PROP_USERNAME)
    private String username;

    public DataSourceConfig() {
    }

    public DataSourceConfig(@Nullable String connectionPropeties,
                            @Nullable String driverClassName,
                            @Nullable String password,
                            @Nullable String url,
                            @Nullable String username) {
        this.connectionPropeties = connectionPropeties;
        this.driverClassName = driverClassName;
        this.password = password;
        this.url = url;
        this.username = username;
    }

}
