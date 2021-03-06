package cz.cas.mbu.cygenexpi.internal;

import java.util.List;

import org.cytoscape.model.CyRow;

public interface TaggingSeriesProvider {
	boolean isRelevant(CyRow taggedRow);
	List<TaggingSeriesDescriptor> getSeriesForTagging(CyRow taggedRow);
	String getTaggingTitle(CyRow taggedRow);
}
