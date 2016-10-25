package cmu.vagraph;

import java.util.Set;

public interface GraphOperation {

	void print(int i, String[] filter);

	default int getSize(String[] filter) {
		return 1;
	}

	GraphOperation getSimpleTrace(Set<GraphOperation> nodes);

}
