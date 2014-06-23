package ntut.csie.protocal;

import java.util.Map;

public class PluginConfig {
	private String id;
	private boolean available;
//	private Map<String,String>  fieldValueMap;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
//	public Map<String,String> getFieldValueMap() {
//		return fieldValueMap;
//	}
//	public void setFieldValueMap(Map<String,String> fieldValueMap) {
//		this.fieldValueMap = fieldValueMap;
//	}
}
