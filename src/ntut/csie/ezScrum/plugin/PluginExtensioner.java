package ntut.csie.ezScrum.plugin;

public class PluginExtensioner {
	private String pluginName;
	public PluginExtensioner( String pluginName ){
		this.pluginName = pluginName;
	}
	
	public String getPluginRoot(){
		return "WebContent/pluginWorkspace/"+this.pluginName;// host assign path to plugin to use resource
	}
	
	public String getWebPluginRoot(){
		return "pluginWorkspace/"+this.pluginName+"/";// host assign path to plugin to use resource
	}
}
