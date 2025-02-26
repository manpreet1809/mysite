package com.mysite.core.models.impl;

import com.mysite.core.models.CustomTitle;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = {SlingHttpServletRequest.class,Resource.class},
        adapters = {CustomTitle.class},
        resourceType = {CustomTitleImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
public class CustomTitleImpl implements CustomTitle {

    static final String RESOURCE_TYPE = "" ;

    @ValueMapValue
    private String title;

    @Override
    public String getTitle() {
        return title;
    }

}
