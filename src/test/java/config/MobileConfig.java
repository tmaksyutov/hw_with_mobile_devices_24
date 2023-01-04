package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:config/${device}.properties",
        "classpath:config/credentials.properties"})
public interface MobileConfig extends Config {
    @Key("device.name")
    String deviceName();

    @Key("platform.name")
    String platformName();

    @Key("platform.version")
    String platformVersion();

    @Key("browserstackUrl")
    @DefaultValue("http://hub.browserstack.com/wd/hub")
    String browserstackUrl();

    @Key("appUrl")
    @DefaultValue("bs://b3329f44da140f8046974f5ecdba6c1d950fb9e9")
    String app();

    @Key("device")
    @DefaultValue("emulator")
    String device();

    String browserstackLogin();

    String browserstackPassword();

}
