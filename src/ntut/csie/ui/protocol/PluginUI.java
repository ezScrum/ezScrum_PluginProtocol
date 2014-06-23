package ntut.csie.ui.protocol;

public abstract class PluginUI implements EzScrumUI{
	
	public abstract String getPluginID();
	
	public PluginUI getPluginUI() {
		return this;
	}
}
