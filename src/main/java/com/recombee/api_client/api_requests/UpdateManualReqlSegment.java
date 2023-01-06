package com.recombee.api_client.api_requests;

/*
 This file is auto-generated, do not edit
*/

import java.util.Date;
import java.util.Map;
import java.util.HashMap;

import com.recombee.api_client.bindings.Logic;
import com.recombee.api_client.util.HTTPMethod;

/**
 * Update definition of the Segment.
 */
public class UpdateManualReqlSegment extends Request {

    /**
     * ID of the Segmentation to which the updated Segment belongs
     */
    protected String segmentationId;
    /**
     * ID of the Segment that will be updated
     */
    protected String segmentId;
    /**
     * ReQL filter that returns `true` for items that belong to this Segment. Otherwise returns `false`.
     */
    protected String filter;
    /**
     * Human-readable name of the Segment that is shown in the Recombee Admin UI.
     */
    protected String title;

    /**
     * Construct the request
     * @param segmentationId ID of the Segmentation to which the updated Segment belongs
     * @param segmentId ID of the Segment that will be updated
     * @param filter ReQL filter that returns `true` for items that belong to this Segment. Otherwise returns `false`.
     */
    public UpdateManualReqlSegment (String segmentationId,String segmentId,String filter) {
        this.segmentationId = segmentationId;
        this.segmentId = segmentId;
        this.filter = filter;
        this.timeout = 10000;
    }

    /**
     * @param title Human-readable name of the Segment that is shown in the Recombee Admin UI.
     */
    public UpdateManualReqlSegment setTitle(String title) {
         this.title = title;
         return this;
    }

    public String getSegmentationId() {
         return this.segmentationId;
    }

    public String getSegmentId() {
         return this.segmentId;
    }

    public String getFilter() {
         return this.filter;
    }

    public String getTitle() {
         return this.title;
    }

    /**
     * @return Used HTTP method
     */
    @Override
    public HTTPMethod getHTTPMethod() {
        return HTTPMethod.POST;
    }

    /**
     * @return URI to the endpoint including path parameters
     */
    @Override
    public String getPath() {
        return String.format("/segmentations/manual-reql/%s/segments/%s", this.segmentationId,this.segmentId);
    }

    /**
     * Get query parameters
     * @return Values of query parameters (name of parameter: value of the parameter)
     */
    @Override
    public Map<String, Object> getQueryParameters() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        return params;
    }

    /**
     * Get body parameters
     * @return Values of body parameters (name of parameter: value of the parameter)
     */
    @Override
    public Map<String, Object> getBodyParameters() {
        HashMap<String, Object> params = new HashMap<String, Object>();
        params.put("filter", this.filter);
        if (this.title!=null) {
            params.put("title", this.title);
        }
        return params;
    }

}
