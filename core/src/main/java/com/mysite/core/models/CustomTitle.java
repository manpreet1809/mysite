package com.mysite.core.models;


import com.adobe.cq.wcm.core.components.commons.link.Link;
import com.adobe.cq.wcm.core.components.models.Component;
import com.adobe.cq.wcm.core.components.models.datalayer.ComponentData;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;


public interface CustomTitle extends Component {
     String getText();

     String getType();
     @Nullable
     Link getLink();

     @Deprecated
     String getLinkURL();

     boolean isLinkDisabled();

     @NotNull
     String getId();

     @NotNull
     ComponentData getData();

     @NotNull
     String getAppliedCssClasses();

     @NotNull
     String getExportedType();

     String getSubTitle();


}
