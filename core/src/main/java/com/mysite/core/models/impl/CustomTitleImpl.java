package com.mysite.core.models.impl;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.adobe.cq.wcm.core.components.commons.link.Link;
import com.adobe.cq.wcm.core.components.models.Title;
import com.adobe.cq.wcm.core.components.models.datalayer.ComponentData;
import com.day.cq.wcm.api.Page;
import com.mysite.core.models.CustomTitle;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Via;
import org.apache.sling.models.annotations.injectorspecific.ScriptVariable;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.apache.sling.models.annotations.via.ResourceSuperType;

@Model(
        adaptables = {SlingHttpServletRequest.class,Resource.class},
        adapters = {CustomTitle.class, ComponentExporter.class},
        resourceType = {CustomTitleImpl.RESOURCE_TYPE},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(name = ExporterConstants.SLING_MODEL_EXPORTER_NAME, extensions = ExporterConstants.SLING_MODEL_EXTENSION)
public class CustomTitleImpl implements CustomTitle {

    static final String RESOURCE_TYPE = "mysite/components/customtitle" ;

    @ScriptVariable
    private Page curretnPage;

    @Self
    @Via(type = ResourceSuperType.class)
    private Title title;

    @ValueMapValue
    private String subTitle;


    @Override
    public String getText() {
        return title.getText();
    }

    @Override
    public String getType() {
        return title.getType();
    }

    @Override
    public Link getLink() {
        return title.getLink();
    }

    @Override
    public String getLinkURL() {
        return title.getLinkURL();
    }

    @Override
    public boolean isLinkDisabled() {
        return title.isLinkDisabled();
    }

    @Override
    public String getId() {
        return title.getId();
    }

    @Override
    public ComponentData getData() {
        return title.getData();
    }

    @Override
    public String getAppliedCssClasses() {
        return title.getAppliedCssClasses();
    }

    @Override
    public String getExportedType() {
        return RESOURCE_TYPE;
    }

    @Override
    public String getSubTitle() {
        return subTitle;
    }
}
