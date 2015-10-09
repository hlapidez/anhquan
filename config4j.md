# Introduction #

The purpose of this project is to demonstrate how to use Annotation, Reflection, Proxy to dynamically add implementation to an Interface.

Furthermore, config4j will help you to configure your java applications easier. This configuration framework uses Apache Commons Configuration in the background.

# Usage #
### 1) Define a configuration Interface which extends from Config ###
```
//AppConfig.java
import de.anhquan.config4j.annotation.ConfigContainer;
import de.anhquan.config4j.annotation.ConfigParam;

@ConfigContainer(Location="app.properties", Prefix="app.")
public interface AppConfig extends Config{
	
	@ConfigParam(PropertyName="bind.port", DefaultInteger=8089)
	public int getBindPort();
	
	@ConfigParam(PropertyName="database.host", DefaultString="localhost")
	public String getDatabaseHost();
	
	@ConfigParam(PropertyName="databse.port", DefaultInteger=5555)
	public int getDatabasePort();
	
}
```

### 2) Create a property file (app.properties) to store the configuration ###
```
#### Configuration File ####
app.bind.port=8080
app.database.host=localhost
app.database.port=1234
```

### 3) Using the Config everywhere by calling ConfigFactory.getConfig (...) ###
```
//MyApp.java
import de.anhquan.config4j.AppConfig;
import de.anhquan.config4j.ConfigFactory;

public class MyApp {

	public static void main(String[] args) {
		AppConfig appCfg = ConfigFactory.getConfig(AppConfig.class);
		System.out.println("bind port = "+appCfg.getBindPort());
	}

}
```


# SVN Check out #
```
svn checkout http://anhquan.googlecode.com/svn/trunk/config4j config4j
```


---


[Go Home](http://code.google.com/p/anhquan/)