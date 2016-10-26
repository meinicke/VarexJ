package cmu.vagraph;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import de.fosd.typechef.featureexpr.FeatureExpr;

public interface GraphOperation {

	void print(int i, String... filter);

	default int getSize(String[] filter) {
		return 1;
	}

	GraphOperation getSimpleTrace(Set<GraphOperation> nodes);

	default List<GraphOperation> getChildren() {
		return Collections.emptyList();
	}

	String toGraphString();
	
	FeatureExpr getCtx();
	
	int getID();
}
