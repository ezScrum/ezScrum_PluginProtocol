package ntut.csie.ui.protocol;

import java.util.List;

public abstract class ProjectUI implements EzScrumUI {
	public abstract List<String> getProjectLeftTreeIDList();
	public abstract List<String> getProjectPageIDList();
}
